package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.SecretKeyListResponse;
import com.swirepay.client.model.SecretKeyRequest;
import com.swirepay.client.model.SecretKeyResponse;

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
@Component("com.swirepay.client.SecretKeyApi")
public class SecretKeyApi {
    private ApiClient apiClient;

    public SecretKeyApi() {
        this(new ApiClient());
    }

    @Autowired
    public SecretKeyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get All Secret Key
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return SecretKeyListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretKeyListResponse getAllSecretKey(Integer page, Integer size) throws RestClientException {
        return getAllSecretKeyWithHttpInfo(page, size).getBody();
    }

    /**
     * Get All Secret Key
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;SecretKeyListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretKeyListResponse> getAllSecretKeyWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/secret-key", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SecretKeyListResponse> returnType = new ParameterizedTypeReference<SecretKeyListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Roll Secret Key by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param secretKeyRequest  (optional)
     * @return SecretKeyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretKeyResponse rollSecretKeyByGid(String gid, SecretKeyRequest secretKeyRequest) throws RestClientException {
        return rollSecretKeyByGidWithHttpInfo(gid, secretKeyRequest).getBody();
    }

    /**
     * Roll Secret Key by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param secretKeyRequest  (optional)
     * @return ResponseEntity&lt;SecretKeyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretKeyResponse> rollSecretKeyByGidWithHttpInfo(String gid, SecretKeyRequest secretKeyRequest) throws RestClientException {
        Object postBody = secretKeyRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling rollSecretKeyByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/secret-key/{gid}/roll", uriVariables);

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

        ParameterizedTypeReference<SecretKeyResponse> returnType = new ParameterizedTypeReference<SecretKeyResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
