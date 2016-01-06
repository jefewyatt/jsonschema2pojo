
package com.example;

import java.util.ArrayList;
import java.util.List;
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
    "validation",
    "format"
})
public class TypesProperty {

    @JsonProperty("validation")
    private List<Validation_________> validation = new ArrayList<Validation_________>();
    @JsonProperty("format")
    private Format_ format;

    /**
     * 
     * @return
     *     The validation
     */
    @JsonProperty("validation")
    public List<Validation_________> getValidation() {
        return validation;
    }

    /**
     * 
     * @param validation
     *     The validation
     */
    @JsonProperty("validation")
    public void setValidation(List<Validation_________> validation) {
        this.validation = validation;
    }

    /**
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public Format_ getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(Format_ format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(validation).append(format).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TypesProperty) == false) {
            return false;
        }
        TypesProperty rhs = ((TypesProperty) other);
        return new EqualsBuilder().append(validation, rhs.validation).append(format, rhs.format).isEquals();
    }

}
