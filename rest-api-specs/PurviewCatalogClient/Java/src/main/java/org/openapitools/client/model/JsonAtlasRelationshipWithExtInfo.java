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
import org.openapitools.client.model.JsonAtlasEntityHeader;
import org.openapitools.client.model.JsonAtlasRelationship;

/**
 * The relationship with extended information.
 */
@ApiModel(description = "The relationship with extended information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasRelationshipWithExtInfo {
  public static final String SERIALIZED_NAME_REFERRED_ENTITIES = "referredEntities";
  @SerializedName(SERIALIZED_NAME_REFERRED_ENTITIES)
  private Map<String, JsonAtlasEntityHeader> referredEntities = null;

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private JsonAtlasRelationship relationship = null;


  public JsonAtlasRelationshipWithExtInfo referredEntities(Map<String, JsonAtlasEntityHeader> referredEntities) {
    
    this.referredEntities = referredEntities;
    return this;
  }

  public JsonAtlasRelationshipWithExtInfo putReferredEntitiesItem(String key, JsonAtlasEntityHeader referredEntitiesItem) {
    if (this.referredEntities == null) {
      this.referredEntities = new HashMap<String, JsonAtlasEntityHeader>();
    }
    this.referredEntities.put(key, referredEntitiesItem);
    return this;
  }

   /**
   * The referred entity header.
   * @return referredEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The referred entity header.")

  public Map<String, JsonAtlasEntityHeader> getReferredEntities() {
    return referredEntities;
  }


  public void setReferredEntities(Map<String, JsonAtlasEntityHeader> referredEntities) {
    this.referredEntities = referredEntities;
  }


  public JsonAtlasRelationshipWithExtInfo relationship(JsonAtlasRelationship relationship) {
    
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonAtlasRelationship getRelationship() {
    return relationship;
  }


  public void setRelationship(JsonAtlasRelationship relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasRelationshipWithExtInfo jsonAtlasRelationshipWithExtInfo = (JsonAtlasRelationshipWithExtInfo) o;
    return Objects.equals(this.referredEntities, jsonAtlasRelationshipWithExtInfo.referredEntities) &&
        Objects.equals(this.relationship, jsonAtlasRelationshipWithExtInfo.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredEntities, relationship);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasRelationshipWithExtInfo {\n");
    sb.append("    referredEntities: ").append(toIndentedString(referredEntities)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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

