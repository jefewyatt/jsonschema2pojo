
package com.example;

import java.util.ArrayList;
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
    "type",
    "metadata",
    "validation",
    "format",
    "enum",
    "default"
})
public class SchemaPropertyProperty {

    @JsonProperty("type")
    private String type;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("validation")
    private List<Validation_______> validation = new ArrayList<Validation_______>();
    /**
     * 
     */
    @JsonProperty("format")
    private Format format;
    @JsonProperty("enum")
    private List<String> _enum = new ArrayList<String>();
    @JsonProperty("default")
    private String _default;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The validation
     */
    @JsonProperty("validation")
    public List<Validation_______> getValidation() {
        return validation;
    }

    /**
     * 
     * @param validation
     *     The validation
     */
    @JsonProperty("validation")
    public void setValidation(List<Validation_______> validation) {
        this.validation = validation;
    }

    /**
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public Format getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The _enum
     */
    @JsonProperty("enum")
    public List<String> getEnum() {
        return _enum;
    }

    /**
     * 
     * @param _enum
     *     The enum
     */
    @JsonProperty("enum")
    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    /**
     * 
     * @return
     *     The _default
     */
    @JsonProperty("default")
    public String getDefault() {
        return _default;
    }

    /**
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(String _default) {
        this._default = _default;
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
        return new HashCodeBuilder().append(type).append(metadata).append(validation).append(format).append(_enum).append(_default).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaPropertyProperty) == false) {
            return false;
        }
        SchemaPropertyProperty rhs = ((SchemaPropertyProperty) other);
        return new EqualsBuilder().append(type, rhs.type).append(metadata, rhs.metadata).append(validation, rhs.validation).append(format, rhs.format).append(_enum, rhs._enum).append(_default, rhs._default).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
