package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.PaymentMethodRequest;
import com.swirepay.client.model.PaymentMethodResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T07:22:16.653Z[Etc/UTC]")
@Component("com.swirepay.client.PaymentMethodApi")
public class PaymentMethodApi {
    private ApiClient apiClient;

    public PaymentMethodApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentMethodApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a payment method
     * Adds a payment method to an account
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @param body Payment method object that needs to be added to the account (required)
     * @return PaymentMethodResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodResponse addPaymentMethod(String xApiKey, PaymentMethodRequest body) throws RestClientException {
        return addPaymentMethodWithHttpInfo(xApiKey, body).getBody();
    }

    /**
     * Add a payment method
     * Adds a payment method to an account
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @param body Payment method object that needs to be added to the account (required)
     * @return ResponseEntity&lt;PaymentMethodResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodResponse> addPaymentMethodWithHttpInfo(String xApiKey, PaymentMethodRequest body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling addPaymentMethod");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addPaymentMethod");
        }
        
        String path = apiClient.expandPath("/payment-method", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xApiKey != null)
        headerParams.add("x-api-key", apiClient.parameterToString(xApiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<PaymentMethodResponse> returnType = new ParameterizedTypeReference<PaymentMethodResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get payment methods
     * Get payment methods
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @return PaymentMethodResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodResponse getPaymentMethod(String xApiKey) throws RestClientException {
        return getPaymentMethodWithHttpInfo(xApiKey).getBody();
    }

    /**
     * Get payment methods
     * Get payment methods
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @return ResponseEntity&lt;PaymentMethodResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodResponse> getPaymentMethodWithHttpInfo(String xApiKey) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling getPaymentMethod");
        }
        
        String path = apiClient.expandPath("/payment-method", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xApiKey != null)
        headerParams.add("x-api-key", apiClient.parameterToString(xApiKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<PaymentMethodResponse> returnType = new ParameterizedTypeReference<PaymentMethodResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
