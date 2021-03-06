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
import org.openapitools.client.model.JsonTypeCategory;

/**
 * The basic information of the type definition.
 */
@ApiModel(description = "The basic information of the type definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasTypeDefHeader {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private JsonTypeCategory category;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public JsonAtlasTypeDefHeader category(JsonTypeCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonTypeCategory getCategory() {
    return category;
  }


  public void setCategory(JsonTypeCategory category) {
    this.category = category;
  }


  public JsonAtlasTypeDefHeader guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * The GUID of the type definition.
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the type definition.")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public JsonAtlasTypeDefHeader name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the type definition.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the type definition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasTypeDefHeader jsonAtlasTypeDefHeader = (JsonAtlasTypeDefHeader) o;
    return Objects.equals(this.category, jsonAtlasTypeDefHeader.category) &&
        Objects.equals(this.guid, jsonAtlasTypeDefHeader.guid) &&
        Objects.equals(this.name, jsonAtlasTypeDefHeader.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, guid, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasTypeDefHeader {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

