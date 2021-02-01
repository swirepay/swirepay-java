package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.PaymentButtonResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T11:10:44.725Z[Etc/UTC]")
@Component("com.swirepay.client.PaymentButtonApi")
public class PaymentButtonApi {
    private ApiClient apiClient;

    public PaymentButtonApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentButtonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get payment button
     * Get payment button
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @return PaymentButtonResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentButtonResponse getPaymentButton(String xApiKey) throws RestClientException {
        return getPaymentButtonWithHttpInfo(xApiKey).getBody();
    }

    /**
     * Get payment button
     * Get payment button
     * <p><b>200</b> - successful operation
     * @param xApiKey  (required)
     * @return ResponseEntity&lt;PaymentButtonResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentButtonResponse> getPaymentButtonWithHttpInfo(String xApiKey) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling getPaymentButton");
        }
        
        String path = apiClient.expandPath("/payment-button", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentButtonResponse> returnType = new ParameterizedTypeReference<PaymentButtonResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
