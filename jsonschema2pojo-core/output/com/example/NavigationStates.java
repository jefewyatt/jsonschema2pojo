
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
    "state_type",
    "ref",
    "transitions"
})
public class NavigationStates {

    @JsonProperty("state_type")
    private NavigationStates.StateType stateType;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("transitions")
    private Transitions transitions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The stateType
     */
    @JsonProperty("state_type")
    public NavigationStates.StateType getStateType() {
        return stateType;
    }

    /**
     * 
     * @param stateType
     *     The state_type
     */
    @JsonProperty("state_type")
    public void setStateType(NavigationStates.StateType stateType) {
        this.stateType = stateType;
    }

    /**
     * 
     * @return
     *     The ref
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * 
     * @param ref
     *     The ref
     */
    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * 
     * @return
     *     The transitions
     */
    @JsonProperty("transitions")
    public Transitions getTransitions() {
        return transitions;
    }

    /**
     * 
     * @param transitions
     *     The transitions
     */
    @JsonProperty("transitions")
    public void setTransitions(Transitions transitions) {
        this.transitions = transitions;
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
        return new HashCodeBuilder().append(stateType).append(ref).append(transitions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NavigationStates) == false) {
            return false;
        }
        NavigationStates rhs = ((NavigationStates) other);
        return new EqualsBuilder().append(stateType, rhs.stateType).append(ref, rhs.ref).append(transitions, rhs.transitions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum StateType {

        VIEW("VIEW"),
        ACTION("ACTION"),
        END("END");
        private final String value;
        private static Map<String, NavigationStates.StateType> constants = new HashMap<String, NavigationStates.StateType>();

        static {
            for (NavigationStates.StateType c: values()) {
                constants.put(c.value, c);
            }
        }

        private StateType(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static NavigationStates.StateType fromValue(String value) {
            NavigationStates.StateType constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
