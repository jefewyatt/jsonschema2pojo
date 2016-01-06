
package com.example;

import java.util.HashMap;
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
    "state_type",
    "outcome"
})
public class ENDDone {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state_type")
    private String stateType;
    @JsonProperty("outcome")
    private String outcome;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stateType
     */
    @JsonProperty("state_type")
    public String getStateType() {
        return stateType;
    }

    /**
     * 
     * (Required)
     * 
     * @param stateType
     *     The state_type
     */
    @JsonProperty("state_type")
    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    /**
     * 
     * @return
     *     The outcome
     */
    @JsonProperty("outcome")
    public String getOutcome() {
        return outcome;
    }

    /**
     * 
     * @param outcome
     *     The outcome
     */
    @JsonProperty("outcome")
    public void setOutcome(String outcome) {
        this.outcome = outcome;
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
        return new HashCodeBuilder().append(stateType).append(outcome).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ENDDone) == false) {
            return false;
        }
        ENDDone rhs = ((ENDDone) other);
        return new EqualsBuilder().append(stateType, rhs.stateType).append(outcome, rhs.outcome).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
