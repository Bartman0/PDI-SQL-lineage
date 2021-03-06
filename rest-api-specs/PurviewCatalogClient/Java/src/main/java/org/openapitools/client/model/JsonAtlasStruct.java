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

/**
 * Captures details of struct contents. Not instantiated directly, used only via AtlasEntity, AtlasClassification.
 */
@ApiModel(description = "Captures details of struct contents. Not instantiated directly, used only via AtlasEntity, AtlasClassification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasStruct {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_T_S = "lastModifiedTS";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_T_S)
  private String lastModifiedTS;


  public JsonAtlasStruct attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public JsonAtlasStruct putAttributesItem(String key, Object attributesItem) {
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


  public JsonAtlasStruct typeName(String typeName) {
    
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


  public JsonAtlasStruct lastModifiedTS(String lastModifiedTS) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasStruct jsonAtlasStruct = (JsonAtlasStruct) o;
    return Objects.equals(this.attributes, jsonAtlasStruct.attributes) &&
        Objects.equals(this.typeName, jsonAtlasStruct.typeName) &&
        Objects.equals(this.lastModifiedTS, jsonAtlasStruct.lastModifiedTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, typeName, lastModifiedTS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasStruct {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    lastModifiedTS: ").append(toIndentedString(lastModifiedTS)).append("\n");
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

