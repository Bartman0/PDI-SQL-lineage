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
import org.openapitools.client.model.JsonAtlasClassification;
import org.openapitools.client.model.JsonAtlasEntityAllOf;
import org.openapitools.client.model.JsonAtlasStruct;
import org.openapitools.client.model.JsonAtlasTermAssignmentHeader;
import org.openapitools.client.model.JsonContactBasic;
import org.openapitools.client.model.JsonStatus;

/**
 * An instance of an entity - like hive_table, hive_database.
 */
@ApiModel(description = "An instance of an entity - like hive_table, hive_database.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasEntity {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_T_S = "lastModifiedTS";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_T_S)
  private String lastModifiedTS;

  public static final String SERIALIZED_NAME_CLASSIFICATIONS = "classifications";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATIONS)
  private List<JsonAtlasClassification> classifications = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private BigDecimal createTime;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_HOME_ID = "homeId";
  @SerializedName(SERIALIZED_NAME_HOME_ID)
  private String homeId;

  public static final String SERIALIZED_NAME_MEANINGS = "meanings";
  @SerializedName(SERIALIZED_NAME_MEANINGS)
  private List<JsonAtlasTermAssignmentHeader> meanings = null;

  public static final String SERIALIZED_NAME_PROVENANCE_TYPE = "provenanceType";
  @SerializedName(SERIALIZED_NAME_PROVENANCE_TYPE)
  private BigDecimal provenanceType;

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private Boolean proxy;

  public static final String SERIALIZED_NAME_RELATIONSHIP_ATTRIBUTES = "relationshipAttributes";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_ATTRIBUTES)
  private Map<String, Object> relationshipAttributes = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonStatus status;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private BigDecimal updateTime;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_DETAILS = "sourceDetails";
  @SerializedName(SERIALIZED_NAME_SOURCE_DETAILS)
  private Map<String, Object> sourceDetails = null;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Map<String, JsonContactBasic> contacts = null;


  public JsonAtlasEntity attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public JsonAtlasEntity putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The attributes of the struct.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes of the struct.")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public JsonAtlasEntity typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * The name of the type.
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the type.")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public JsonAtlasEntity lastModifiedTS(String lastModifiedTS) {
    
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


  public JsonAtlasEntity classifications(List<JsonAtlasClassification> classifications) {
    
    this.classifications = classifications;
    return this;
  }

  public JsonAtlasEntity addClassificationsItem(JsonAtlasClassification classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<JsonAtlasClassification>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * An array of classifications.
   * @return classifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of classifications.")

  public List<JsonAtlasClassification> getClassifications() {
    return classifications;
  }


  public void setClassifications(List<JsonAtlasClassification> classifications) {
    this.classifications = classifications;
  }


  public JsonAtlasEntity createTime(BigDecimal createTime) {
    
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


  public JsonAtlasEntity createdBy(String createdBy) {
    
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


  public JsonAtlasEntity guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * The GUID of the entity.
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the entity.")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public JsonAtlasEntity homeId(String homeId) {
    
    this.homeId = homeId;
    return this;
  }

   /**
   * The home ID of the entity.
   * @return homeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The home ID of the entity.")

  public String getHomeId() {
    return homeId;
  }


  public void setHomeId(String homeId) {
    this.homeId = homeId;
  }


  public JsonAtlasEntity meanings(List<JsonAtlasTermAssignmentHeader> meanings) {
    
    this.meanings = meanings;
    return this;
  }

  public JsonAtlasEntity addMeaningsItem(JsonAtlasTermAssignmentHeader meaningsItem) {
    if (this.meanings == null) {
      this.meanings = new ArrayList<JsonAtlasTermAssignmentHeader>();
    }
    this.meanings.add(meaningsItem);
    return this;
  }

   /**
   * An array of term assignment headers indicating the meanings of the entity.
   * @return meanings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of term assignment headers indicating the meanings of the entity.")

  public List<JsonAtlasTermAssignmentHeader> getMeanings() {
    return meanings;
  }


  public void setMeanings(List<JsonAtlasTermAssignmentHeader> meanings) {
    this.meanings = meanings;
  }


  public JsonAtlasEntity provenanceType(BigDecimal provenanceType) {
    
    this.provenanceType = provenanceType;
    return this;
  }

   /**
   * Used to record the provenance of an instance of an entity or relationship.
   * @return provenanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to record the provenance of an instance of an entity or relationship.")

  public BigDecimal getProvenanceType() {
    return provenanceType;
  }


  public void setProvenanceType(BigDecimal provenanceType) {
    this.provenanceType = provenanceType;
  }


  public JsonAtlasEntity proxy(Boolean proxy) {
    
    this.proxy = proxy;
    return this;
  }

   /**
   * Determines if there&#39;s a proxy.
   * @return proxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if there's a proxy.")

  public Boolean getProxy() {
    return proxy;
  }


  public void setProxy(Boolean proxy) {
    this.proxy = proxy;
  }


  public JsonAtlasEntity relationshipAttributes(Map<String, Object> relationshipAttributes) {
    
    this.relationshipAttributes = relationshipAttributes;
    return this;
  }

  public JsonAtlasEntity putRelationshipAttributesItem(String key, Object relationshipAttributesItem) {
    if (this.relationshipAttributes == null) {
      this.relationshipAttributes = new HashMap<String, Object>();
    }
    this.relationshipAttributes.put(key, relationshipAttributesItem);
    return this;
  }

   /**
   * The attributes of relationship.
   * @return relationshipAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes of relationship.")

  public Map<String, Object> getRelationshipAttributes() {
    return relationshipAttributes;
  }


  public void setRelationshipAttributes(Map<String, Object> relationshipAttributes) {
    this.relationshipAttributes = relationshipAttributes;
  }


  public JsonAtlasEntity status(JsonStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonStatus getStatus() {
    return status;
  }


  public void setStatus(JsonStatus status) {
    this.status = status;
  }


  public JsonAtlasEntity updateTime(BigDecimal updateTime) {
    
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


  public JsonAtlasEntity updatedBy(String updatedBy) {
    
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


  public JsonAtlasEntity version(BigDecimal version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the entity.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the entity.")

  public BigDecimal getVersion() {
    return version;
  }


  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  public JsonAtlasEntity source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * indicate the source who create the classification detail
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicate the source who create the classification detail")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public JsonAtlasEntity sourceDetails(Map<String, Object> sourceDetails) {
    
    this.sourceDetails = sourceDetails;
    return this;
  }

  public JsonAtlasEntity putSourceDetailsItem(String key, Object sourceDetailsItem) {
    if (this.sourceDetails == null) {
      this.sourceDetails = new HashMap<String, Object>();
    }
    this.sourceDetails.put(key, sourceDetailsItem);
    return this;
  }

   /**
   * more detail on source information
   * @return sourceDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "more detail on source information")

  public Map<String, Object> getSourceDetails() {
    return sourceDetails;
  }


  public void setSourceDetails(Map<String, Object> sourceDetails) {
    this.sourceDetails = sourceDetails;
  }


  public JsonAtlasEntity contacts(Map<String, JsonContactBasic> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public JsonAtlasEntity putContactsItem(String key, JsonContactBasic contactsItem) {
    if (this.contacts == null) {
      this.contacts = new HashMap<String, JsonContactBasic>();
    }
    this.contacts.put(key, contactsItem);
    return this;
  }

   /**
   * The dictionary of contacts for terms. Key could be Expert or Owner.
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dictionary of contacts for terms. Key could be Expert or Owner.")

  public Map<String, JsonContactBasic> getContacts() {
    return contacts;
  }


  public void setContacts(Map<String, JsonContactBasic> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasEntity jsonAtlasEntity = (JsonAtlasEntity) o;
    return Objects.equals(this.attributes, jsonAtlasEntity.attributes) &&
        Objects.equals(this.typeName, jsonAtlasEntity.typeName) &&
        Objects.equals(this.lastModifiedTS, jsonAtlasEntity.lastModifiedTS) &&
        Objects.equals(this.classifications, jsonAtlasEntity.classifications) &&
        Objects.equals(this.createTime, jsonAtlasEntity.createTime) &&
        Objects.equals(this.createdBy, jsonAtlasEntity.createdBy) &&
        Objects.equals(this.guid, jsonAtlasEntity.guid) &&
        Objects.equals(this.homeId, jsonAtlasEntity.homeId) &&
        Objects.equals(this.meanings, jsonAtlasEntity.meanings) &&
        Objects.equals(this.provenanceType, jsonAtlasEntity.provenanceType) &&
        Objects.equals(this.proxy, jsonAtlasEntity.proxy) &&
        Objects.equals(this.relationshipAttributes, jsonAtlasEntity.relationshipAttributes) &&
        Objects.equals(this.status, jsonAtlasEntity.status) &&
        Objects.equals(this.updateTime, jsonAtlasEntity.updateTime) &&
        Objects.equals(this.updatedBy, jsonAtlasEntity.updatedBy) &&
        Objects.equals(this.version, jsonAtlasEntity.version) &&
        Objects.equals(this.source, jsonAtlasEntity.source) &&
        Objects.equals(this.sourceDetails, jsonAtlasEntity.sourceDetails) &&
        Objects.equals(this.contacts, jsonAtlasEntity.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, typeName, lastModifiedTS, classifications, createTime, createdBy, guid, homeId, meanings, provenanceType, proxy, relationshipAttributes, status, updateTime, updatedBy, version, source, sourceDetails, contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasEntity {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    lastModifiedTS: ").append(toIndentedString(lastModifiedTS)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    homeId: ").append(toIndentedString(homeId)).append("\n");
    sb.append("    meanings: ").append(toIndentedString(meanings)).append("\n");
    sb.append("    provenanceType: ").append(toIndentedString(provenanceType)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    relationshipAttributes: ").append(toIndentedString(relationshipAttributes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDetails: ").append(toIndentedString(sourceDetails)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

