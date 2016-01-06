
package com.example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "label",
    "value"
})
public class AssetSummaryItem
    extends Asset
{

    @JsonProperty("type")
    private AssetSummaryItem.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private TextAssets label;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("value")
    private AnyAssetWrapper value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetSummaryItem.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetSummaryItem.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(TextAssets label) {
        this.label = label;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public AnyAssetWrapper getValue() {
        return value;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(AnyAssetWrapper value) {
        this.value = value;
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
        return new HashCodeBuilder().append(type).append(label).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetSummaryItem) == false) {
            return false;
        }
        AssetSummaryItem rhs = ((AssetSummaryItem) other);
        return new EqualsBuilder().append(type, rhs.type).append(label, rhs.label).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        SUMMARY_ITEM("summaryItem");
        private final String value;
        private static Map<String, AssetSummaryItem.Type> constants = new HashMap<String, AssetSummaryItem.Type>();

        static {
            for (AssetSummaryItem.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static AssetSummaryItem.Type fromValue(String value) {
            AssetSummaryItem.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
