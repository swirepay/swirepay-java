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
import com.swirepay.client.model.Customer;
import com.swirepay.client.model.PaymentMethod;
import com.swirepay.client.model.PaymentMethodType;
import com.swirepay.client.model.Plan;
import com.swirepay.client.model.SubscriptionButton;
import com.swirepay.client.model.SubscriptionLineItem;
import com.swirepay.client.model.SubscriptionLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Subscription
 */
@JsonPropertyOrder({
  Subscription.JSON_PROPERTY_GID,
  Subscription.JSON_PROPERTY_CREATED_AT,
  Subscription.JSON_PROPERTY_UPDATED_AT,
  Subscription.JSON_PROPERTY_DELETED,
  Subscription.JSON_PROPERTY_PLAN_QUANTITY,
  Subscription.JSON_PROPERTY_PLAN_TOTAL_PAYMENTS,
  Subscription.JSON_PROPERTY_PLAN_START_DATE,
  Subscription.JSON_PROPERTY_PLAN_END_DATE,
  Subscription.JSON_PROPERTY_PLAN_AMOUNT,
  Subscription.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  Subscription.JSON_PROPERTY_STATEMENT_DESCRIPTION,
  Subscription.JSON_PROPERTY_DESCRIPTION,
  Subscription.JSON_PROPERTY_EMAIL_RECIPIENT_LIST,
  Subscription.JSON_PROPERTY_STATUS,
  Subscription.JSON_PROPERTY_UPFRONT_AMOUNT,
  Subscription.JSON_PROPERTY_LAST_PROCESSED,
  Subscription.JSON_PROPERTY_NEXT_PAYMENT_DATE,
  Subscription.JSON_PROPERTY_TOTAL_SUCCESSFUL_PAYMENTS,
  Subscription.JSON_PROPERTY_BILLING_AMOUNT,
  Subscription.JSON_PROPERTY_PLAN_BILLING_FREQUENCY,
  Subscription.JSON_PROPERTY_PLAN_BILLING_PERIOD,
  Subscription.JSON_PROPERTY_REDIRECT_URL,
  Subscription.JSON_PROPERTY_PLAN,
  Subscription.JSON_PROPERTY_CUSTOMER,
  Subscription.JSON_PROPERTY_CURRENCY,
  Subscription.JSON_PROPERTY_PAYMENT_METHOD,
  Subscription.JSON_PROPERTY_SUBSCRIPTION_LINE_ITEMS,
  Subscription.JSON_PROPERTY_SUBSCRIPTION_LINKS,
  Subscription.JSON_PROPERTY_SUBSCRIPTION_BUTTON
})
@JsonTypeName("Subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T05:48:21.646Z[Etc/UTC]")
public class Subscription {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_PLAN_QUANTITY = "planQuantity";
  private Integer planQuantity;

  public static final String JSON_PROPERTY_PLAN_TOTAL_PAYMENTS = "planTotalPayments";
  private Integer planTotalPayments;

  public static final String JSON_PROPERTY_PLAN_START_DATE = "planStartDate";
  private String planStartDate;

  public static final String JSON_PROPERTY_PLAN_END_DATE = "planEndDate";
  private String planEndDate;

  public static final String JSON_PROPERTY_PLAN_AMOUNT = "planAmount";
  private Long planAmount;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private List<PaymentMethodType> paymentMethodType = null;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTION = "statementDescription";
  private String statementDescription;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EMAIL_RECIPIENT_LIST = "emailRecipientList";
  private List<String> emailRecipientList = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_UPFRONT_AMOUNT = "upfrontAmount";
  private Long upfrontAmount;

  public static final String JSON_PROPERTY_LAST_PROCESSED = "lastProcessed";
  private String lastProcessed;

  public static final String JSON_PROPERTY_NEXT_PAYMENT_DATE = "nextPaymentDate";
  private String nextPaymentDate;

  public static final String JSON_PROPERTY_TOTAL_SUCCESSFUL_PAYMENTS = "totalSuccessfulPayments";
  private String totalSuccessfulPayments;

  public static final String JSON_PROPERTY_BILLING_AMOUNT = "billingAmount";
  private Long billingAmount;

  /**
   * Gets or Sets planBillingFrequency
   */
  public enum PlanBillingFrequencyEnum {
    DAY("DAY"),
    
