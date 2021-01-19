# DisputeApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDispute**](DisputeApi.md#getDispute) | **GET** /dispute | Get dispute



## getDispute

> DisputeResponse getDispute(xApiKey)

Get dispute

Get dispute

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.DisputeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DisputeApi apiInstance = new DisputeApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            DisputeResponse result = apiInstance.getDispute(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DisputeApi#getDispute");
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

[**DisputeResponse**](DisputeResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

