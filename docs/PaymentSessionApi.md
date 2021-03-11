# PaymentSessionApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPaymentSession**](PaymentSessionApi.md#addPaymentSession) | **POST** /payment-session | Add a new payment ssession
[**cancelPaymentSession**](PaymentSessionApi.md#cancelPaymentSession) | **PATCH** /payment-session/{gid}/cancel | Cancel Payment Session
[**capturePaymentSession**](PaymentSessionApi.md#capturePaymentSession) | **PATCH** /payment-session/{gid}/capture | Capture Payment Session
[**confirmPaymentSession**](PaymentSessionApi.md#confirmPaymentSession) | **PATCH** /payment-session/{gid}/confirm | Confirm Payment Session
[**getAllPaymentSession**](PaymentSessionApi.md#getAllPaymentSession) | **GET** /payment-session | Get all payment session
[**getPaymentSessionByGid**](PaymentSessionApi.md#getPaymentSessionByGid) | **GET** /payment-session/{gid} | Get Payment Session by Gid
[**notifyPaymentSessionByGid**](PaymentSessionApi.md#notifyPaymentSessionByGid) | **GET** /payment-session/{gid}/notify | Notify Payment Session by Gid
[**refundPaymentSession**](PaymentSessionApi.md#refundPaymentSession) | **PATCH** /payment-session/{gid}/refund | Refund Payment Session
[**updatePaymentSession**](PaymentSessionApi.md#updatePaymentSession) | **PATCH** /payment-session/{gid}/update | Update Payment Session



## addPaymentSession

> PaymentSessionResponse addPaymentSession(paymentSessionRequest, destinationAccount)

Add a new payment ssession

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        PaymentSessionRequest paymentSessionRequest = new PaymentSessionRequest(); // PaymentSessionRequest | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            PaymentSessionResponse result = apiInstance.addPaymentSession(paymentSessionRequest, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#addPaymentSession");
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
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)|  |
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## cancelPaymentSession

> PaymentSessionResponse cancelPaymentSession(gid, destinationAccount)

Cancel Payment Session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            PaymentSessionResponse result = apiInstance.cancelPaymentSession(gid, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#cancelPaymentSession");
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

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## capturePaymentSession

> PaymentSessionResponse capturePaymentSession(gid, destinationAccount)

Capture Payment Session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            PaymentSessionResponse result = apiInstance.capturePaymentSession(gid, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#capturePaymentSession");
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

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## confirmPaymentSession

> PaymentSessionResponse confirmPaymentSession(gid, destinationAccount, paymentSessionRequest)

Confirm Payment Session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        PaymentSessionRequest paymentSessionRequest = new PaymentSessionRequest(); // PaymentSessionRequest | 
        try {
            PaymentSessionResponse result = apiInstance.confirmPaymentSession(gid, destinationAccount, paymentSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#confirmPaymentSession");
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
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)|  | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAllPaymentSession

> PaymentSessionListResponse getAllPaymentSession(page, size, destinationAccount)

Get all payment session

Get all payment session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            PaymentSessionListResponse result = apiInstance.getAllPaymentSession(page, size, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#getAllPaymentSession");
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

[**PaymentSessionListResponse**](PaymentSessionListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPaymentSessionByGid

> PaymentSessionResponse getPaymentSessionByGid(gid, destinationAccount)

Get Payment Session by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            PaymentSessionResponse result = apiInstance.getPaymentSessionByGid(gid, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#getPaymentSessionByGid");
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

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## notifyPaymentSessionByGid

> PaymentSessionResponse notifyPaymentSessionByGid(gid)

Notify Payment Session by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        try {
            PaymentSessionResponse result = apiInstance.notifyPaymentSessionByGid(gid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#notifyPaymentSessionByGid");
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

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## refundPaymentSession

> PaymentSessionResponse refundPaymentSession(gid, destinationAccount, paymentSessionRequest)

Refund Payment Session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        PaymentSessionRequest paymentSessionRequest = new PaymentSessionRequest(); // PaymentSessionRequest | 
        try {
            PaymentSessionResponse result = apiInstance.refundPaymentSession(gid, destinationAccount, paymentSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#refundPaymentSession");
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
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)|  | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## updatePaymentSession

> PaymentSessionResponse updatePaymentSession(gid, destinationAccount, paymentSessionRequest)

Update Payment Session

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.PaymentSessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PaymentSessionApi apiInstance = new PaymentSessionApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        PaymentSessionRequest paymentSessionRequest = new PaymentSessionRequest(); // PaymentSessionRequest | 
        try {
            PaymentSessionResponse result = apiInstance.updatePaymentSession(gid, destinationAccount, paymentSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentSessionApi#updatePaymentSession");
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
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)|  | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

