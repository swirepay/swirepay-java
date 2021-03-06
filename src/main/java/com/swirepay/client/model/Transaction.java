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
import com.swirepay.client.model.Currency;
import com.swirepay.client.model.Payment;
import com.swirepay.client.model.PaymentSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Transaction
 */
@JsonPropertyOrder({
  Transaction.JSON_PROPERTY_GID,
  Transaction.JSON_PROPERTY_CREATED_AT,
  Transaction.JSON_PROPERTY_UPDATED_AT,
  Transaction.JSON_PROPERTY_DELETED,
  Transaction.JSON_PROPERTY_AMOUNT,
  Transaction.JSON_PROPERTY_FEE,
  Transaction.JSON_PROPERTY_TAX,
  Transaction.JSON_PROPERTY_NET,
  Transaction.JSON_PROPERTY_DESCRIPTION,
  Transaction.JSON_PROPERTY_TYPE,
  Transaction.JSON_PROPERTY_PAYOUT_GID,
  Transaction.JSON_PROPERTY_PAYMENT_SESSION,
  Transaction.JSON_PROPERTY_CURRENCY,
  Transaction.JSON_PROPERTY_PAYMENT
})
@JsonTypeName("Transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T05:48:21.646Z[Etc/UTC]")
public class Transaction {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Integer fee;

  public static final String JSON_PROPERTY_TAX = "tax";
  private Integer tax;

  public static final String JSON_PROPERTY_NET = "net";
  private Integer net;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PAYOUT_GID = "payoutGid";
  private String payoutGid;

  public static final String JSON_PROPERTY_PAYMENT_SESSION = "paymentSession";
  private PaymentSession paymentSession;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private Payment payment;


  public Transaction gid(String gid) {
    
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


  public Transaction createdAt(String createdAt) {
    
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


  public Transaction updatedAt(String updatedAt) {
    
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


  public Transaction deleted(Boolean deleted) {
    
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


  public Transaction amount(Integer amount) {
    
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

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Transaction fee(Integer fee) {
    
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


  public Transaction tax(Integer tax) {
    
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


  public Transaction net(Integer net) {
    
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNet() {
    return net;
  }


  public void setNet(Integer net) {
    this.net = net;
  }


  public Transaction description(String description) {
    
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


  public Transaction type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Transaction payoutGid(String payoutGid) {
    
    this.payoutGid = payoutGid;
    return this;
  }

   /**
   * Get payoutGid
   * @return payoutGid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYOUT_GID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayoutGid() {
    return payoutGid;
  }


  public void setPayoutGid(String payoutGid) {
    this.payoutGid = payoutGid;
  }


  public Transaction paymentSession(PaymentSession paymentSession) {
    
    this.paymentSession = paymentSession;
    return this;
  }

   /**
   * Get paymentSession
   * @return paymentSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentSession getPaymentSession() {
    return paymentSession;
  }


  public void setPaymentSession(PaymentSession paymentSession) {
    this.paymentSession = paymentSession;
  }


  public Transaction currency(Currency currency) {
    
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


  public Transaction payment(Payment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Payment getPayment() {
    return payment;
  }


  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.gid, transaction.gid) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.updatedAt, transaction.updatedAt) &&
        Objects.equals(this.deleted, transaction.deleted) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.fee, transaction.fee) &&
        Objects.equals(this.tax, transaction.tax) &&
        Objects.equals(this.net, transaction.net) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.payoutGid, transaction.payoutGid) &&
        Objects.equals(this.paymentSession, transaction.paymentSession) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.payment, transaction.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, amount, fee, tax, net, description, type, payoutGid, paymentSession, currency, payment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payoutGid: ").append(toIndentedString(payoutGid)).append("\n");
    sb.append("    paymentSession: ").append(toIndentedString(paymentSession)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

