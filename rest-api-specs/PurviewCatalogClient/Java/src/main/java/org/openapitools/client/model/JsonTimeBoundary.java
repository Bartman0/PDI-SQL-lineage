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
 * Captures time-boundary details
 */
@ApiModel(description = "Captures time-boundary details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonTimeBoundary {
  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;


  public JsonTimeBoundary endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end of the time boundary.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end of the time boundary.")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public JsonTimeBoundary startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start of the time boundary.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start of the time boundary.")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public JsonTimeBoundary timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The timezone of the time boundary.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone of the time boundary.")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonTimeBoundary jsonTimeBoundary = (JsonTimeBoundary) o;
    return Objects.equals(this.endTime, jsonTimeBoundary.endTime) &&
        Objects.equals(this.startTime, jsonTimeBoundary.startTime) &&
        Objects.equals(this.timeZone, jsonTimeBoundary.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTimeBoundary {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

