# swirepay-payment-api

Swirepay Payment API

- API version: 1.0.0

- Build date: 2021-01-29T07:36:07.311Z[Etc/UTC]

Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded
request bodies, return JSON-encoded responses, and use standard HTTP response
codes, authentication, and verbs. You can use the Swirepay API in test mode, which
does not affect your live data or interact with the banking networks. The `API
key` you use to authenticate the request determines whether the request is live
mode or test mode.


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
  <artifactId>swirepay-payment-api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swirepay:swirepay-payment-api:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/swirepay-payment-api-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swirepay.client.invoker.*;
import com.swirepay.client.invoker.auth.*;
import com.swirepay.client.model.*;
import com.swirepay.client.BalanceApi;

public class BalanceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.swirepay.com/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | 
        try {
            BalanceResponse result = apiInstance.getBalance(xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#getBalance");
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
*BalanceApi* | [**getBalance**](docs/BalanceApi.md#getBalance) | **GET** /balance | Get balance
*CategoryApi* | [**getCategory**](docs/CategoryApi.md#getCategory) | **GET** /category | Get category
*CountryApi* | [**getCountry**](docs/CountryApi.md#getCountry) | **GET** /country | Get country
*CurrencyApi* | [**getCurrency**](docs/CurrencyApi.md#getCurrency) | **GET** /currency | Get currency
*CustomerApi* | [**addCustomer**](docs/CustomerApi.md#addCustomer) | **POST** /customer | Add a customer
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /customer | Get customers
*DisputeApi* | [**getDispute**](docs/DisputeApi.md#getDispute) | **GET** /dispute | Get dispute
*EventApi* | [**getEvent**](docs/EventApi.md#getEvent) | **GET** /event | Get event
*InvoiceApi* | [**getInvoice**](docs/InvoiceApi.md#getInvoice) | **GET** /invoice | Get invoice
*MembershipApi* | [**getMembership**](docs/MembershipApi.md#getMembership) | **GET** /membership | Get membership
*PaymentApi* | [**getPayment**](docs/PaymentApi.md#getPayment) | **GET** /payment | Get payment
*PaymentButtonApi* | [**getPaymentButton**](docs/PaymentButtonApi.md#getPaymentButton) | **GET** /payment-button | Get payment button
*PaymentLinkApi* | [**getPaymentLink**](docs/PaymentLinkApi.md#getPaymentLink) | **GET** /payment-link | Get payment link
*PaymentMethodApi* | [**addPaymentMethod**](docs/PaymentMethodApi.md#addPaymentMethod) | **POST** /payment-method | Add a payment method
*PaymentMethodApi* | [**getPaymentMethod**](docs/PaymentMethodApi.md#getPaymentMethod) | **GET** /payment-method | Get payment methods
*PaymentSessionApi* | [**getPaymentSession**](docs/PaymentSessionApi.md#getPaymentSession) | **GET** /payment-session | Get payment sessions
*PayoutApi* | [**getPayout**](docs/PayoutApi.md#getPayout) | **GET** /payout | Get payout
*PlanApi* | [**getPlan**](docs/PlanApi.md#getPlan) | **GET** /plan | Get plan
*ProductApi* | [**getProduct**](docs/ProductApi.md#getProduct) | **GET** /product | Get product
*PublicKeyApi* | [**getPublicKey**](docs/PublicKeyApi.md#getPublicKey) | **GET** /public-key | Get public key
*RefundApi* | [**getRefund**](docs/RefundApi.md#getRefund) | **GET** /refund | Get refund
*ReminderApi* | [**getReminder**](docs/ReminderApi.md#getReminder) | **GET** /reminder | Get reminder
*ReportApi* | [**getReport**](docs/ReportApi.md#getReport) | **GET** /report | Get report
*SetupSessionApi* | [**getSetupSession**](docs/SetupSessionApi.md#getSetupSession) | **GET** /setup-session | Get setup session
*SetupSubscriptionApi* | [**getSubscription**](docs/SetupSubscriptionApi.md#getSubscription) | **GET** /subscription | Get subscription
*TerminalApi* | [**getTerminal**](docs/TerminalApi.md#getTerminal) | **GET** /terminal | Get terminal
*TransactionApi* | [**getTransaction**](docs/TransactionApi.md#getTransaction) | **GET** /transaction | Get transaction


## Documentation for Models

 - [Balance](docs/Balance.md)
 - [BalanceResponse](docs/BalanceResponse.md)
 - [BalanceResponseEntity](docs/BalanceResponseEntity.md)
 - [CardRequest](docs/CardRequest.md)
 - [CategoryResponse](docs/CategoryResponse.md)
 - [CategoryResponseEntity](docs/CategoryResponseEntity.md)
 - [CountryResponse](docs/CountryResponse.md)
 - [CurrencyResponse](docs/CurrencyResponse.md)
 - [CustomerRequest](docs/CustomerRequest.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [DefaultResponse](docs/DefaultResponse.md)
 - [DisputeResponse](docs/DisputeResponse.md)
 - [EventResponse](docs/EventResponse.md)
 - [InvoiceResponse](docs/InvoiceResponse.md)
 - [MembershipResponse](docs/MembershipResponse.md)
 - [PaymentButtonResponse](docs/PaymentButtonResponse.md)
 - [PaymentLinkResponse](docs/PaymentLinkResponse.md)
 - [PaymentMethodRequest](docs/PaymentMethodRequest.md)
 - [PaymentMethodRequestCard](docs/PaymentMethodRequestCard.md)
 - [PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [PaymentResponse](docs/PaymentResponse.md)
 - [PaymentSessionResponse](docs/PaymentSessionResponse.md)
 - [PayoutResponse](docs/PayoutResponse.md)
 - [PlanResponse](docs/PlanResponse.md)
 - [ProductResponse](docs/ProductResponse.md)
 - [PublicKeyResponse](docs/PublicKeyResponse.md)
 - [RefundResponse](docs/RefundResponse.md)
 - [ReminderResponse](docs/ReminderResponse.md)
 - [ReportResponse](docs/ReportResponse.md)
 - [SetupSessionResponse](docs/SetupSessionResponse.md)
 - [SubscriptionResponse](docs/SubscriptionResponse.md)
 - [TerminalResponse](docs/TerminalResponse.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [UserResponse](docs/UserResponse.md)


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

