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


package com.swirepay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.swirepay.client.model.AddressRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CustomerRequest
 */
@JsonPropertyOrder({
  CustomerRequest.JSON_PROPERTY_EMAIL,
  CustomerRequest.JSON_PROPERTY_NAME,
  CustomerRequest.JSON_PROPERTY_PHONE_NUMBER,
  CustomerRequest.JSON_PROPERTY_REFERENCE_NUMBER,
  CustomerRequest.JSON_PROPERTY_TAX_STATUS,
  CustomerRequest.JSON_PROPERTY_TAX_ID,
  CustomerRequest.JSON_PROPERTY_TAX_VALUE,
  CustomerRequest.JSON_PROPERTY_BILLING_ADDRESS,
  CustomerRequest.JSON_PROPERTY_SHIPPING_ADDRESS
})
@JsonTypeName("CustomerRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
public class CustomerRequest {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_REFERENCE_NUMBER = "referenceNumber";
  private String referenceNumber;

  /**
   * Gets or Sets taxStatus
   */
  public enum TaxStatusEnum {
    TAXABLE("TAXABLE"),
    
    EXEMPT("EXEMPT");

    private String value;

    TaxStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaxStatusEnum fromValue(String value) {
      for (TaxStatusEnum b : TaxStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TAX_STATUS = "taxStatus";
  private TaxStatusEnum taxStatus;

  /**
   * Gets or Sets taxId
   */
  public enum TaxIdEnum {
    NONE("NONE"),
    
    EIN("EIN"),
    
    GST("GST");

    private String value;

    TaxIdEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaxIdEnum fromValue(String value) {
      for (TaxIdEnum b : TaxIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private TaxIdEnum taxId;

  public static final String JSON_PROPERTY_TAX_VALUE = "taxValue";
  private String taxValue;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private AddressRequest billingAddress;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private AddressRequest shippingAddress;


  public CustomerRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "sample-customer@example.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Sample Customer", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomerRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "180000000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CustomerRequest referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public CustomerRequest taxStatus(TaxStatusEnum taxStatus) {
    
    this.taxStatus = taxStatus;
    return this;
  }

   /**
   * Get taxStatus
   * @return taxStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxStatusEnum getTaxStatus() {
    return taxStatus;
  }


  public void setTaxStatus(TaxStatusEnum taxStatus) {
    this.taxStatus = taxStatus;
  }


  public CustomerRequest taxId(TaxIdEnum taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxIdEnum getTaxId() {
    return taxId;
  }


  public void setTaxId(TaxIdEnum taxId) {
    this.taxId = taxId;
  }


  public CustomerRequest taxValue(String taxValue) {
    
    this.taxValue = taxValue;
    return this;
  }

   /**
   * Get taxValue
   * @return taxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxValue() {
    return taxValue;
  }


  public void setTaxValue(String taxValue) {
    this.taxValue = taxValue;
  }


  public CustomerRequest billingAddress(AddressRequest billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressRequest getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(AddressRequest billingAddress) {
    this.billingAddress = billingAddress;
  }


  public CustomerRequest shippingAddress(AddressRequest shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressRequest getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(AddressRequest shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRequest customerRequest = (CustomerRequest) o;
    return Objects.equals(this.email, customerRequest.email) &&
        Objects.equals(this.name, customerRequest.name) &&
        Objects.equals(this.phoneNumber, customerRequest.phoneNumber) &&
        Objects.equals(this.referenceNumber, customerRequest.referenceNumber) &&
        Objects.equals(this.taxStatus, customerRequest.taxStatus) &&
        Objects.equals(this.taxId, customerRequest.taxId) &&
        Objects.equals(this.taxValue, customerRequest.taxValue) &&
        Objects.equals(this.billingAddress, customerRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, customerRequest.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phoneNumber, referenceNumber, taxStatus, taxId, taxValue, billingAddress, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    taxStatus: ").append(toIndentedString(taxStatus)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxValue: ").append(toIndentedString(taxValue)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

