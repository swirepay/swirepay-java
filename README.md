# swirepay-java

Swirepay API

- API version: 1.0.0

- Build date: 2021-03-11T05:48:21.646Z[Etc/UTC]

Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.swirepay</groupId>
  <artifactId>swirepay-java</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swirepay:swirepay-java:1.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/swirepay-java-1.0.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swirepay.client.invoker.*;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.model.*;
import com.swirepay.client.CustomerApi;

public class CustomerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        CustomerRequest customerRequest = new CustomerRequest(); // CustomerRequest | 
        String destinationAccount = "destinationAccount_example"; // String | If processing on behalf of another Swirepay affiliate account
        try {
            CustomerResponse result = apiInstance.addCustomer(customerRequest, destinationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.swirepay.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomerApi* | [**addCustomer**](docs/CustomerApi.md#addCustomer) | **POST** /customer | Add a new customer
*CustomerApi* | [**deleteCustomerByGid**](docs/CustomerApi.md#deleteCustomerByGid) | **DELETE** /customer/{gid} | Delete customer by Gid
*CustomerApi* | [**getAllCustomers**](docs/CustomerApi.md#getAllCustomers) | **GET** /customer | Get all customers
*CustomerApi* | [**getCustomerByGid**](docs/CustomerApi.md#getCustomerByGid) | **GET** /customer/{gid} | Get Customer by Gid
*CustomerApi* | [**updateCustomer**](docs/CustomerApi.md#updateCustomer) | **PATCH** /customer/{gid} | Update Customer by Gid
*DisputeApi* | [**getAllDisputes**](docs/DisputeApi.md#getAllDisputes) | **GET** /dispute | Get All Disputes
*DisputeApi* | [**getDisputeByGid**](docs/DisputeApi.md#getDisputeByGid) | **GET** /dispute/{gid} | Get dispute by Gid
*InvoiceApi* | [**addInvoice**](docs/InvoiceApi.md#addInvoice) | **POST** /invoice | Add a new invoice
*InvoiceApi* | [**getAllInvoices**](docs/InvoiceApi.md#getAllInvoices) | **GET** /invoice | Get All Invoices
*InvoiceApi* | [**getInvoiceByGid**](docs/InvoiceApi.md#getInvoiceByGid) | **GET** /invoice/{gid} | Get invoice by Gid
*InvoiceApi* | [**payInvoice**](docs/InvoiceApi.md#payInvoice) | **PATCH** /invoice/{gid}/pay | pay for invoice
*InvoiceApi* | [**updateInvoiceActive**](docs/InvoiceApi.md#updateInvoiceActive) | **PATCH** /invoice/{gid}/active | Update invoice to active
*InvoiceApi* | [**updateInvoiceDraft**](docs/InvoiceApi.md#updateInvoiceDraft) | **PATCH** /invoice/{gid}/draft | Update invoice to draft
*PaymentLinkApi* | [**addPaymentLink**](docs/PaymentLinkApi.md#addPaymentLink) | **POST** /payment-link | Add a new Payment Link
*PaymentLinkApi* | [**cancelPaymentLinkByGid**](docs/PaymentLinkApi.md#cancelPaymentLinkByGid) | **PATCH** /payment-link/{gid}/cancel | Get Payment Link by Gid
*PaymentLinkApi* | [**getAllPaymentLink**](docs/PaymentLinkApi.md#getAllPaymentLink) | **GET** /payment-link | Get All payment Link
*PaymentLinkApi* | [**getPaymentLinkByGid**](docs/PaymentLinkApi.md#getPaymentLinkByGid) | **GET** /payment-link/{gid} | Get Payment Link by Gid
*PaymentMethodApi* | [**addPaymentMethod**](docs/PaymentMethodApi.md#addPaymentMethod) | **POST** /payment-method | Add Payment Method
*PaymentMethodApi* | [**deletePaymentMethod**](docs/PaymentMethodApi.md#deletePaymentMethod) | **DELETE** /payment-method/{gid} | Delete Payment Method
*PaymentMethodApi* | [**getPaymentMethodByGid**](docs/PaymentMethodApi.md#getPaymentMethodByGid) | **GET** /payment-method/{gid} | Get Payment Method by Gid
*PaymentSessionApi* | [**addPaymentSession**](docs/PaymentSessionApi.md#addPaymentSession) | **POST** /payment-session | Add a new payment ssession
*PaymentSessionApi* | [**cancelPaymentSession**](docs/PaymentSessionApi.md#cancelPaymentSession) | **PATCH** /payment-session/{gid}/cancel | Cancel Payment Session
*PaymentSessionApi* | [**capturePaymentSession**](docs/PaymentSessionApi.md#capturePaymentSession) | **PATCH** /payment-session/{gid}/capture | Capture Payment Session
*PaymentSessionApi* | [**confirmPaymentSession**](docs/PaymentSessionApi.md#confirmPaymentSession) | **PATCH** /payment-session/{gid}/confirm | Confirm Payment Session
*PaymentSessionApi* | [**getAllPaymentSession**](docs/PaymentSessionApi.md#getAllPaymentSession) | **GET** /payment-session | Get all payment session
*PaymentSessionApi* | [**getPaymentSessionByGid**](docs/PaymentSessionApi.md#getPaymentSessionByGid) | **GET** /payment-session/{gid} | Get Payment Session by Gid
*PaymentSessionApi* | [**notifyPaymentSessionByGid**](docs/PaymentSessionApi.md#notifyPaymentSessionByGid) | **GET** /payment-session/{gid}/notify | Notify Payment Session by Gid
*PaymentSessionApi* | [**refundPaymentSession**](docs/PaymentSessionApi.md#refundPaymentSession) | **PATCH** /payment-session/{gid}/refund | Refund Payment Session
*PaymentSessionApi* | [**updatePaymentSession**](docs/PaymentSessionApi.md#updatePaymentSession) | **PATCH** /payment-session/{gid}/update | Update Payment Session
*PayoutApi* | [**getAllPayouts**](docs/PayoutApi.md#getAllPayouts) | **GET** /payout | Get All payouts
*PayoutApi* | [**getPayoutByGid**](docs/PayoutApi.md#getPayoutByGid) | **GET** /payout/{gid} | Get payout by Gid
*PlanApi* | [**addPlan**](docs/PlanApi.md#addPlan) | **POST** /plan | Add a new plan
*PlanApi* | [**getAllPlan**](docs/PlanApi.md#getAllPlan) | **GET** /plan | Get All Plan
*PlanApi* | [**getplanByGid**](docs/PlanApi.md#getplanByGid) | **GET** /plan/{gid} | Get Plan by Gid
*PlanApi* | [**updatePlan**](docs/PlanApi.md#updatePlan) | **PATCH** /plan/{gid} | Update Plan
*PublicKeyApi* | [**getAllPublicKey**](docs/PublicKeyApi.md#getAllPublicKey) | **GET** /public-key | Get All Public Key
*PublicKeyApi* | [**rollPublicKeyByGid**](docs/PublicKeyApi.md#rollPublicKeyByGid) | **PATCH** /public-key/{gid}/roll | Roll Public Key by Gid
*RefundApi* | [**getAllRefunds**](docs/RefundApi.md#getAllRefunds) | **GET** /refund | Get All Refunds
*RefundApi* | [**getRefundByGid**](docs/RefundApi.md#getRefundByGid) | **GET** /refund/{gid} | Get refund by Gid
*SecretKeyApi* | [**getAllSecretKey**](docs/SecretKeyApi.md#getAllSecretKey) | **GET** /secret-key | Get All Secret Key
*SecretKeyApi* | [**rollSecretKeyByGid**](docs/SecretKeyApi.md#rollSecretKeyByGid) | **PATCH** /secret-key/{gid}/roll | Roll Secret Key by Gid
*SubscriptionApi* | [**addSubscription**](docs/SubscriptionApi.md#addSubscription) | **POST** /subscription | Add a new subscription
*SubscriptionApi* | [**cancelSubscription**](docs/SubscriptionApi.md#cancelSubscription) | **PATCH** /subscription/{gid}/cancel | Cancel Subscription
*SubscriptionApi* | [**getAllSubscription**](docs/SubscriptionApi.md#getAllSubscription) | **GET** /subscription | Get All Subscription
*SubscriptionApi* | [**getSubscriptionByGid**](docs/SubscriptionApi.md#getSubscriptionByGid) | **GET** /subscription/{gid} | Get Subscription by Gid
*TransactionApi* | [**getAllTransaction**](docs/TransactionApi.md#getAllTransaction) | **GET** /transaction | Get All transactions
*WebhookApi* | [**addWebhook**](docs/WebhookApi.md#addWebhook) | **POST** /webhook | Add new webhook
*WebhookApi* | [**deleteWebhook**](docs/WebhookApi.md#deleteWebhook) | **DELETE** /webhook/{gid} | Delete webhook
*WebhookApi* | [**getAllWebhook**](docs/WebhookApi.md#getAllWebhook) | **GET** /webhook | Get All Webhook
*WebhookApi* | [**getWebhookByGid**](docs/WebhookApi.md#getWebhookByGid) | **GET** /webhook/{gid} | Get webhook by gid
*WebhookApi* | [**updateWebhook**](docs/WebhookApi.md#updateWebhook) | **PATCH** /webhook/{gid} | Update webhook


## Documentation for Models

 - [AccountRate](docs/AccountRate.md)
 - [Acquirer](docs/Acquirer.md)
 - [Address](docs/Address.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [BillingFrequency](docs/BillingFrequency.md)
 - [Bin](docs/Bin.md)
 - [Card](docs/Card.md)
 - [CardRequest](docs/CardRequest.md)
 - [Category](docs/Category.md)
 - [Country](docs/Country.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerListResponse](docs/CustomerListResponse.md)
 - [CustomerListResponseEntity](docs/CustomerListResponseEntity.md)
 - [CustomerRequest](docs/CustomerRequest.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [Dispute](docs/Dispute.md)
 - [DisputeListResponse](docs/DisputeListResponse.md)
 - [DisputeListResponseEntity](docs/DisputeListResponseEntity.md)
 - [DisputeResponse](docs/DisputeResponse.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceLineItem](docs/InvoiceLineItem.md)
 - [InvoiceLink](docs/InvoiceLink.md)
 - [InvoiceListResponse](docs/InvoiceListResponse.md)
 - [InvoiceListResponseEntity](docs/InvoiceListResponseEntity.md)
 - [InvoiceRequest](docs/InvoiceRequest.md)
 - [InvoiceResponse](docs/InvoiceResponse.md)
 - [InvoicelineItemRequest](docs/InvoicelineItemRequest.md)
 - [Payment](docs/Payment.md)
 - [PaymentLink](docs/PaymentLink.md)
 - [PaymentLinkListResponse](docs/PaymentLinkListResponse.md)
 - [PaymentLinkListResponseEntity](docs/PaymentLinkListResponseEntity.md)
 - [PaymentLinkRequest](docs/PaymentLinkRequest.md)
 - [PaymentLinkResponse](docs/PaymentLinkResponse.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodRequest](docs/PaymentMethodRequest.md)
 - [PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [PaymentMethodType](docs/PaymentMethodType.md)
 - [PaymentSession](docs/PaymentSession.md)
 - [PaymentSessionListResponse](docs/PaymentSessionListResponse.md)
 - [PaymentSessionListResponseEntity](docs/PaymentSessionListResponseEntity.md)
 - [PaymentSessionPublicResponse](docs/PaymentSessionPublicResponse.md)
 - [PaymentSessionRequest](docs/PaymentSessionRequest.md)
 - [PaymentSessionResponse](docs/PaymentSessionResponse.md)
 - [PaymentType](docs/PaymentType.md)
 - [Payout](docs/Payout.md)
 - [PayoutListResponse](docs/PayoutListResponse.md)
 - [PayoutListResponseEntity](docs/PayoutListResponseEntity.md)
 - [PayoutResponse](docs/PayoutResponse.md)
 - [Plan](docs/Plan.md)
 - [PlanListResponse](docs/PlanListResponse.md)
 - [PlanListResponseEntity](docs/PlanListResponseEntity.md)
 - [PlanRequest](docs/PlanRequest.md)
 - [PlanResponse](docs/PlanResponse.md)
 - [PublicKey](docs/PublicKey.md)
 - [PublicKeyListResponse](docs/PublicKeyListResponse.md)
 - [PublicKeyListResponseEntity](docs/PublicKeyListResponseEntity.md)
 - [PublicKeyRequest](docs/PublicKeyRequest.md)
 - [PublicKeyResponse](docs/PublicKeyResponse.md)
 - [Rate](docs/Rate.md)
 - [Refund](docs/Refund.md)
 - [RefundListResponse](docs/RefundListResponse.md)
 - [RefundListResponseEntity](docs/RefundListResponseEntity.md)
 - [RefundResponse](docs/RefundResponse.md)
 - [SecretKey](docs/SecretKey.md)
 - [SecretKeyListResponse](docs/SecretKeyListResponse.md)
 - [SecretKeyListResponseEntity](docs/SecretKeyListResponseEntity.md)
 - [SecretKeyRequest](docs/SecretKeyRequest.md)
 - [SecretKeyResponse](docs/SecretKeyResponse.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionButton](docs/SubscriptionButton.md)
 - [SubscriptionLineItem](docs/SubscriptionLineItem.md)
 - [SubscriptionLineItemRequest](docs/SubscriptionLineItemRequest.md)
 - [SubscriptionLink](docs/SubscriptionLink.md)
 - [SubscriptionListResponse](docs/SubscriptionListResponse.md)
 - [SubscriptionListResponseEntity](docs/SubscriptionListResponseEntity.md)
 - [SubscriptionRequest](docs/SubscriptionRequest.md)
 - [SubscriptionResponse](docs/SubscriptionResponse.md)
 - [Support](docs/Support.md)
 - [Tax](docs/Tax.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionListResponse](docs/TransactionListResponse.md)
 - [TransactionListResponseEntity](docs/TransactionListResponseEntity.md)
 - [Upi](docs/Upi.md)
 - [UpiRequest](docs/UpiRequest.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookEvent](docs/WebhookEvent.md)
 - [WebhookListResponse](docs/WebhookListResponse.md)
 - [WebhookListResponseEntity](docs/WebhookListResponseEntity.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookResponse](docs/WebhookResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key


- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apiteam@swirepay.com

