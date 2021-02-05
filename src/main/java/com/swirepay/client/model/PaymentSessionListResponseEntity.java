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
import com.swirepay.client.model.PaymentSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentSessionListResponseEntity
 */
@JsonPropertyOrder({
  PaymentSessionListResponseEntity.JSON_PROPERTY_EMPTY,
  PaymentSessionListResponseEntity.JSON_PROPERTY_NUMBER,
  PaymentSessionListResponseEntity.JSON_PROPERTY_NUMBER_OF_ELEMENTS,
  PaymentSessionListResponseEntity.JSON_PROPERTY_TOTAL_ELEMENTS,
  PaymentSessionListResponseEntity.JSON_PROPERTY_TOTAL_PAGES,
  PaymentSessionListResponseEntity.JSON_PROPERTY_SIZE,
  PaymentSessionListResponseEntity.JSON_PROPERTY_CONTENT
})
@JsonTypeName("PaymentSessionListResponse_entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:48:22.419Z[Etc/UTC]")
public class PaymentSessionListResponseEntity {
  public static final String JSON_PROPERTY_EMPTY = "empty";
  private Boolean empty;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Integer number;

  public static final String JSON_PROPERTY_NUMBER_OF_ELEMENTS = "numberOfElements";
  private Integer numberOfElements;

  public static final String JSON_PROPERTY_TOTAL_ELEMENTS = "totalElements";
  private Integer totalElements;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "totalPages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private List<PaymentSession> content = null;


  public PaymentSessionListResponseEntity empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmpty() {
    return empty;
  }


  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  public PaymentSessionListResponseEntity number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public PaymentSessionListResponseEntity numberOfElements(Integer numberOfElements) {
    
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfElements() {
    return numberOfElements;
  }


  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public PaymentSessionListResponseEntity totalElements(Integer totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }


  public PaymentSessionListResponseEntity totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PaymentSessionListResponseEntity size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public PaymentSessionListResponseEntity content(List<PaymentSession> content) {
    
    this.content = content;
    return this;
  }

  public PaymentSessionListResponseEntity addContentItem(PaymentSession contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentSession> getContent() {
    return content;
  }


  public void setContent(List<PaymentSession> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSessionListResponseEntity paymentSessionListResponseEntity = (PaymentSessionListResponseEntity) o;
    return Objects.equals(this.empty, paymentSessionListResponseEntity.empty) &&
        Objects.equals(this.number, paymentSessionListResponseEntity.number) &&
        Objects.equals(this.numberOfElements, paymentSessionListResponseEntity.numberOfElements) &&
        Objects.equals(this.totalElements, paymentSessionListResponseEntity.totalElements) &&
        Objects.equals(this.totalPages, paymentSessionListResponseEntity.totalPages) &&
        Objects.equals(this.size, paymentSessionListResponseEntity.size) &&
        Objects.equals(this.content, paymentSessionListResponseEntity.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, number, numberOfElements, totalElements, totalPages, size, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSessionListResponseEntity {\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
