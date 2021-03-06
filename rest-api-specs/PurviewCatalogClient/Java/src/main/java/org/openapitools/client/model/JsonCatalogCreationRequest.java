/*
 * Purview Catalog Service REST API Document
 * Purview Catalog Service is a fully managed cloud service whose users can discover the data sources they need and understand the data sources they find. At the same time, Data Catalog helps organizations get more value from their existing investments. This swagger defines REST API of the Hot Tier of Data Catalog Gen 2.
 *
 * The version of the OpenAPI document: 2020-12-01-preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for catalog creation.
 */
@ApiModel(description = "Request for catalog creation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonCatalogCreationRequest {
  public static final String SERIALIZED_NAME_CATALOG_NAME = "catalogName";
  @SerializedName(SERIALIZED_NAME_CATALOG_NAME)
  private String catalogName;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private String catalogId;

  public static final String SERIALIZED_NAME_CREATOR_USER_ID = "creatorUserId";
  @SerializedName(SERIALIZED_NAME_CREATOR_USER_ID)
  private String creatorUserId;

  public static final String SERIALIZED_NAME_EVENT_HUB_CONNECTION_STRING = "eventHubConnectionString";
  @SerializedName(SERIALIZED_NAME_EVENT_HUB_CONNECTION_STRING)
  private String eventHubConnectionString;


  public JsonCatalogCreationRequest catalogName(String catalogName) {
    
    this.catalogName = catalogName;
    return this;
  }

   /**
   * Name of the catalog.
   * @return catalogName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the catalog.")

  public String getCatalogName() {
    return catalogName;
  }


  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public JsonCatalogCreationRequest catalogId(String catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * ID of the catalog.
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the catalog.")

  public String getCatalogId() {
    return catalogId;
  }


  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  public JsonCatalogCreationRequest creatorUserId(String creatorUserId) {
    
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * User ID or the creator.
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User ID or the creator.")

  public String getCreatorUserId() {
    return creatorUserId;
  }


  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  public JsonCatalogCreationRequest eventHubConnectionString(String eventHubConnectionString) {
    
    this.eventHubConnectionString = eventHubConnectionString;
    return this;
  }

   /**
   * The connection string of the Event Hubs.
   * @return eventHubConnectionString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection string of the Event Hubs.")

  public String getEventHubConnectionString() {
    return eventHubConnectionString;
  }


  public void setEventHubConnectionString(String eventHubConnectionString) {
    this.eventHubConnectionString = eventHubConnectionString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonCatalogCreationRequest jsonCatalogCreationRequest = (JsonCatalogCreationRequest) o;
    return Objects.equals(this.catalogName, jsonCatalogCreationRequest.catalogName) &&
        Objects.equals(this.catalogId, jsonCatalogCreationRequest.catalogId) &&
        Objects.equals(this.creatorUserId, jsonCatalogCreationRequest.creatorUserId) &&
        Objects.equals(this.eventHubConnectionString, jsonCatalogCreationRequest.eventHubConnectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, catalogId, creatorUserId, eventHubConnectionString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonCatalogCreationRequest {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    eventHubConnectionString: ").append(toIndentedString(eventHubConnectionString)).append("\n");
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

