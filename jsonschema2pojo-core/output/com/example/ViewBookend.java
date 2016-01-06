
package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
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
    "id",
    "type",
    "title",
    "subtitle",
    "titleImage",
    "primaryInfo",
    "additionalInfo",
    "actions",
    "interactions",
    "listeners",
    "validation",
    "metaData",
    "footer",
    "header"
})
public class ViewBookend
    extends View
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private ViewBookend.Type type;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private AnyAssetWrapper title;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("subtitle")
    private AnyAssetWrapper subtitle;
    /**
     * 
     */
    @JsonProperty("titleImage")
    private TitleImage_____ titleImage;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("primaryInfo")
    private AnyAssetWrapper primaryInfo;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalInfo")
    private AnyAssetWrapper additionalInfo;
    @JsonProperty("actions")
    private List<Actions_> actions = new ArrayList<Actions_>();
    @JsonProperty("interactions")
    private List<Object> interactions = new ArrayList<Object>();
    @JsonProperty("listeners")
    private Listeners______ listeners;
    @JsonProperty("validation")
    private List<Validation______> validation = new ArrayList<Validation______>();
    @JsonProperty("metaData")
    private MetaData__ metaData;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("footer")
    private AnyAssetWrapper footer;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("header")
    private AnyAssetWrapper header;

    /**
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
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public ViewBookend.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(ViewBookend.Type type) {
        this.type = type;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public AnyAssetWrapper getTitle() {
        return title;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(AnyAssetWrapper title) {
        this.title = title;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The subtitle
     */
    @JsonProperty("subtitle")
    public AnyAssetWrapper getSubtitle() {
        return subtitle;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param subtitle
     *     The subtitle
     */
    @JsonProperty("subtitle")
    public void setSubtitle(AnyAssetWrapper subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * 
     * @return
     *     The titleImage
     */
    @JsonProperty("titleImage")
    public TitleImage_____ getTitleImage() {
        return titleImage;
    }

    /**
     * 
     * @param titleImage
     *     The titleImage
     */
    @JsonProperty("titleImage")
    public void setTitleImage(TitleImage_____ titleImage) {
        this.titleImage = titleImage;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The primaryInfo
     */
    @JsonProperty("primaryInfo")
    public AnyAssetWrapper getPrimaryInfo() {
        return primaryInfo;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param primaryInfo
     *     The primaryInfo
     */
    @JsonProperty("primaryInfo")
    public void setPrimaryInfo(AnyAssetWrapper primaryInfo) {
        this.primaryInfo = primaryInfo;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The additionalInfo
     */
    @JsonProperty("additionalInfo")
    public AnyAssetWrapper getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param additionalInfo
     *     The additionalInfo
     */
    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AnyAssetWrapper additionalInfo) {
        this.additionalInfo = additionalInfo;
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

    /**
     * 
     * @return
     *     The interactions
     */
    @JsonProperty("interactions")
    public List<Object> getInteractions() {
        return interactions;
    }

    /**
     * 
     * @param interactions
     *     The interactions
     */
    @JsonProperty("interactions")
    public void setInteractions(List<Object> interactions) {
        this.interactions = interactions;
    }

    /**
     * 
     * @return
     *     The listeners
     */
    @JsonProperty("listeners")
    public Listeners______ getListeners() {
        return listeners;
    }

    /**
     * 
     * @param listeners
     *     The listeners
     */
    @JsonProperty("listeners")
    public void setListeners(Listeners______ listeners) {
        this.listeners = listeners;
    }

    /**
     * 
     * @return
     *     The validation
     */
    @JsonProperty("validation")
    public List<Validation______> getValidation() {
        return validation;
    }

    /**
     * 
     * @param validation
     *     The validation
     */
    @JsonProperty("validation")
    public void setValidation(List<Validation______> validation) {
        this.validation = validation;
    }

    /**
     * 
     * @return
     *     The metaData
     */
    @JsonProperty("metaData")
    public MetaData__ getMetaData() {
        return metaData;
    }

    /**
     * 
     * @param metaData
     *     The metaData
     */
    @JsonProperty("metaData")
    public void setMetaData(MetaData__ metaData) {
        this.metaData = metaData;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The footer
     */
    @JsonProperty("footer")
    public AnyAssetWrapper getFooter() {
        return footer;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param footer
     *     The footer
     */
    @JsonProperty("footer")
    public void setFooter(AnyAssetWrapper footer) {
        this.footer = footer;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The header
     */
    @JsonProperty("header")
    public AnyAssetWrapper getHeader() {
        return header;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param header
     *     The header
     */
    @JsonProperty("header")
    public void setHeader(AnyAssetWrapper header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(type).append(title).append(subtitle).append(titleImage).append(primaryInfo).append(additionalInfo).append(actions).append(interactions).append(listeners).append(validation).append(metaData).append(footer).append(header).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewBookend) == false) {
            return false;
        }
        ViewBookend rhs = ((ViewBookend) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(title, rhs.title).append(subtitle, rhs.subtitle).append(titleImage, rhs.titleImage).append(primaryInfo, rhs.primaryInfo).append(additionalInfo, rhs.additionalInfo).append(actions, rhs.actions).append(interactions, rhs.interactions).append(listeners, rhs.listeners).append(validation, rhs.validation).append(metaData, rhs.metaData).append(footer, rhs.footer).append(header, rhs.header).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        BOOKEND("bookend");
        private final String value;
        private static Map<String, ViewBookend.Type> constants = new HashMap<String, ViewBookend.Type>();

        static {
            for (ViewBookend.Type c: values()) {
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
        public static ViewBookend.Type fromValue(String value) {
            ViewBookend.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
