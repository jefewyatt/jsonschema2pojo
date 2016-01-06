
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
    "binding",
    "affirmativeAction",
    "negativeAction",
    "prevAction"
})
public class GatewayActions {

    @JsonProperty("binding")
    private String binding;
    /**
     * actions
     * <p>
     * 
     * 
     */
    @JsonProperty("affirmativeAction")
    private Actions_ affirmativeAction;
    /**
     * actions
     * <p>
     * 
     * 
     */
    @JsonProperty("negativeAction")
    private Actions_ negativeAction;
    /**
     * actions
     * <p>
     * 
     * 
     */
    @JsonProperty("prevAction")
    private Actions_ prevAction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * actions
     * <p>
     * 
     * 
     * @return
     *     The affirmativeAction
     */
    @JsonProperty("affirmativeAction")
    public Actions_ getAffirmativeAction() {
        return affirmativeAction;
    }

    /**
     * actions
     * <p>
     * 
     * 
     * @param affirmativeAction
     *     The affirmativeAction
     */
    @JsonProperty("affirmativeAction")
    public void setAffirmativeAction(Actions_ affirmativeAction) {
        this.affirmativeAction = affirmativeAction;
    }

    /**
     * actions
     * <p>
     * 
     * 
     * @return
     *     The negativeAction
     */
    @JsonProperty("negativeAction")
    public Actions_ getNegativeAction() {
        return negativeAction;
    }

    /**
     * actions
     * <p>
     * 
     * 
     * @param negativeAction
     *     The negativeAction
     */
    @JsonProperty("negativeAction")
    public void setNegativeAction(Actions_ negativeAction) {
        this.negativeAction = negativeAction;
    }

    /**
     * actions
     * <p>
     * 
     * 
     * @return
     *     The prevAction
     */
    @JsonProperty("prevAction")
    public Actions_ getPrevAction() {
        return prevAction;
    }

    /**
     * actions
     * <p>
     * 
     * 
     * @param prevAction
     *     The prevAction
     */
    @JsonProperty("prevAction")
    public void setPrevAction(Actions_ prevAction) {
        this.prevAction = prevAction;
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
        return new HashCodeBuilder().append(binding).append(affirmativeAction).append(negativeAction).append(prevAction).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GatewayActions) == false) {
            return false;
        }
        GatewayActions rhs = ((GatewayActions) other);
        return new EqualsBuilder().append(binding, rhs.binding).append(affirmativeAction, rhs.affirmativeAction).append(negativeAction, rhs.negativeAction).append(prevAction, rhs.prevAction).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
