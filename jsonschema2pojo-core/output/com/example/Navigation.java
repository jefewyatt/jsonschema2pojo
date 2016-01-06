
package com.example;

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
    "BEGIN"
})
public class Navigation {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BEGIN")
    private String BEGIN;
    @JsonProperty("flow")
    private List<Flow> flow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The BEGIN
     */
    @JsonProperty("BEGIN")
    public String getBEGIN() {
        return BEGIN;
    }

    /**
     * 
     * (Required)
     * 
     * @param BEGIN
     *     The BEGIN
     */
    @JsonProperty("BEGIN")
    public void setBEGIN(String BEGIN) {
        this.BEGIN = BEGIN;
    }

    /**
     * 
     * @return
     *     The flow
     */
    @JsonProperty("flow")
    public List<Flow> getFlow() {
        return flow;
    }

    /**
     * 
     * @param flow
     *     The flow
     */
    @JsonProperty("flow")
    public void setFlow(List<Flow> flow) {
        this.flow = flow;
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
        return new HashCodeBuilder().append(BEGIN).append(flow).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Navigation) == false) {
            return false;
        }
        Navigation rhs = ((Navigation) other);
        return new EqualsBuilder().append(BEGIN, rhs.BEGIN).append(flow, rhs.flow).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
