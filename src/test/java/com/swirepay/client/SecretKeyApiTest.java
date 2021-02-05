/*
 * Swirepay API
 * Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@swirepay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.swirepay.client;

import com.swirepay.client.model.SecretKeyListResponse;
import com.swirepay.client.model.SecretKeyRequest;
import com.swirepay.client.model.SecretKeyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecretKeyApi
 */
@Ignore
public class SecretKeyApiTest {

    private final SecretKeyApi api = new SecretKeyApi();

    
    /**
     * Get All Secret Key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSecretKeyTest() {
        Integer page = null;
        Integer size = null;
        SecretKeyListResponse response = api.getAllSecretKey(page, size);

        // TODO: test validations
    }
    
    /**
     * Roll Secret Key by Gid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollSecretKeyByGidTest() {
        String gid = null;
        SecretKeyRequest secretKeyRequest = null;
        SecretKeyResponse response = api.rollSecretKeyByGid(gid, secretKeyRequest);

        // TODO: test validations
    }
    
}