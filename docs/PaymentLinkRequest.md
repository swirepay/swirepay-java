

# PaymentLinkRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** |  | 
**currencyCode** | **String** |  | 
**paymentMethodType** | **List&lt;PaymentMethodType&gt;** |  | 
**redirectUri** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**statementDescriptor** | **String** |  |  [optional]
**expiresAt** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) |  |  [optional]



## Enum: NotificationTypeEnum

Name | Value
---- | -----
ALL | &quot;ALL&quot;
SMS | &quot;SMS&quot;
EMAIL | &quot;EMAIL&quot;



