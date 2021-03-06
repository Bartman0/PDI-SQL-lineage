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
import org.openapitools.client.model.JsonAtlasEntity;
import org.openapitools.client.model.JsonEntityAuditActionV2;
import org.openapitools.client.model.JsonEntityAuditType;

/**
 * Structure of v2 entity audit event
 */
@ApiModel(description = "Structure of v2 entity audit event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonEntityAuditEventV2 {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private JsonEntityAuditActionV2 action;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private JsonAtlasEntity entity = null;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_EVENT_KEY = "eventKey";
  @SerializedName(SERIALIZED_NAME_EVENT_KEY)
  private String eventKey;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private JsonEntityAuditType type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;


  public JsonEntityAuditEventV2 action(JsonEntityAuditActionV2 action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonEntityAuditActionV2 getAction() {
    return action;
  }


  public void setAction(JsonEntityAuditActionV2 action) {
    this.action = action;
  }


  public JsonEntityAuditEventV2 details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * The details of the event.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the event.")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public JsonEntityAuditEventV2 entity(JsonAtlasEntity entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonAtlasEntity getEntity() {
    return entity;
  }


  public void setEntity(JsonAtlasEntity entity) {
    this.entity = entity;
  }


  public JsonEntityAuditEventV2 entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * The GUID of the entity.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the entity.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public JsonEntityAuditEventV2 eventKey(String eventKey) {
    
    this.eventKey = eventKey;
    return this;
  }

   /**
   * The key of the event.
   * @return eventKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the event.")

  public String getEventKey() {
    return eventKey;
  }


  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }


  public JsonEntityAuditEventV2 timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the event.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the event.")

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public JsonEntityAuditEventV2 type(JsonEntityAuditType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonEntityAuditType getType() {
    return type;
  }


  public void setType(JsonEntityAuditType type) {
    this.type = type;
  }


  public JsonEntityAuditEventV2 user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * The user of the event.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user of the event.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonEntityAuditEventV2 jsonEntityAuditEventV2 = (JsonEntityAuditEventV2) o;
    return Objects.equals(this.action, jsonEntityAuditEventV2.action) &&
        Objects.equals(this.details, jsonEntityAuditEventV2.details) &&
        Objects.equals(this.entity, jsonEntityAuditEventV2.entity) &&
        Objects.equals(this.entityId, jsonEntityAuditEventV2.entityId) &&
        Objects.equals(this.eventKey, jsonEntityAuditEventV2.eventKey) &&
        Objects.equals(this.timestamp, jsonEntityAuditEventV2.timestamp) &&
        Objects.equals(this.type, jsonEntityAuditEventV2.type) &&
        Objects.equals(this.user, jsonEntityAuditEventV2.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, details, entity, entityId, eventKey, timestamp, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonEntityAuditEventV2 {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

