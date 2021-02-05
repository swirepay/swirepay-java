# SecretKeyApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSecretKey**](SecretKeyApi.md#getAllSecretKey) | **GET** /secret-key | Get All Secret Key
[**rollSecretKeyByGid**](SecretKeyApi.md#rollSecretKeyByGid) | **PATCH** /secret-key/{gid}/roll | Roll Secret Key by Gid



## getAllSecretKey

> SecretKeyListResponse getAllSecretKey(page, size)

Get All Secret Key

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SecretKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        SecretKeyApi apiInstance = new SecretKeyApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        try {
            SecretKeyListResponse result = apiInstance.getAllSecretKey(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretKeyApi#getAllSecretKey");
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
 **page** | **Integer**|  | [optional]
 **size** | **Integer**|  | [optional]

### Return type

[**SecretKeyListResponse**](SecretKeyListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## rollSecretKeyByGid

> SecretKeyResponse rollSecretKeyByGid(gid, secretKeyRequest)

Roll Secret Key by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SecretKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");

        SecretKeyApi apiInstance = new SecretKeyApi(defaultClient);
        String gid = "gid_example"; // String | 
        SecretKeyRequest secretKeyRequest = new SecretKeyRequest(); // SecretKeyRequest | 
        try {
            SecretKeyResponse result = apiInstance.rollSecretKeyByGid(gid, secretKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretKeyApi#rollSecretKeyByGid");
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
 **gid** | **String**|  |
 **secretKeyRequest** | [**SecretKeyRequest**](SecretKeyRequest.md)|  | [optional]

### Return type

[**SecretKeyResponse**](SecretKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

