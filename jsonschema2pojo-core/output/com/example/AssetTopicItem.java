
package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "value",
    "actions"
})
public class AssetTopicItem
    extends Asset
{

    @JsonProperty("type")
    private AssetTopicItem.Type type;
    @JsonProperty("value")
    private TextAssets value;
    @JsonProperty("actions")
    private List<Actions_> actions = new ArrayList<Actions_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public AssetTopicItem.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(AssetTopicItem.Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public TextAssets getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(TextAssets value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The actions
     */
    @JsonProperty("actions")
    public List<Actions_> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Actions_> actions) {
        this.actions = actions;
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
        return new HashCodeBuilder().append(type).append(value).append(actions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetTopicItem) == false) {
            return false;
        }
        AssetTopicItem rhs = ((AssetTopicItem) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).append(actions, rhs.actions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        TOPIC_ITEM("topicItem");
        private final String value;
        private static Map<String, AssetTopicItem.Type> constants = new HashMap<String, AssetTopicItem.Type>();

        static {
            for (AssetTopicItem.Type c: values()) {
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
        public static AssetTopicItem.Type fromValue(String value) {
            AssetTopicItem.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
