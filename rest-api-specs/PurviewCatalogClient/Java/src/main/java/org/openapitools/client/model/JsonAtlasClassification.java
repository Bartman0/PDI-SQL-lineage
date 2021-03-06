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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.JsonAtlasClassificationAllOf;
import org.openapitools.client.model.JsonAtlasStruct;
import org.openapitools.client.model.JsonStatus;
import org.openapitools.client.model.JsonTimeBoundary;

/**
 * An instance of a classification; it doesn&#39;t have an identity, this object exists only when associated with an entity.
 */
@ApiModel(description = "An instance of a classification; it doesn't have an identity, this object exists only when associated with an entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasClassification {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_T_S = "lastModifiedTS";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_T_S)
  private String lastModifiedTS;

  public static final String SERIALIZED_NAME_ENTITY_GUID = "entityGuid";
  @SerializedName(SERIALIZED_NAME_ENTITY_GUID)
  private String entityGuid;

  public static final String SERIALIZED_NAME_ENTITY_STATUS = "entityStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_STATUS)
  private JsonStatus entityStatus;

  public static final String SERIALIZED_NAME_PROPAGATE = "propagate";
  @SerializedName(SERIALIZED_NAME_PROPAGATE)
  private Boolean propagate;

  public static final String SERIALIZED_NAME_REMOVE_PROPAGATIONS_ON_ENTITY_DELETE = "removePropagationsOnEntityDelete";
  @SerializedName(SERIALIZED_NAME_REMOVE_PROPAGATIONS_ON_ENTITY_DELETE)
  private Boolean removePropagationsOnEntityDelete;

  public static final String SERIALIZED_NAME_VALIDITY_PERIODS = "validityPeriods";
  @SerializedName(SERIALIZED_NAME_VALIDITY_PERIODS)
  private List<JsonTimeBoundary> validityPeriods = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_DETAILS = "sourceDetails";
  @SerializedName(SERIALIZED_NAME_SOURCE_DETAILS)
  private Map<String, Object> sourceDetails = null;


  public JsonAtlasClassification attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public JsonAtlasClassification putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The attributes of the struct.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes of the struct.")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public JsonAtlasClassification typeName(String typeName) {
    
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


  public JsonAtlasClassification lastModifiedTS(String lastModifiedTS) {
    
    this.lastModifiedTS = lastModifiedTS;
    return this;
  }

   /**
   * ETag for concurrency control.
   * @return lastModifiedTS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ETag for concurrency control.")

  public String getLastModifiedTS() {
    return lastModifiedTS;
  }


  public void setLastModifiedTS(String lastModifiedTS) {
    this.lastModifiedTS = lastModifiedTS;
  }


  public JsonAtlasClassification entityGuid(String entityGuid) {
    
    this.entityGuid = entityGuid;
    return this;
  }

   /**
   * The GUID of the entity.
   * @return entityGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the entity.")

  public String getEntityGuid() {
    return entityGuid;
  }


  public void setEntityGuid(String entityGuid) {
    this.entityGuid = entityGuid;
  }


  public JsonAtlasClassification entityStatus(JsonStatus entityStatus) {
    
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


  public JsonAtlasClassification propagate(Boolean propagate) {
    
    this.propagate = propagate;
    return this;
  }

   /**
   * Determines if the classification will be propagated.
   * @return propagate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if the classification will be propagated.")

  public Boolean getPropagate() {
    return propagate;
  }


  public void setPropagate(Boolean propagate) {
    this.propagate = propagate;
  }


  public JsonAtlasClassification removePropagationsOnEntityDelete(Boolean removePropagationsOnEntityDelete) {
    
    this.removePropagationsOnEntityDelete = removePropagationsOnEntityDelete;
    return this;
  }

   /**
   * Determines if propagations will be removed on entity deletion.
   * @return removePropagationsOnEntityDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if propagations will be removed on entity deletion.")

  public Boolean getRemovePropagationsOnEntityDelete() {
    return removePropagationsOnEntityDelete;
  }


  public void setRemovePropagationsOnEntityDelete(Boolean removePropagationsOnEntityDelete) {
    this.removePropagationsOnEntityDelete = removePropagationsOnEntityDelete;
  }


  public JsonAtlasClassification validityPeriods(List<JsonTimeBoundary> validityPeriods) {
    
    this.validityPeriods = validityPeriods;
    return this;
  }

  public JsonAtlasClassification addValidityPeriodsItem(JsonTimeBoundary validityPeriodsItem) {
    if (this.validityPeriods == null) {
      this.validityPeriods = new ArrayList<JsonTimeBoundary>();
    }
    this.validityPeriods.add(validityPeriodsItem);
    return this;
  }

   /**
   * An array of time boundaries indicating validity periods.
   * @return validityPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of time boundaries indicating validity periods.")

  public List<JsonTimeBoundary> getValidityPeriods() {
    return validityPeriods;
  }


  public void setValidityPeriods(List<JsonTimeBoundary> validityPeriods) {
    this.validityPeriods = validityPeriods;
  }


  public JsonAtlasClassification source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * indicate the source who create the classification detail
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicate the source who create the classification detail")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public JsonAtlasClassification sourceDetails(Map<String, Object> sourceDetails) {
    
    this.sourceDetails = sourceDetails;
    return this;
  }

  public JsonAtlasClassification putSourceDetailsItem(String key, Object sourceDetailsItem) {
    if (this.sourceDetails == null) {
      this.sourceDetails = new HashMap<String, Object>();
    }
    this.sourceDetails.put(key, sourceDetailsItem);
    return this;
  }

   /**
   * more detail on source information
   * @return sourceDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "more detail on source information")

  public Map<String, Object> getSourceDetails() {
    return sourceDetails;
  }


  public void setSourceDetails(Map<String, Object> sourceDetails) {
    this.sourceDetails = sourceDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasClassification jsonAtlasClassification = (JsonAtlasClassification) o;
    return Objects.equals(this.attributes, jsonAtlasClassification.attributes) &&
        Objects.equals(this.typeName, jsonAtlasClassification.typeName) &&
        Objects.equals(this.lastModifiedTS, jsonAtlasClassification.lastModifiedTS) &&
        Objects.equals(this.entityGuid, jsonAtlasClassification.entityGuid) &&
        Objects.equals(this.entityStatus, jsonAtlasClassification.entityStatus) &&
        Objects.equals(this.propagate, jsonAtlasClassification.propagate) &&
        Objects.equals(this.removePropagationsOnEntityDelete, jsonAtlasClassification.removePropagationsOnEntityDelete) &&
        Objects.equals(this.validityPeriods, jsonAtlasClassification.validityPeriods) &&
        Objects.equals(this.source, jsonAtlasClassification.source) &&
        Objects.equals(this.sourceDetails, jsonAtlasClassification.sourceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, typeName, lastModifiedTS, entityGuid, entityStatus, propagate, removePropagationsOnEntityDelete, validityPeriods, source, sourceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasClassification {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    lastModifiedTS: ").append(toIndentedString(lastModifiedTS)).append("\n");
    sb.append("    entityGuid: ").append(toIndentedString(entityGuid)).append("\n");
    sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
    sb.append("    propagate: ").append(toIndentedString(propagate)).append("\n");
    sb.append("    removePropagationsOnEntityDelete: ").append(toIndentedString(removePropagationsOnEntityDelete)).append("\n");
    sb.append("    validityPeriods: ").append(toIndentedString(validityPeriods)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDetails: ").append(toIndentedString(sourceDetails)).append("\n");
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

