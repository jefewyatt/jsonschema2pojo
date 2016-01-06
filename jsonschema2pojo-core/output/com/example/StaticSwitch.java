
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
    "case",
    "asset"
})
public class StaticSwitch {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("case")
    private String _case;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset")
    private AnyAsset asset;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The _case
     */
    @JsonProperty("case")
    public String getCase() {
        return _case;
    }

    /**
     * 
     * (Required)
     * 
     * @param _case
     *     The case
     */
    @JsonProperty("case")
    public void setCase(String _case) {
        this._case = _case;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param asset
     *     The asset
     */
    @JsonProperty("asset")
    public void setAsset(AnyAsset asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_case).append(asset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StaticSwitch) == false) {
            return false;
        }
        StaticSwitch rhs = ((StaticSwitch) other);
        return new EqualsBuilder().append(_case, rhs._case).append(asset, rhs.asset).isEquals();
    }

}
