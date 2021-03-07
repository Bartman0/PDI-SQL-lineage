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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of term relationship.
 */
@JsonAdapter(JsonAtlasTermRelationshipStatus.Adapter.class)
public enum JsonAtlasTermRelationshipStatus {
  
  DRAFT("DRAFT"),
  
  ACTIVE("ACTIVE"),
  
  DEPRECATED("DEPRECATED"),
  
  OBSOLETE("OBSOLETE"),
  
  OTHER("OTHER");

  private String value;

  JsonAtlasTermRelationshipStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JsonAtlasTermRelationshipStatus fromValue(String value) {
    for (JsonAtlasTermRelationshipStatus b : JsonAtlasTermRelationshipStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<JsonAtlasTermRelationshipStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final JsonAtlasTermRelationshipStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JsonAtlasTermRelationshipStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JsonAtlasTermRelationshipStatus.fromValue(value);
    }
  }
}

