# CategoryApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategory**](CategoryApi.md#getCategory) | **GET** /category | Get category



## getCategory

> CategoryResponse getCategory(xApiKey)

Get category

Get category

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CategoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            CategoryResponse result = apiInstance.getCategory(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategory");
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

[**CategoryResponse**](CategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

