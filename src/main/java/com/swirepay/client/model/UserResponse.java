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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserResponse
 */
@JsonPropertyOrder({
  UserResponse.JSON_PROPERTY_GID,
  UserResponse.JSON_PROPERTY_GIVEN_NAME,
  UserResponse.JSON_PROPERTY_FAMIL_NAME,
  UserResponse.JSON_PROPERTY_FULL_NAME,
  UserResponse.JSON_PROPERTY_IS_EMAIL_CONFIRMED,
  UserResponse.JSON_PROPERTY_PHONE_NUMBER,
  UserResponse.JSON_PROPERTY_IS_TWO_FACTOR_ENABLED,
  UserResponse.JSON_PROPERTY_LAST_LOGIN,
  UserResponse.JSON_PROPERTY_ACTIVE,
  UserResponse.JSON_PROPERTY_DELETED,
  UserResponse.JSON_PROPERTY_CREATED_AT,
  UserResponse.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("UserResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-29T08:42:23.758Z[Etc/UTC]")
public class UserResponse {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMIL_NAME = "familName";
  private String familName;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_IS_EMAIL_CONFIRMED = "isEmailConfirmed";
  private String isEmailConfirmed;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_IS_TWO_FACTOR_ENABLED = "isTwoFactorEnabled";
  private Boolean isTwoFactorEnabled;

  public static final String JSON_PROPERTY_LAST_LOGIN = "lastLogin";
  private String lastLogin;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;


  public UserResponse gid(String gid) {
    
    this.gid = gid;
    return this;
  }

   /**
   * Get gid
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-16b90f1c2ecc484c899f2720c557f5a7", value = "")
  @JsonProperty(JSON_PROPERTY_GID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGid() {
    return gid;
  }


  public void setGid(String gid) {
    this.gid = gid;
  }


  public UserResponse givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public UserResponse familName(String familName) {
    
    this.familName = familName;
    return this;
  }

   /**
   * Get familName
   * @return familName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAMIL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilName() {
    return familName;
  }


  public void setFamilName(String familName) {
    this.familName = familName;
  }


  public UserResponse fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public UserResponse isEmailConfirmed(String isEmailConfirmed) {
    
    this.isEmailConfirmed = isEmailConfirmed;
    return this;
  }

   /**
   * Get isEmailConfirmed
   * @return isEmailConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_EMAIL_CONFIRMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsEmailConfirmed() {
    return isEmailConfirmed;
  }


  public void setIsEmailConfirmed(String isEmailConfirmed) {
    this.isEmailConfirmed = isEmailConfirmed;
  }


  public UserResponse phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UserResponse isTwoFactorEnabled(Boolean isTwoFactorEnabled) {
    
    this.isTwoFactorEnabled = isTwoFactorEnabled;
    return this;
  }

   /**
   * Get isTwoFactorEnabled
   * @return isTwoFactorEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_IS_TWO_FACTOR_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTwoFactorEnabled() {
    return isTwoFactorEnabled;
  }


  public void setIsTwoFactorEnabled(Boolean isTwoFactorEnabled) {
    this.isTwoFactorEnabled = isTwoFactorEnabled;
  }


  public UserResponse lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-25T03:43:13.000Z", value = "")
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public UserResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UserResponse deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public UserResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-25T03:43:13.000Z", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public UserResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-25T03:43:13.000Z", value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.gid, userResponse.gid) &&
        Objects.equals(this.givenName, userResponse.givenName) &&
        Objects.equals(this.familName, userResponse.familName) &&
        Objects.equals(this.fullName, userResponse.fullName) &&
        Objects.equals(this.isEmailConfirmed, userResponse.isEmailConfirmed) &&
        Objects.equals(this.phoneNumber, userResponse.phoneNumber) &&
        Objects.equals(this.isTwoFactorEnabled, userResponse.isTwoFactorEnabled) &&
        Objects.equals(this.lastLogin, userResponse.lastLogin) &&
        Objects.equals(this.active, userResponse.active) &&
        Objects.equals(this.deleted, userResponse.deleted) &&
        Objects.equals(this.createdAt, userResponse.createdAt) &&
        Objects.equals(this.updatedAt, userResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, givenName, familName, fullName, isEmailConfirmed, phoneNumber, isTwoFactorEnabled, lastLogin, active, deleted, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familName: ").append(toIndentedString(familName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isEmailConfirmed: ").append(toIndentedString(isEmailConfirmed)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    isTwoFactorEnabled: ").append(toIndentedString(isTwoFactorEnabled)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

