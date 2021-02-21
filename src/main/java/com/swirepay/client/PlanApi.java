package com.swirepay.client;

import com.swirepay.client.invoker.ApiClient;

import com.swirepay.client.model.PlanListResponse;
import com.swirepay.client.model.PlanRequest;
import com.swirepay.client.model.PlanResponse;

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
@Component("com.swirepay.client.PlanApi")
public class PlanApi {
    private ApiClient apiClient;

    public PlanApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new plan
     * 
     * <p><b>200</b> - Successful Response
     * @param planRequest  (required)
     * @return PlanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlanResponse addPlan(PlanRequest planRequest) throws RestClientException {
        return addPlanWithHttpInfo(planRequest).getBody();
    }

    /**
     * Add a new plan
     * 
     * <p><b>200</b> - Successful Response
     * @param planRequest  (required)
     * @return ResponseEntity&lt;PlanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlanResponse> addPlanWithHttpInfo(PlanRequest planRequest) throws RestClientException {
        Object postBody = planRequest;
        
        // verify the required parameter 'planRequest' is set
        if (planRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'planRequest' when calling addPlan");
        }
        
        String path = apiClient.expandPath("/plan", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PlanResponse> returnType = new ParameterizedTypeReference<PlanResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get All Plan
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return PlanListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlanListResponse getAllPlan(Integer page, Integer size) throws RestClientException {
        return getAllPlanWithHttpInfo(page, size).getBody();
    }

    /**
     * Get All Plan
     * 
     * <p><b>200</b> - Successful Response
     * @param page  (optional)
     * @param size  (optional)
     * @return ResponseEntity&lt;PlanListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlanListResponse> getAllPlanWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/plan", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PlanListResponse> returnType = new ParameterizedTypeReference<PlanListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get Plan by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return PlanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlanResponse getplanByGid(String gid) throws RestClientException {
        return getplanByGidWithHttpInfo(gid).getBody();
    }

    /**
     * Get Plan by Gid
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @return ResponseEntity&lt;PlanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlanResponse> getplanByGidWithHttpInfo(String gid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling getplanByGid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/plan/{gid}", uriVariables);

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

        ParameterizedTypeReference<PlanResponse> returnType = new ParameterizedTypeReference<PlanResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update Plan
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param planRequest  (optional)
     * @return PlanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlanResponse updatePlan(String gid, PlanRequest planRequest) throws RestClientException {
        return updatePlanWithHttpInfo(gid, planRequest).getBody();
    }

    /**
     * Update Plan
     * 
     * <p><b>200</b> - Successful Response
     * @param gid  (required)
     * @param planRequest  (optional)
     * @return ResponseEntity&lt;PlanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlanResponse> updatePlanWithHttpInfo(String gid, PlanRequest planRequest) throws RestClientException {
        Object postBody = planRequest;
        
        // verify the required parameter 'gid' is set
        if (gid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gid' when calling updatePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gid", gid);
        String path = apiClient.expandPath("/plan/{gid}", uriVariables);

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

        ParameterizedTypeReference<PlanResponse> returnType = new ParameterizedTypeReference<PlanResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
