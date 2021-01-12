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

import com.swirepay.client.model.RefundResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefundApi
 */
@Ignore
public class RefundApiTest {

    private final RefundApi api = new RefundApi();

    
    /**
     * Get refund
     *
     * Get refund
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRefundTest() {
        String xApiKey = null;
        RefundResponse response = api.getRefund(xApiKey);

        // TODO: test validations
    }
    
}
