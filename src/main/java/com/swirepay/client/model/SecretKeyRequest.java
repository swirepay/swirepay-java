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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SecretKeyRequest
 */
@JsonPropertyOrder({
  SecretKeyRequest.JSON_PROPERTY_EXPIRATION_IN_SECONDS
})
@JsonTypeName("SecretKeyRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
public class SecretKeyRequest {
  public static final String JSON_PROPERTY_EXPIRATION_IN_SECONDS = "expirationInSeconds";
  private Long expirationInSeconds;


  public SecretKeyRequest expirationInSeconds(Long expirationInSeconds) {
    
    this.expirationInSeconds = expirationInSeconds;
    return this;
  }

   /**
   * Get expirationInSeconds
   * @return expirationInSeconds
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getExpirationInSeconds() {
    return expirationInSeconds;
  }


  public void setExpirationInSeconds(Long expirationInSeconds) {
    this.expirationInSeconds = expirationInSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretKeyRequest secretKeyRequest = (SecretKeyRequest) o;
    return Objects.equals(this.expirationInSeconds, secretKeyRequest.expirationInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationInSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretKeyRequest {\n");
    sb.append("    expirationInSeconds: ").append(toIndentedString(expirationInSeconds)).append("\n");
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

