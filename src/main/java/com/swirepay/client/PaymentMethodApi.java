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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T05:48:21.646Z[Etc/UTC]")
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
     * Add Payment Method
     * 
     * <p><b>200</b> - Successful Response
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @param paymentMethodRequest  (optional)
     * @return PaymentMethodResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodResponse addPaymentMethod(String destinationAccount, PaymentMethodRequest paymentMethodRequest) throws RestClientException {
        return addPaymentMethodWithHttpInfo(destinationAccount, paymentMethodRequest).getBody();
    }

    /**
     * Add Payment Method
     * 
     * <p><b>200</b> - Successful Response
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @param paymentMethodRequest  (optional)
     * @return ResponseEntity&lt;PaymentMethodResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodResponse> addPaymentMethodWithHttpInfo(String destinationAccount, PaymentMethodRequest paymentMethodRequest) throws RestClientException {
        Object postBody = paymentMethodRequest;
        
        String path = apiClient.expandPath("/payment-method", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PaymentMethodResponse> returnType = new ParameterizedTypeReference<PaymentMethodResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete Payment Method
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePaymentMethod(String gid, String destinationAccount) throws RestClientException {
        deletePaymentMethodWithHttpInfo(gid, destinationAccount);
    }

    /**
     * Delete Payment Method
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deletePaymentMethodWithHttpInfo(String gid, String destinationAccount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling deletePaymentMethod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-method/{gid}", uriVariables);

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
     * Get Payment Method by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return PaymentMethodResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentMethodResponse getPaymentMethodByGid(String gid, String destinationAccount) throws RestClientException {
        return getPaymentMethodByGidWithHttpInfo(gid, destinationAccount).getBody();
    }

    /**
     * Get Payment Method by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param destinationAccount If processing on behalf of another Swirepay affiliate account (optional)
     * @return ResponseEntity&lt;PaymentMethodResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentMethodResponse> getPaymentMethodByGidWithHttpInfo(String gid, String destinationAccount) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getPaymentMethodByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/payment-method/{gid}", uriVariables);

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

        ParameterizedTypeReference<PaymentMethodResponse> returnType = new ParameterizedTypeReference<PaymentMethodResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
