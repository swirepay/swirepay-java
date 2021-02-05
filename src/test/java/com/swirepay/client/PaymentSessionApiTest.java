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

import com.swirepay.client.model.PaymentSessionListResponse;
import com.swirepay.client.model.PaymentSessionRequest;
import com.swirepay.client.model.PaymentSessionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentSessionApi
 */
@Ignore
public class PaymentSessionApiTest {

    private final PaymentSessionApi api = new PaymentSessionApi();

    
    /**
     * Add a new payment ssession
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPaymentSessionTest() {
        PaymentSessionRequest paymentSessionRequest = null;
        PaymentSessionResponse response = api.addPaymentSession(paymentSessionRequest);

        // TODO: test validations
    }
    
    /**
     * Cancel Payment Session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPaymentSessionTest() {
        String gid = null;
        PaymentSessionResponse response = api.cancelPaymentSession(gid);

        // TODO: test validations
    }
    
    /**
     * Capture Payment Session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void capturePaymentSessionTest() {
        String gid = null;
        PaymentSessionResponse response = api.capturePaymentSession(gid);

        // TODO: test validations
    }
    
    /**
     * Confirm Payment Session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmPaymentSessionTest() {
        String gid = null;
        PaymentSessionRequest paymentSessionRequest = null;
        PaymentSessionResponse response = api.confirmPaymentSession(gid, paymentSessionRequest);

        // TODO: test validations
    }
    
    /**
     * Get all payment session
     *
     * Get all payment session
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPaymentSessionTest() {
        Integer page = null;
        Integer size = null;
        PaymentSessionListResponse response = api.getAllPaymentSession(page, size);

        // TODO: test validations
    }
    
    /**
     * Get Payment Session by Gid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentSessionByGidTest() {
        String gid = null;
        PaymentSessionResponse response = api.getPaymentSessionByGid(gid);

        // TODO: test validations
    }
    
    /**
     * Notify Payment Session by Gid
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyPaymentSessionByGidTest() {
        String gid = null;
        PaymentSessionResponse response = api.notifyPaymentSessionByGid(gid);

        // TODO: test validations
    }
    
    /**
     * Refund Payment Session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refundPaymentSessionTest() {
        String gid = null;
        PaymentSessionRequest paymentSessionRequest = null;
        PaymentSessionResponse response = api.refundPaymentSession(gid, paymentSessionRequest);

        // TODO: test validations
    }
    
    /**
     * Update Payment Session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentSessionTest() {
        String gid = null;
        PaymentSessionRequest paymentSessionRequest = null;
        PaymentSessionResponse response = api.updatePaymentSession(gid, paymentSessionRequest);

        // TODO: test validations
    }
    
}
