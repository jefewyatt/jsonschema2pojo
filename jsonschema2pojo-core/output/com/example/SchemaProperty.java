
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
    "UUID",
    "enum",
    "type"
})
public class SchemaProperty {

    /**
     * 
     */
    @JsonProperty("UUID")
    private com.example.UUID UUID;
    @JsonProperty("enum")
    private List<Object> _enum = new ArrayList<Object>();
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, SchemaPropertyProperty> additionalProperties = new HashMap<String, SchemaPropertyProperty>();

    /**
     * 
     * @return
     *     The UUID
     */
    @JsonProperty("UUID")
    public com.example.UUID getUUID() {
        return UUID;
    }

    /**
     * 
     * @param UUID
     *     The UUID
     */
    @JsonProperty("UUID")
    public void setUUID(com.example.UUID UUID) {
        this.UUID = UUID;
    }

    /**
     * 
     * @return
     *     The _enum
     */
    @JsonProperty("enum")
    public List<Object> getEnum() {
        return _enum;
    }

    /**
     * 
     * @param _enum
     *     The enum
     */
    @JsonProperty("enum")
    public void setEnum(List<Object> _enum) {
        this._enum = _enum;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, SchemaPropertyProperty> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, SchemaPropertyProperty value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(UUID).append(_enum).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SchemaProperty) == false) {
            return false;
        }
        SchemaProperty rhs = ((SchemaProperty) other);
        return new EqualsBuilder().append(UUID, rhs.UUID).append(_enum, rhs._enum).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
