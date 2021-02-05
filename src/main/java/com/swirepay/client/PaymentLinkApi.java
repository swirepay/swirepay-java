package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.PaymentLinkListResponse;
import com.swirepay.client.model.PaymentLinkRequest;
import com.swirepay.client.model.PaymentLinkResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
@Component("com.swirepay.client.PaymentLinkApi")
public class PaymentLinkApi {
    private ApiClient apiClient;

    public PaymentLinkApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentLinkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new Payment Link
     * 
     * <p><b>200</b> - Successful Response
     * @param paymentLinkRequest  (required)
     * @return PaymentLinkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentLinkResponse addPaymentLink(PaymentLinkRequest paymentLinkRequest) throws RestClientException {
        return addPaymentLinkWithHttpInfo(paymentLinkRequest).getBody();
    }

    /**
     * Add a new Payment Link
     * 
     * <p><b>200</b> - Successful Response
     * @param paymentLinkRequest  (required)
     * @return ResponseEntity&lt;PaymentLinkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentLinkResponse> addPaymentLinkWithHttpInfo(PaymentLinkRequest paymentLinkRequest) throws RestClientException {
        Object postBody = paymentLinkRequest;
        
        // verify the required parameter 'paymentLinkRequest' is set
        if (paymentLinkRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paymentLinkRequest' when calling addPaymentLink");
        }
        
        String path = apiClient.expandPath("/payment-link", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentLinkResponse> returnType = new ParameterizedTypeReference<PaymentLinkResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Payment Link by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentLinkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentLinkResponse cancelPaymentLinkByGid(String gid) throws RestClientException {
        return cancelPaymentLinkByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get Payment Link by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentLinkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentLinkResponse> cancelPaymentLinkByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling cancelPaymentLinkByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-link/{gid}/cancel", uriVariables);

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

        ParameterizedTypeReference<PaymentLinkResponse> returnType = new ParameterizedTypeReference<PaymentLinkResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get All payment Link
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return PaymentLinkListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentLinkListResponse getAllPaymentLink(Integer page, Integer size) throws RestClientException {
        return getAllPaymentLinkWithHttpInfo(page, size).getBody();
    }

    /**
     * Get All payment Link
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;PaymentLinkListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentLinkListResponse> getAllPaymentLinkWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/payment-link", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentLinkListResponse> returnType = new ParameterizedTypeReference<PaymentLinkListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Payment Link by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentLinkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentLinkResponse getPaymentLinkByGid(String gid) throws RestClientException {
        return getPaymentLinkByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get Payment Link by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentLinkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentLinkResponse> getPaymentLinkByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getPaymentLinkByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-link/{gid}", uriVariables);

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

        ParameterizedTypeReference<PaymentLinkResponse> returnType = new ParameterizedTypeReference<PaymentLinkResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
