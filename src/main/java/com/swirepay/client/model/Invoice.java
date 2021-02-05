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
import com.swirepay.client.model.Address;
import com.swirepay.client.model.Currency;
import com.swirepay.client.model.Customer;
import com.swirepay.client.model.InvoiceLineItem;
import com.swirepay.client.model.InvoiceLink;
import com.swirepay.client.model.PaymentMethod;
import com.swirepay.client.model.PaymentMethodType;
import com.swirepay.client.model.PaymentSessionPublicResponse;
import com.swirepay.client.model.Subscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Invoice
 */
@JsonPropertyOrder({
  Invoice.JSON_PROPERTY_GID,
  Invoice.JSON_PROPERTY_CREATED_AT,
  Invoice.JSON_PROPERTY_UPDATED_AT,
  Invoice.JSON_PROPERTY_DELETED,
  Invoice.JSON_PROPERTY_STATUS,
  Invoice.JSON_PROPERTY_INVOICE_NUMBER,
  Invoice.JSON_PROPERTY_AMOUNT,
  Invoice.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  Invoice.JSON_PROPERTY_STATEMENT_DESCRIPTOR,
  Invoice.JSON_PROPERTY_DESCRIPTION,
  Invoice.JSON_PROPERTY_PAYMENT_DATE,
  Invoice.JSON_PROPERTY_LAST_PROCESSED,
  Invoice.JSON_PROPERTY_NO_RETRIES,
  Invoice.JSON_PROPERTY_PAYMENT_DUE_DATE,
  Invoice.JSON_PROPERTY_INVOICE_PDF_KEY,
  Invoice.JSON_PROPERTY_ISSUE_DATE,
  Invoice.JSON_PROPERTY_CUSTOMER_NOTE,
  Invoice.JSON_PROPERTY_DAYS_UNTIL_DUE,
  Invoice.JSON_PROPERTY_PAYMENT_PROCESS_DATE,
  Invoice.JSON_PROPERTY_REDIRECT_URL,
  Invoice.JSON_PROPERTY_PAYMENT_SESSION,
  Invoice.JSON_PROPERTY_PAYMENT_METHOD,
  Invoice.JSON_PROPERTY_INVOICE_LINE_ITEMS,
  Invoice.JSON_PROPERTY_CUSTOMER,
  Invoice.JSON_PROPERTY_CURRENCY,
  Invoice.JSON_PROPERTY_BILLING_ADDRESS,
  Invoice.JSON_PROPERTY_SHIPPING_ADDRESS,
  Invoice.JSON_PROPERTY_INVOICE_LINKS,
  Invoice.JSON_PROPERTY_SUBSCRIPTION
})
@JsonTypeName("Invoice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
public class Invoice {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_INVOICE_NUMBER = "invoiceNumber";
  private String invoiceNumber;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private List<PaymentMethodType> paymentMethodType = null;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR = "statementDescriptor";
  private String statementDescriptor;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PAYMENT_DATE = "paymentDate";
  private String paymentDate;

  public static final String JSON_PROPERTY_LAST_PROCESSED = "lastProcessed";
  private String lastProcessed;

  public static final String JSON_PROPERTY_NO_RETRIES = "noRetries";
  private Integer noRetries;

  public static final String JSON_PROPERTY_PAYMENT_DUE_DATE = "paymentDueDate";
  private String paymentDueDate;

  public static final String JSON_PROPERTY_INVOICE_PDF_KEY = "invoicePdfKey";
  private String invoicePdfKey;

  public static final String JSON_PROPERTY_ISSUE_DATE = "issueDate";
  private String issueDate;

  public static final String JSON_PROPERTY_CUSTOMER_NOTE = "customerNote";
  private String customerNote;

  public static final String JSON_PROPERTY_DAYS_UNTIL_DUE = "daysUntilDue";
  private Integer daysUntilDue;

  public static final String JSON_PROPERTY_PAYMENT_PROCESS_DATE = "paymentProcessDate";
  private String paymentProcessDate;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private String redirectUrl;

  public static final String JSON_PROPERTY_PAYMENT_SESSION = "paymentSession";
  private PaymentSessionPublicResponse paymentSession;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_INVOICE_LINE_ITEMS = "invoiceLineItems";
  private List<InvoiceLineItem> invoiceLineItems = null;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public static final String JSON_PROPERTY_INVOICE_LINKS = "invoiceLinks";
  private List<InvoiceLink> invoiceLinks = null;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private Subscription subscription;


  public Invoice gid(String gid) {
    
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


  public Invoice createdAt(String createdAt) {
    
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


  public Invoice updatedAt(String updatedAt) {
    
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


  public Invoice deleted(Boolean deleted) {
    
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


  public Invoice status(String status) {
    
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


  public Invoice invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public Invoice amount(Long amount) {
    
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


  public Invoice paymentMethodType(List<PaymentMethodType> paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  public Invoice addPaymentMethodTypeItem(PaymentMethodType paymentMethodTypeItem) {
    if (this.paymentMethodType == null) {
      this.paymentMethodType = new ArrayList<>();
    }
    this.paymentMethodType.add(paymentMethodTypeItem);
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentMethodType> getPaymentMethodType() {
    return paymentMethodType;
  }


  public void setPaymentMethodType(List<PaymentMethodType> paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public Invoice statementDescriptor(String statementDescriptor) {
    
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


  public Invoice description(String description) {
    
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


  public Invoice paymentDate(String paymentDate) {
    
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


  public Invoice lastProcessed(String lastProcessed) {
    
    this.lastProcessed = lastProcessed;
    return this;
  }

   /**
   * Get lastProcessed
   * @return lastProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastProcessed() {
    return lastProcessed;
  }


  public void setLastProcessed(String lastProcessed) {
    this.lastProcessed = lastProcessed;
  }


  public Invoice noRetries(Integer noRetries) {
    
    this.noRetries = noRetries;
    return this;
  }

   /**
   * Get noRetries
   * @return noRetries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NO_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoRetries() {
    return noRetries;
  }


  public void setNoRetries(Integer noRetries) {
    this.noRetries = noRetries;
  }


  public Invoice paymentDueDate(String paymentDueDate) {
    
    this.paymentDueDate = paymentDueDate;
    return this;
  }

   /**
   * Get paymentDueDate
   * @return paymentDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentDueDate() {
    return paymentDueDate;
  }


  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  public Invoice invoicePdfKey(String invoicePdfKey) {
    
    this.invoicePdfKey = invoicePdfKey;
    return this;
  }

   /**
   * Get invoicePdfKey
   * @return invoicePdfKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_PDF_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoicePdfKey() {
    return invoicePdfKey;
  }


  public void setInvoicePdfKey(String invoicePdfKey) {
    this.invoicePdfKey = invoicePdfKey;
  }


  public Invoice issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public Invoice customerNote(String customerNote) {
    
    this.customerNote = customerNote;
    return this;
  }

   /**
   * Get customerNote
   * @return customerNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerNote() {
    return customerNote;
  }


  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }


  public Invoice daysUntilDue(Integer daysUntilDue) {
    
    this.daysUntilDue = daysUntilDue;
    return this;
  }

   /**
   * Get daysUntilDue
   * @return daysUntilDue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAYS_UNTIL_DUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDaysUntilDue() {
    return daysUntilDue;
  }


  public void setDaysUntilDue(Integer daysUntilDue) {
    this.daysUntilDue = daysUntilDue;
  }


  public Invoice paymentProcessDate(String paymentProcessDate) {
    
    this.paymentProcessDate = paymentProcessDate;
    return this;
  }

   /**
   * Get paymentProcessDate
   * @return paymentProcessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentProcessDate() {
    return paymentProcessDate;
  }


  public void setPaymentProcessDate(String paymentProcessDate) {
    this.paymentProcessDate = paymentProcessDate;
  }


  public Invoice redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public Invoice paymentSession(PaymentSessionPublicResponse paymentSession) {
    
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

  public PaymentSessionPublicResponse getPaymentSession() {
    return paymentSession;
  }


  public void setPaymentSession(PaymentSessionPublicResponse paymentSession) {
    this.paymentSession = paymentSession;
  }


  public Invoice paymentMethod(PaymentMethod paymentMethod) {
    
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


  public Invoice invoiceLineItems(List<InvoiceLineItem> invoiceLineItems) {
    
    this.invoiceLineItems = invoiceLineItems;
    return this;
  }

  public Invoice addInvoiceLineItemsItem(InvoiceLineItem invoiceLineItemsItem) {
    if (this.invoiceLineItems == null) {
      this.invoiceLineItems = new ArrayList<>();
    }
    this.invoiceLineItems.add(invoiceLineItemsItem);
    return this;
  }

   /**
   * Get invoiceLineItems
   * @return invoiceLineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvoiceLineItem> getInvoiceLineItems() {
    return invoiceLineItems;
  }


  public void setInvoiceLineItems(List<InvoiceLineItem> invoiceLineItems) {
    this.invoiceLineItems = invoiceLineItems;
  }


  public Invoice customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public Invoice currency(Currency currency) {
    
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


  public Invoice billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public Invoice shippingAddress(Address shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public Invoice invoiceLinks(List<InvoiceLink> invoiceLinks) {
    
    this.invoiceLinks = invoiceLinks;
    return this;
  }

  public Invoice addInvoiceLinksItem(InvoiceLink invoiceLinksItem) {
    if (this.invoiceLinks == null) {
      this.invoiceLinks = new ArrayList<>();
    }
    this.invoiceLinks.add(invoiceLinksItem);
    return this;
  }

   /**
   * Get invoiceLinks
   * @return invoiceLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvoiceLink> getInvoiceLinks() {
    return invoiceLinks;
  }


  public void setInvoiceLinks(List<InvoiceLink> invoiceLinks) {
    this.invoiceLinks = invoiceLinks;
  }


  public Invoice subscription(Subscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscription getSubscription() {
    return subscription;
  }


  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.gid, invoice.gid) &&
        Objects.equals(this.createdAt, invoice.createdAt) &&
        Objects.equals(this.updatedAt, invoice.updatedAt) &&
        Objects.equals(this.deleted, invoice.deleted) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.paymentMethodType, invoice.paymentMethodType) &&
        Objects.equals(this.statementDescriptor, invoice.statementDescriptor) &&
        Objects.equals(this.description, invoice.description) &&
        Objects.equals(this.paymentDate, invoice.paymentDate) &&
        Objects.equals(this.lastProcessed, invoice.lastProcessed) &&
        Objects.equals(this.noRetries, invoice.noRetries) &&
        Objects.equals(this.paymentDueDate, invoice.paymentDueDate) &&
        Objects.equals(this.invoicePdfKey, invoice.invoicePdfKey) &&
        Objects.equals(this.issueDate, invoice.issueDate) &&
        Objects.equals(this.customerNote, invoice.customerNote) &&
        Objects.equals(this.daysUntilDue, invoice.daysUntilDue) &&
        Objects.equals(this.paymentProcessDate, invoice.paymentProcessDate) &&
        Objects.equals(this.redirectUrl, invoice.redirectUrl) &&
        Objects.equals(this.paymentSession, invoice.paymentSession) &&
        Objects.equals(this.paymentMethod, invoice.paymentMethod) &&
        Objects.equals(this.invoiceLineItems, invoice.invoiceLineItems) &&
        Objects.equals(this.customer, invoice.customer) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.billingAddress, invoice.billingAddress) &&
        Objects.equals(this.shippingAddress, invoice.shippingAddress) &&
        Objects.equals(this.invoiceLinks, invoice.invoiceLinks) &&
        Objects.equals(this.subscription, invoice.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, status, invoiceNumber, amount, paymentMethodType, statementDescriptor, description, paymentDate, lastProcessed, noRetries, paymentDueDate, invoicePdfKey, issueDate, customerNote, daysUntilDue, paymentProcessDate, redirectUrl, paymentSession, paymentMethod, invoiceLineItems, customer, currency, billingAddress, shippingAddress, invoiceLinks, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    lastProcessed: ").append(toIndentedString(lastProcessed)).append("\n");
    sb.append("    noRetries: ").append(toIndentedString(noRetries)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    invoicePdfKey: ").append(toIndentedString(invoicePdfKey)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    customerNote: ").append(toIndentedString(customerNote)).append("\n");
    sb.append("    daysUntilDue: ").append(toIndentedString(daysUntilDue)).append("\n");
    sb.append("    paymentProcessDate: ").append(toIndentedString(paymentProcessDate)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    paymentSession: ").append(toIndentedString(paymentSession)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    invoiceLineItems: ").append(toIndentedString(invoiceLineItems)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    invoiceLinks: ").append(toIndentedString(invoiceLinks)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

