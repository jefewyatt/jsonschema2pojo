/**
 * Copyright © 2010-2014 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo.rules;

import static org.apache.commons.lang3.StringUtils.capitalize;

import org.jsonschema2pojo.Schema;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JAnnotationArrayMember;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;

/**
 * Applies a JSON schema.
 * 
 * @see <a
 *      href="http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5">http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5</a>
 */
public class SchemaRule implements Rule<JClassContainer, JType> {

    private final RuleFactory ruleFactory;

    protected SchemaRule(RuleFactory ruleFactory) {
        this.ruleFactory = ruleFactory;
    }

    /**
     * Applies this schema rule to take the required code generation steps.
     * <p>
     * At the root of a schema document this rule should be applied (schema documents contain a schema), but also in
     * many places within the document. Each property of type "object" is itself defined by a schema, the items
     * attribute of an array is a schema, the additionalProperties attribute of a schema is also a schema.
     * <p>
     * Where the schema value is a $ref, the ref URI is assumed to be applicable as a URL (from which content will be
     * read). Where the ref URI has been encountered before, the root Java type created by that schema will be re-used
     * (generation steps won't be repeated).
     * 
     * @param schema
     *            the schema within which this schema rule is being applied
     */
    @Override
    public JType apply(String nodeName, JsonNode schemaNode, JClassContainer generatableType, Schema schema) {

        // Use title as the class name if present
        if (schemaNode.has("title")) {
            nodeName = schemaNode.get("title").asText();
        }

        if (schemaNode.has("$ref")) {
            schema = ruleFactory.getSchemaStore().create(schema, schemaNode.get("$ref").asText());
            JsonNode newSchemaNode = schema.getContent();

            if (schema.isGenerated()) {
                return schema.getJavaType();
            }

            // Change the node name to the referenced schema's name?
            JsonNode schemaNode2 = schemaNode.get("$ref");
            String schemaFullName = schemaNode.get("$ref").asText();
            if (schemaFullName.contains("asset_action")) {
                System.out.println("break");
            }
            String schemaName = schemaFullName.substring(schemaFullName.lastIndexOf("/") + 1);
            return apply(schemaName, newSchemaNode, generatableType, schema);
        }

        // Trying the oneOf bullshit
        if (schemaNode.has("oneOf") || schemaNode.has("anyOf")) {
            // create the empty polymorphic container

            System.err.println("Node name: " + nodeName);
            JDefinedClass superType;
            try {
                superType = generatableType.getPackage()._class(JMod.PUBLIC,
                        getClassName(nodeName, generatableType.getPackage().getPackage()), ClassType.CLASS);
            } catch (JClassAlreadyExistsException e) {
                superType = e.getExistingClass();
            }
            System.err.println("Super type: " + superType.name());

            // Now let's iterate through the schemas and get their types:
            JsonNode parentSchema = null;
            if (schemaNode.has("oneOf")) {
                parentSchema = schemaNode.get("oneOf");
            } else {
                parentSchema = schemaNode.get("anyOf");
            }
            // If any of the "one ofs" are a simple type, I'm just gonna make this thing an object
            for (JsonNode childSchema : parentSchema) {
                if (childSchema.has("type") && (childSchema.get("type").asText().equals("string"))) {
                    return generatableType.owner()._ref(Object.class);
                }

            }

            for (JsonNode childSchema : parentSchema) {
                if (childSchema.has("$ref")) {
                    int index = childSchema.get("$ref").asText().lastIndexOf("/");
                    nodeName = childSchema.get("$ref").asText().substring(index);
                    System.out.println("=========" + nodeName);
                }
                JType childType = apply(nodeName, childSchema, generatableType, schema);

                // let's see if this cast works =/
                if (childType instanceof JDefinedClass) {
                    JDefinedClass childClass = (JDefinedClass) childType;

                    childClass._extends(superType);

                    // We need to do the Jackson annotations:

                    // Determine what our type name will be
                    // Dereference the child schema if needed
                    if (childSchema.has("$ref")) {
                        Schema newSchema = ruleFactory.getSchemaStore().create(schema, childSchema.get("$ref").asText());
                        childSchema = newSchema.getContent();
                    }

                    // Hack for assets -- if we see all of lets make it the second child schema
                    // TODO find a good way to remove this
                    if (childSchema.has("allOf")) {
                        childSchema = childSchema.get("allOf").get(1);
                    }

                    String nameValue = null;
                    try {
                        nameValue = childSchema.get("properties").get("type").get("enum").get(0).asText();
                    } catch (NullPointerException e) {

                    }

                    if (nameValue != null) {
                        JAnnotationUse subTypeAnnotation = null;
                        JAnnotationArrayMember arrayAnnotation = null;
                        // First check if we already have the subtype annotation
                        for (JAnnotationUse someAnnotation : superType.annotations()) {
                            if (someAnnotation.getAnnotationClass().fullName().contains("JsonSubTypes")) {
                                subTypeAnnotation = someAnnotation;
                                arrayAnnotation = (JAnnotationArrayMember) subTypeAnnotation.getAnnotationMembers()
                                        .get("value");
                                break;
                            }
                        }

                        // If we haven't found the subtype annotation, create it and the type info annotation
                        if (subTypeAnnotation == null) {
                            
                            JAnnotationUse typeInfo = superType.annotate(JsonTypeInfo.class);
                            typeInfo.param("use", JsonTypeInfo.Id.NAME);
                            typeInfo.param("include", JsonTypeInfo.As.PROPERTY);
                            typeInfo.param("property", "type");
                            typeInfo.param("defaultImpl", Object.class);
                            
                            subTypeAnnotation = superType.annotate(JsonSubTypes.class);
                            arrayAnnotation = subTypeAnnotation.paramArray("value");
                        }

                        // Add our subtype if it doesn't exist already
                        boolean found = false;
                        // try {
                        // for (JAnnotationUse someAnnotation : arrayAnnotation.annotations()) {
                        // JAnnotationValue stringValue = someAnnotation.getAnnotationMembers().get("name");
                        // Class<?> stringValueClass = stringValue.getClass();
                        // stringValueClass.getField("value").setAccessible(true);
                        // Object stringLiteralObj = stringValueClass.getField("value").get(stringValue);
                        // Class<?> stringLiteralClass = stringLiteralObj.getClass();
                        // stringLiteralClass.getField("str").setAccessible(true);
                        // String nameString = (String) stringLiteralClass.getField("str").get(stringLiteralObj);
                        //
                        // if (nameString.equals(nameValue)) {
                        // found = true;
                        // }
                        // }
                        // } catch (Exception e) {
                        // e.printStackTrace();
                        // }

                        JAnnotationUse typeAnnotation = arrayAnnotation.annotate(Type.class);
                        typeAnnotation.param("value", childClass);
                        typeAnnotation.param("name", nameValue);
                    }

                }
            }
            return superType;
        }
        // @JsonSubTypes({ @Type(value=AssetText.class, name="text"),
        // @Type(value=AssetImage.class, name="image"),

        /*
         * The shitty pattern I'm using for allOf:
         * 
         * It looks like all of our allOf usages are of the following scenario: the first schema is the "parent" schema,
         * that encompasses common fields. The next schema are the additions. So I'm going to make that assumption here,
         * even though there are many more uses of "allOf" in the wild.
         */
        if (schemaNode.has("allOf")) {

            String childNodeName = nodeName;
            if (schemaNode.has("title")) {
                childNodeName = schemaNode.get("title").asText();
            }

            JsonNode parentSchema = schemaNode.get("allOf").get(0);
            JsonNode childSchema = schemaNode.get("allOf").get(1);

            // Get the parent type
            JType superType = apply(nodeName, parentSchema, generatableType, schema);

            // Now we'll get the child type
            JType childType = apply(childNodeName, childSchema, generatableType, schema);

            // Now we just add an extends and hopefully we're done!
            if (childType instanceof JDefinedClass && superType instanceof JDefinedClass) {
                JDefinedClass childClass = (JDefinedClass) childType;

                // Hack to remove the type field
                JMethod getMethod = null;
                JMethod setMethod = null;
                for (JMethod method : childClass.methods()) {
                    if (method.name().contains("getType")) {
                        getMethod = method;
                    } else if (method.name().contains("setType")) {
                        setMethod = method;
                    }

                }
                childClass.methods().remove(getMethod);
                childClass.methods().remove(setMethod);

                for (JMethod method : childClass.methods()) {
                    if (method.name().contains("getMetaData")) {
                        getMethod = method;
                    } else if (method.name().contains("setMetaData")) {
                        setMethod = method;
                    }

                }
                childClass.methods().remove(getMethod);
                childClass.methods().remove(setMethod);

                childClass._extends((JDefinedClass) superType);
                return childClass;
            }

        }

        JType javaType;
        if (schemaNode.has("enum")) {
            javaType = ruleFactory.getEnumRule().apply(nodeName, schemaNode, generatableType, schema);
        } else {
            javaType = ruleFactory.getTypeRule().apply(nodeName, schemaNode, generatableType.getPackage(), schema);
        }
        schema.setJavaTypeIfEmpty(javaType);
        System.err.println("construct type: " + javaType.name());
        return javaType;
    }

    private String getClassName(String nodeName, JPackage _package) {
        String className = ruleFactory.getNameHelper().replaceIllegalCharacters(capitalize(nodeName));
        String normalizedName = ruleFactory.getNameHelper().normalizeName(className);
        return normalizedName;
    }
}