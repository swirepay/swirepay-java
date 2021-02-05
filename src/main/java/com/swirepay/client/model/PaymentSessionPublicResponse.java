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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentSessionPublicResponse
 */
@JsonPropertyOrder({
  PaymentSessionPublicResponse.JSON_PROPERTY_GID,
  PaymentSessionPublicResponse.JSON_PROPERTY_AMOUNT,
  PaymentSessionPublicResponse.JSON_PROPERTY_AMOUNT_DISPUTED,
  PaymentSessionPublicResponse.JSON_PROPERTY_AMOUNT_REFUNDED,
  PaymentSessionPublicResponse.JSON_PROPERTY_DESCRIPTION,
  PaymentSessionPublicResponse.JSON_PROPERTY_PAYMENT_DATE,
  PaymentSessionPublicResponse.JSON_PROPERTY_REFUND_DATE,
  PaymentSessionPublicResponse.JSON_PROPERTY_DISPUTE_DATE,
  PaymentSessionPublicResponse.JSON_PROPERTY_STATUS,
  PaymentSessionPublicResponse.JSON_PROPERTY_RECEIPT_NUMBER,
  PaymentSessionPublicResponse.JSON_PROPERTY_METHOD,
  PaymentSessionPublicResponse.JSON_PROPERTY_CURRENCY,
  PaymentSessionPublicResponse.JSON_PROPERTY_NEXT_ACTION_URL,
  PaymentSessionPublicResponse.JSON_PROPERTY_RETURN_URL
})
@JsonTypeName("PaymentSessionPublicResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:32:04.002Z[Etc/UTC]")
public class PaymentSessionPublicResponse {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_AMOUNT_DISPUTED = "amountDisputed";
  private Long amountDisputed;

  public static final String JSON_PROPERTY_AMOUNT_REFUNDED = "amountRefunded";
  private Long amountRefunded;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PAYMENT_DATE = "paymentDate";
  private String paymentDate;

  public static final String JSON_PROPERTY_REFUND_DATE = "refundDate";
  private String refundDate;

  public static final String JSON_PROPERTY_DISPUTE_DATE = "disputeDate";
  private String disputeDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_RECEIPT_NUMBER = "receiptNumber";
  private String receiptNumber;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_NEXT_ACTION_URL = "nextActionUrl";
  private String nextActionUrl;

  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private String returnUrl;


  public PaymentSessionPublicResponse gid(String gid) {
    
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


  public PaymentSessionPublicResponse amount(Long amount) {
    
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


  public PaymentSessionPublicResponse amountDisputed(Long amountDisputed) {
    
    this.amountDisputed = amountDisputed;
    return this;
  }

   /**
   * Get amountDisputed
   * @return amountDisputed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_DISPUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmountDisputed() {
    return amountDisputed;
  }


  public void setAmountDisputed(Long amountDisputed) {
    this.amountDisputed = amountDisputed;
  }


  public PaymentSessionPublicResponse amountRefunded(Long amountRefunded) {
    
    this.amountRefunded = amountRefunded;
    return this;
  }

   /**
   * Get amountRefunded
   * @return amountRefunded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_REFUNDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmountRefunded() {
    return amountRefunded;
  }


  public void setAmountRefunded(Long amountRefunded) {
    this.amountRefunded = amountRefunded;
  }


  public PaymentSessionPublicResponse description(String description) {
    
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


  public PaymentSessionPublicResponse paymentDate(String paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  public PaymentSessionPublicResponse refundDate(String refundDate) {
    
    this.refundDate = refundDate;
    return this;
  }

   /**
   * Get refundDate
   * @return refundDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundDate() {
    return refundDate;
  }


  public void setRefundDate(String refundDate) {
    this.refundDate = refundDate;
  }


  public PaymentSessionPublicResponse disputeDate(String disputeDate) {
    
    this.disputeDate = disputeDate;
    return this;
  }

   /**
   * Get disputeDate
   * @return disputeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPUTE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisputeDate() {
    return disputeDate;
  }


  public void setDisputeDate(String disputeDate) {
    this.disputeDate = disputeDate;
  }


  public PaymentSessionPublicResponse status(String status) {
    
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


  public PaymentSessionPublicResponse receiptNumber(String receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECEIPT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public PaymentSessionPublicResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public PaymentSessionPublicResponse currency(Currency currency) {
    
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


  public PaymentSessionPublicResponse nextActionUrl(String nextActionUrl) {
    
    this.nextActionUrl = nextActionUrl;
    return this;
  }

   /**
   * Get nextActionUrl
   * @return nextActionUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT_ACTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextActionUrl() {
    return nextActionUrl;
  }


  public void setNextActionUrl(String nextActionUrl) {
    this.nextActionUrl = nextActionUrl;
  }


  public PaymentSessionPublicResponse returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Get returnUrl
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSessionPublicResponse paymentSessionPublicResponse = (PaymentSessionPublicResponse) o;
    return Objects.equals(this.gid, paymentSessionPublicResponse.gid) &&
        Objects.equals(this.amount, paymentSessionPublicResponse.amount) &&
        Objects.equals(this.amountDisputed, paymentSessionPublicResponse.amountDisputed) &&
        Objects.equals(this.amountRefunded, paymentSessionPublicResponse.amountRefunded) &&
        Objects.equals(this.description, paymentSessionPublicResponse.description) &&
        Objects.equals(this.paymentDate, paymentSessionPublicResponse.paymentDate) &&
        Objects.equals(this.refundDate, paymentSessionPublicResponse.refundDate) &&
        Objects.equals(this.disputeDate, paymentSessionPublicResponse.disputeDate) &&
        Objects.equals(this.status, paymentSessionPublicResponse.status) &&
        Objects.equals(this.receiptNumber, paymentSessionPublicResponse.receiptNumber) &&
        Objects.equals(this.method, paymentSessionPublicResponse.method) &&
        Objects.equals(this.currency, paymentSessionPublicResponse.currency) &&
        Objects.equals(this.nextActionUrl, paymentSessionPublicResponse.nextActionUrl) &&
        Objects.equals(this.returnUrl, paymentSessionPublicResponse.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, amount, amountDisputed, amountRefunded, description, paymentDate, refundDate, disputeDate, status, receiptNumber, method, currency, nextActionUrl, returnUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSessionPublicResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountDisputed: ").append(toIndentedString(amountDisputed)).append("\n");
    sb.append("    amountRefunded: ").append(toIndentedString(amountRefunded)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    disputeDate: ").append(toIndentedString(disputeDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nextActionUrl: ").append(toIndentedString(nextActionUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

