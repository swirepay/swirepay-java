# PublicKeyApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPublicKey**](PublicKeyApi.md#getAllPublicKey) | **GET** /public-key | Get All Public Key
[**rollPublicKeyByGid**](PublicKeyApi.md#rollPublicKeyByGid) | **PATCH** /public-key/{gid}/roll | Roll Public Key by Gid



## getAllPublicKey

> PublicKeyListResponse getAllPublicKey(page, size)

Get All Public Key

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PublicKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        try {
            PublicKeyListResponse result = apiInstance.getAllPublicKey(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicKeyApi#getAllPublicKey");
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

[**PublicKeyListResponse**](PublicKeyListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## rollPublicKeyByGid

> PublicKeyResponse rollPublicKeyByGid(gid, publicKeyRequest)

Roll Public Key by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PublicKeyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");

        PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
        String gid = "gid_example"; // String | 
        PublicKeyRequest publicKeyRequest = new PublicKeyRequest(); // PublicKeyRequest | 
        try {
            PublicKeyResponse result = apiInstance.rollPublicKeyByGid(gid, publicKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicKeyApi#rollPublicKeyByGid");
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
 **publicKeyRequest** | [**PublicKeyRequest**](PublicKeyRequest.md)|  | [optional]

### Return type

[**PublicKeyResponse**](PublicKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

