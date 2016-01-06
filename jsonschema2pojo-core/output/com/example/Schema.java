
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
    "ROOT"
})
public class Schema {

    @JsonProperty("ROOT")
    private com.example.ROOT ROOT;
    @JsonIgnore
    private Map<String, SchemaProperty> additionalProperties = new HashMap<String, SchemaProperty>();

    /**
     * 
     * @return
     *     The ROOT
     */
    @JsonProperty("ROOT")
    public com.example.ROOT getROOT() {
        return ROOT;
    }

    /**
     * 
     * @param ROOT
     *     The ROOT
     */
    @JsonProperty("ROOT")
    public void setROOT(com.example.ROOT ROOT) {
        this.ROOT = ROOT;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, SchemaProperty> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, SchemaProperty value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ROOT).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return new EqualsBuilder().append(ROOT, rhs.ROOT).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
