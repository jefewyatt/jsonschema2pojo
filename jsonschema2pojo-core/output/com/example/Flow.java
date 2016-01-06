
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
    "startState",
    "onStart",
    "END_done"
})
public class Flow {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startState")
    private String startState;
    @JsonProperty("onStart")
    private OnStart onStart;
    /**
     * 
     */
    @JsonProperty("END_done")
    private com.example.ENDDone ENDDone;
    @JsonProperty("navigationState")
    private List<NavigationStates> navigationState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The startState
     */
    @JsonProperty("startState")
    public String getStartState() {
        return startState;
    }

    /**
     * 
     * (Required)
     * 
     * @param startState
     *     The startState
     */
    @JsonProperty("startState")
    public void setStartState(String startState) {
        this.startState = startState;
    }

    /**
     * 
     * @return
     *     The onStart
     */
    @JsonProperty("onStart")
    public OnStart getOnStart() {
        return onStart;
    }

    /**
     * 
     * @param onStart
     *     The onStart
     */
    @JsonProperty("onStart")
    public void setOnStart(OnStart onStart) {
        this.onStart = onStart;
    }

    /**
     * 
     * @return
     *     The ENDDone
     */
    @JsonProperty("END_done")
    public com.example.ENDDone getENDDone() {
        return ENDDone;
    }

    /**
     * 
     * @param ENDDone
     *     The END_done
     */
    @JsonProperty("END_done")
    public void setENDDone(com.example.ENDDone ENDDone) {
        this.ENDDone = ENDDone;
    }

    /**
     * 
     * @return
     *     The navigationState
     */
    @JsonProperty("navigationState")
    public List<NavigationStates> getNavigationState() {
        return navigationState;
    }

    /**
     * 
     * @param navigationState
     *     The navigationState
     */
    @JsonProperty("navigationState")
    public void setNavigationState(List<NavigationStates> navigationState) {
        this.navigationState = navigationState;
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
        return new HashCodeBuilder().append(startState).append(onStart).append(ENDDone).append(navigationState).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flow) == false) {
            return false;
        }
        Flow rhs = ((Flow) other);
        return new EqualsBuilder().append(startState, rhs.startState).append(onStart, rhs.onStart).append(ENDDone, rhs.ENDDone).append(navigationState, rhs.navigationState).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
