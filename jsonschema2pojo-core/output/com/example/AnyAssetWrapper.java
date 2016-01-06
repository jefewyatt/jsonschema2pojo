
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


/**
 * anyAssetWrapper
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "asset",
    "staticSwitch"
})
public class AnyAssetWrapper {

    @JsonProperty("asset")
    private AnyAsset asset;
    @JsonProperty("staticSwitch")
    private List<StaticSwitch> staticSwitch = new ArrayList<StaticSwitch>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The asset
     */
    @JsonProperty("asset")
    public AnyAsset getAsset() {
        return asset;
    }

    /**
     * 
     * @param asset
     *     The asset
     */
    @JsonProperty("asset")
    public void setAsset(AnyAsset asset) {
        this.asset = asset;
    }

    /**
     * 
     * @return
     *     The staticSwitch
     */
    @JsonProperty("staticSwitch")
    public List<StaticSwitch> getStaticSwitch() {
        return staticSwitch;
    }

    /**
     * 
     * @param staticSwitch
     *     The staticSwitch
     */
    @JsonProperty("staticSwitch")
    public void setStaticSwitch(List<StaticSwitch> staticSwitch) {
        this.staticSwitch = staticSwitch;
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
        return new HashCodeBuilder().append(asset).append(staticSwitch).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnyAssetWrapper) == false) {
            return false;
        }
        AnyAssetWrapper rhs = ((AnyAssetWrapper) other);
        return new EqualsBuilder().append(asset, rhs.asset).append(staticSwitch, rhs.staticSwitch).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
