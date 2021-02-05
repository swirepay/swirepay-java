/*
 * Swirepay API
 * Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@swirepay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.swirepay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Currency
 */
@JsonPropertyOrder({
  Currency.JSON_PROPERTY_ID,
  Currency.JSON_PROPERTY_NAME,
  Currency.JSON_PROPERTY_PREFIX,
  Currency.JSON_PROPERTY_TO_FIXED,
  Currency.JSON_PROPERTY_COUNTRY_ALPHA2
})
@JsonTypeName("Currency")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:48:22.419Z[Etc/UTC]")
public class Currency {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_TO_FIXED = "toFixed";
  private Integer toFixed;

  public static final String JSON_PROPERTY_COUNTRY_ALPHA2 = "countryAlpha2";
  private String countryAlpha2;


  public Currency id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Currency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Currency prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public Currency toFixed(Integer toFixed) {
    
    this.toFixed = toFixed;
    return this;
  }

   /**
   * Get toFixed
   * @return toFixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getToFixed() {
    return toFixed;
  }


  public void setToFixed(Integer toFixed) {
    this.toFixed = toFixed;
  }


  public Currency countryAlpha2(String countryAlpha2) {
    
    this.countryAlpha2 = countryAlpha2;
    return this;
  }

   /**
   * Get countryAlpha2
   * @return countryAlpha2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_ALPHA2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryAlpha2() {
    return countryAlpha2;
  }


  public void setCountryAlpha2(String countryAlpha2) {
    this.countryAlpha2 = countryAlpha2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.id, currency.id) &&
        Objects.equals(this.name, currency.name) &&
        Objects.equals(this.prefix, currency.prefix) &&
        Objects.equals(this.toFixed, currency.toFixed) &&
        Objects.equals(this.countryAlpha2, currency.countryAlpha2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prefix, toFixed, countryAlpha2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    toFixed: ").append(toIndentedString(toFixed)).append("\n");
    sb.append("    countryAlpha2: ").append(toIndentedString(countryAlpha2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

