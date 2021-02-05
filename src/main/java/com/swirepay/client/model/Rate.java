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
import com.swirepay.client.model.Acquirer;
import com.swirepay.client.model.Category;
import com.swirepay.client.model.Country;
import com.swirepay.client.model.Currency;
import com.swirepay.client.model.PaymentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Rate
 */
@JsonPropertyOrder({
  Rate.JSON_PROPERTY_ID,
  Rate.JSON_PROPERTY_GID,
  Rate.JSON_PROPERTY_CREATED_AT,
  Rate.JSON_PROPERTY_UPDATED_AT,
  Rate.JSON_PROPERTY_PROCESSING_MIN,
  Rate.JSON_PROPERTY_PROCESSING_MAX,
  Rate.JSON_PROPERTY_BASE_RATE,
  Rate.JSON_PROPERTY_BASE_FEE,
  Rate.JSON_PROPERTY_RATE,
  Rate.JSON_PROPERTY_FEE,
  Rate.JSON_PROPERTY_BASE_TAX,
  Rate.JSON_PROPERTY_TAX,
  Rate.JSON_PROPERTY_DELETED,
  Rate.JSON_PROPERTY_COUNTRY,
  Rate.JSON_PROPERTY_CURRENCY,
  Rate.JSON_PROPERTY_CATEGORY,
  Rate.JSON_PROPERTY_ACQUIRER,
  Rate.JSON_PROPERTY_PAYMENT_TYPE
})
@JsonTypeName("Rate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:32:04.002Z[Etc/UTC]")
public class Rate {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_PROCESSING_MIN = "processingMin";
  private Integer processingMin;

  public static final String JSON_PROPERTY_PROCESSING_MAX = "processingMax";
  private Integer processingMax;

  public static final String JSON_PROPERTY_BASE_RATE = "baseRate";
  private Integer baseRate;

  public static final String JSON_PROPERTY_BASE_FEE = "baseFee";
  private Integer baseFee;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Integer rate;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Integer fee;

  public static final String JSON_PROPERTY_BASE_TAX = "baseTax";
  private Integer baseTax;

  public static final String JSON_PROPERTY_TAX = "tax";
  private Integer tax;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Country country;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private Category category;

  public static final String JSON_PROPERTY_ACQUIRER = "acquirer";
  private Acquirer acquirer;

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "paymentType";
  private PaymentType paymentType;


  public Rate id(Integer id) {
    
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


  public Rate gid(String gid) {
    
    this.gid = gid;
    return this;
  }

   /**
   * Get gid
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGid() {
    return gid;
  }


  public void setGid(String gid) {
    this.gid = gid;
  }


  public Rate createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Rate updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Rate processingMin(Integer processingMin) {
    
    this.processingMin = processingMin;
    return this;
  }

   /**
   * Get processingMin
   * @return processingMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESSING_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProcessingMin() {
    return processingMin;
  }


  public void setProcessingMin(Integer processingMin) {
    this.processingMin = processingMin;
  }


  public Rate processingMax(Integer processingMax) {
    
    this.processingMax = processingMax;
    return this;
  }

   /**
   * Get processingMax
   * @return processingMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESSING_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProcessingMax() {
    return processingMax;
  }


  public void setProcessingMax(Integer processingMax) {
    this.processingMax = processingMax;
  }


  public Rate baseRate(Integer baseRate) {
    
    this.baseRate = baseRate;
    return this;
  }

   /**
   * Get baseRate
   * @return baseRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaseRate() {
    return baseRate;
  }


  public void setBaseRate(Integer baseRate) {
    this.baseRate = baseRate;
  }


  public Rate baseFee(Integer baseFee) {
    
    this.baseFee = baseFee;
    return this;
  }

   /**
   * Get baseFee
   * @return baseFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaseFee() {
    return baseFee;
  }


  public void setBaseFee(Integer baseFee) {
    this.baseFee = baseFee;
  }


  public Rate rate(Integer rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRate() {
    return rate;
  }


  public void setRate(Integer rate) {
    this.rate = rate;
  }


  public Rate fee(Integer fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFee() {
    return fee;
  }


  public void setFee(Integer fee) {
    this.fee = fee;
  }


  public Rate baseTax(Integer baseTax) {
    
    this.baseTax = baseTax;
    return this;
  }

   /**
   * Get baseTax
   * @return baseTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBaseTax() {
    return baseTax;
  }


  public void setBaseTax(Integer baseTax) {
    this.baseTax = baseTax;
  }


  public Rate tax(Integer tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTax() {
    return tax;
  }


  public void setTax(Integer tax) {
    this.tax = tax;
  }


  public Rate deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Rate country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public Rate currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public Rate category(Category category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


  public Rate acquirer(Acquirer acquirer) {
    
    this.acquirer = acquirer;
    return this;
  }

   /**
   * Get acquirer
   * @return acquirer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACQUIRER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Acquirer getAcquirer() {
    return acquirer;
  }


  public void setAcquirer(Acquirer acquirer) {
    this.acquirer = acquirer;
  }


  public Rate paymentType(PaymentType paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rate rate = (Rate) o;
    return Objects.equals(this.id, rate.id) &&
        Objects.equals(this.gid, rate.gid) &&
        Objects.equals(this.createdAt, rate.createdAt) &&
        Objects.equals(this.updatedAt, rate.updatedAt) &&
        Objects.equals(this.processingMin, rate.processingMin) &&
        Objects.equals(this.processingMax, rate.processingMax) &&
        Objects.equals(this.baseRate, rate.baseRate) &&
        Objects.equals(this.baseFee, rate.baseFee) &&
        Objects.equals(this.rate, rate.rate) &&
        Objects.equals(this.fee, rate.fee) &&
        Objects.equals(this.baseTax, rate.baseTax) &&
        Objects.equals(this.tax, rate.tax) &&
        Objects.equals(this.deleted, rate.deleted) &&
        Objects.equals(this.country, rate.country) &&
        Objects.equals(this.currency, rate.currency) &&
        Objects.equals(this.category, rate.category) &&
        Objects.equals(this.acquirer, rate.acquirer) &&
        Objects.equals(this.paymentType, rate.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gid, createdAt, updatedAt, processingMin, processingMax, baseRate, baseFee, rate, fee, baseTax, tax, deleted, country, currency, category, acquirer, paymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    processingMin: ").append(toIndentedString(processingMin)).append("\n");
    sb.append("    processingMax: ").append(toIndentedString(processingMax)).append("\n");
    sb.append("    baseRate: ").append(toIndentedString(baseRate)).append("\n");
    sb.append("    baseFee: ").append(toIndentedString(baseFee)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    baseTax: ").append(toIndentedString(baseTax)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    acquirer: ").append(toIndentedString(acquirer)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

