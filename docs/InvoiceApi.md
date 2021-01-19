# InvoiceApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoice**](InvoiceApi.md#getInvoice) | **GET** /invoice | Get invoice



## getInvoice

> InvoiceResponse getInvoice(xApiKey)

Get invoice

Get invoice

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.InvoiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        InvoiceApi apiInstance = new InvoiceApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            InvoiceResponse result = apiInstance.getInvoice(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#getInvoice");
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

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

