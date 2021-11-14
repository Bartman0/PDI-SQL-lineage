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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.JsonAtlasAttributeDef;
import org.openapitools.client.model.JsonAtlasStructDef;
import org.openapitools.client.model.JsonDateFormat;
import org.openapitools.client.model.JsonTypeCategory;

/**
 * term template definition for glossary term.
 */
@ApiModel(description = "term template definition for glossary term.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonTermTemplateDef {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private JsonTypeCategory category;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private BigDecimal createTime;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_DATE_FORMATTER = "dateFormatter";
  @SerializedName(SERIALIZED_NAME_DATE_FORMATTER)
  private JsonDateFormat dateFormatter;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_TYPE_VERSION = "typeVersion";
  @SerializedName(SERIALIZED_NAME_TYPE_VERSION)
  private String typeVersion;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private BigDecimal updateTime;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_T_S = "lastModifiedTS";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_T_S)
  private String lastModifiedTS;

  public static final String SERIALIZED_NAME_ATTRIBUTE_DEFS = "attributeDefs";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DEFS)
  private List<JsonAtlasAttributeDef> attributeDefs = null;


  public JsonTermTemplateDef category(JsonTypeCategory category) {
    
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


  public JsonTermTemplateDef createTime(BigDecimal createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The created time of the record.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The created time of the record.")

  public BigDecimal getCreateTime() {
    return createTime;
  }


  public void setCreateTime(BigDecimal createTime) {
    this.createTime = createTime;
  }


  public JsonTermTemplateDef createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The user who created the record.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user who created the record.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public JsonTermTemplateDef dateFormatter(JsonDateFormat dateFormatter) {
    
    this.dateFormatter = dateFormatter;
    return this;
  }

   /**
   * Get dateFormatter
   * @return dateFormatter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonDateFormat getDateFormatter() {
    return dateFormatter;
  }


  public void setDateFormatter(JsonDateFormat dateFormatter) {
    this.dateFormatter = dateFormatter;
  }


  public JsonTermTemplateDef description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the type definition.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the type definition.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public JsonTermTemplateDef guid(String guid) {
    
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


  public JsonTermTemplateDef name(String name) {
    
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


  public JsonTermTemplateDef options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public JsonTermTemplateDef putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * The options for the type definition.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The options for the type definition.")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public JsonTermTemplateDef serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * The service type.
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service type.")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public JsonTermTemplateDef typeVersion(String typeVersion) {
    
    this.typeVersion = typeVersion;
    return this;
  }

   /**
   * The version of the type.
   * @return typeVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the type.")

  public String getTypeVersion() {
    return typeVersion;
  }


  public void setTypeVersion(String typeVersion) {
    this.typeVersion = typeVersion;
  }


  public JsonTermTemplateDef updateTime(BigDecimal updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The update time of the record.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The update time of the record.")

  public BigDecimal getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(BigDecimal updateTime) {
    this.updateTime = updateTime;
  }


  public JsonTermTemplateDef updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * The user who updated the record.
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user who updated the record.")

  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public JsonTermTemplateDef version(BigDecimal version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the record.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the record.")

  public BigDecimal getVersion() {
    return version;
  }


  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  public JsonTermTemplateDef lastModifiedTS(String lastModifiedTS) {
    
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


  public JsonTermTemplateDef attributeDefs(List<JsonAtlasAttributeDef> attributeDefs) {
    
    this.attributeDefs = attributeDefs;
    return this;
  }

  public JsonTermTemplateDef addAttributeDefsItem(JsonAtlasAttributeDef attributeDefsItem) {
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
    JsonTermTemplateDef jsonTermTemplateDef = (JsonTermTemplateDef) o;
    return Objects.equals(this.category, jsonTermTemplateDef.category) &&
        Objects.equals(this.createTime, jsonTermTemplateDef.createTime) &&
        Objects.equals(this.createdBy, jsonTermTemplateDef.createdBy) &&
        Objects.equals(this.dateFormatter, jsonTermTemplateDef.dateFormatter) &&
        Objects.equals(this.description, jsonTermTemplateDef.description) &&
        Objects.equals(this.guid, jsonTermTemplateDef.guid) &&
        Objects.equals(this.name, jsonTermTemplateDef.name) &&
        Objects.equals(this.options, jsonTermTemplateDef.options) &&
        Objects.equals(this.serviceType, jsonTermTemplateDef.serviceType) &&
        Objects.equals(this.typeVersion, jsonTermTemplateDef.typeVersion) &&
        Objects.equals(this.updateTime, jsonTermTemplateDef.updateTime) &&
        Objects.equals(this.updatedBy, jsonTermTemplateDef.updatedBy) &&
        Objects.equals(this.version, jsonTermTemplateDef.version) &&
        Objects.equals(this.lastModifiedTS, jsonTermTemplateDef.lastModifiedTS) &&
        Objects.equals(this.attributeDefs, jsonTermTemplateDef.attributeDefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, createTime, createdBy, dateFormatter, description, guid, name, options, serviceType, typeVersion, updateTime, updatedBy, version, lastModifiedTS, attributeDefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTermTemplateDef {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateFormatter: ").append(toIndentedString(dateFormatter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    typeVersion: ").append(toIndentedString(typeVersion)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastModifiedTS: ").append(toIndentedString(lastModifiedTS)).append("\n");
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

