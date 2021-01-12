# PaymentMethodApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPaymentMethod**](PaymentMethodApi.md#addPaymentMethod) | **POST** /payment-method | Add a payment method
[**getPaymentMethod**](PaymentMethodApi.md#getPaymentMethod) | **GET** /payment-method | Get payment methods



## addPaymentMethod

> PaymentMethodResponse addPaymentMethod(xApiKey, body)

Add a payment method

Adds a payment method to an account

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentMethodApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentMethodApi apiInstance = new PaymentMethodApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        PaymentMethodRequest body = new PaymentMethodRequest(); // PaymentMethodRequest | Payment method object that needs to be added to the account
        try {
            PaymentMethodResponse result = apiInstance.addPaymentMethod(xApiKey, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodApi#addPaymentMethod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |
 **body** | [**PaymentMethodRequest**](PaymentMethodRequest.md)| Payment method object that needs to be added to the account |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |


## getPaymentMethod

> PaymentMethodResponse getPaymentMethod(xApiKey)

Get payment methods

Get payment methods

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentMethodApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentMethodApi apiInstance = new PaymentMethodApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            PaymentMethodResponse result = apiInstance.getPaymentMethod(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentMethodApi#getPaymentMethod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**|  |

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

