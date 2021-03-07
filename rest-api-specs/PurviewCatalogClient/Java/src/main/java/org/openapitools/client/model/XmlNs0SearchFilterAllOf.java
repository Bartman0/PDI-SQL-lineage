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
import org.openapitools.client.model.XmlNs0SortType;

/**
 * XmlNs0SearchFilterAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class XmlNs0SearchFilterAllOf {
  public static final String SERIALIZED_NAME_GET_COUNT = "getCount";
  @SerializedName(SERIALIZED_NAME_GET_COUNT)
  private Boolean getCount;

  public static final String SERIALIZED_NAME_MAX_ROWS = "maxRows";
  @SerializedName(SERIALIZED_NAME_MAX_ROWS)
  private Long maxRows;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Object params;

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public static final String SERIALIZED_NAME_SORT_TYPE = "sortType";
  @SerializedName(SERIALIZED_NAME_SORT_TYPE)
  private XmlNs0SortType sortType;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Long startIndex;


  public XmlNs0SearchFilterAllOf getCount(Boolean getCount) {
    
    this.getCount = getCount;
    return this;
  }

   /**
   * Determines if get the count.
   * @return getCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if get the count.")

  public Boolean getGetCount() {
    return getCount;
  }


  public void setGetCount(Boolean getCount) {
    this.getCount = getCount;
  }


  public XmlNs0SearchFilterAllOf maxRows(Long maxRows) {
    
    this.maxRows = maxRows;
    return this;
  }

   /**
   * The maximum of rows.
   * @return maxRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum of rows.")

  public Long getMaxRows() {
    return maxRows;
  }


  public void setMaxRows(Long maxRows) {
    this.maxRows = maxRows;
  }


  public XmlNs0SearchFilterAllOf params(Object params) {
    
    this.params = params;
    return this;
  }

   /**
   * The parameter of the search.
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The parameter of the search.")

  public Object getParams() {
    return params;
  }


  public void setParams(Object params) {
    this.params = params;
  }


  public XmlNs0SearchFilterAllOf sortBy(String sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * The sorted by field.
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sorted by field.")

  public String getSortBy() {
    return sortBy;
  }


  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public XmlNs0SearchFilterAllOf sortType(XmlNs0SortType sortType) {
    
    this.sortType = sortType;
    return this;
  }

   /**
   * Get sortType
   * @return sortType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public XmlNs0SortType getSortType() {
    return sortType;
  }


  public void setSortType(XmlNs0SortType sortType) {
    this.sortType = sortType;
  }


  public XmlNs0SearchFilterAllOf startIndex(Long startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index of the search.
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start index of the search.")

  public Long getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0SearchFilterAllOf xmlNs0SearchFilterAllOf = (XmlNs0SearchFilterAllOf) o;
    return Objects.equals(this.getCount, xmlNs0SearchFilterAllOf.getCount) &&
        Objects.equals(this.maxRows, xmlNs0SearchFilterAllOf.maxRows) &&
        Objects.equals(this.params, xmlNs0SearchFilterAllOf.params) &&
        Objects.equals(this.sortBy, xmlNs0SearchFilterAllOf.sortBy) &&
        Objects.equals(this.sortType, xmlNs0SearchFilterAllOf.sortType) &&
        Objects.equals(this.startIndex, xmlNs0SearchFilterAllOf.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCount, maxRows, params, sortBy, sortType, startIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0SearchFilterAllOf {\n");
    sb.append("    getCount: ").append(toIndentedString(getCount)).append("\n");
    sb.append("    maxRows: ").append(toIndentedString(maxRows)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

