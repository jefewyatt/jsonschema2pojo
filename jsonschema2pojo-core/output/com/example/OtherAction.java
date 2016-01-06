
package com.example;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * otherAction
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "label",
    "metaData",
    "value",
    "applicability",
    "accessibility"
})
public class OtherAction
    extends Actions
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("label")
    private TextAssets label;
    @JsonProperty("metaData")
    private MetaData metaData;
    @JsonProperty("value")
    private String value;
    @JsonProperty("applicability")
    private String applicability;
    @JsonProperty("accessibility")
    private String accessibility;

    /**
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
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public TextAssets getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(TextAssets label) {
        this.label = label;
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
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(label).append(metaData).append(value).append(applicability).append(accessibility).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OtherAction) == false) {
            return false;
        }
        OtherAction rhs = ((OtherAction) other);
        return new EqualsBuilder().append(id, rhs.id).append(label, rhs.label).append(metaData, rhs.metaData).append(value, rhs.value).append(applicability, rhs.applicability).append(accessibility, rhs.accessibility).isEquals();
    }

}
