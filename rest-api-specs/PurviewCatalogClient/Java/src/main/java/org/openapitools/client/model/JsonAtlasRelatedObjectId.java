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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.JsonAtlasObjectId;
import org.openapitools.client.model.JsonAtlasRelatedObjectIdAllOf;
import org.openapitools.client.model.JsonAtlasStruct;
import org.openapitools.client.model.JsonStatus;
import org.openapitools.client.model.JsonStatusAtlasRelationship;

/**
 * Reference to an object-instance of AtlasEntity type used in relationship attribute values
 */
@ApiModel(description = "Reference to an object-instance of AtlasEntity type used in relationship attribute values")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasRelatedObjectId {
  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_UNIQUE_ATTRIBUTES = "uniqueAttributes";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ATTRIBUTES)
  private Map<String, Object> uniqueAttributes = null;

  public static final String SERIALIZED_NAME_DISPLAY_TEXT = "displayText";
  @SerializedName(SERIALIZED_NAME_DISPLAY_TEXT)
  private String displayText;

  public static final String SERIALIZED_NAME_ENTITY_STATUS = "entityStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_STATUS)
  private JsonStatus entityStatus;

  public static final String SERIALIZED_NAME_RELATIONSHIP_ATTRIBUTES = "relationshipAttributes";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_ATTRIBUTES)
  private JsonAtlasStruct relationshipAttributes;

  public static final String SERIALIZED_NAME_RELATIONSHIP_GUID = "relationshipGuid";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_GUID)
  private String relationshipGuid;

  public static final String SERIALIZED_NAME_RELATIONSHIP_STATUS = "relationshipStatus";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_STATUS)
  private JsonStatusAtlasRelationship relationshipStatus;


  public JsonAtlasRelatedObjectId guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * The GUID of the object.
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the object.")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public JsonAtlasRelatedObjectId typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * The name of the type.
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the type.")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public JsonAtlasRelatedObjectId uniqueAttributes(Map<String, Object> uniqueAttributes) {
    
    this.uniqueAttributes = uniqueAttributes;
    return this;
  }

  public JsonAtlasRelatedObjectId putUniqueAttributesItem(String key, Object uniqueAttributesItem) {
    if (this.uniqueAttributes == null) {
      this.uniqueAttributes = new HashMap<String, Object>();
    }
    this.uniqueAttributes.put(key, uniqueAttributesItem);
    return this;
  }

   /**
   * The unique attributes of the object.
   * @return uniqueAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique attributes of the object.")

  public Map<String, Object> getUniqueAttributes() {
    return uniqueAttributes;
  }


  public void setUniqueAttributes(Map<String, Object> uniqueAttributes) {
    this.uniqueAttributes = uniqueAttributes;
  }


  public JsonAtlasRelatedObjectId displayText(String displayText) {
    
    this.displayText = displayText;
    return this;
  }

   /**
   * The display text.
   * @return displayText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display text.")

  public String getDisplayText() {
    return displayText;
  }


  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }


  public JsonAtlasRelatedObjectId entityStatus(JsonStatus entityStatus) {
    
    this.entityStatus = entityStatus;
    return this;
  }

   /**
   * Get entityStatus
   * @return entityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonStatus getEntityStatus() {
    return entityStatus;
  }


  public void setEntityStatus(JsonStatus entityStatus) {
    this.entityStatus = entityStatus;
  }


  public JsonAtlasRelatedObjectId relationshipAttributes(JsonAtlasStruct relationshipAttributes) {
    
    this.relationshipAttributes = relationshipAttributes;
    return this;
  }

   /**
   * Get relationshipAttributes
   * @return relationshipAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonAtlasStruct getRelationshipAttributes() {
    return relationshipAttributes;
  }


  public void setRelationshipAttributes(JsonAtlasStruct relationshipAttributes) {
    this.relationshipAttributes = relationshipAttributes;
  }


  public JsonAtlasRelatedObjectId relationshipGuid(String relationshipGuid) {
    
    this.relationshipGuid = relationshipGuid;
    return this;
  }

   /**
   * The GUID of the relationship.
   * @return relationshipGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the relationship.")

  public String getRelationshipGuid() {
    return relationshipGuid;
  }


  public void setRelationshipGuid(String relationshipGuid) {
    this.relationshipGuid = relationshipGuid;
  }


  public JsonAtlasRelatedObjectId relationshipStatus(JsonStatusAtlasRelationship relationshipStatus) {
    
    this.relationshipStatus = relationshipStatus;
    return this;
  }

   /**
   * Get relationshipStatus
   * @return relationshipStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonStatusAtlasRelationship getRelationshipStatus() {
    return relationshipStatus;
  }


  public void setRelationshipStatus(JsonStatusAtlasRelationship relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasRelatedObjectId jsonAtlasRelatedObjectId = (JsonAtlasRelatedObjectId) o;
    return Objects.equals(this.guid, jsonAtlasRelatedObjectId.guid) &&
        Objects.equals(this.typeName, jsonAtlasRelatedObjectId.typeName) &&
        Objects.equals(this.uniqueAttributes, jsonAtlasRelatedObjectId.uniqueAttributes) &&
        Objects.equals(this.displayText, jsonAtlasRelatedObjectId.displayText) &&
        Objects.equals(this.entityStatus, jsonAtlasRelatedObjectId.entityStatus) &&
        Objects.equals(this.relationshipAttributes, jsonAtlasRelatedObjectId.relationshipAttributes) &&
        Objects.equals(this.relationshipGuid, jsonAtlasRelatedObjectId.relationshipGuid) &&
        Objects.equals(this.relationshipStatus, jsonAtlasRelatedObjectId.relationshipStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, typeName, uniqueAttributes, displayText, entityStatus, relationshipAttributes, relationshipGuid, relationshipStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasRelatedObjectId {\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    uniqueAttributes: ").append(toIndentedString(uniqueAttributes)).append("\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
    sb.append("    relationshipAttributes: ").append(toIndentedString(relationshipAttributes)).append("\n");
    sb.append("    relationshipGuid: ").append(toIndentedString(relationshipGuid)).append("\n");
    sb.append("    relationshipStatus: ").append(toIndentedString(relationshipStatus)).append("\n");
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

