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

import com.swirepay.client.model.WebhookListResponse;
import com.swirepay.client.model.WebhookRequest;
import com.swirepay.client.model.WebhookResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Ignore
public class WebhookApiTest {

    private final WebhookApi api = new WebhookApi();

    
    /**
     * Add new webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWebhookTest() {
        WebhookRequest webhookRequest = null;
        WebhookResponse response = api.addWebhook(webhookRequest);

        // TODO: test validations
    }
    
    /**
     * Delete webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() {
        String gid = null;
        api.deleteWebhook(gid);

        // TODO: test validations
    }
    
    /**
     * Get All Webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWebhookTest() {
        Integer page = null;
        Integer size = null;
        WebhookListResponse response = api.getAllWebhook(page, size);

        // TODO: test validations
    }
    
    /**
     * Get webhook by gid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookByGidTest() {
        String gid = null;
        WebhookResponse response = api.getWebhookByGid(gid);

        // TODO: test validations
    }
    
    /**
     * Update webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookTest() {
        String gid = null;
        WebhookRequest webhookRequest = null;
        WebhookResponse response = api.updateWebhook(gid, webhookRequest);

        // TODO: test validations
    }
    
}