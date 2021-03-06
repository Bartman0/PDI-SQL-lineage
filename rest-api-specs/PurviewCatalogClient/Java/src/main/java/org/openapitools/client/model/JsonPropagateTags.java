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
 * PropagateTags indicates whether tags should propagate across the relationship instance. &lt;p&gt; Tags can propagate: &lt;p&gt; NONE - not at all &lt;br&gt; ONE_TO_TWO - from end 1 to 2 &lt;br&gt; TWO_TO_ONE - from end 2 to 1  &lt;br&gt; BOTH - both ways &lt;p&gt; Care needs to be taken when specifying. The use cases we are aware of where this flag is useful: &lt;p&gt; - propagating confidentiality classifications from a table to columns - ONE_TO_TWO could be used here &lt;br&gt; - propagating classifications around Glossary synonyms - BOTH could be used here. &lt;p&gt; There is an expectation that further enhancements will allow more granular control of tag propagation and will address how to resolve conflicts.
 */
@JsonAdapter(JsonPropagateTags.Adapter.class)
public enum JsonPropagateTags {
  
  NONE("NONE"),
  
  ONE_TO_TWO("ONE_TO_TWO"),
  
  TWO_TO_ONE("TWO_TO_ONE"),
  
  BOTH("BOTH");

  private String value;

  JsonPropagateTags(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JsonPropagateTags fromValue(String value) {
    for (JsonPropagateTags b : JsonPropagateTags.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<JsonPropagateTags> {
    @Override
    public void write(final JsonWriter jsonWriter, final JsonPropagateTags enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JsonPropagateTags read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JsonPropagateTags.fromValue(value);
    }
  }
}

