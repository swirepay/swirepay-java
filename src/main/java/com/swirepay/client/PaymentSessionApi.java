package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.PaymentSessionListResponse;
import com.swirepay.client.model.PaymentSessionRequest;
import com.swirepay.client.model.PaymentSessionResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-21T04:14:10.799Z[Etc/UTC]")
@Component("com.swirepay.client.PaymentSessionApi")
public class PaymentSessionApi {
    private ApiClient apiClient;

    public PaymentSessionApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentSessionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new payment ssession
     * 
     * <p><b>200</b> - Successful Response
     * @param paymentSessionRequest  (required)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse addPaymentSession(PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        return addPaymentSessionWithHttpInfo(paymentSessionRequest).getBody();
    }

    /**
     * Add a new payment ssession
     * 
     * <p><b>200</b> - Successful Response
     * @param paymentSessionRequest  (required)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> addPaymentSessionWithHttpInfo(PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        Object postBody = paymentSessionRequest;
        
        // verify the required parameter 'paymentSessionRequest' is set
        if (paymentSessionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paymentSessionRequest' when calling addPaymentSession");
        }
        
        String path = apiClient.expandPath("/payment-session", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Cancel Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse cancelPaymentSession(String gid) throws RestClientException {
        return cancelPaymentSessionWithHttpInfo(gid).getBody();
    }

    /**
     * Cancel Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> cancelPaymentSessionWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling cancelPaymentSession");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/cancel", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Capture Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse capturePaymentSession(String gid) throws RestClientException {
        return capturePaymentSessionWithHttpInfo(gid).getBody();
    }

    /**
     * Capture Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> capturePaymentSessionWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling capturePaymentSession");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/capture", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Confirm Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse confirmPaymentSession(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        return confirmPaymentSessionWithHttpInfo(gid, paymentSessionRequest).getBody();
    }

    /**
     * Confirm Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> confirmPaymentSessionWithHttpInfo(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        Object postBody = paymentSessionRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling confirmPaymentSession");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/confirm", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get all payment session
     * Get all payment session
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return PaymentSessionListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionListResponse getAllPaymentSession(Integer page, Integer size) throws RestClientException {
        return getAllPaymentSessionWithHttpInfo(page, size).getBody();
    }

    /**
     * Get all payment session
     * Get all payment session
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;PaymentSessionListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionListResponse> getAllPaymentSessionWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/payment-session", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentSessionListResponse> returnType = new ParameterizedTypeReference<PaymentSessionListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Payment Session by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse getPaymentSessionByGid(String gid) throws RestClientException {
        return getPaymentSessionByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get Payment Session by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> getPaymentSessionByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getPaymentSessionByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Notify Payment Session by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse notifyPaymentSessionByGid(String gid) throws RestClientException {
        return notifyPaymentSessionByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Notify Payment Session by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> notifyPaymentSessionByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling notifyPaymentSessionByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/notify", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Refund Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse refundPaymentSession(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        return refundPaymentSessionWithHttpInfo(gid, paymentSessionRequest).getBody();
    }

    /**
     * Refund Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> refundPaymentSessionWithHttpInfo(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        Object postBody = paymentSessionRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling refundPaymentSession");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/refund", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return PaymentSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentSessionResponse updatePaymentSession(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        return updatePaymentSessionWithHttpInfo(gid, paymentSessionRequest).getBody();
    }

    /**
     * Update Payment Session
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param paymentSessionRequest  (optional)
     * @return ResponseEntity&lt;PaymentSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentSessionResponse> updatePaymentSessionWithHttpInfo(String gid, PaymentSessionRequest paymentSessionRequest) throws RestClientException {
        Object postBody = paymentSessionRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updatePaymentSession");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-session/{gid}/update", uriVariables);

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

        ParameterizedTypeReference<PaymentSessionResponse> returnType = new ParameterizedTypeReference<PaymentSessionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
