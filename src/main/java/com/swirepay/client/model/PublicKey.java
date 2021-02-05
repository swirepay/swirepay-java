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
 * PublicKey
 */
@JsonPropertyOrder({
  PublicKey.JSON_PROPERTY_GID,
  PublicKey.JSON_PROPERTY_CREATED_AT,
  PublicKey.JSON_PROPERTY_UPDATED_AT,
  PublicKey.JSON_PROPERTY_DELETED,
  PublicKey.JSON_PROPERTY_API_KEY,
  PublicKey.JSON_PROPERTY_PENDING_EXPIRATION,
  PublicKey.JSON_PROPERTY_LAST_USED
})
@JsonTypeName("PublicKey")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T05:55:44.963Z[Etc/UTC]")
public class PublicKey {
  public static final String JSON_PROPERTY_GID = "gid";
  private String gid;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_PENDING_EXPIRATION = "pendingExpiration";
  private Boolean pendingExpiration;

  public static final String JSON_PROPERTY_LAST_USED = "lastUsed";
  private String lastUsed;


  public PublicKey gid(String gid) {
    
    this.gid = gid;
    return this;
  }

   /**
   * Get gid
   * @return gid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGid() {
    return gid;
  }


  public void setGid(String gid) {
    this.gid = gid;
  }


  public PublicKey createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PublicKey updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PublicKey deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public PublicKey apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public PublicKey pendingExpiration(Boolean pendingExpiration) {
    
    this.pendingExpiration = pendingExpiration;
    return this;
  }

   /**
   * Get pendingExpiration
   * @return pendingExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PENDING_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPendingExpiration() {
    return pendingExpiration;
  }


  public void setPendingExpiration(Boolean pendingExpiration) {
    this.pendingExpiration = pendingExpiration;
  }


  public PublicKey lastUsed(String lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * Get lastUsed
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUsed() {
    return lastUsed;
  }


  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKey publicKey = (PublicKey) o;
    return Objects.equals(this.gid, publicKey.gid) &&
        Objects.equals(this.createdAt, publicKey.createdAt) &&
        Objects.equals(this.updatedAt, publicKey.updatedAt) &&
        Objects.equals(this.deleted, publicKey.deleted) &&
        Objects.equals(this.apiKey, publicKey.apiKey) &&
        Objects.equals(this.pendingExpiration, publicKey.pendingExpiration) &&
        Objects.equals(this.lastUsed, publicKey.lastUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, updatedAt, deleted, apiKey, pendingExpiration, lastUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKey {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    pendingExpiration: ").append(toIndentedString(pendingExpiration)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
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

