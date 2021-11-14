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
import org.openapitools.client.model.JsonAtlasGlossaryHeader;
import org.openapitools.client.model.JsonAtlasRelatedObjectId;
import org.openapitools.client.model.JsonAtlasRelatedTermHeader;
import org.openapitools.client.model.JsonAtlasTermCategorizationHeader;
import org.openapitools.client.model.JsonContactBasic;
import org.openapitools.client.model.JsonResourceLink;
import org.openapitools.client.model.JsonTermStatus;

/**
 * JsonAtlasGlossaryTermAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasGlossaryTermAllOf {
  public static final String SERIALIZED_NAME_ABBREVIATION = "abbreviation";
  @SerializedName(SERIALIZED_NAME_ABBREVIATION)
  private String abbreviation;

  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private JsonAtlasGlossaryHeader anchor;

  public static final String SERIALIZED_NAME_ANTONYMS = "antonyms";
  @SerializedName(SERIALIZED_NAME_ANTONYMS)
  private List<JsonAtlasRelatedTermHeader> antonyms = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private BigDecimal createTime;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private BigDecimal updateTime;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonTermStatus status;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<JsonResourceLink> resources = null;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Map<String, JsonContactBasic> contacts = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Map<String, Object>> attributes = null;

  public static final String SERIALIZED_NAME_ASSIGNED_ENTITIES = "assignedEntities";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_ENTITIES)
  private List<JsonAtlasRelatedObjectId> assignedEntities = null;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<JsonAtlasTermCategorizationHeader> categories = null;

  public static final String SERIALIZED_NAME_CLASSIFIES = "classifies";
  @SerializedName(SERIALIZED_NAME_CLASSIFIES)
  private List<JsonAtlasRelatedTermHeader> classifies = null;

  public static final String SERIALIZED_NAME_EXAMPLES = "examples";
  @SerializedName(SERIALIZED_NAME_EXAMPLES)
  private List<String> examples = null;

  public static final String SERIALIZED_NAME_IS_A = "isA";
  @SerializedName(SERIALIZED_NAME_IS_A)
  private List<JsonAtlasRelatedTermHeader> isA = null;

  public static final String SERIALIZED_NAME_PREFERRED_TERMS = "preferredTerms";
  @SerializedName(SERIALIZED_NAME_PREFERRED_TERMS)
  private List<JsonAtlasRelatedTermHeader> preferredTerms = null;

  public static final String SERIALIZED_NAME_PREFERRED_TO_TERMS = "preferredToTerms";
  @SerializedName(SERIALIZED_NAME_PREFERRED_TO_TERMS)
  private List<JsonAtlasRelatedTermHeader> preferredToTerms = null;

  public static final String SERIALIZED_NAME_REPLACED_BY = "replacedBy";
  @SerializedName(SERIALIZED_NAME_REPLACED_BY)
  private List<JsonAtlasRelatedTermHeader> replacedBy = null;

  public static final String SERIALIZED_NAME_REPLACEMENT_TERMS = "replacementTerms";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_TERMS)
  private List<JsonAtlasRelatedTermHeader> replacementTerms = null;

  public static final String SERIALIZED_NAME_SEE_ALSO = "seeAlso";
  @SerializedName(SERIALIZED_NAME_SEE_ALSO)
  private List<JsonAtlasRelatedTermHeader> seeAlso = null;

  public static final String SERIALIZED_NAME_SYNONYMS = "synonyms";
  @SerializedName(SERIALIZED_NAME_SYNONYMS)
  private List<JsonAtlasRelatedTermHeader> synonyms = null;

  public static final String SERIALIZED_NAME_TRANSLATED_TERMS = "translatedTerms";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_TERMS)
  private List<JsonAtlasRelatedTermHeader> translatedTerms = null;

  public static final String SERIALIZED_NAME_TRANSLATION_TERMS = "translationTerms";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_TERMS)
  private List<JsonAtlasRelatedTermHeader> translationTerms = null;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private String usage;

  public static final String SERIALIZED_NAME_VALID_VALUES = "validValues";
  @SerializedName(SERIALIZED_NAME_VALID_VALUES)
  private List<JsonAtlasRelatedTermHeader> validValues = null;

  public static final String SERIALIZED_NAME_VALID_VALUES_FOR = "validValuesFor";
  @SerializedName(SERIALIZED_NAME_VALID_VALUES_FOR)
  private List<JsonAtlasRelatedTermHeader> validValuesFor = null;


  public JsonAtlasGlossaryTermAllOf abbreviation(String abbreviation) {
    
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * The abbreviation of the term.
   * @return abbreviation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The abbreviation of the term.")

  public String getAbbreviation() {
    return abbreviation;
  }


  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }


  public JsonAtlasGlossaryTermAllOf anchor(JsonAtlasGlossaryHeader anchor) {
    
    this.anchor = anchor;
    return this;
  }

   /**
   * Get anchor
   * @return anchor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonAtlasGlossaryHeader getAnchor() {
    return anchor;
  }


  public void setAnchor(JsonAtlasGlossaryHeader anchor) {
    this.anchor = anchor;
  }


  public JsonAtlasGlossaryTermAllOf antonyms(List<JsonAtlasRelatedTermHeader> antonyms) {
    
    this.antonyms = antonyms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addAntonymsItem(JsonAtlasRelatedTermHeader antonymsItem) {
    if (this.antonyms == null) {
      this.antonyms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.antonyms.add(antonymsItem);
    return this;
  }

   /**
   * An array of related term headers as antonyms.
   * @return antonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers as antonyms.")

  public List<JsonAtlasRelatedTermHeader> getAntonyms() {
    return antonyms;
  }


  public void setAntonyms(List<JsonAtlasRelatedTermHeader> antonyms) {
    this.antonyms = antonyms;
  }


  public JsonAtlasGlossaryTermAllOf createTime(BigDecimal createTime) {
    
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


  public JsonAtlasGlossaryTermAllOf createdBy(String createdBy) {
    
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


  public JsonAtlasGlossaryTermAllOf updateTime(BigDecimal updateTime) {
    
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


  public JsonAtlasGlossaryTermAllOf updatedBy(String updatedBy) {
    
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


  public JsonAtlasGlossaryTermAllOf status(JsonTermStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonTermStatus getStatus() {
    return status;
  }


  public void setStatus(JsonTermStatus status) {
    this.status = status;
  }


  public JsonAtlasGlossaryTermAllOf resources(List<JsonResourceLink> resources) {
    
    this.resources = resources;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addResourcesItem(JsonResourceLink resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<JsonResourceLink>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * An array of resource link for term
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of resource link for term")

  public List<JsonResourceLink> getResources() {
    return resources;
  }


  public void setResources(List<JsonResourceLink> resources) {
    this.resources = resources;
  }


  public JsonAtlasGlossaryTermAllOf contacts(Map<String, JsonContactBasic> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf putContactsItem(String key, JsonContactBasic contactsItem) {
    if (this.contacts == null) {
      this.contacts = new HashMap<String, JsonContactBasic>();
    }
    this.contacts.put(key, contactsItem);
    return this;
  }

   /**
   * The dictionary of contacts for terms. Key could be Expert or Steward.
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dictionary of contacts for terms. Key could be Expert or Steward.")

  public Map<String, JsonContactBasic> getContacts() {
    return contacts;
  }


  public void setContacts(Map<String, JsonContactBasic> contacts) {
    this.contacts = contacts;
  }


  public JsonAtlasGlossaryTermAllOf attributes(Map<String, Map<String, Object>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf putAttributesItem(String key, Map<String, Object> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Map<String, Object>>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * The custom attributes of the term, which is map&lt;string,map&lt;string,object&gt;&gt;. The key of the first layer map is term template name.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom attributes of the term, which is map<string,map<string,object>>. The key of the first layer map is term template name.")

  public Map<String, Map<String, Object>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Map<String, Object>> attributes) {
    this.attributes = attributes;
  }


  public JsonAtlasGlossaryTermAllOf assignedEntities(List<JsonAtlasRelatedObjectId> assignedEntities) {
    
    this.assignedEntities = assignedEntities;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addAssignedEntitiesItem(JsonAtlasRelatedObjectId assignedEntitiesItem) {
    if (this.assignedEntities == null) {
      this.assignedEntities = new ArrayList<JsonAtlasRelatedObjectId>();
    }
    this.assignedEntities.add(assignedEntitiesItem);
    return this;
  }

   /**
   * An array of related object IDs.
   * @return assignedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related object IDs.")

  public List<JsonAtlasRelatedObjectId> getAssignedEntities() {
    return assignedEntities;
  }


  public void setAssignedEntities(List<JsonAtlasRelatedObjectId> assignedEntities) {
    this.assignedEntities = assignedEntities;
  }


  public JsonAtlasGlossaryTermAllOf categories(List<JsonAtlasTermCategorizationHeader> categories) {
    
    this.categories = categories;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addCategoriesItem(JsonAtlasTermCategorizationHeader categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<JsonAtlasTermCategorizationHeader>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * An array of term categorization headers.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of term categorization headers.")

  public List<JsonAtlasTermCategorizationHeader> getCategories() {
    return categories;
  }


  public void setCategories(List<JsonAtlasTermCategorizationHeader> categories) {
    this.categories = categories;
  }


  public JsonAtlasGlossaryTermAllOf classifies(List<JsonAtlasRelatedTermHeader> classifies) {
    
    this.classifies = classifies;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addClassifiesItem(JsonAtlasRelatedTermHeader classifiesItem) {
    if (this.classifies == null) {
      this.classifies = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.classifies.add(classifiesItem);
    return this;
  }

   /**
   * An array of related term headers.
   * @return classifies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers.")

  public List<JsonAtlasRelatedTermHeader> getClassifies() {
    return classifies;
  }


  public void setClassifies(List<JsonAtlasRelatedTermHeader> classifies) {
    this.classifies = classifies;
  }


  public JsonAtlasGlossaryTermAllOf examples(List<String> examples) {
    
    this.examples = examples;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addExamplesItem(String examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<String>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * An array of examples.
   * @return examples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of examples.")

  public List<String> getExamples() {
    return examples;
  }


  public void setExamples(List<String> examples) {
    this.examples = examples;
  }


  public JsonAtlasGlossaryTermAllOf isA(List<JsonAtlasRelatedTermHeader> isA) {
    
    this.isA = isA;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addIsAItem(JsonAtlasRelatedTermHeader isAItem) {
    if (this.isA == null) {
      this.isA = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.isA.add(isAItem);
    return this;
  }

   /**
   * An array of related term headers indicating the is-a relationship.
   * @return isA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers indicating the is-a relationship.")

  public List<JsonAtlasRelatedTermHeader> getIsA() {
    return isA;
  }


  public void setIsA(List<JsonAtlasRelatedTermHeader> isA) {
    this.isA = isA;
  }


  public JsonAtlasGlossaryTermAllOf preferredTerms(List<JsonAtlasRelatedTermHeader> preferredTerms) {
    
    this.preferredTerms = preferredTerms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addPreferredTermsItem(JsonAtlasRelatedTermHeader preferredTermsItem) {
    if (this.preferredTerms == null) {
      this.preferredTerms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.preferredTerms.add(preferredTermsItem);
    return this;
  }

   /**
   * An array of preferred related term headers.
   * @return preferredTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of preferred related term headers.")

  public List<JsonAtlasRelatedTermHeader> getPreferredTerms() {
    return preferredTerms;
  }


  public void setPreferredTerms(List<JsonAtlasRelatedTermHeader> preferredTerms) {
    this.preferredTerms = preferredTerms;
  }


  public JsonAtlasGlossaryTermAllOf preferredToTerms(List<JsonAtlasRelatedTermHeader> preferredToTerms) {
    
    this.preferredToTerms = preferredToTerms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addPreferredToTermsItem(JsonAtlasRelatedTermHeader preferredToTermsItem) {
    if (this.preferredToTerms == null) {
      this.preferredToTerms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.preferredToTerms.add(preferredToTermsItem);
    return this;
  }

   /**
   * An array of related term headers that are preferred to.
   * @return preferredToTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers that are preferred to.")

  public List<JsonAtlasRelatedTermHeader> getPreferredToTerms() {
    return preferredToTerms;
  }


  public void setPreferredToTerms(List<JsonAtlasRelatedTermHeader> preferredToTerms) {
    this.preferredToTerms = preferredToTerms;
  }


  public JsonAtlasGlossaryTermAllOf replacedBy(List<JsonAtlasRelatedTermHeader> replacedBy) {
    
    this.replacedBy = replacedBy;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addReplacedByItem(JsonAtlasRelatedTermHeader replacedByItem) {
    if (this.replacedBy == null) {
      this.replacedBy = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.replacedBy.add(replacedByItem);
    return this;
  }

   /**
   * An array of related term headers that are replaced by.
   * @return replacedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers that are replaced by.")

  public List<JsonAtlasRelatedTermHeader> getReplacedBy() {
    return replacedBy;
  }


  public void setReplacedBy(List<JsonAtlasRelatedTermHeader> replacedBy) {
    this.replacedBy = replacedBy;
  }


  public JsonAtlasGlossaryTermAllOf replacementTerms(List<JsonAtlasRelatedTermHeader> replacementTerms) {
    
    this.replacementTerms = replacementTerms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addReplacementTermsItem(JsonAtlasRelatedTermHeader replacementTermsItem) {
    if (this.replacementTerms == null) {
      this.replacementTerms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.replacementTerms.add(replacementTermsItem);
    return this;
  }

   /**
   * An array of related term headers for replacement.
   * @return replacementTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers for replacement.")

  public List<JsonAtlasRelatedTermHeader> getReplacementTerms() {
    return replacementTerms;
  }


  public void setReplacementTerms(List<JsonAtlasRelatedTermHeader> replacementTerms) {
    this.replacementTerms = replacementTerms;
  }


  public JsonAtlasGlossaryTermAllOf seeAlso(List<JsonAtlasRelatedTermHeader> seeAlso) {
    
    this.seeAlso = seeAlso;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addSeeAlsoItem(JsonAtlasRelatedTermHeader seeAlsoItem) {
    if (this.seeAlso == null) {
      this.seeAlso = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.seeAlso.add(seeAlsoItem);
    return this;
  }

   /**
   * An array of related term headers for see also.
   * @return seeAlso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers for see also.")

  public List<JsonAtlasRelatedTermHeader> getSeeAlso() {
    return seeAlso;
  }


  public void setSeeAlso(List<JsonAtlasRelatedTermHeader> seeAlso) {
    this.seeAlso = seeAlso;
  }


  public JsonAtlasGlossaryTermAllOf synonyms(List<JsonAtlasRelatedTermHeader> synonyms) {
    
    this.synonyms = synonyms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addSynonymsItem(JsonAtlasRelatedTermHeader synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * An array of related term headers as synonyms.
   * @return synonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers as synonyms.")

  public List<JsonAtlasRelatedTermHeader> getSynonyms() {
    return synonyms;
  }


  public void setSynonyms(List<JsonAtlasRelatedTermHeader> synonyms) {
    this.synonyms = synonyms;
  }


  public JsonAtlasGlossaryTermAllOf translatedTerms(List<JsonAtlasRelatedTermHeader> translatedTerms) {
    
    this.translatedTerms = translatedTerms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addTranslatedTermsItem(JsonAtlasRelatedTermHeader translatedTermsItem) {
    if (this.translatedTerms == null) {
      this.translatedTerms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.translatedTerms.add(translatedTermsItem);
    return this;
  }

   /**
   * An array of translated related term headers.
   * @return translatedTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of translated related term headers.")

  public List<JsonAtlasRelatedTermHeader> getTranslatedTerms() {
    return translatedTerms;
  }


  public void setTranslatedTerms(List<JsonAtlasRelatedTermHeader> translatedTerms) {
    this.translatedTerms = translatedTerms;
  }


  public JsonAtlasGlossaryTermAllOf translationTerms(List<JsonAtlasRelatedTermHeader> translationTerms) {
    
    this.translationTerms = translationTerms;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addTranslationTermsItem(JsonAtlasRelatedTermHeader translationTermsItem) {
    if (this.translationTerms == null) {
      this.translationTerms = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.translationTerms.add(translationTermsItem);
    return this;
  }

   /**
   * An array of related term headers for translation.
   * @return translationTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers for translation.")

  public List<JsonAtlasRelatedTermHeader> getTranslationTerms() {
    return translationTerms;
  }


  public void setTranslationTerms(List<JsonAtlasRelatedTermHeader> translationTerms) {
    this.translationTerms = translationTerms;
  }


  public JsonAtlasGlossaryTermAllOf usage(String usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * The usage of the term.
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The usage of the term.")

  public String getUsage() {
    return usage;
  }


  public void setUsage(String usage) {
    this.usage = usage;
  }


  public JsonAtlasGlossaryTermAllOf validValues(List<JsonAtlasRelatedTermHeader> validValues) {
    
    this.validValues = validValues;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addValidValuesItem(JsonAtlasRelatedTermHeader validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.validValues.add(validValuesItem);
    return this;
  }

   /**
   * An array of related term headers as valid values.
   * @return validValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers as valid values.")

  public List<JsonAtlasRelatedTermHeader> getValidValues() {
    return validValues;
  }


  public void setValidValues(List<JsonAtlasRelatedTermHeader> validValues) {
    this.validValues = validValues;
  }


  public JsonAtlasGlossaryTermAllOf validValuesFor(List<JsonAtlasRelatedTermHeader> validValuesFor) {
    
    this.validValuesFor = validValuesFor;
    return this;
  }

  public JsonAtlasGlossaryTermAllOf addValidValuesForItem(JsonAtlasRelatedTermHeader validValuesForItem) {
    if (this.validValuesFor == null) {
      this.validValuesFor = new ArrayList<JsonAtlasRelatedTermHeader>();
    }
    this.validValuesFor.add(validValuesForItem);
    return this;
  }

   /**
   * An array of related term headers as valid values for other records.
   * @return validValuesFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related term headers as valid values for other records.")

  public List<JsonAtlasRelatedTermHeader> getValidValuesFor() {
    return validValuesFor;
  }


  public void setValidValuesFor(List<JsonAtlasRelatedTermHeader> validValuesFor) {
    this.validValuesFor = validValuesFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasGlossaryTermAllOf jsonAtlasGlossaryTermAllOf = (JsonAtlasGlossaryTermAllOf) o;
    return Objects.equals(this.abbreviation, jsonAtlasGlossaryTermAllOf.abbreviation) &&
        Objects.equals(this.anchor, jsonAtlasGlossaryTermAllOf.anchor) &&
        Objects.equals(this.antonyms, jsonAtlasGlossaryTermAllOf.antonyms) &&
        Objects.equals(this.createTime, jsonAtlasGlossaryTermAllOf.createTime) &&
        Objects.equals(this.createdBy, jsonAtlasGlossaryTermAllOf.createdBy) &&
        Objects.equals(this.updateTime, jsonAtlasGlossaryTermAllOf.updateTime) &&
        Objects.equals(this.updatedBy, jsonAtlasGlossaryTermAllOf.updatedBy) &&
        Objects.equals(this.status, jsonAtlasGlossaryTermAllOf.status) &&
        Objects.equals(this.resources, jsonAtlasGlossaryTermAllOf.resources) &&
        Objects.equals(this.contacts, jsonAtlasGlossaryTermAllOf.contacts) &&
        Objects.equals(this.attributes, jsonAtlasGlossaryTermAllOf.attributes) &&
        Objects.equals(this.assignedEntities, jsonAtlasGlossaryTermAllOf.assignedEntities) &&
        Objects.equals(this.categories, jsonAtlasGlossaryTermAllOf.categories) &&
        Objects.equals(this.classifies, jsonAtlasGlossaryTermAllOf.classifies) &&
        Objects.equals(this.examples, jsonAtlasGlossaryTermAllOf.examples) &&
        Objects.equals(this.isA, jsonAtlasGlossaryTermAllOf.isA) &&
        Objects.equals(this.preferredTerms, jsonAtlasGlossaryTermAllOf.preferredTerms) &&
        Objects.equals(this.preferredToTerms, jsonAtlasGlossaryTermAllOf.preferredToTerms) &&
        Objects.equals(this.replacedBy, jsonAtlasGlossaryTermAllOf.replacedBy) &&
        Objects.equals(this.replacementTerms, jsonAtlasGlossaryTermAllOf.replacementTerms) &&
        Objects.equals(this.seeAlso, jsonAtlasGlossaryTermAllOf.seeAlso) &&
        Objects.equals(this.synonyms, jsonAtlasGlossaryTermAllOf.synonyms) &&
        Objects.equals(this.translatedTerms, jsonAtlasGlossaryTermAllOf.translatedTerms) &&
        Objects.equals(this.translationTerms, jsonAtlasGlossaryTermAllOf.translationTerms) &&
        Objects.equals(this.usage, jsonAtlasGlossaryTermAllOf.usage) &&
        Objects.equals(this.validValues, jsonAtlasGlossaryTermAllOf.validValues) &&
        Objects.equals(this.validValuesFor, jsonAtlasGlossaryTermAllOf.validValuesFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, anchor, antonyms, createTime, createdBy, updateTime, updatedBy, status, resources, contacts, attributes, assignedEntities, categories, classifies, examples, isA, preferredTerms, preferredToTerms, replacedBy, replacementTerms, seeAlso, synonyms, translatedTerms, translationTerms, usage, validValues, validValuesFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasGlossaryTermAllOf {\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    antonyms: ").append(toIndentedString(antonyms)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    assignedEntities: ").append(toIndentedString(assignedEntities)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    classifies: ").append(toIndentedString(classifies)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    isA: ").append(toIndentedString(isA)).append("\n");
    sb.append("    preferredTerms: ").append(toIndentedString(preferredTerms)).append("\n");
    sb.append("    preferredToTerms: ").append(toIndentedString(preferredToTerms)).append("\n");
    sb.append("    replacedBy: ").append(toIndentedString(replacedBy)).append("\n");
    sb.append("    replacementTerms: ").append(toIndentedString(replacementTerms)).append("\n");
    sb.append("    seeAlso: ").append(toIndentedString(seeAlso)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    translatedTerms: ").append(toIndentedString(translatedTerms)).append("\n");
    sb.append("    translationTerms: ").append(toIndentedString(translationTerms)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
    sb.append("    validValuesFor: ").append(toIndentedString(validValuesFor)).append("\n");
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
