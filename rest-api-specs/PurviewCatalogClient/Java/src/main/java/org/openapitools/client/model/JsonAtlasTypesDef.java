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
import java.util.List;
import org.openapitools.client.model.JsonAtlasClassificationDef;
import org.openapitools.client.model.JsonAtlasEntityDef;
import org.openapitools.client.model.JsonAtlasEnumDef;
import org.openapitools.client.model.JsonAtlasRelationshipDef;
import org.openapitools.client.model.JsonAtlasStructDef;

/**
 * The definitions of types.
 */
@ApiModel(description = "The definitions of types.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasTypesDef {
  public static final String SERIALIZED_NAME_CLASSIFICATION_DEFS = "classificationDefs";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION_DEFS)
  private List<JsonAtlasClassificationDef> classificationDefs = null;

  public static final String SERIALIZED_NAME_ENTITY_DEFS = "entityDefs";
  @SerializedName(SERIALIZED_NAME_ENTITY_DEFS)
  private List<JsonAtlasEntityDef> entityDefs = null;

  public static final String SERIALIZED_NAME_ENUM_DEFS = "enumDefs";
  @SerializedName(SERIALIZED_NAME_ENUM_DEFS)
  private List<JsonAtlasEnumDef> enumDefs = null;

  public static final String SERIALIZED_NAME_RELATIONSHIP_DEFS = "relationshipDefs";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_DEFS)
  private List<JsonAtlasRelationshipDef> relationshipDefs = null;

  public static final String SERIALIZED_NAME_STRUCT_DEFS = "structDefs";
  @SerializedName(SERIALIZED_NAME_STRUCT_DEFS)
  private List<JsonAtlasStructDef> structDefs = null;


  public JsonAtlasTypesDef classificationDefs(List<JsonAtlasClassificationDef> classificationDefs) {
    
    this.classificationDefs = classificationDefs;
    return this;
  }

  public JsonAtlasTypesDef addClassificationDefsItem(JsonAtlasClassificationDef classificationDefsItem) {
    if (this.classificationDefs == null) {
      this.classificationDefs = new ArrayList<JsonAtlasClassificationDef>();
    }
    this.classificationDefs.add(classificationDefsItem);
    return this;
  }

   /**
   * An array of classification definitions.
   * @return classificationDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of classification definitions.")

  public List<JsonAtlasClassificationDef> getClassificationDefs() {
    return classificationDefs;
  }


  public void setClassificationDefs(List<JsonAtlasClassificationDef> classificationDefs) {
    this.classificationDefs = classificationDefs;
  }


  public JsonAtlasTypesDef entityDefs(List<JsonAtlasEntityDef> entityDefs) {
    
    this.entityDefs = entityDefs;
    return this;
  }

  public JsonAtlasTypesDef addEntityDefsItem(JsonAtlasEntityDef entityDefsItem) {
    if (this.entityDefs == null) {
      this.entityDefs = new ArrayList<JsonAtlasEntityDef>();
    }
    this.entityDefs.add(entityDefsItem);
    return this;
  }

   /**
   * An array of entity definitions.
   * @return entityDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of entity definitions.")

  public List<JsonAtlasEntityDef> getEntityDefs() {
    return entityDefs;
  }


  public void setEntityDefs(List<JsonAtlasEntityDef> entityDefs) {
    this.entityDefs = entityDefs;
  }


  public JsonAtlasTypesDef enumDefs(List<JsonAtlasEnumDef> enumDefs) {
    
    this.enumDefs = enumDefs;
    return this;
  }

  public JsonAtlasTypesDef addEnumDefsItem(JsonAtlasEnumDef enumDefsItem) {
    if (this.enumDefs == null) {
      this.enumDefs = new ArrayList<JsonAtlasEnumDef>();
    }
    this.enumDefs.add(enumDefsItem);
    return this;
  }

   /**
   * An array of enum definitions.
   * @return enumDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of enum definitions.")

  public List<JsonAtlasEnumDef> getEnumDefs() {
    return enumDefs;
  }


  public void setEnumDefs(List<JsonAtlasEnumDef> enumDefs) {
    this.enumDefs = enumDefs;
  }


  public JsonAtlasTypesDef relationshipDefs(List<JsonAtlasRelationshipDef> relationshipDefs) {
    
    this.relationshipDefs = relationshipDefs;
    return this;
  }

  public JsonAtlasTypesDef addRelationshipDefsItem(JsonAtlasRelationshipDef relationshipDefsItem) {
    if (this.relationshipDefs == null) {
      this.relationshipDefs = new ArrayList<JsonAtlasRelationshipDef>();
    }
    this.relationshipDefs.add(relationshipDefsItem);
    return this;
  }

   /**
   * An array of relationship definitions.
   * @return relationshipDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of relationship definitions.")

  public List<JsonAtlasRelationshipDef> getRelationshipDefs() {
    return relationshipDefs;
  }


  public void setRelationshipDefs(List<JsonAtlasRelationshipDef> relationshipDefs) {
    this.relationshipDefs = relationshipDefs;
  }


  public JsonAtlasTypesDef structDefs(List<JsonAtlasStructDef> structDefs) {
    
    this.structDefs = structDefs;
    return this;
  }

  public JsonAtlasTypesDef addStructDefsItem(JsonAtlasStructDef structDefsItem) {
    if (this.structDefs == null) {
      this.structDefs = new ArrayList<JsonAtlasStructDef>();
    }
    this.structDefs.add(structDefsItem);
    return this;
  }

   /**
   * An array of struct definitions.
   * @return structDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of struct definitions.")

  public List<JsonAtlasStructDef> getStructDefs() {
    return structDefs;
  }


  public void setStructDefs(List<JsonAtlasStructDef> structDefs) {
    this.structDefs = structDefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasTypesDef jsonAtlasTypesDef = (JsonAtlasTypesDef) o;
    return Objects.equals(this.classificationDefs, jsonAtlasTypesDef.classificationDefs) &&
        Objects.equals(this.entityDefs, jsonAtlasTypesDef.entityDefs) &&
        Objects.equals(this.enumDefs, jsonAtlasTypesDef.enumDefs) &&
        Objects.equals(this.relationshipDefs, jsonAtlasTypesDef.relationshipDefs) &&
        Objects.equals(this.structDefs, jsonAtlasTypesDef.structDefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationDefs, entityDefs, enumDefs, relationshipDefs, structDefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasTypesDef {\n");
    sb.append("    classificationDefs: ").append(toIndentedString(classificationDefs)).append("\n");
    sb.append("    entityDefs: ").append(toIndentedString(entityDefs)).append("\n");
    sb.append("    enumDefs: ").append(toIndentedString(enumDefs)).append("\n");
    sb.append("    relationshipDefs: ").append(toIndentedString(relationshipDefs)).append("\n");
    sb.append("    structDefs: ").append(toIndentedString(structDefs)).append("\n");
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

