
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
    "id",
    "type",
    "listeners",
    "validation",
    "title",
    "subtitle",
    "titleImage",
    "tip",
    "primaryInfo",
    "additionalInfo",
    "summary",
    "actions",
    "interactions",
    "footer",
    "header"
})
public class ViewSummary
    extends View
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private ViewSummary.Type type;
    @JsonProperty("listeners")
    private Listeners__ listeners;
    @JsonProperty("validation")
    private List<Validation__> validation = new ArrayList<Validation__>();
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
    private TitleImage__ titleImage;
    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     */
    @JsonProperty("tip")
    private AnyAssetWrapper tip;
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
    /**
     * 
     */
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("actions")
    private List<Actions_> actions = new ArrayList<Actions_>();
    @JsonProperty("interactions")
    private List<Object> interactions = new ArrayList<Object>();
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public ViewSummary.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(ViewSummary.Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The listeners
     */
    @JsonProperty("listeners")
    public Listeners__ getListeners() {
        return listeners;
    }

    /**
     * 
     * @param listeners
     *     The listeners
     */
    @JsonProperty("listeners")
    public void setListeners(Listeners__ listeners) {
        this.listeners = listeners;
    }

    /**
     * 
     * @return
     *     The validation
     */
    @JsonProperty("validation")
    public List<Validation__> getValidation() {
        return validation;
    }

    /**
     * 
     * @param validation
     *     The validation
     */
    @JsonProperty("validation")
    public void setValidation(List<Validation__> validation) {
        this.validation = validation;
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
    public TitleImage__ getTitleImage() {
        return titleImage;
    }

    /**
     * 
     * @param titleImage
     *     The titleImage
     */
    @JsonProperty("titleImage")
    public void setTitleImage(TitleImage__ titleImage) {
        this.titleImage = titleImage;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @return
     *     The tip
     */
    @JsonProperty("tip")
    public AnyAssetWrapper getTip() {
        return tip;
    }

    /**
     * anyAssetWrapper
     * <p>
     * 
     * 
     * @param tip
     *     The tip
     */
    @JsonProperty("tip")
    public void setTip(AnyAssetWrapper tip) {
        this.tip = tip;
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
     *     The summary
     */
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
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
        return new HashCodeBuilder().append(id).append(type).append(listeners).append(validation).append(title).append(subtitle).append(titleImage).append(tip).append(primaryInfo).append(additionalInfo).append(summary).append(actions).append(interactions).append(footer).append(header).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewSummary) == false) {
            return false;
        }
        ViewSummary rhs = ((ViewSummary) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(listeners, rhs.listeners).append(validation, rhs.validation).append(title, rhs.title).append(subtitle, rhs.subtitle).append(titleImage, rhs.titleImage).append(tip, rhs.tip).append(primaryInfo, rhs.primaryInfo).append(additionalInfo, rhs.additionalInfo).append(summary, rhs.summary).append(actions, rhs.actions).append(interactions, rhs.interactions).append(footer, rhs.footer).append(header, rhs.header).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        SUMMARY("summary");
        private final String value;
        private static Map<String, ViewSummary.Type> constants = new HashMap<String, ViewSummary.Type>();

        static {
            for (ViewSummary.Type c: values()) {
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
        public static ViewSummary.Type fromValue(String value) {
            ViewSummary.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
