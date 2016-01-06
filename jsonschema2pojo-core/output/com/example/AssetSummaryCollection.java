
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
    "modelUUIDs",
    "values",
    "actions",
    "totals",
    "binding"
})
public class AssetSummaryCollection
    extends Asset
{

    @JsonProperty("type")
    private AssetSummaryCollection.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modelUUIDs")
    private List<String> modelUUIDs = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("values")
    private List<Value> values = new ArrayList<Value>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actions")
    private List<Actions_> actions = new ArrayList<Actions_>();
    /**
     * 
     */
    @JsonProperty("totals")
    private Totals totals;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("binding")
    private String binding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetSummaryCollection.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetSummaryCollection.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The modelUUIDs
     */
    @JsonProperty("modelUUIDs")
    public List<String> getModelUUIDs() {
        return modelUUIDs;
    }

    /**
     * 
     * (Required)
     * 
     * @param modelUUIDs
     *     The modelUUIDs
     */
    @JsonProperty("modelUUIDs")
    public void setModelUUIDs(List<String> modelUUIDs) {
        this.modelUUIDs = modelUUIDs;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value> getValues() {
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
    public void setValues(List<Value> values) {
        this.values = values;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param actions
     *     The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Actions_> actions) {
        this.actions = actions;
    }

    /**
     * 
     * @return
     *     The totals
     */
    @JsonProperty("totals")
    public Totals getTotals() {
        return totals;
    }

    /**
     * 
     * @param totals
     *     The totals
     */
    @JsonProperty("totals")
    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param binding
     *     The binding
     */
    @JsonProperty("binding")
    public void setBinding(String binding) {
        this.binding = binding;
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
        return new HashCodeBuilder().append(type).append(modelUUIDs).append(values).append(actions).append(totals).append(binding).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetSummaryCollection) == false) {
            return false;
        }
        AssetSummaryCollection rhs = ((AssetSummaryCollection) other);
        return new EqualsBuilder().append(type, rhs.type).append(modelUUIDs, rhs.modelUUIDs).append(values, rhs.values).append(actions, rhs.actions).append(totals, rhs.totals).append(binding, rhs.binding).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        SUMMARY_COLLECTION("summaryCollection");
        private final String value;
        private static Map<String, AssetSummaryCollection.Type> constants = new HashMap<String, AssetSummaryCollection.Type>();

        static {
            for (AssetSummaryCollection.Type c: values()) {
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
        public static AssetSummaryCollection.Type fromValue(String value) {
            AssetSummaryCollection.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
