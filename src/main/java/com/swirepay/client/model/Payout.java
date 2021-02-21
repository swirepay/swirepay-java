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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Payout
 */
@JsonPropertyOrder({
  Payout.JSON_PROPERTY_GID,
  Payout.JSON_PROPERTY_CREATED_AT,
  Payout.JSON_PROPERTY_UPDATED_AT,
  Payout.JSON_PROPERTY_DELETED,
  Payout.JSON_PROPERTY_AMOUNT,
  Payout.JSON_PROPERTY_FEE,
  Payout.JSON_PROPERTY_STATUS,
  Payout.JSON_PROPERTY_PAYOUT_DATE,
  Payout.JSON_PROPERTY_DESCRIPTION,
  Payout.JSON_PROPERTY_BANK_ROUTING_NUMBER,
  Payout.JSON_PROPERTY_BANK_ACCOUNT_LAST_FOUR,
  Payout.JSON_PROPERTY_BANK_BENEFICIARY_NAME,
  Payout.JSON_PROPERTY_BANK_NAME
})
@JsonTypeName("Payout")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-21T04:14:10.799Z[Etc/UTC]")
public class Payout {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Long fee;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_PAYOUT_DATE = "payoutDate";
  private String payoutDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_BANK_ROUTING_NUMBER = "bankRoutingNumber";
  private String bankRoutingNumber;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_LAST_FOUR = "bankAccountLastFour";
  private String bankAccountLastFour;

  public static final String JSON_PROPERTY_BANK_BENEFICIARY_NAME = "bankBeneficiaryName";
  private String bankBeneficiaryName;

  public static final String JSON_PROPERTY_BANK_NAME = "bankName";
  private String bankName;


  public Payout gid(String gid) {
    
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


  public Payout createdAt(String createdAt) {
    
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


  public Payout updatedAt(String updatedAt) {
    
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


  public Payout deleted(Boolean deleted) {
    
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


  public Payout amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public Payout fee(Long fee) {
    
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

  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public Payout status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Payout payoutDate(String payoutDate) {
    
    this.payoutDate = payoutDate;
    return this;
  }

   /**
   * Get payoutDate
   * @return payoutDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYOUT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayoutDate() {
    return payoutDate;
  }


  public void setPayoutDate(String payoutDate) {
    this.payoutDate = payoutDate;
  }


  public Payout description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Payout bankRoutingNumber(String bankRoutingNumber) {
    
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

   /**
   * Get bankRoutingNumber
   * @return bankRoutingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankRoutingNumber() {
    return bankRoutingNumber;
  }


  public void setBankRoutingNumber(String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }


  public Payout bankAccountLastFour(String bankAccountLastFour) {
    
    this.bankAccountLastFour = bankAccountLastFour;
    return this;
  }

   /**
   * Get bankAccountLastFour
   * @return bankAccountLastFour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountLastFour() {
    return bankAccountLastFour;
  }


  public void setBankAccountLastFour(String bankAccountLastFour) {
    this.bankAccountLastFour = bankAccountLastFour;
  }


  public Payout bankBeneficiaryName(String bankBeneficiaryName) {
    
    this.bankBeneficiaryName = bankBeneficiaryName;
    return this;
  }

   /**
   * Get bankBeneficiaryName
   * @return bankBeneficiaryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_BENEFICIARY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankBeneficiaryName() {
    return bankBeneficiaryName;
  }


  public void setBankBeneficiaryName(String bankBeneficiaryName) {
    this.bankBeneficiaryName = bankBeneficiaryName;
  }


  public Payout bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payout payout = (Payout) o;
    return Objects.equals(this.gid, payout.gid) &&
        Objects.equals(this.createdAt, payout.createdAt) &&
        Objects.equals(this.updatedAt, payout.updatedAt) &&
        Objects.equals(this.deleted, payout.deleted) &&
        Objects.equals(this.amount, payout.amount) &&
        Objects.equals(this.fee, payout.fee) &&
        Objects.equals(this.status, payout.status) &&
        Objects.equals(this.payoutDate, payout.payoutDate) &&
        Objects.equals(this.description, payout.description) &&
        Objects.equals(this.bankRoutingNumber, payout.bankRoutingNumber) &&
        Objects.equals(this.bankAccountLastFour, payout.bankAccountLastFour) &&
        Objects.equals(this.bankBeneficiaryName, payout.bankBeneficiaryName) &&
        Objects.equals(this.bankName, payout.bankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, amount, fee, status, payoutDate, description, bankRoutingNumber, bankAccountLastFour, bankBeneficiaryName, bankName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payout {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payoutDate: ").append(toIndentedString(payoutDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
    sb.append("    bankAccountLastFour: ").append(toIndentedString(bankAccountLastFour)).append("\n");
    sb.append("    bankBeneficiaryName: ").append(toIndentedString(bankBeneficiaryName)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
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

