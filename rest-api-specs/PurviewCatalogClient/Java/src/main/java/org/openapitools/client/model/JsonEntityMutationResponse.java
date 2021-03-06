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
import org.openapitools.client.model.JsonAtlasEntityHeader;

/**
 * The mutation response of entity.
 */
@ApiModel(description = "The mutation response of entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonEntityMutationResponse {
  public static final String SERIALIZED_NAME_GUID_ASSIGNMENTS = "guidAssignments";
  @SerializedName(SERIALIZED_NAME_GUID_ASSIGNMENTS)
  private Map<String, String> guidAssignments = null;

  public static final String SERIALIZED_NAME_MUTATED_ENTITIES = "mutatedEntities";
  @SerializedName(SERIALIZED_NAME_MUTATED_ENTITIES)
  private Map<String, List<JsonAtlasEntityHeader>> mutatedEntities = null;

  public static final String SERIALIZED_NAME_PARTIAL_UPDATED_ENTITIES = "partialUpdatedEntities";
  @SerializedName(SERIALIZED_NAME_PARTIAL_UPDATED_ENTITIES)
  private List<JsonAtlasEntityHeader> partialUpdatedEntities = null;


  public JsonEntityMutationResponse guidAssignments(Map<String, String> guidAssignments) {
    
    this.guidAssignments = guidAssignments;
    return this;
  }

  public JsonEntityMutationResponse putGuidAssignmentsItem(String key, String guidAssignmentsItem) {
    if (this.guidAssignments == null) {
      this.guidAssignments = new HashMap<String, String>();
    }
    this.guidAssignments.put(key, guidAssignmentsItem);
    return this;
  }

   /**
   * A map of GUID assignments with entities.
   * @return guidAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of GUID assignments with entities.")

  public Map<String, String> getGuidAssignments() {
    return guidAssignments;
  }


  public void setGuidAssignments(Map<String, String> guidAssignments) {
    this.guidAssignments = guidAssignments;
  }


  public JsonEntityMutationResponse mutatedEntities(Map<String, List<JsonAtlasEntityHeader>> mutatedEntities) {
    
    this.mutatedEntities = mutatedEntities;
    return this;
  }

  public JsonEntityMutationResponse putMutatedEntitiesItem(String key, List<JsonAtlasEntityHeader> mutatedEntitiesItem) {
    if (this.mutatedEntities == null) {
      this.mutatedEntities = new HashMap<String, List<JsonAtlasEntityHeader>>();
    }
    this.mutatedEntities.put(key, mutatedEntitiesItem);
    return this;
  }

   /**
   * The entity headers of mutated entities.
   * @return mutatedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity headers of mutated entities.")

  public Map<String, List<JsonAtlasEntityHeader>> getMutatedEntities() {
    return mutatedEntities;
  }


  public void setMutatedEntities(Map<String, List<JsonAtlasEntityHeader>> mutatedEntities) {
    this.mutatedEntities = mutatedEntities;
  }


  public JsonEntityMutationResponse partialUpdatedEntities(List<JsonAtlasEntityHeader> partialUpdatedEntities) {
    
    this.partialUpdatedEntities = partialUpdatedEntities;
    return this;
  }

  public JsonEntityMutationResponse addPartialUpdatedEntitiesItem(JsonAtlasEntityHeader partialUpdatedEntitiesItem) {
    if (this.partialUpdatedEntities == null) {
      this.partialUpdatedEntities = new ArrayList<JsonAtlasEntityHeader>();
    }
    this.partialUpdatedEntities.add(partialUpdatedEntitiesItem);
    return this;
  }

   /**
   * An array of entity headers that partially updated.
   * @return partialUpdatedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of entity headers that partially updated.")

  public List<JsonAtlasEntityHeader> getPartialUpdatedEntities() {
    return partialUpdatedEntities;
  }


  public void setPartialUpdatedEntities(List<JsonAtlasEntityHeader> partialUpdatedEntities) {
    this.partialUpdatedEntities = partialUpdatedEntities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonEntityMutationResponse jsonEntityMutationResponse = (JsonEntityMutationResponse) o;
    return Objects.equals(this.guidAssignments, jsonEntityMutationResponse.guidAssignments) &&
        Objects.equals(this.mutatedEntities, jsonEntityMutationResponse.mutatedEntities) &&
        Objects.equals(this.partialUpdatedEntities, jsonEntityMutationResponse.partialUpdatedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guidAssignments, mutatedEntities, partialUpdatedEntities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonEntityMutationResponse {\n");
    sb.append("    guidAssignments: ").append(toIndentedString(guidAssignments)).append("\n");
    sb.append("    mutatedEntities: ").append(toIndentedString(mutatedEntities)).append("\n");
    sb.append("    partialUpdatedEntities: ").append(toIndentedString(partialUpdatedEntities)).append("\n");
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

