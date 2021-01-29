/*
 * Swirepay Payment API
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
 * CardRequest
 */
@JsonPropertyOrder({
  CardRequest.JSON_PROPERTY_NAME,
  CardRequest.JSON_PROPERTY_NUMBER,
  CardRequest.JSON_PROPERTY_SCHEME,
  CardRequest.JSON_PROPERTY_CVV,
  CardRequest.JSON_PROPERTY_EXPIRY_MONTH,
  CardRequest.JSON_PROPERTY_EXPIRY_YEAR
})
@JsonTypeName("CardRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T08:08:42.386Z[Etc/UTC]")
public class CardRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_SCHEME = "scheme";
  private String scheme;

  public static final String JSON_PROPERTY_CVV = "cvv";
  private String cvv;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private String expiryMonth;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private String expiryYear;


  public CardRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sample Customer", value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CardRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4242424242424242", value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public CardRequest scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "")
  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public CardRequest cvv(String cvv) {
    
    this.cvv = cvv;
    return this;
  }

   /**
   * Get cvv
   * @return cvv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")
  @JsonProperty(JSON_PROPERTY_CVV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCvv() {
    return cvv;
  }


  public void setCvv(String cvv) {
    this.cvv = cvv;
  }


  public CardRequest expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Get expiryMonth
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "08", value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public CardRequest expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Get expiryYear
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024", value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardRequest cardRequest = (CardRequest) o;
    return Objects.equals(this.name, cardRequest.name) &&
        Objects.equals(this.number, cardRequest.number) &&
        Objects.equals(this.scheme, cardRequest.scheme) &&
        Objects.equals(this.cvv, cardRequest.cvv) &&
        Objects.equals(this.expiryMonth, cardRequest.expiryMonth) &&
        Objects.equals(this.expiryYear, cardRequest.expiryYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number, scheme, cvv, expiryMonth, expiryYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
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

