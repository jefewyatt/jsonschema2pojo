
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
    "FRFVersion",
    "MEFVersion"
})
public class MetaData___ {

    @JsonProperty("FRFVersion")
    private String FRFVersion;
    @JsonProperty("MEFVersion")
    private String MEFVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FRFVersion
     */
    @JsonProperty("FRFVersion")
    public String getFRFVersion() {
        return FRFVersion;
    }

    /**
     * 
     * @param FRFVersion
     *     The FRFVersion
     */
    @JsonProperty("FRFVersion")
    public void setFRFVersion(String FRFVersion) {
        this.FRFVersion = FRFVersion;
    }

    /**
     * 
     * @return
     *     The MEFVersion
     */
    @JsonProperty("MEFVersion")
    public String getMEFVersion() {
        return MEFVersion;
    }

    /**
     * 
     * @param MEFVersion
     *     The MEFVersion
     */
    @JsonProperty("MEFVersion")
    public void setMEFVersion(String MEFVersion) {
        this.MEFVersion = MEFVersion;
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
        return new HashCodeBuilder().append(FRFVersion).append(MEFVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaData___) == false) {
            return false;
        }
        MetaData___ rhs = ((MetaData___) other);
        return new EqualsBuilder().append(FRFVersion, rhs.FRFVersion).append(MEFVersion, rhs.MEFVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
