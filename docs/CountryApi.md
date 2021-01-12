# CountryApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountry**](CountryApi.md#getCountry) | **GET** /country | Get country



## getCountry

> CountryResponse getCountry(xApiKey)

Get country

Get country

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CountryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");

        CountryApi apiInstance = new CountryApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            CountryResponse result = apiInstance.getCountry(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CountryApi#getCountry");
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

[**CountryResponse**](CountryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

