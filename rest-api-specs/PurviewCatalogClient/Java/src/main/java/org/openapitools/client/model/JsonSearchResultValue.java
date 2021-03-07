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
import org.openapitools.client.model.JsonContactSearchResultValue;
import org.openapitools.client.model.JsonSearchHighlights;
import org.openapitools.client.model.JsonTermSearchResultValue;

/**
 * The value item of the search result.
 */
@ApiModel(description = "The value item of the search result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonSearchResultValue {
  public static final String SERIALIZED_NAME_AT_SEARCH_SCORE = "@search.score";
  @SerializedName(SERIALIZED_NAME_AT_SEARCH_SCORE)
  private Float atSearchScore;

  public static final String SERIALIZED_NAME_AT_SEARCH_HIGHLIGHTS = "@search.highlights";
  @SerializedName(SERIALIZED_NAME_AT_SEARCH_HIGHLIGHTS)
  private JsonSearchHighlights atSearchHighlights;

  public static final String SERIALIZED_NAME_AT_SEARCH_TEXT = "@search.text";
  @SerializedName(SERIALIZED_NAME_AT_SEARCH_TEXT)
  private String atSearchText;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_QUALIFIED_NAME = "qualifiedName";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_NAME)
  private String qualifiedName;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private List<String> classification = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private List<String> label = null;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private List<JsonTermSearchResultValue> term = null;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private List<JsonContactSearchResultValue> contact = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private List<String> assetType = null;


  public JsonSearchResultValue atSearchScore(Float atSearchScore) {
    
    this.atSearchScore = atSearchScore;
    return this;
  }

   /**
   * The search score calculated by the search engine. The results are ordered by search score by default.
   * @return atSearchScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The search score calculated by the search engine. The results are ordered by search score by default.")

  public Float getAtSearchScore() {
    return atSearchScore;
  }


  public void setAtSearchScore(Float atSearchScore) {
    this.atSearchScore = atSearchScore;
  }


  public JsonSearchResultValue atSearchHighlights(JsonSearchHighlights atSearchHighlights) {
    
    this.atSearchHighlights = atSearchHighlights;
    return this;
  }

   /**
   * Get atSearchHighlights
   * @return atSearchHighlights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonSearchHighlights getAtSearchHighlights() {
    return atSearchHighlights;
  }


  public void setAtSearchHighlights(JsonSearchHighlights atSearchHighlights) {
    this.atSearchHighlights = atSearchHighlights;
  }


  public JsonSearchResultValue atSearchText(String atSearchText) {
    
    this.atSearchText = atSearchText;
    return this;
  }

   /**
   * The target text that contains the keyword as prefix. The keyword is wrapped with emphasis mark.
   * @return atSearchText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target text that contains the keyword as prefix. The keyword is wrapped with emphasis mark.")

  public String getAtSearchText() {
    return atSearchText;
  }


  public void setAtSearchText(String atSearchText) {
    this.atSearchText = atSearchText;
  }


  public JsonSearchResultValue description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the record.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the record.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public JsonSearchResultValue id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The GUID of the record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the record.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public JsonSearchResultValue name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the record.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the record.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JsonSearchResultValue owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * The owner of the record. This is an Atlas native attribute.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The owner of the record. This is an Atlas native attribute.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public JsonSearchResultValue qualifiedName(String qualifiedName) {
    
    this.qualifiedName = qualifiedName;
    return this;
  }

   /**
   * The qualified name of the record.
   * @return qualifiedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The qualified name of the record.")

  public String getQualifiedName() {
    return qualifiedName;
  }


  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }


  public JsonSearchResultValue entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The type name of the record.
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type name of the record.")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public JsonSearchResultValue classification(List<String> classification) {
    
    this.classification = classification;
    return this;
  }

  public JsonSearchResultValue addClassificationItem(String classificationItem) {
    if (this.classification == null) {
      this.classification = new ArrayList<String>();
    }
    this.classification.add(classificationItem);
    return this;
  }

   /**
   * The classifications of the record.
   * @return classification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The classifications of the record.")

  public List<String> getClassification() {
    return classification;
  }


  public void setClassification(List<String> classification) {
    this.classification = classification;
  }


  public JsonSearchResultValue label(List<String> label) {
    
    this.label = label;
    return this;
  }

  public JsonSearchResultValue addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<String>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * The labels of the record.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The labels of the record.")

  public List<String> getLabel() {
    return label;
  }


  public void setLabel(List<String> label) {
    this.label = label;
  }


  public JsonSearchResultValue term(List<JsonTermSearchResultValue> term) {
    
    this.term = term;
    return this;
  }

  public JsonSearchResultValue addTermItem(JsonTermSearchResultValue termItem) {
    if (this.term == null) {
      this.term = new ArrayList<JsonTermSearchResultValue>();
    }
    this.term.add(termItem);
    return this;
  }

   /**
   * The terms assigned to the record.
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The terms assigned to the record.")

  public List<JsonTermSearchResultValue> getTerm() {
    return term;
  }


  public void setTerm(List<JsonTermSearchResultValue> term) {
    this.term = term;
  }


  public JsonSearchResultValue contact(List<JsonContactSearchResultValue> contact) {
    
    this.contact = contact;
    return this;
  }

  public JsonSearchResultValue addContactItem(JsonContactSearchResultValue contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<JsonContactSearchResultValue>();
    }
    this.contact.add(contactItem);
    return this;
  }

   /**
   * The contacts of the record.
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contacts of the record.")

  public List<JsonContactSearchResultValue> getContact() {
    return contact;
  }


  public void setContact(List<JsonContactSearchResultValue> contact) {
    this.contact = contact;
  }


  public JsonSearchResultValue assetType(List<String> assetType) {
    
    this.assetType = assetType;
    return this;
  }

  public JsonSearchResultValue addAssetTypeItem(String assetTypeItem) {
    if (this.assetType == null) {
      this.assetType = new ArrayList<String>();
    }
    this.assetType.add(assetTypeItem);
    return this;
  }

   /**
   * The asset types of the record.
   * @return assetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The asset types of the record.")

  public List<String> getAssetType() {
    return assetType;
  }


  public void setAssetType(List<String> assetType) {
    this.assetType = assetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSearchResultValue jsonSearchResultValue = (JsonSearchResultValue) o;
    return Objects.equals(this.atSearchScore, jsonSearchResultValue.atSearchScore) &&
        Objects.equals(this.atSearchHighlights, jsonSearchResultValue.atSearchHighlights) &&
        Objects.equals(this.atSearchText, jsonSearchResultValue.atSearchText) &&
        Objects.equals(this.description, jsonSearchResultValue.description) &&
        Objects.equals(this.id, jsonSearchResultValue.id) &&
        Objects.equals(this.name, jsonSearchResultValue.name) &&
        Objects.equals(this.owner, jsonSearchResultValue.owner) &&
        Objects.equals(this.qualifiedName, jsonSearchResultValue.qualifiedName) &&
        Objects.equals(this.entityType, jsonSearchResultValue.entityType) &&
        Objects.equals(this.classification, jsonSearchResultValue.classification) &&
        Objects.equals(this.label, jsonSearchResultValue.label) &&
        Objects.equals(this.term, jsonSearchResultValue.term) &&
        Objects.equals(this.contact, jsonSearchResultValue.contact) &&
        Objects.equals(this.assetType, jsonSearchResultValue.assetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atSearchScore, atSearchHighlights, atSearchText, description, id, name, owner, qualifiedName, entityType, classification, label, term, contact, assetType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSearchResultValue {\n");
    sb.append("    atSearchScore: ").append(toIndentedString(atSearchScore)).append("\n");
    sb.append("    atSearchHighlights: ").append(toIndentedString(atSearchHighlights)).append("\n");
    sb.append("    atSearchText: ").append(toIndentedString(atSearchText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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

