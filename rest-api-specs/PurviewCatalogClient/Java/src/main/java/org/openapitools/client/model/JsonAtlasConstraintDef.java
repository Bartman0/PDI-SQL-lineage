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
 * class that captures details of a constraint.
 */
@ApiModel(description = "class that captures details of a constraint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasConstraintDef {
  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Map<String, Object> params = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public JsonAtlasConstraintDef params(Map<String, Object> params) {
    
    this.params = params;
    return this;
  }

  public JsonAtlasConstraintDef putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<String, Object>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * The parameters of the constraint definition.
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The parameters of the constraint definition.")

  public Map<String, Object> getParams() {
    return params;
  }


  public void setParams(Map<String, Object> params) {
    this.params = params;
  }


  public JsonAtlasConstraintDef type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the constraint.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the constraint.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasConstraintDef jsonAtlasConstraintDef = (JsonAtlasConstraintDef) o;
    return Objects.equals(this.params, jsonAtlasConstraintDef.params) &&
        Objects.equals(this.type, jsonAtlasConstraintDef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasConstraintDef {\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

