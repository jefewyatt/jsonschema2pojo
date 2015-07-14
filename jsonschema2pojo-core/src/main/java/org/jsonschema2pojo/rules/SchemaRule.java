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

import java.util.LinkedList;

import com.fasterxml.jackson.databind.JsonNode;

import org.jsonschema2pojo.Schema;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JDefinedClass;
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
        System.err.println("NAME " + nodeName);
        if (nodeName.equals("view")) {
            System.out.println("break");
        }
        if (schemaNode.has("$ref")) {
            schema = ruleFactory.getSchemaStore().create(schema, schemaNode.get("$ref").asText());
            schemaNode = schema.getContent();

            if (schema.isGenerated()) {
                return schema.getJavaType();
            }

            return apply(nodeName, schemaNode, generatableType, schema);
        }

        // Trying the oneOf bullshit
        if (schemaNode.has("oneOf") || schemaNode.has("anyOf")) {
            // create the empty polymorphic container

            System.err.println("Node name: " + nodeName);
            JDefinedClass superType;
            try {
                superType = generatableType.owner()._class(JMod.PUBLIC, getClassName(nodeName, generatableType.getPackage()), ClassType.CLASS);
            } catch (JClassAlreadyExistsException e) {
                superType = e.getExistingClass();
            }
            System.err.println("Super type: " + superType.name());

            // Now let's iterate through the schemas and get their types:
            for (JsonNode childSchema : schemaNode.get("oneOf")) {
                if (childSchema.has("$ref")) {
                    int index = childSchema.get("$ref").asText().lastIndexOf("/");
                    nodeName.add(childSchema.get("$ref").asText().substring(index));
                    System.out.println("=========" + nodeName);
                }
                JType childType = apply(nodeName, childSchema, generatableType, schema);
                // let's see if this cast works =/
                if (childType instanceof JDefinedClass) {
                    JDefinedClass childClass = (JDefinedClass) childType;

                    childClass._extends(superType);
                }
            }
            return superType;
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