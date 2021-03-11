# SubscriptionApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSubscription**](SubscriptionApi.md#addSubscription) | **POST** /subscription | Add a new subscription
[**cancelSubscription**](SubscriptionApi.md#cancelSubscription) | **PATCH** /subscription/{gid}/cancel | Cancel Subscription
[**getAllSubscription**](SubscriptionApi.md#getAllSubscription) | **GET** /subscription | Get All Subscription
[**getSubscriptionByGid**](SubscriptionApi.md#getSubscriptionByGid) | **GET** /subscription/{gid} | Get Subscription by Gid



## addSubscription

> SubscriptionResponse addSubscription(subscriptionRequest)

Add a new subscription

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SubscriptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
        try {
            SubscriptionResponse result = apiInstance.addSubscription(subscriptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionApi#addSubscription");
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
 **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## cancelSubscription

> SubscriptionResponse cancelSubscription(gid, destinationAccount, subscriptionRequest)

Cancel Subscription

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SubscriptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
        try {
            SubscriptionResponse result = apiInstance.cancelSubscription(gid, destinationAccount, subscriptionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionApi#cancelSubscription");
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
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]
 **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  | [optional]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAllSubscription

> SubscriptionListResponse getAllSubscription(page, size, destinationAccount)

Get All Subscription

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SubscriptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            SubscriptionListResponse result = apiInstance.getAllSubscription(page, size, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionApi#getAllSubscription");
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
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]

### Return type

[**SubscriptionListResponse**](SubscriptionListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getSubscriptionByGid

> SubscriptionListResponse getSubscriptionByGid(gid, destinationAccount)

Get Subscription by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.SubscriptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            SubscriptionListResponse result = apiInstance.getSubscriptionByGid(gid, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionApi#getSubscriptionByGid");
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
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]

### Return type

[**SubscriptionListResponse**](SubscriptionListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

