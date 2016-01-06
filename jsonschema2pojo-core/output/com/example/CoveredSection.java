
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
    "label",
    "values"
})
public class CoveredSection {

    @JsonProperty("label")
    private TextAssets label;
    @JsonProperty("values")
    private List<AnyAssetWrapper> values = new ArrayList<AnyAssetWrapper>();

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public TextAssets getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(TextAssets label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<AnyAssetWrapper> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<AnyAssetWrapper> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(label).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoveredSection) == false) {
            return false;
        }
        CoveredSection rhs = ((CoveredSection) other);
        return new EqualsBuilder().append(label, rhs.label).append(values, rhs.values).isEquals();
    }

}
