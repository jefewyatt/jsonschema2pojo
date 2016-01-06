
package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "values"
})
public class AssetSummaryTotal
    extends Asset
{

    @JsonProperty("type")
    private AssetSummaryTotal.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private TextAssets label;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("values")
    private List<Value__> values = new ArrayList<Value__>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetSummaryTotal.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetSummaryTotal.Type type) {
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
     * 
     * (Required)
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value__> getValues() {
        return values;
    }

    /**
     * 
     * (Required)
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Value__> values) {
        this.values = values;
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
        return new HashCodeBuilder().append(type).append(label).append(values).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetSummaryTotal) == false) {
            return false;
        }
        AssetSummaryTotal rhs = ((AssetSummaryTotal) other);
        return new EqualsBuilder().append(type, rhs.type).append(label, rhs.label).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        SUMMARY_TOTAL("summaryTotal");
        private final String value;
        private static Map<String, AssetSummaryTotal.Type> constants = new HashMap<String, AssetSummaryTotal.Type>();

        static {
            for (AssetSummaryTotal.Type c: values()) {
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
        public static AssetSummaryTotal.Type fromValue(String value) {
            AssetSummaryTotal.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
