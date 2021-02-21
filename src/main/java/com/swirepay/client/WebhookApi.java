package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.WebhookListResponse;
import com.swirepay.client.model.WebhookRequest;
import com.swirepay.client.model.WebhookResponse;

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
@Component("com.swirepay.client.WebhookApi")
public class WebhookApi {
    private ApiClient apiClient;

    public WebhookApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add new webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param webhookRequest  (optional)
     * @return WebhookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookResponse addWebhook(WebhookRequest webhookRequest) throws RestClientException {
        return addWebhookWithHttpInfo(webhookRequest).getBody();
    }

    /**
     * Add new webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param webhookRequest  (optional)
     * @return ResponseEntity&lt;WebhookResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookResponse> addWebhookWithHttpInfo(WebhookRequest webhookRequest) throws RestClientException {
        Object postBody = webhookRequest;
        
        String path = apiClient.expandPath("/webhook", Collections.<String, Object>emptyMap());

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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<WebhookResponse> returnType = new ParameterizedTypeReference<WebhookResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteWebhook(String gid) throws RestClientException {
        deleteWebhookWithHttpInfo(gid);
    }

    /**
     * Delete webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteWebhookWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling deleteWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/webhook/{gid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get All Webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return WebhookListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookListResponse getAllWebhook(Integer page, Integer size) throws RestClientException {
        return getAllWebhookWithHttpInfo(page, size).getBody();
    }

    /**
     * Get All Webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;WebhookListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookListResponse> getAllWebhookWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/webhook", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<WebhookListResponse> returnType = new ParameterizedTypeReference<WebhookListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get webhook by gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return WebhookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookResponse getWebhookByGid(String gid) throws RestClientException {
        return getWebhookByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get webhook by gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;WebhookResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookResponse> getWebhookByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getWebhookByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/webhook/{gid}", uriVariables);

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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<WebhookResponse> returnType = new ParameterizedTypeReference<WebhookResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param webhookRequest  (optional)
     * @return WebhookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookResponse updateWebhook(String gid, WebhookRequest webhookRequest) throws RestClientException {
        return updateWebhookWithHttpInfo(gid, webhookRequest).getBody();
    }

    /**
     * Update webhook
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param webhookRequest  (optional)
     * @return ResponseEntity&lt;WebhookResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WebhookResponse> updateWebhookWithHttpInfo(String gid, WebhookRequest webhookRequest) throws RestClientException {
        Object postBody = webhookRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updateWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/webhook/{gid}", uriVariables);

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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<WebhookResponse> returnType = new ParameterizedTypeReference<WebhookResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
