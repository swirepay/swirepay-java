

# SubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planQuantity** | **Integer** |  | 
**currencyCode** | **String** |  | 
**customerGid** | **String** |  | 
**planGid** | **String** |  | 
**planTotalPayments** | **Integer** |  | 
**planStartDate** | **String** |  | 
**planEndDate** | **String** |  |  [optional]
**planAmount** | **Long** |  | 
**paymentMethodType** | **List&lt;PaymentMethodType&gt;** |  |  [optional]
**statementDescription** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**emailRecipientList** | **List&lt;String&gt;** |  |  [optional]
**status** | **String** |  |  [optional]
**planBillingFrequency** | **BillingFrequency** |  | 
**planBillingPeriod** | **Integer** |  | 
**redirectUrl** | **String** |  |  [optional]
**billingAddress** | [**AddressRequest**](AddressRequest.md) |  |  [optional]
**shippingAddress** | [**AddressRequest**](AddressRequest.md) |  |  [optional]
**invoiceLineItems** | [**List&lt;SubscriptionLineItemRequest&gt;**](SubscriptionLineItemRequest.md) |  |  [optional]



