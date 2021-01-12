# PayoutApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayout**](PayoutApi.md#getPayout) | **GET** /payout | Get payout



## getPayout

> PayoutResponse getPayout(xApiKey)

Get payout

Get payout

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");

        PayoutApi apiInstance = new PayoutApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            PayoutResponse result = apiInstance.getPayout(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PayoutApi#getPayout");
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

[**PayoutResponse**](PayoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

