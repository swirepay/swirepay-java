

# Subscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gid** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**planQuantity** | **Integer** |  |  [optional]
**planTotalPayments** | **Integer** |  |  [optional]
**planStartDate** | **String** |  |  [optional]
**planEndDate** | **String** |  |  [optional]
**planAmount** | **Long** |  |  [optional]
**paymentMethodType** | **List&lt;PaymentMethodType&gt;** |  |  [optional]
**statementDescription** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**emailRecipientList** | **List&lt;String&gt;** |  |  [optional]
**status** | **String** |  |  [optional]
**upfrontAmount** | **Long** |  |  [optional]
**lastProcessed** | **String** |  |  [optional]
**nextPaymentDate** | **String** |  |  [optional]
**totalSuccessfulPayments** | **String** |  |  [optional]
**billingAmount** | **Long** |  |  [optional]
**planBillingFrequency** | [**PlanBillingFrequencyEnum**](#PlanBillingFrequencyEnum) |  |  [optional]
**planBillingPeriod** | **Integer** |  |  [optional]
**redirectUrl** | **String** |  |  [optional]
**plan** | [**Plan**](Plan.md) |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**subscriptionLineItems** | [**List&lt;SubscriptionLineItem&gt;**](SubscriptionLineItem.md) |  |  [optional]
**subscriptionLinks** | [**List&lt;SubscriptionLink&gt;**](SubscriptionLink.md) |  |  [optional]
**subscriptionButton** | [**SubscriptionButton**](SubscriptionButton.md) |  |  [optional]



## Enum: PlanBillingFrequencyEnum

Name | Value
---- | -----
DAY | &quot;DAY&quot;
MONTH | &quot;MONTH&quot;
WEEK | &quot;WEEK&quot;
YEAR | &quot;YEAR&quot;



