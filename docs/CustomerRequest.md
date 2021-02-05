

# CustomerRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** |  | 
**name** | **String** |  | 
**phoneNumber** | **String** |  | 
**referenceNumber** | **String** |  |  [optional]
**taxStatus** | [**TaxStatusEnum**](#TaxStatusEnum) |  |  [optional]
**taxId** | [**TaxIdEnum**](#TaxIdEnum) |  |  [optional]
**taxValue** | **String** |  |  [optional]
**billingAddress** | [**AddressRequest**](AddressRequest.md) |  |  [optional]
**shippingAddress** | [**AddressRequest**](AddressRequest.md) |  |  [optional]



## Enum: TaxStatusEnum

Name | Value
---- | -----
TAXABLE | &quot;TAXABLE&quot;
EXEMPT | &quot;EXEMPT&quot;



## Enum: TaxIdEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
EIN | &quot;EIN&quot;
GST | &quot;GST&quot;



