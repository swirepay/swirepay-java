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
import com.swirepay.client.model.PaymentMethod;
import com.swirepay.client.model.PaymentSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Payment
 */
@JsonPropertyOrder({
  Payment.JSON_PROPERTY_GID,
  Payment.JSON_PROPERTY_CREATED_AT,
  Payment.JSON_PROPERTY_UPDATED_AT,
  Payment.JSON_PROPERTY_DELETED,
  Payment.JSON_PROPERTY_AMOUNT,
  Payment.JSON_PROPERTY_AMOUNT_REFUNDED,
  Payment.JSON_PROPERTY_FEE,
  Payment.JSON_PROPERTY_TAX,
  Payment.JSON_PROPERTY_NET,
  Payment.JSON_PROPERTY_STATEMENT_DESCRIPTOR,
  Payment.JSON_PROPERTY_DESCRIPTION,
  Payment.JSON_PROPERTY_AUTHORIZATION_CODE,
  Payment.JSON_PROPERTY_ERROR_CODE,
  Payment.JSON_PROPERTY_ERROR_DESCRIPTION,
  Payment.JSON_PROPERTY_CURRENCY,
  Payment.JSON_PROPERTY_PAYMENT_METHOD,
  Payment.JSON_PROPERTY_PAYMENT_SESSION
})
@JsonTypeName("Payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:32:04.002Z[Etc/UTC]")
public class Payment {
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

  public static final String JSON_PROPERTY_AMOUNT_REFUNDED = "amountRefunded";
  private Long amountRefunded;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Long fee;

  public static final String JSON_PROPERTY_TAX = "tax";
  private Long tax;

  public static final String JSON_PROPERTY_NET = "net";
  private Long net;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR = "statementDescriptor";
  private String statementDescriptor;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AUTHORIZATION_CODE = "authorizationCode";
  private String authorizationCode;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "errorDescription";
  private String errorDescription;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_SESSION = "paymentSession";
  private PaymentSession paymentSession;


  public Payment gid(String gid) {
    
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


  public Payment createdAt(String createdAt) {
    
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


  public Payment updatedAt(String updatedAt) {
    
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


  public Payment deleted(Boolean deleted) {
    
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


  public Payment amount(Long amount) {
    
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


  public Payment amountRefunded(Long amountRefunded) {
    
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


  public Payment fee(Long fee) {
    
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


  public Payment tax(Long tax) {
    
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

  public Long getTax() {
    return tax;
  }


  public void setTax(Long tax) {
    this.tax = tax;
  }


  public Payment net(Long net) {
    
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

  public Long getNet() {
    return net;
  }


  public void setNet(Long net) {
    this.net = net;
  }


  public Payment statementDescriptor(String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * Get statementDescriptor
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public Payment description(String description) {
    
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


  public Payment authorizationCode(String authorizationCode) {
    
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * Get authorizationCode
   * @return authorizationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationCode() {
    return authorizationCode;
  }


  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }


  public Payment errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Payment errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public Payment currency(Currency currency) {
    
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


  public Payment paymentMethod(PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Payment paymentSession(PaymentSession paymentSession) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.gid, payment.gid) &&
        Objects.equals(this.createdAt, payment.createdAt) &&
        Objects.equals(this.updatedAt, payment.updatedAt) &&
        Objects.equals(this.deleted, payment.deleted) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.amountRefunded, payment.amountRefunded) &&
        Objects.equals(this.fee, payment.fee) &&
        Objects.equals(this.tax, payment.tax) &&
        Objects.equals(this.net, payment.net) &&
        Objects.equals(this.statementDescriptor, payment.statementDescriptor) &&
        Objects.equals(this.description, payment.description) &&
        Objects.equals(this.authorizationCode, payment.authorizationCode) &&
        Objects.equals(this.errorCode, payment.errorCode) &&
        Objects.equals(this.errorDescription, payment.errorDescription) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.paymentMethod, payment.paymentMethod) &&
        Objects.equals(this.paymentSession, payment.paymentSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, amount, amountRefunded, fee, tax, net, statementDescriptor, description, authorizationCode, errorCode, errorDescription, currency, paymentMethod, paymentSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountRefunded: ").append(toIndentedString(amountRefunded)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentSession: ").append(toIndentedString(paymentSession)).append("\n");
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

