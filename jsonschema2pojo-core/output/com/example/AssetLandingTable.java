
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
    "description",
    "values",
    "binding",
    "actions"
})
public class AssetLandingTable
    extends Asset
{

    @JsonProperty("type")
    private AssetLandingTable.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private TextAssets label;
    @JsonProperty("description")
    private TextAssets description;
    @JsonProperty("values")
    private List<Value___> values = new ArrayList<Value___>();
    @JsonProperty("binding")
    private String binding;
    @JsonProperty("actions")
    private List<Actions_> actions = new ArrayList<Actions_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetLandingTable.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetLandingTable.Type type) {
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
     * @return
     *     The description
     */
    @JsonProperty("description")
    public TextAssets getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(TextAssets description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value___> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Value___> values) {
        this.values = values;
    }

    /**
     * 
     * @return
     *     The binding
     */
    @JsonProperty("binding")
    public String getBinding() {
        return binding;
    }

    /**
     * 
     * @param binding
     *     The binding
     */
    @JsonProperty("binding")
    public void setBinding(String binding) {
        this.binding = binding;
    }

    /**
     * 
     * @return
     *     The actions
     */
    @JsonProperty("actions")
    public List<Actions_> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Actions_> actions) {
        this.actions = actions;
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
        return new HashCodeBuilder().append(type).append(label).append(description).append(values).append(binding).append(actions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetLandingTable) == false) {
            return false;
        }
        AssetLandingTable rhs = ((AssetLandingTable) other);
        return new EqualsBuilder().append(type, rhs.type).append(label, rhs.label).append(description, rhs.description).append(values, rhs.values).append(binding, rhs.binding).append(actions, rhs.actions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        LANDING_TABLE("landingTable");
        private final String value;
        private static Map<String, AssetLandingTable.Type> constants = new HashMap<String, AssetLandingTable.Type>();

        static {
            for (AssetLandingTable.Type c: values()) {
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
        public static AssetLandingTable.Type fromValue(String value) {
            AssetLandingTable.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
