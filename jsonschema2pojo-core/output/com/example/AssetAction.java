
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
    "id",
    "label",
    "value",
    "exp",
    "metaData",
    "accessibility",
    "confirmation"
})
public class AssetAction
    extends Asset
{

    @JsonProperty("type")
    private AssetAction.Type type;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private TextAssets label;
    @JsonProperty("value")
    private String value;
    @JsonProperty("exp")
    private Exp exp;
    @JsonProperty("metaData")
    private MetaData_ metaData;
    @JsonProperty("accessibility")
    private String accessibility;
    /**
     * 
     */
    @JsonProperty("confirmation")
    private ActionConfirmation confirmation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetAction.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetAction.Type type) {
        this.type = type;
    }

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
     *     The exp
     */
    @JsonProperty("exp")
    public Exp getExp() {
        return exp;
    }

    /**
     * 
     * @param exp
     *     The exp
     */
    @JsonProperty("exp")
    public void setExp(Exp exp) {
        this.exp = exp;
    }

    /**
     * 
     * @return
     *     The metaData
     */
    @JsonProperty("metaData")
    public MetaData_ getMetaData() {
        return metaData;
    }

    /**
     * 
     * @param metaData
     *     The metaData
     */
    @JsonProperty("metaData")
    public void setMetaData(MetaData_ metaData) {
        this.metaData = metaData;
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
     *     The confirmation
     */
    @JsonProperty("confirmation")
    public ActionConfirmation getConfirmation() {
        return confirmation;
    }

    /**
     * 
     * @param confirmation
     *     The confirmation
     */
    @JsonProperty("confirmation")
    public void setConfirmation(ActionConfirmation confirmation) {
        this.confirmation = confirmation;
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
        return new HashCodeBuilder().append(type).append(id).append(label).append(value).append(exp).append(metaData).append(accessibility).append(confirmation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetAction) == false) {
            return false;
        }
        AssetAction rhs = ((AssetAction) other);
        return new EqualsBuilder().append(type, rhs.type).append(id, rhs.id).append(label, rhs.label).append(value, rhs.value).append(exp, rhs.exp).append(metaData, rhs.metaData).append(accessibility, rhs.accessibility).append(confirmation, rhs.confirmation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        ACTION("action");
        private final String value;
        private static Map<String, AssetAction.Type> constants = new HashMap<String, AssetAction.Type>();

        static {
            for (AssetAction.Type c: values()) {
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
        public static AssetAction.Type fromValue(String value) {
            AssetAction.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
