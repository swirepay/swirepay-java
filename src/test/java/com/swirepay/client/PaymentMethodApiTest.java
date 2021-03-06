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

import com.swirepay.client.model.PaymentMethodRequest;
import com.swirepay.client.model.PaymentMethodResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodApi
 */
@Ignore
public class PaymentMethodApiTest {

    private final PaymentMethodApi api = new PaymentMethodApi();

    
    /**
     * Add Payment Method
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPaymentMethodTest() {
        String destinationAccount = null;
        PaymentMethodRequest paymentMethodRequest = null;
        PaymentMethodResponse response = api.addPaymentMethod(destinationAccount, paymentMethodRequest);

        // TODO: test validations
    }
    
    /**
     * Delete Payment Method
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentMethodTest() {
        String gid = null;
        String destinationAccount = null;
        api.deletePaymentMethod(gid, destinationAccount);

        // TODO: test validations
    }
    
    /**
     * Get Payment Method by Gid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentMethodByGidTest() {
        String gid = null;
        String destinationAccount = null;
        PaymentMethodResponse response = api.getPaymentMethodByGid(gid, destinationAccount);

        // TODO: test validations
    }
    
}
