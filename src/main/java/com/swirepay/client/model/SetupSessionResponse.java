/*
 * Swirepay Payment API
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
import com.swirepay.client.model.CategoryResponseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SetupSessionResponse
 */
@JsonPropertyOrder({
  SetupSessionResponse.JSON_PROPERTY_MESSAGE,
  SetupSessionResponse.JSON_PROPERTY_ENTITY,
  SetupSessionResponse.JSON_PROPERTY_RESPONSE_CODE,
  SetupSessionResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("SetupSessionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T10:47:55.753Z[Etc/UTC]")
public class SetupSessionResponse {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private CategoryResponseEntity entity;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Long responseCode;

  /**
   * status of response
   */
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public SetupSessionResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OK", value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SetupSessionResponse entity(CategoryResponseEntity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CategoryResponseEntity getEntity() {
    return entity;
  }


  public void setEntity(CategoryResponseEntity entity) {
    this.entity = entity;
  }


  public SetupSessionResponse responseCode(Long responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(Long responseCode) {
    this.responseCode = responseCode;
  }


  public SetupSessionResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * status of response
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of response")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupSessionResponse setupSessionResponse = (SetupSessionResponse) o;
    return Objects.equals(this.message, setupSessionResponse.message) &&
        Objects.equals(this.entity, setupSessionResponse.entity) &&
        Objects.equals(this.responseCode, setupSessionResponse.responseCode) &&
        Objects.equals(this.status, setupSessionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, entity, responseCode, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupSessionResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

