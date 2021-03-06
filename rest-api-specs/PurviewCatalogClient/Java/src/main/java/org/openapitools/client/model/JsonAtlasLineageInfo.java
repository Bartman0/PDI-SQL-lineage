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
import org.openapitools.client.model.JsonLineageDirection;
import org.openapitools.client.model.JsonLineageRelation;
import org.openapitools.client.model.JsonParentRelation;

/**
 * The lineage information.
 */
@ApiModel(description = "The lineage information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasLineageInfo {
  public static final String SERIALIZED_NAME_BASE_ENTITY_GUID = "baseEntityGuid";
  @SerializedName(SERIALIZED_NAME_BASE_ENTITY_GUID)
  private String baseEntityGuid;

  public static final String SERIALIZED_NAME_GUID_ENTITY_MAP = "guidEntityMap";
  @SerializedName(SERIALIZED_NAME_GUID_ENTITY_MAP)
  private Map<String, JsonAtlasEntityHeader> guidEntityMap = null;

  public static final String SERIALIZED_NAME_WIDTH_COUNTS = "widthCounts";
  @SerializedName(SERIALIZED_NAME_WIDTH_COUNTS)
  private Map<String, Map<String, Object>> widthCounts = null;

  public static final String SERIALIZED_NAME_LINEAGE_DEPTH = "lineageDepth";
  @SerializedName(SERIALIZED_NAME_LINEAGE_DEPTH)
  private Integer lineageDepth;

  public static final String SERIALIZED_NAME_LINEAGE_WIDTH = "lineageWidth";
  @SerializedName(SERIALIZED_NAME_LINEAGE_WIDTH)
  private Integer lineageWidth;

  public static final String SERIALIZED_NAME_INCLUDE_PARENT = "includeParent";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PARENT)
  private Boolean includeParent;

  public static final String SERIALIZED_NAME_CHILDREN_COUNT = "childrenCount";
  @SerializedName(SERIALIZED_NAME_CHILDREN_COUNT)
  private Integer childrenCount;

  public static final String SERIALIZED_NAME_LINEAGE_DIRECTION = "lineageDirection";
  @SerializedName(SERIALIZED_NAME_LINEAGE_DIRECTION)
  private JsonLineageDirection lineageDirection;

  public static final String SERIALIZED_NAME_PARENT_RELATIONS = "parentRelations";
  @SerializedName(SERIALIZED_NAME_PARENT_RELATIONS)
  private List<JsonParentRelation> parentRelations = null;

  public static final String SERIALIZED_NAME_RELATIONS = "relations";
  @SerializedName(SERIALIZED_NAME_RELATIONS)
  private List<JsonLineageRelation> relations = null;


  public JsonAtlasLineageInfo baseEntityGuid(String baseEntityGuid) {
    
    this.baseEntityGuid = baseEntityGuid;
    return this;
  }

   /**
   * The GUID of the base entity.
   * @return baseEntityGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the base entity.")

  public String getBaseEntityGuid() {
    return baseEntityGuid;
  }


  public void setBaseEntityGuid(String baseEntityGuid) {
    this.baseEntityGuid = baseEntityGuid;
  }


  public JsonAtlasLineageInfo guidEntityMap(Map<String, JsonAtlasEntityHeader> guidEntityMap) {
    
    this.guidEntityMap = guidEntityMap;
    return this;
  }

  public JsonAtlasLineageInfo putGuidEntityMapItem(String key, JsonAtlasEntityHeader guidEntityMapItem) {
    if (this.guidEntityMap == null) {
      this.guidEntityMap = new HashMap<String, JsonAtlasEntityHeader>();
    }
    this.guidEntityMap.put(key, guidEntityMapItem);
    return this;
  }

   /**
   * The GUID entity map.
   * @return guidEntityMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID entity map.")

  public Map<String, JsonAtlasEntityHeader> getGuidEntityMap() {
    return guidEntityMap;
  }


  public void setGuidEntityMap(Map<String, JsonAtlasEntityHeader> guidEntityMap) {
    this.guidEntityMap = guidEntityMap;
  }


  public JsonAtlasLineageInfo widthCounts(Map<String, Map<String, Object>> widthCounts) {
    
    this.widthCounts = widthCounts;
    return this;
  }

  public JsonAtlasLineageInfo putWidthCountsItem(String key, Map<String, Object> widthCountsItem) {
    if (this.widthCounts == null) {
      this.widthCounts = new HashMap<String, Map<String, Object>>();
    }
    this.widthCounts.put(key, widthCountsItem);
    return this;
  }

   /**
   * The entity count in specific direction.
   * @return widthCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity count in specific direction.")

  public Map<String, Map<String, Object>> getWidthCounts() {
    return widthCounts;
  }


  public void setWidthCounts(Map<String, Map<String, Object>> widthCounts) {
    this.widthCounts = widthCounts;
  }


  public JsonAtlasLineageInfo lineageDepth(Integer lineageDepth) {
    
    this.lineageDepth = lineageDepth;
    return this;
  }

   /**
   * The depth of lineage.
   * @return lineageDepth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The depth of lineage.")

  public Integer getLineageDepth() {
    return lineageDepth;
  }


  public void setLineageDepth(Integer lineageDepth) {
    this.lineageDepth = lineageDepth;
  }


  public JsonAtlasLineageInfo lineageWidth(Integer lineageWidth) {
    
    this.lineageWidth = lineageWidth;
    return this;
  }

   /**
   * The width of lineage.
   * @return lineageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of lineage.")

  public Integer getLineageWidth() {
    return lineageWidth;
  }


  public void setLineageWidth(Integer lineageWidth) {
    this.lineageWidth = lineageWidth;
  }


  public JsonAtlasLineageInfo includeParent(Boolean includeParent) {
    
    this.includeParent = includeParent;
    return this;
  }

   /**
   * True to return the parent of the base entity.
   * @return includeParent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to return the parent of the base entity.")

  public Boolean getIncludeParent() {
    return includeParent;
  }


  public void setIncludeParent(Boolean includeParent) {
    this.includeParent = includeParent;
  }


  public JsonAtlasLineageInfo childrenCount(Integer childrenCount) {
    
    this.childrenCount = childrenCount;
    return this;
  }

   /**
   * The number of children node.
   * @return childrenCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of children node.")

  public Integer getChildrenCount() {
    return childrenCount;
  }


  public void setChildrenCount(Integer childrenCount) {
    this.childrenCount = childrenCount;
  }


  public JsonAtlasLineageInfo lineageDirection(JsonLineageDirection lineageDirection) {
    
    this.lineageDirection = lineageDirection;
    return this;
  }

   /**
   * Get lineageDirection
   * @return lineageDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonLineageDirection getLineageDirection() {
    return lineageDirection;
  }


  public void setLineageDirection(JsonLineageDirection lineageDirection) {
    this.lineageDirection = lineageDirection;
  }


  public JsonAtlasLineageInfo parentRelations(List<JsonParentRelation> parentRelations) {
    
    this.parentRelations = parentRelations;
    return this;
  }

  public JsonAtlasLineageInfo addParentRelationsItem(JsonParentRelation parentRelationsItem) {
    if (this.parentRelations == null) {
      this.parentRelations = new ArrayList<JsonParentRelation>();
    }
    this.parentRelations.add(parentRelationsItem);
    return this;
  }

   /**
   * An array of parentRelations relations.
   * @return parentRelations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of parentRelations relations.")

  public List<JsonParentRelation> getParentRelations() {
    return parentRelations;
  }


  public void setParentRelations(List<JsonParentRelation> parentRelations) {
    this.parentRelations = parentRelations;
  }


  public JsonAtlasLineageInfo relations(List<JsonLineageRelation> relations) {
    
    this.relations = relations;
    return this;
  }

  public JsonAtlasLineageInfo addRelationsItem(JsonLineageRelation relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<JsonLineageRelation>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * An array of lineage relations.
   * @return relations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of lineage relations.")

  public List<JsonLineageRelation> getRelations() {
    return relations;
  }


  public void setRelations(List<JsonLineageRelation> relations) {
    this.relations = relations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasLineageInfo jsonAtlasLineageInfo = (JsonAtlasLineageInfo) o;
    return Objects.equals(this.baseEntityGuid, jsonAtlasLineageInfo.baseEntityGuid) &&
        Objects.equals(this.guidEntityMap, jsonAtlasLineageInfo.guidEntityMap) &&
        Objects.equals(this.widthCounts, jsonAtlasLineageInfo.widthCounts) &&
        Objects.equals(this.lineageDepth, jsonAtlasLineageInfo.lineageDepth) &&
        Objects.equals(this.lineageWidth, jsonAtlasLineageInfo.lineageWidth) &&
        Objects.equals(this.includeParent, jsonAtlasLineageInfo.includeParent) &&
        Objects.equals(this.childrenCount, jsonAtlasLineageInfo.childrenCount) &&
        Objects.equals(this.lineageDirection, jsonAtlasLineageInfo.lineageDirection) &&
        Objects.equals(this.parentRelations, jsonAtlasLineageInfo.parentRelations) &&
        Objects.equals(this.relations, jsonAtlasLineageInfo.relations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseEntityGuid, guidEntityMap, widthCounts, lineageDepth, lineageWidth, includeParent, childrenCount, lineageDirection, parentRelations, relations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasLineageInfo {\n");
    sb.append("    baseEntityGuid: ").append(toIndentedString(baseEntityGuid)).append("\n");
    sb.append("    guidEntityMap: ").append(toIndentedString(guidEntityMap)).append("\n");
    sb.append("    widthCounts: ").append(toIndentedString(widthCounts)).append("\n");
    sb.append("    lineageDepth: ").append(toIndentedString(lineageDepth)).append("\n");
    sb.append("    lineageWidth: ").append(toIndentedString(lineageWidth)).append("\n");
    sb.append("    includeParent: ").append(toIndentedString(includeParent)).append("\n");
    sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
    sb.append("    lineageDirection: ").append(toIndentedString(lineageDirection)).append("\n");
    sb.append("    parentRelations: ").append(toIndentedString(parentRelations)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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