    MONTH("MONTH"),
    
    WEEK("WEEK"),
    
    YEAR("YEAR");

    private String value;

    PlanBillingFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PlanBillingFrequencyEnum fromValue(String value) {
      for (PlanBillingFrequencyEnum b : PlanBillingFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PLAN_BILLING_FREQUENCY = "planBillingFrequency";
  private PlanBillingFrequencyEnum planBillingFrequency;

  public static final String JSON_PROPERTY_PLAN_BILLING_PERIOD = "planBillingPeriod";
  private Integer planBillingPeriod;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private String redirectUrl;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private Plan plan;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_SUBSCRIPTION_LINE_ITEMS = "subscriptionLineItems";
  private List<SubscriptionLineItem> subscriptionLineItems = null;

  public static final String JSON_PROPERTY_SUBSCRIPTION_LINKS = "subscriptionLinks";
  private List<SubscriptionLink> subscriptionLinks = null;

  public static final String JSON_PROPERTY_SUBSCRIPTION_BUTTON = "subscriptionButton";
  private SubscriptionButton subscriptionButton;


  public Subscription gid(String gid) {
    
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


  public Subscription createdAt(String createdAt) {
    
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


  public Subscription updatedAt(String updatedAt) {
    
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


  public Subscription deleted(Boolean deleted) {
    
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


  public Subscription planQuantity(Integer planQuantity) {
    
    this.planQuantity = planQuantity;
    return this;
  }

   /**
   * Get planQuantity
   * @return planQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlanQuantity() {
    return planQuantity;
  }


  public void setPlanQuantity(Integer planQuantity) {
    this.planQuantity = planQuantity;
  }


  public Subscription planTotalPayments(Integer planTotalPayments) {
    
    this.planTotalPayments = planTotalPayments;
    return this;
  }

   /**
   * Get planTotalPayments
   * @return planTotalPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_TOTAL_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlanTotalPayments() {
    return planTotalPayments;
  }


  public void setPlanTotalPayments(Integer planTotalPayments) {
    this.planTotalPayments = planTotalPayments;
  }


  public Subscription planStartDate(String planStartDate) {
    
    this.planStartDate = planStartDate;
    return this;
  }

   /**
   * Get planStartDate
   * @return planStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanStartDate() {
    return planStartDate;
  }


  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }


  public Subscription planEndDate(String planEndDate) {
    
    this.planEndDate = planEndDate;
    return this;
  }

   /**
   * Get planEndDate
   * @return planEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanEndDate() {
    return planEndDate;
  }


  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }


  public Subscription planAmount(Long planAmount) {
    
    this.planAmount = planAmount;
    return this;
  }

   /**
   * Get planAmount
   * @return planAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPlanAmount() {
    return planAmount;
  }


  public void setPlanAmount(Long planAmount) {
    this.planAmount = planAmount;
  }


  public Subscription paymentMethodType(List<PaymentMethodType> paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  public Subscription addPaymentMethodTypeItem(PaymentMethodType paymentMethodTypeItem) {
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


  public Subscription statementDescription(String statementDescription) {
    
    this.statementDescription = statementDescription;
    return this;
  }

   /**
   * Get statementDescription
   * @return statementDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementDescription() {
    return statementDescription;
  }


  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }


  public Subscription description(String description) {
    
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


  public Subscription emailRecipientList(List<String> emailRecipientList) {
    
    this.emailRecipientList = emailRecipientList;
    return this;
  }

  public Subscription addEmailRecipientListItem(String emailRecipientListItem) {
    if (this.emailRecipientList == null) {
      this.emailRecipientList = new ArrayList<>();
    }
    this.emailRecipientList.add(emailRecipientListItem);
    return this;
  }

   /**
   * Get emailRecipientList
   * @return emailRecipientList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_RECIPIENT_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEmailRecipientList() {
    return emailRecipientList;
  }


  public void setEmailRecipientList(List<String> emailRecipientList) {
    this.emailRecipientList = emailRecipientList;
  }


  public Subscription status(String status) {
    
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


  public Subscription upfrontAmount(Long upfrontAmount) {
    
    this.upfrontAmount = upfrontAmount;
    return this;
  }

   /**
   * Get upfrontAmount
   * @return upfrontAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPFRONT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpfrontAmount() {
    return upfrontAmount;
  }


  public void setUpfrontAmount(Long upfrontAmount) {
    this.upfrontAmount = upfrontAmount;
  }


  public Subscription lastProcessed(String lastProcessed) {
    
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


  public Subscription nextPaymentDate(String nextPaymentDate) {
    
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

   /**
   * Get nextPaymentDate
   * @return nextPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPaymentDate() {
    return nextPaymentDate;
  }


  public void setNextPaymentDate(String nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }


  public Subscription totalSuccessfulPayments(String totalSuccessfulPayments) {
    
    this.totalSuccessfulPayments = totalSuccessfulPayments;
    return this;
  }

   /**
   * Get totalSuccessfulPayments
   * @return totalSuccessfulPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_SUCCESSFUL_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalSuccessfulPayments() {
    return totalSuccessfulPayments;
  }


  public void setTotalSuccessfulPayments(String totalSuccessfulPayments) {
    this.totalSuccessfulPayments = totalSuccessfulPayments;
  }


  public Subscription billingAmount(Long billingAmount) {
    
    this.billingAmount = billingAmount;
    return this;
  }

   /**
   * Get billingAmount
   * @return billingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBillingAmount() {
    return billingAmount;
  }


  public void setBillingAmount(Long billingAmount) {
    this.billingAmount = billingAmount;
  }


  public Subscription planBillingFrequency(PlanBillingFrequencyEnum planBillingFrequency) {
    
    this.planBillingFrequency = planBillingFrequency;
    return this;
  }

   /**
   * Get planBillingFrequency
   * @return planBillingFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_BILLING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanBillingFrequencyEnum getPlanBillingFrequency() {
    return planBillingFrequency;
  }


  public void setPlanBillingFrequency(PlanBillingFrequencyEnum planBillingFrequency) {
    this.planBillingFrequency = planBillingFrequency;
  }


  public Subscription planBillingPeriod(Integer planBillingPeriod) {
    
    this.planBillingPeriod = planBillingPeriod;
    return this;
  }

   /**
   * Get planBillingPeriod
   * @return planBillingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlanBillingPeriod() {
    return planBillingPeriod;
  }


  public void setPlanBillingPeriod(Integer planBillingPeriod) {
    this.planBillingPeriod = planBillingPeriod;
  }


  public Subscription redirectUrl(String redirectUrl) {
    
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


  public Subscription plan(Plan plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Plan getPlan() {
    return plan;
  }


  public void setPlan(Plan plan) {
    this.plan = plan;
  }


  public Subscription customer(Customer customer) {
    
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


  public Subscription currency(Currency currency) {
    
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


  public Subscription paymentMethod(PaymentMethod paymentMethod) {
    
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


  public Subscription subscriptionLineItems(List<SubscriptionLineItem> subscriptionLineItems) {
    
    this.subscriptionLineItems = subscriptionLineItems;
    return this;
  }

  public Subscription addSubscriptionLineItemsItem(SubscriptionLineItem subscriptionLineItemsItem) {
    if (this.subscriptionLineItems == null) {
      this.subscriptionLineItems = new ArrayList<>();
    }
    this.subscriptionLineItems.add(subscriptionLineItemsItem);
    return this;
  }

   /**
   * Get subscriptionLineItems
   * @return subscriptionLineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionLineItem> getSubscriptionLineItems() {
    return subscriptionLineItems;
  }


  public void setSubscriptionLineItems(List<SubscriptionLineItem> subscriptionLineItems) {
    this.subscriptionLineItems = subscriptionLineItems;
  }


  public Subscription subscriptionLinks(List<SubscriptionLink> subscriptionLinks) {
    
    this.subscriptionLinks = subscriptionLinks;
    return this;
  }

  public Subscription addSubscriptionLinksItem(SubscriptionLink subscriptionLinksItem) {
    if (this.subscriptionLinks == null) {
      this.subscriptionLinks = new ArrayList<>();
    }
    this.subscriptionLinks.add(subscriptionLinksItem);
    return this;
  }

   /**
   * Get subscriptionLinks
   * @return subscriptionLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionLink> getSubscriptionLinks() {
    return subscriptionLinks;
  }


  public void setSubscriptionLinks(List<SubscriptionLink> subscriptionLinks) {
    this.subscriptionLinks = subscriptionLinks;
  }


  public Subscription subscriptionButton(SubscriptionButton subscriptionButton) {
    
    this.subscriptionButton = subscriptionButton;
    return this;
  }

   /**
   * Get subscriptionButton
   * @return subscriptionButton
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_BUTTON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionButton getSubscriptionButton() {
    return subscriptionButton;
  }


  public void setSubscriptionButton(SubscriptionButton subscriptionButton) {
    this.subscriptionButton = subscriptionButton;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.gid, subscription.gid) &&
        Objects.equals(this.createdAt, subscription.createdAt) &&
        Objects.equals(this.updatedAt, subscription.updatedAt) &&
        Objects.equals(this.deleted, subscription.deleted) &&
        Objects.equals(this.planQuantity, subscription.planQuantity) &&
        Objects.equals(this.planTotalPayments, subscription.planTotalPayments) &&
        Objects.equals(this.planStartDate, subscription.planStartDate) &&
        Objects.equals(this.planEndDate, subscription.planEndDate) &&
        Objects.equals(this.planAmount, subscription.planAmount) &&
        Objects.equals(this.paymentMethodType, subscription.paymentMethodType) &&
        Objects.equals(this.statementDescription, subscription.statementDescription) &&
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.emailRecipientList, subscription.emailRecipientList) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.upfrontAmount, subscription.upfrontAmount) &&
        Objects.equals(this.lastProcessed, subscription.lastProcessed) &&
        Objects.equals(this.nextPaymentDate, subscription.nextPaymentDate) &&
        Objects.equals(this.totalSuccessfulPayments, subscription.totalSuccessfulPayments) &&
        Objects.equals(this.billingAmount, subscription.billingAmount) &&
        Objects.equals(this.planBillingFrequency, subscription.planBillingFrequency) &&
        Objects.equals(this.planBillingPeriod, subscription.planBillingPeriod) &&
        Objects.equals(this.redirectUrl, subscription.redirectUrl) &&
        Objects.equals(this.plan, subscription.plan) &&
        Objects.equals(this.customer, subscription.customer) &&
        Objects.equals(this.currency, subscription.currency) &&
        Objects.equals(this.paymentMethod, subscription.paymentMethod) &&
        Objects.equals(this.subscriptionLineItems, subscription.subscriptionLineItems) &&
        Objects.equals(this.subscriptionLinks, subscription.subscriptionLinks) &&
        Objects.equals(this.subscriptionButton, subscription.subscriptionButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, planQuantity, planTotalPayments, planStartDate, planEndDate, planAmount, paymentMethodType, statementDescription, description, emailRecipientList, status, upfrontAmount, lastProcessed, nextPaymentDate, totalSuccessfulPayments, billingAmount, planBillingFrequency, planBillingPeriod, redirectUrl, plan, customer, currency, paymentMethod, subscriptionLineItems, subscriptionLinks, subscriptionButton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    planQuantity: ").append(toIndentedString(planQuantity)).append("\n");
    sb.append("    planTotalPayments: ").append(toIndentedString(planTotalPayments)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
    sb.append("    planAmount: ").append(toIndentedString(planAmount)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailRecipientList: ").append(toIndentedString(emailRecipientList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    upfrontAmount: ").append(toIndentedString(upfrontAmount)).append("\n");
    sb.append("    lastProcessed: ").append(toIndentedString(lastProcessed)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    totalSuccessfulPayments: ").append(toIndentedString(totalSuccessfulPayments)).append("\n");
    sb.append("    billingAmount: ").append(toIndentedString(billingAmount)).append("\n");
    sb.append("    planBillingFrequency: ").append(toIndentedString(planBillingFrequency)).append("\n");
    sb.append("    planBillingPeriod: ").append(toIndentedString(planBillingPeriod)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    subscriptionLineItems: ").append(toIndentedString(subscriptionLineItems)).append("\n");
    sb.append("    subscriptionLinks: ").append(toIndentedString(subscriptionLinks)).append("\n");
    sb.append("    subscriptionButton: ").append(toIndentedString(subscriptionButton)).append("\n");
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

