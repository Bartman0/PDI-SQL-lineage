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
import org.openapitools.client.model.JsonAtlasAttributeDef;

/**
 * JsonAtlasStructDefAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasStructDefAllOf {
  public static final String SERIALIZED_NAME_ATTRIBUTE_DEFS = "attributeDefs";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DEFS)
  private List<JsonAtlasAttributeDef> attributeDefs = null;


  public JsonAtlasStructDefAllOf attributeDefs(List<JsonAtlasAttributeDef> attributeDefs) {
    
    this.attributeDefs = attributeDefs;
    return this;
  }

  public JsonAtlasStructDefAllOf addAttributeDefsItem(JsonAtlasAttributeDef attributeDefsItem) {
    if (this.attributeDefs == null) {
      this.attributeDefs = new ArrayList<JsonAtlasAttributeDef>();
    }
    this.attributeDefs.add(attributeDefsItem);
    return this;
  }

   /**
   * An array of attribute definitions.
   * @return attributeDefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of attribute definitions.")

  public List<JsonAtlasAttributeDef> getAttributeDefs() {
    return attributeDefs;
  }


  public void setAttributeDefs(List<JsonAtlasAttributeDef> attributeDefs) {
    this.attributeDefs = attributeDefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasStructDefAllOf jsonAtlasStructDefAllOf = (JsonAtlasStructDefAllOf) o;
    return Objects.equals(this.attributeDefs, jsonAtlasStructDefAllOf.attributeDefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasStructDefAllOf {\n");
    sb.append("    attributeDefs: ").append(toIndentedString(attributeDefs)).append("\n");
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
