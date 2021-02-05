package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.InvoiceListResponse;
import com.swirepay.client.model.InvoiceRequest;
import com.swirepay.client.model.InvoiceResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:48:22.419Z[Etc/UTC]")
@Component("com.swirepay.client.InvoiceApi")
public class InvoiceApi {
    private ApiClient apiClient;

    public InvoiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvoiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new invoice
     * 
     * <p><b>200</b> - Successful Response
     * @param invoiceRequest  (required)
     * @return InvoiceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResponse addInvoice(InvoiceRequest invoiceRequest) throws RestClientException {
        return addInvoiceWithHttpInfo(invoiceRequest).getBody();
    }

    /**
     * Add a new invoice
     * 
     * <p><b>200</b> - Successful Response
     * @param invoiceRequest  (required)
     * @return ResponseEntity&lt;InvoiceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceResponse> addInvoiceWithHttpInfo(InvoiceRequest invoiceRequest) throws RestClientException {
        Object postBody = invoiceRequest;
        
        // verify the required parameter 'invoiceRequest' is set
        if (invoiceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceRequest' when calling addInvoice");
        }
        
        String path = apiClient.expandPath("/invoice", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceResponse> returnType = new ParameterizedTypeReference<InvoiceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get All Invoices
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return InvoiceListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceListResponse getAllInvoices(Integer page, Integer size) throws RestClientException {
        return getAllInvoicesWithHttpInfo(page, size).getBody();
    }

    /**
     * Get All Invoices
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;InvoiceListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceListResponse> getAllInvoicesWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/invoice", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceListResponse> returnType = new ParameterizedTypeReference<InvoiceListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get invoice by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return InvoiceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResponse getInvoiceByGid(String gid) throws RestClientException {
        return getInvoiceByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get invoice by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;InvoiceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceResponse> getInvoiceByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getInvoiceByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/invoice/{gid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceResponse> returnType = new ParameterizedTypeReference<InvoiceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * pay for invoice
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return InvoiceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResponse payInvoice(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        return payInvoiceWithHttpInfo(gid, invoiceRequest).getBody();
    }

    /**
     * pay for invoice
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return ResponseEntity&lt;InvoiceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceResponse> payInvoiceWithHttpInfo(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        Object postBody = invoiceRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling payInvoice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/invoice/{gid}/pay", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceResponse> returnType = new ParameterizedTypeReference<InvoiceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update invoice to active
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return InvoiceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResponse updateInvoiceActive(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        return updateInvoiceActiveWithHttpInfo(gid, invoiceRequest).getBody();
    }

    /**
     * Update invoice to active
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return ResponseEntity&lt;InvoiceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceResponse> updateInvoiceActiveWithHttpInfo(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        Object postBody = invoiceRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updateInvoiceActive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/invoice/{gid}/active", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceResponse> returnType = new ParameterizedTypeReference<InvoiceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update invoice to draft
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return InvoiceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceResponse updateInvoiceDraft(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        return updateInvoiceDraftWithHttpInfo(gid, invoiceRequest).getBody();
    }

    /**
     * Update invoice to draft
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param invoiceRequest  (optional)
     * @return ResponseEntity&lt;InvoiceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceResponse> updateInvoiceDraftWithHttpInfo(String gid, InvoiceRequest invoiceRequest) throws RestClientException {
        Object postBody = invoiceRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updateInvoiceDraft");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/invoice/{gid}/draft", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceResponse> returnType = new ParameterizedTypeReference<InvoiceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
