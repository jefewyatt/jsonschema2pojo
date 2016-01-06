
package com.example;

import java.util.HashMap;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taxYear",
    "offering",
    "os",
    "form",
    "lang",
    "version",
    "recipe"
})
public class Context {

    @JsonProperty("taxYear")
    private String taxYear;
    @JsonProperty("offering")
    private String offering;
    @JsonProperty("os")
    private String os;
    @JsonProperty("form")
    private String form;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("version")
    private String version;
    @JsonProperty("recipe")
    private String recipe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The taxYear
     */
    @JsonProperty("taxYear")
    public String getTaxYear() {
        return taxYear;
    }

    /**
     * 
     * @param taxYear
     *     The taxYear
     */
    @JsonProperty("taxYear")
    public void setTaxYear(String taxYear) {
        this.taxYear = taxYear;
    }

    /**
     * 
     * @return
     *     The offering
     */
    @JsonProperty("offering")
    public String getOffering() {
        return offering;
    }

    /**
     * 
     * @param offering
     *     The offering
     */
    @JsonProperty("offering")
    public void setOffering(String offering) {
        this.offering = offering;
    }

    /**
     * 
     * @return
     *     The os
     */
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    /**
     * 
     * @param os
     *     The os
     */
    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * 
     * @return
     *     The form
     */
    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    /**
     * 
     * @param form
     *     The form
     */
    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * 
     * @return
     *     The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * 
     * @param lang
     *     The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The recipe
     */
    @JsonProperty("recipe")
    public String getRecipe() {
        return recipe;
    }

    /**
     * 
     * @param recipe
     *     The recipe
     */
    @JsonProperty("recipe")
    public void setRecipe(String recipe) {
        this.recipe = recipe;
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
        return new HashCodeBuilder().append(taxYear).append(offering).append(os).append(form).append(lang).append(version).append(recipe).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Context) == false) {
            return false;
        }
        Context rhs = ((Context) other);
        return new EqualsBuilder().append(taxYear, rhs.taxYear).append(offering, rhs.offering).append(os, rhs.os).append(form, rhs.form).append(lang, rhs.lang).append(version, rhs.version).append(recipe, rhs.recipe).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
