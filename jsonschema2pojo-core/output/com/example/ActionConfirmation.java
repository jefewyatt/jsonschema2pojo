
package com.example;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "message",
    "affirmativeLabel",
    "negativeLabel"
})
public class ActionConfirmation {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("affirmativeLabel")
    private String affirmativeLabel;
    @JsonProperty("negativeLabel")
    private String negativeLabel;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * (Required)
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The affirmativeLabel
     */
    @JsonProperty("affirmativeLabel")
    public String getAffirmativeLabel() {
        return affirmativeLabel;
    }

    /**
     * 
     * (Required)
     * 
     * @param affirmativeLabel
     *     The affirmativeLabel
     */
    @JsonProperty("affirmativeLabel")
    public void setAffirmativeLabel(String affirmativeLabel) {
        this.affirmativeLabel = affirmativeLabel;
    }

    /**
     * 
     * @return
     *     The negativeLabel
     */
    @JsonProperty("negativeLabel")
    public String getNegativeLabel() {
        return negativeLabel;
    }

    /**
     * 
     * @param negativeLabel
     *     The negativeLabel
     */
    @JsonProperty("negativeLabel")
    public void setNegativeLabel(String negativeLabel) {
        this.negativeLabel = negativeLabel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).append(affirmativeLabel).append(negativeLabel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActionConfirmation) == false) {
            return false;
        }
        ActionConfirmation rhs = ((ActionConfirmation) other);
        return new EqualsBuilder().append(message, rhs.message).append(affirmativeLabel, rhs.affirmativeLabel).append(negativeLabel, rhs.negativeLabel).isEquals();
    }

}
