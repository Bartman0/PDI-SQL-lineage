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
 * The contact in the search and suggest result.
 */
@ApiModel(description = "The contact in the search and suggest result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonContactSearchResultValue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contactType";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  private String contactType;


  public JsonContactSearchResultValue id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The GUID of the contact.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the contact.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public JsonContactSearchResultValue info(String info) {
    
    this.info = info;
    return this;
  }

   /**
   * The description of the contact.
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the contact.")

  public String getInfo() {
    return info;
  }


  public void setInfo(String info) {
    this.info = info;
  }


  public JsonContactSearchResultValue contactType(String contactType) {
    
    this.contactType = contactType;
    return this;
  }

   /**
   * The type of the contact. It can be Expert or Owner for an entity. It can be Expert or Steward for a glossary term.
   * @return contactType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the contact. It can be Expert or Owner for an entity. It can be Expert or Steward for a glossary term.")

  public String getContactType() {
    return contactType;
  }


  public void setContactType(String contactType) {
    this.contactType = contactType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonContactSearchResultValue jsonContactSearchResultValue = (JsonContactSearchResultValue) o;
    return Objects.equals(this.id, jsonContactSearchResultValue.id) &&
        Objects.equals(this.info, jsonContactSearchResultValue.info) &&
        Objects.equals(this.contactType, jsonContactSearchResultValue.contactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, info, contactType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonContactSearchResultValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
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

