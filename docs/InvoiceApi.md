# InvoiceApi

All URIs are relative to *https://api.swirepay.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoice**](InvoiceApi.md#addInvoice) | **POST** /invoice | Add a new invoice
[**getAllInvoices**](InvoiceApi.md#getAllInvoices) | **GET** /invoice | Get All Invoices
[**getInvoiceByGid**](InvoiceApi.md#getInvoiceByGid) | **GET** /invoice/{gid} | Get invoice by Gid
[**payInvoice**](InvoiceApi.md#payInvoice) | **PATCH** /invoice/{gid}/pay | pay for invoice
[**updateInvoiceActive**](InvoiceApi.md#updateInvoiceActive) | **PATCH** /invoice/{gid}/active | Update invoice to active
[**updateInvoiceDraft**](InvoiceApi.md#updateInvoiceDraft) | **PATCH** /invoice/{gid}/draft | Update invoice to draft



## addInvoice

> InvoiceResponse addInvoice(invoiceRequest, destinationAccount)

Add a new invoice

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
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            InvoiceResponse result = apiInstance.addInvoice(invoiceRequest, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#addInvoice");
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
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)|  |
 **destinationAccount** | **String**| If processing on behalf of another Swirepay affiliate account | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAllInvoices

> InvoiceListResponse getAllInvoices(page, size)

Get All Invoices

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
        Integer page = 56; // Integer | 
        Integer size = 56; // Integer | 
        try {
            InvoiceListResponse result = apiInstance.getAllInvoices(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#getAllInvoices");
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

[**InvoiceListResponse**](InvoiceListResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInvoiceByGid

> InvoiceResponse getInvoiceByGid(gid)

Get invoice by Gid

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
        String gid = "gid_example"; // String | 
        try {
            InvoiceResponse result = apiInstance.getInvoiceByGid(gid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#getInvoiceByGid");
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

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## payInvoice

> InvoiceResponse payInvoice(gid, destinationAccount, invoiceRequest)

pay for invoice

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
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | 
        try {
            InvoiceResponse result = apiInstance.payInvoice(gid, destinationAccount, invoiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#payInvoice");
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
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)|  | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## updateInvoiceActive

> InvoiceResponse updateInvoiceActive(gid, destinationAccount, invoiceRequest)

Update invoice to active

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
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | 
        try {
            InvoiceResponse result = apiInstance.updateInvoiceActive(gid, destinationAccount, invoiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#updateInvoiceActive");
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
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)|  | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## updateInvoiceDraft

> InvoiceResponse updateInvoiceDraft(gid, destinationAccount, invoiceRequest)

Update invoice to draft

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
        String gid = "gid_example"; // String | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | 
        try {
            InvoiceResponse result = apiInstance.updateInvoiceDraft(gid, destinationAccount, invoiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceApi#updateInvoiceDraft");
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
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)|  | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

