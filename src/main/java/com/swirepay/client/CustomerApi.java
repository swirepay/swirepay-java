package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.CustomerListResponse;
import com.swirepay.client.model.CustomerRequest;
import com.swirepay.client.model.CustomerResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T05:48:21.646Z[Etc/UTC]")
@Component("com.swirepay.client.CustomerApi")
public class CustomerApi {
    private ApiClient apiClient;

    public CustomerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new customer
     * 
     * <p><b>200</b> - Successful Response
     * @param customerRequest  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return CustomerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerResponse addCustomer(CustomerRequest customerRequest, String destinationAccount) throws RestClientException {
        return addCustomerWithHttpInfo(customerRequest, destinationAccount).getBody();
    }

    /**
     * Add a new customer
     * 
     * <p><b>200</b> - Successful Response
     * @param customerRequest  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;CustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerResponse> addCustomerWithHttpInfo(CustomerRequest customerRequest, String destinationAccount) throws RestClientException {
        Object postBody = customerRequest;
        
        // verify the required parameter 'customerRequest' is set
        if (customerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerRequest' when calling addCustomer");
        }
        
        String path = apiClient.expandPath("/customer", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (destinationAccount != null)
        headerParams.add("destination_account", apiClient.parameterToString(destinationAccount));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CustomerResponse> returnType = new ParameterizedTypeReference<CustomerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomerByGid(String gid, String destinationAccount) throws RestClientException {
        deleteCustomerByGidWithHttpInfo(gid, destinationAccount);
    }

    /**
     * Delete customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerByGidWithHttpInfo(String gid, String destinationAccount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling deleteCustomerByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/customer/{gid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (destinationAccount != null)
        headerParams.add("destination_account", apiClient.parameterToString(destinationAccount));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all customers
     * Get customers
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return CustomerListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerListResponse getAllCustomers(Integer page, Integer size, String destinationAccount) throws RestClientException {
        return getAllCustomersWithHttpInfo(page, size, destinationAccount).getBody();
    }

    /**
     * Get all customers
     * Get customers
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;CustomerListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerListResponse> getAllCustomersWithHttpInfo(Integer page, Integer size, String destinationAccount) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/customer", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        if (destinationAccount != null)
        headerParams.add("destination_account", apiClient.parameterToString(destinationAccount));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CustomerListResponse> returnType = new ParameterizedTypeReference<CustomerListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return CustomerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerResponse getCustomerByGid(String gid, String destinationAccount) throws RestClientException {
        return getCustomerByGidWithHttpInfo(gid, destinationAccount).getBody();
    }

    /**
     * Get Customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;CustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerResponse> getCustomerByGidWithHttpInfo(String gid, String destinationAccount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getCustomerByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/customer/{gid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (destinationAccount != null)
        headerParams.add("destination_account", apiClient.parameterToString(destinationAccount));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CustomerResponse> returnType = new ParameterizedTypeReference<CustomerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @param customerRequest  (optional)
     * @return CustomerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerResponse updateCustomer(String gid, String destinationAccount, CustomerRequest customerRequest) throws RestClientException {
        return updateCustomerWithHttpInfo(gid, destinationAccount, customerRequest).getBody();
    }

    /**
     * Update Customer by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @param customerRequest  (optional)
     * @return ResponseEntity&lt;CustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerResponse> updateCustomerWithHttpInfo(String gid, String destinationAccount, CustomerRequest customerRequest) throws RestClientException {
        Object postBody = customerRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updateCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/customer/{gid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (destinationAccount != null)
        headerParams.add("destination_account", apiClient.parameterToString(destinationAccount));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CustomerResponse> returnType = new ParameterizedTypeReference<CustomerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
