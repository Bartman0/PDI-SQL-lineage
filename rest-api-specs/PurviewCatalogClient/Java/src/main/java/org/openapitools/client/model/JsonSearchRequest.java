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

/**
 * The search query of advanced search request.
 */
@ApiModel(description = "The search query of advanced search request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonSearchRequest {
  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private String keywords;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private Object filter;


  public JsonSearchRequest keywords(String keywords) {
    
    this.keywords = keywords;
    return this;
  }

   /**
   * The keywords applied to all searchable fields.
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keywords applied to all searchable fields.")

  public String getKeywords() {
    return keywords;
  }


  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public JsonSearchRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset. The default value is 0.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset. The default value is 0.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public JsonSearchRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit of the number of the search result. default value is 50; maximum value is 1000.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit of the number of the search result. default value is 50; maximum value is 1000.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public JsonSearchRequest filter(Object filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * The filter for the search. See examples for the usage of supported filters.
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The filter for the search. See examples for the usage of supported filters.")

  public Object getFilter() {
    return filter;
  }


  public void setFilter(Object filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSearchRequest jsonSearchRequest = (JsonSearchRequest) o;
    return Objects.equals(this.keywords, jsonSearchRequest.keywords) &&
        Objects.equals(this.offset, jsonSearchRequest.offset) &&
        Objects.equals(this.limit, jsonSearchRequest.limit) &&
        Objects.equals(this.filter, jsonSearchRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, offset, limit, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSearchRequest {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

