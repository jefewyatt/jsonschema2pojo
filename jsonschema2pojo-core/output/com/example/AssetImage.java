
package com.example;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "metaData",
    "caption"
})
public class AssetImage
    extends Asset
{

    @JsonProperty("type")
    private AssetImage.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metaData")
    private Object metaData;
    @JsonProperty("caption")
    private TextAssets caption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetImage.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetImage.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The metaData
     */
    @JsonProperty("metaData")
    public Object getMetaData() {
        return metaData;
    }

    /**
     * 
     * (Required)
     * 
     * @param metaData
     *     The metaData
     */
    @JsonProperty("metaData")
    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    /**
     * 
     * @return
     *     The caption
     */
    @JsonProperty("caption")
    public TextAssets getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    @JsonProperty("caption")
    public void setCaption(TextAssets caption) {
        this.caption = caption;
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
        return new HashCodeBuilder().append(type).append(metaData).append(caption).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetImage) == false) {
            return false;
        }
        AssetImage rhs = ((AssetImage) other);
        return new EqualsBuilder().append(type, rhs.type).append(metaData, rhs.metaData).append(caption, rhs.caption).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        IMAGE("image");
        private final String value;
        private static Map<String, AssetImage.Type> constants = new HashMap<String, AssetImage.Type>();

        static {
            for (AssetImage.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static AssetImage.Type fromValue(String value) {
            AssetImage.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
