/*
 * Swirepay API
 * Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.
 *
 * The version of the OpenAPI document: 1.0.1
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
import com.swirepay.client.model.Rate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AccountRate
 */
@JsonPropertyOrder({
  AccountRate.JSON_PROPERTY_GID,
  AccountRate.JSON_PROPERTY_CREATED_AT,
  AccountRate.JSON_PROPERTY_UPDATED_AT,
  AccountRate.JSON_PROPERTY_DELETED,
  AccountRate.JSON_PROPERTY_ACCOUNT_RATE,
  AccountRate.JSON_PROPERTY_PROCESSING_MIN,
  AccountRate.JSON_PROPERTY_PROCESSING_MAX,
  AccountRate.JSON_PROPERTY_ACCOUNT_FEE,
  AccountRate.JSON_PROPERTY_SALES_PERSON,
  AccountRate.JSON_PROPERTY_ACCOUNT_TAX,
  AccountRate.JSON_PROPERTY_RATE,
  AccountRate.JSON_PROPERTY_ACQUIRER
})
@JsonTypeName("AccountRate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-21T03:58:21.960Z[Etc/UTC]")
public class AccountRate {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_ACCOUNT_RATE = "accountRate";
  private Integer accountRate;

  public static final String JSON_PROPERTY_PROCESSING_MIN = "processingMin";
  private Integer processingMin;

  public static final String JSON_PROPERTY_PROCESSING_MAX = "processingMax";
  private Integer processingMax;

  public static final String JSON_PROPERTY_ACCOUNT_FEE = "accountFee";
  private Integer accountFee;

  public static final String JSON_PROPERTY_SALES_PERSON = "salesPerson";
  private String salesPerson;

  public static final String JSON_PROPERTY_ACCOUNT_TAX = "accountTax";
  private Integer accountTax;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Rate rate;

  public static final String JSON_PROPERTY_ACQUIRER = "acquirer";
  private Acquirer acquirer;


  public AccountRate gid(String gid) {
    
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


  public AccountRate createdAt(String createdAt) {
    
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


  public AccountRate updatedAt(String updatedAt) {
    
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


  public AccountRate deleted(Boolean deleted) {
    
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


  public AccountRate accountRate(Integer accountRate) {
    
    this.accountRate = accountRate;
    return this;
  }

   /**
   * Get accountRate
   * @return accountRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountRate() {
    return accountRate;
  }


  public void setAccountRate(Integer accountRate) {
    this.accountRate = accountRate;
  }


  public AccountRate processingMin(Integer processingMin) {
    
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


  public AccountRate processingMax(Integer processingMax) {
    
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


  public AccountRate accountFee(Integer accountFee) {
    
    this.accountFee = accountFee;
    return this;
  }

   /**
   * Get accountFee
   * @return accountFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountFee() {
    return accountFee;
  }


  public void setAccountFee(Integer accountFee) {
    this.accountFee = accountFee;
  }


  public AccountRate salesPerson(String salesPerson) {
    
    this.salesPerson = salesPerson;
    return this;
  }

   /**
   * Get salesPerson
   * @return salesPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALES_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalesPerson() {
    return salesPerson;
  }


  public void setSalesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
  }


  public AccountRate accountTax(Integer accountTax) {
    
    this.accountTax = accountTax;
    return this;
  }

   /**
   * Get accountTax
   * @return accountTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountTax() {
    return accountTax;
  }


  public void setAccountTax(Integer accountTax) {
    this.accountTax = accountTax;
  }


  public AccountRate rate(Rate rate) {
    
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

  public Rate getRate() {
    return rate;
  }


  public void setRate(Rate rate) {
    this.rate = rate;
  }


  public AccountRate acquirer(Acquirer acquirer) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRate accountRate = (AccountRate) o;
    return Objects.equals(this.gid, accountRate.gid) &&
        Objects.equals(this.createdAt, accountRate.createdAt) &&
        Objects.equals(this.updatedAt, accountRate.updatedAt) &&
        Objects.equals(this.deleted, accountRate.deleted) &&
        Objects.equals(this.accountRate, accountRate.accountRate) &&
        Objects.equals(this.processingMin, accountRate.processingMin) &&
        Objects.equals(this.processingMax, accountRate.processingMax) &&
        Objects.equals(this.accountFee, accountRate.accountFee) &&
        Objects.equals(this.salesPerson, accountRate.salesPerson) &&
        Objects.equals(this.accountTax, accountRate.accountTax) &&
        Objects.equals(this.rate, accountRate.rate) &&
        Objects.equals(this.acquirer, accountRate.acquirer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, accountRate, processingMin, processingMax, accountFee, salesPerson, accountTax, rate, acquirer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRate {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    accountRate: ").append(toIndentedString(accountRate)).append("\n");
    sb.append("    processingMin: ").append(toIndentedString(processingMin)).append("\n");
    sb.append("    processingMax: ").append(toIndentedString(processingMax)).append("\n");
    sb.append("    accountFee: ").append(toIndentedString(accountFee)).append("\n");
    sb.append("    salesPerson: ").append(toIndentedString(salesPerson)).append("\n");
    sb.append("    accountTax: ").append(toIndentedString(accountTax)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    acquirer: ").append(toIndentedString(acquirer)).append("\n");
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

