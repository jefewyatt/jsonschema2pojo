
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
    "asset",
    "staticSwitch"
})
public class TextAssets {

    @JsonProperty("asset")
    private Object asset;
    @JsonProperty("staticSwitch")
    private List<StaticSwitch> staticSwitch = new ArrayList<StaticSwitch>();

    /**
     * 
     * @return
     *     The asset
     */
    @JsonProperty("asset")
    public Object getAsset() {
        return asset;
    }

    /**
     * 
     * @param asset
     *     The asset
     */
    @JsonProperty("asset")
    public void setAsset(Object asset) {
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(asset).append(staticSwitch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextAssets) == false) {
            return false;
        }
        TextAssets rhs = ((TextAssets) other);
        return new EqualsBuilder().append(asset, rhs.asset).append(staticSwitch, rhs.staticSwitch).isEquals();
    }

}
