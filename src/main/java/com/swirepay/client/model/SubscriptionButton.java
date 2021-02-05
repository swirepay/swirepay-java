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
import com.swirepay.client.model.Plan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SubscriptionButton
 */
@JsonPropertyOrder({
  SubscriptionButton.JSON_PROPERTY_GID,
  SubscriptionButton.JSON_PROPERTY_CREATED_AT,
  SubscriptionButton.JSON_PROPERTY_UPDATED_AT,
  SubscriptionButton.JSON_PROPERTY_DELETED,
  SubscriptionButton.JSON_PROPERTY_STATUS,
  SubscriptionButton.JSON_PROPERTY_PLAN_QUANTITY,
  SubscriptionButton.JSON_PROPERTY_PLAN_TOTAL_PAYMENTS,
  SubscriptionButton.JSON_PROPERTY_PLAN_AMOUNT,
  SubscriptionButton.JSON_PROPERTY_PLAN_BILLING_FREQUENCY,
  SubscriptionButton.JSON_PROPERTY_PLAN_BILLING_PERIOD,
  SubscriptionButton.JSON_PROPERTY_PLAN_START_DATE,
  SubscriptionButton.JSON_PROPERTY_DESCRIPTION,
  SubscriptionButton.JSON_PROPERTY_NEXT_ACTION_URL,
  SubscriptionButton.JSON_PROPERTY_REDIRECT_URI,
  SubscriptionButton.JSON_PROPERTY_LINK,
  SubscriptionButton.JSON_PROPERTY_CURRENCY,
  SubscriptionButton.JSON_PROPERTY_PLAN
})
@JsonTypeName("SubscriptionButton")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
public class SubscriptionButton {
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

  public static final String JSON_PROPERTY_PLAN_QUANTITY = "planQuantity";
  private Integer planQuantity;

  public static final String JSON_PROPERTY_PLAN_TOTAL_PAYMENTS = "planTotalPayments";
  private Integer planTotalPayments;

  public static final String JSON_PROPERTY_PLAN_AMOUNT = "planAmount";
  private Long planAmount;

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

  public static final String JSON_PROPERTY_PLAN_START_DATE = "planStartDate";
  private String planStartDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NEXT_ACTION_URL = "nextActionUrl";
  private String nextActionUrl;

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirectUri";
  private String redirectUri;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private Plan plan;


  public SubscriptionButton gid(String gid) {
    
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


  public SubscriptionButton createdAt(String createdAt) {
    
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


  public SubscriptionButton updatedAt(String updatedAt) {
    
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


  public SubscriptionButton deleted(Boolean deleted) {
    
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


  public SubscriptionButton status(String status) {
    
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


  public SubscriptionButton planQuantity(Integer planQuantity) {
    
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


  public SubscriptionButton planTotalPayments(Integer planTotalPayments) {
    
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


  public SubscriptionButton planAmount(Long planAmount) {
    
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


  public SubscriptionButton planBillingFrequency(PlanBillingFrequencyEnum planBillingFrequency) {
    
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


  public SubscriptionButton planBillingPeriod(Integer planBillingPeriod) {
    
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


  public SubscriptionButton planStartDate(String planStartDate) {
    
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


  public SubscriptionButton description(String description) {
    
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


  public SubscriptionButton nextActionUrl(String nextActionUrl) {
    
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


  public SubscriptionButton redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * Get redirectUri
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public SubscriptionButton link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public SubscriptionButton currency(Currency currency) {
    
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


  public SubscriptionButton plan(Plan plan) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionButton subscriptionButton = (SubscriptionButton) o;
    return Objects.equals(this.gid, subscriptionButton.gid) &&
        Objects.equals(this.createdAt, subscriptionButton.createdAt) &&
        Objects.equals(this.updatedAt, subscriptionButton.updatedAt) &&
        Objects.equals(this.deleted, subscriptionButton.deleted) &&
        Objects.equals(this.status, subscriptionButton.status) &&
        Objects.equals(this.planQuantity, subscriptionButton.planQuantity) &&
        Objects.equals(this.planTotalPayments, subscriptionButton.planTotalPayments) &&
        Objects.equals(this.planAmount, subscriptionButton.planAmount) &&
        Objects.equals(this.planBillingFrequency, subscriptionButton.planBillingFrequency) &&
        Objects.equals(this.planBillingPeriod, subscriptionButton.planBillingPeriod) &&
        Objects.equals(this.planStartDate, subscriptionButton.planStartDate) &&
        Objects.equals(this.description, subscriptionButton.description) &&
        Objects.equals(this.nextActionUrl, subscriptionButton.nextActionUrl) &&
        Objects.equals(this.redirectUri, subscriptionButton.redirectUri) &&
        Objects.equals(this.link, subscriptionButton.link) &&
        Objects.equals(this.currency, subscriptionButton.currency) &&
        Objects.equals(this.plan, subscriptionButton.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, status, planQuantity, planTotalPayments, planAmount, planBillingFrequency, planBillingPeriod, planStartDate, description, nextActionUrl, redirectUri, link, currency, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionButton {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    planQuantity: ").append(toIndentedString(planQuantity)).append("\n");
    sb.append("    planTotalPayments: ").append(toIndentedString(planTotalPayments)).append("\n");
    sb.append("    planAmount: ").append(toIndentedString(planAmount)).append("\n");
    sb.append("    planBillingFrequency: ").append(toIndentedString(planBillingFrequency)).append("\n");
    sb.append("    planBillingPeriod: ").append(toIndentedString(planBillingPeriod)).append("\n");
    sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nextActionUrl: ").append(toIndentedString(nextActionUrl)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

