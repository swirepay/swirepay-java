# CustomerApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomer**](CustomerApi.md#addCustomer) | **POST** /customer | Add a new customer
[**deleteCustomerByGid**](CustomerApi.md#deleteCustomerByGid) | **DELETE** /customer/{gid} | Delete customer by Gid
[**getAllCustomers**](CustomerApi.md#getAllCustomers) | **GET** /customer | Get all customers
[**getCustomerByGid**](CustomerApi.md#getCustomerByGid) | **GET** /customer/{gid} | Get Customer by Gid
[**updateCustomer**](CustomerApi.md#updateCustomer) | **PATCH** /customer/{gid} | Update Customer by Gid



## addCustomer

> CustomerResponse addCustomer(customerRequest, destinationAccount)

Add a new customer

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            CustomerResponse result = apiInstance.addCustomer(customerRequest, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomer");
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
 **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  |
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## deleteCustomerByGid

> deleteCustomerByGid(gid, destinationAccount)

Delete customer by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            apiInstance.deleteCustomerByGid(gid, destinationAccount);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomerByGid");
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

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAllCustomers

> CustomerListResponse getAllCustomers(page, size, destinationAccount)

Get all customers

Get customers

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            CustomerListResponse result = apiInstance.getAllCustomers(page, size, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getAllCustomers");
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

[**CustomerListResponse**](CustomerListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCustomerByGid

> CustomerResponse getCustomerByGid(gid, destinationAccount)

Get Customer by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            CustomerResponse result = apiInstance.getCustomerByGid(gid, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerByGid");
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

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## updateCustomer

> CustomerResponse updateCustomer(gid, destinationAccount, customerRequest)

Update Customer by Gid

### Example

```java
// Import classes:
import com.swirepay.client.invoker.ApiClient;
import com.swirepay.client.invoker.ApiException;
import com.swirepay.client.invoker.Configuration;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.invoker.models.*;
import com.swirepay.client.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        try {
            CustomerResponse result = apiInstance.updateCustomer(gid, destinationAccount, customerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomer");
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
 **customerRequest** | [**CustomerRequest**](CustomerRequest.md)|  | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

