
package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "applicability",
    "accessibility",
    "metaData",
    "modifiers",
    "template",
    "templateData",
    "templateOutput",
    "_serviceParams",
    "_comment"
})
public class Asset {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonProperty("applicability")
    private String applicability;
    @JsonProperty("accessibility")
    private String accessibility;
    @JsonProperty("metaData")
    private MetaData metaData;
    @JsonProperty("modifiers")
    private List<Object> modifiers = new ArrayList<Object>();
    @JsonProperty("template")
    private Object template;
    @JsonProperty("templateData")
    private String templateData;
    @JsonProperty("templateOutput")
    private String templateOutput;
    @JsonProperty("_serviceParams")
    private com.example.ServiceParams ServiceParams;
    @JsonProperty("_comment")
    private String Comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The applicability
     */
    @JsonProperty("applicability")
    public String getApplicability() {
        return applicability;
    }

    /**
     * 
     * @param applicability
     *     The applicability
     */
    @JsonProperty("applicability")
    public void setApplicability(String applicability) {
        this.applicability = applicability;
    }

    /**
     * 
     * @return
     *     The accessibility
     */
    @JsonProperty("accessibility")
    public String getAccessibility() {
        return accessibility;
    }

    /**
     * 
     * @param accessibility
     *     The accessibility
     */
    @JsonProperty("accessibility")
    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    /**
     * 
     * @return
     *     The metaData
     */
    @JsonProperty("metaData")
    public MetaData getMetaData() {
        return metaData;
    }

    /**
     * 
     * @param metaData
     *     The metaData
     */
    @JsonProperty("metaData")
    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    /**
     * 
     * @return
     *     The modifiers
     */
    @JsonProperty("modifiers")
    public List<Object> getModifiers() {
        return modifiers;
    }

    /**
     * 
     * @param modifiers
     *     The modifiers
     */
    @JsonProperty("modifiers")
    public void setModifiers(List<Object> modifiers) {
        this.modifiers = modifiers;
    }

    /**
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public Object getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(Object template) {
        this.template = template;
    }

    /**
     * 
     * @return
     *     The templateData
     */
    @JsonProperty("templateData")
    public String getTemplateData() {
        return templateData;
    }

    /**
     * 
     * @param templateData
     *     The templateData
     */
    @JsonProperty("templateData")
    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    /**
     * 
     * @return
     *     The templateOutput
     */
    @JsonProperty("templateOutput")
    public String getTemplateOutput() {
        return templateOutput;
    }

    /**
     * 
     * @param templateOutput
     *     The templateOutput
     */
    @JsonProperty("templateOutput")
    public void setTemplateOutput(String templateOutput) {
        this.templateOutput = templateOutput;
    }

    /**
     * 
     * @return
     *     The ServiceParams
     */
    @JsonProperty("_serviceParams")
    public com.example.ServiceParams getServiceParams() {
        return ServiceParams;
    }

    /**
     * 
     * @param ServiceParams
     *     The _serviceParams
     */
    @JsonProperty("_serviceParams")
    public void setServiceParams(com.example.ServiceParams ServiceParams) {
        this.ServiceParams = ServiceParams;
    }

    /**
     * 
     * @return
     *     The Comment
     */
    @JsonProperty("_comment")
    public String getComment() {
        return Comment;
    }

    /**
     * 
     * @param Comment
     *     The _comment
     */
    @JsonProperty("_comment")
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(type).append(applicability).append(accessibility).append(metaData).append(modifiers).append(template).append(templateData).append(templateOutput).append(ServiceParams).append(Comment).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Asset) == false) {
            return false;
        }
        Asset rhs = ((Asset) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(applicability, rhs.applicability).append(accessibility, rhs.accessibility).append(metaData, rhs.metaData).append(modifiers, rhs.modifiers).append(template, rhs.template).append(templateData, rhs.templateData).append(templateOutput, rhs.templateOutput).append(ServiceParams, rhs.ServiceParams).append(Comment, rhs.Comment).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
