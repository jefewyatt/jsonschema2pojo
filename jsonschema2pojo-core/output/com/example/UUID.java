
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
    "type"
})
public class UUID {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Object type;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UUID) == false) {
            return false;
        }
        UUID rhs = ((UUID) other);
        return new EqualsBuilder().append(type, rhs.type).isEquals();
    }

}
