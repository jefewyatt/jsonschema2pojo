
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
    "id",
    "topic",
    "context",
    "views",
    "schema",
    "data",
    "navigation",
    "messages",
    "metaData",
    "types"
})
public class FuegoSchemaJson {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("context")
    private Context context;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("views")
    private List<View> views = new ArrayList<View>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("schema")
    private Schema schema;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private Data data;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("navigation")
    private Navigation navigation;
    @JsonProperty("messages")
    private Messages messages;
    @JsonProperty("metaData")
    private MetaData___ metaData;
    @JsonProperty("types")
    private Types types;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topic
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * 
     * (Required)
     * 
     * @param topic
     *     The topic
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * 
     * @return
     *     The context
     */
    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    /**
     * 
     * @param context
     *     The context
     */
    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The views
     */
    @JsonProperty("views")
    public List<View> getViews() {
        return views;
    }

    /**
     * 
     * (Required)
     * 
     * @param views
     *     The views
     */
    @JsonProperty("views")
    public void setViews(List<View> views) {
        this.views = views;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The schema
     */
    @JsonProperty("schema")
    public Schema getSchema() {
        return schema;
    }

    /**
     * 
     * (Required)
     * 
     * @param schema
     *     The schema
     */
    @JsonProperty("schema")
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The navigation
     */
    @JsonProperty("navigation")
    public Navigation getNavigation() {
        return navigation;
    }

    /**
     * 
     * (Required)
     * 
     * @param navigation
     *     The navigation
     */
    @JsonProperty("navigation")
    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The metaData
     */
    @JsonProperty("metaData")
    public MetaData___ getMetaData() {
        return metaData;
    }

    /**
     * 
     * @param metaData
     *     The metaData
     */
    @JsonProperty("metaData")
    public void setMetaData(MetaData___ metaData) {
        this.metaData = metaData;
    }

    /**
     * 
     * @return
     *     The types
     */
    @JsonProperty("types")
    public Types getTypes() {
        return types;
    }

    /**
     * 
     * @param types
     *     The types
     */
    @JsonProperty("types")
    public void setTypes(Types types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(topic).append(context).append(views).append(schema).append(data).append(navigation).append(messages).append(metaData).append(types).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FuegoSchemaJson) == false) {
            return false;
        }
        FuegoSchemaJson rhs = ((FuegoSchemaJson) other);
        return new EqualsBuilder().append(id, rhs.id).append(topic, rhs.topic).append(context, rhs.context).append(views, rhs.views).append(schema, rhs.schema).append(data, rhs.data).append(navigation, rhs.navigation).append(messages, rhs.messages).append(metaData, rhs.metaData).append(types, rhs.types).isEquals();
    }

}
