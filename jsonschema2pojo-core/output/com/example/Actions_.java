
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
    "asset"
})
public class Actions_
    extends Actions
{

    /**
     * assetAction
     * <p>
     * 
     * 
     */
    @JsonProperty("asset")
    private Object asset;

    /**
     * assetAction
     * <p>
     * 
     * 
     * @return
     *     The asset
     */
    @JsonProperty("asset")
    public Object getAsset() {
        return asset;
    }

    /**
     * assetAction
     * <p>
     * 
     * 
     * @param asset
     *     The asset
     */
    @JsonProperty("asset")
    public void setAsset(Object asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(asset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Actions_) == false) {
            return false;
        }
        Actions_ rhs = ((Actions_) other);
        return new EqualsBuilder().append(asset, rhs.asset).isEquals();
    }

}
