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
import org.openapitools.client.model.JsonAtlasTermRelationshipStatus;

/**
 * The header of the related term.
 */
@ApiModel(description = "The header of the related term.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonAtlasRelatedTermHeader {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_TEXT = "displayText";
  @SerializedName(SERIALIZED_NAME_DISPLAY_TEXT)
  private String displayText;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_RELATION_GUID = "relationGuid";
  @SerializedName(SERIALIZED_NAME_RELATION_GUID)
  private String relationGuid;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JsonAtlasTermRelationshipStatus status;

  public static final String SERIALIZED_NAME_STEWARD = "steward";
  @SerializedName(SERIALIZED_NAME_STEWARD)
  private String steward;

  public static final String SERIALIZED_NAME_TERM_GUID = "termGuid";
  @SerializedName(SERIALIZED_NAME_TERM_GUID)
  private String termGuid;


  public JsonAtlasRelatedTermHeader description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the related term.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the related term.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public JsonAtlasRelatedTermHeader displayText(String displayText) {
    
    this.displayText = displayText;
    return this;
  }

   /**
   * The display text.
   * @return displayText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display text.")

  public String getDisplayText() {
    return displayText;
  }


  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }


  public JsonAtlasRelatedTermHeader expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * The expression of the term.
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expression of the term.")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public JsonAtlasRelatedTermHeader relationGuid(String relationGuid) {
    
    this.relationGuid = relationGuid;
    return this;
  }

   /**
   * The GUID of the relationship.
   * @return relationGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the relationship.")

  public String getRelationGuid() {
    return relationGuid;
  }


  public void setRelationGuid(String relationGuid) {
    this.relationGuid = relationGuid;
  }


  public JsonAtlasRelatedTermHeader source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the term.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the term.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public JsonAtlasRelatedTermHeader status(JsonAtlasTermRelationshipStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonAtlasTermRelationshipStatus getStatus() {
    return status;
  }


  public void setStatus(JsonAtlasTermRelationshipStatus status) {
    this.status = status;
  }


  public JsonAtlasRelatedTermHeader steward(String steward) {
    
    this.steward = steward;
    return this;
  }

   /**
   * The steward of the term.
   * @return steward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The steward of the term.")

  public String getSteward() {
    return steward;
  }


  public void setSteward(String steward) {
    this.steward = steward;
  }


  public JsonAtlasRelatedTermHeader termGuid(String termGuid) {
    
    this.termGuid = termGuid;
    return this;
  }

   /**
   * The GUID of the term.
   * @return termGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The GUID of the term.")

  public String getTermGuid() {
    return termGuid;
  }


  public void setTermGuid(String termGuid) {
    this.termGuid = termGuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonAtlasRelatedTermHeader jsonAtlasRelatedTermHeader = (JsonAtlasRelatedTermHeader) o;
    return Objects.equals(this.description, jsonAtlasRelatedTermHeader.description) &&
        Objects.equals(this.displayText, jsonAtlasRelatedTermHeader.displayText) &&
        Objects.equals(this.expression, jsonAtlasRelatedTermHeader.expression) &&
        Objects.equals(this.relationGuid, jsonAtlasRelatedTermHeader.relationGuid) &&
        Objects.equals(this.source, jsonAtlasRelatedTermHeader.source) &&
        Objects.equals(this.status, jsonAtlasRelatedTermHeader.status) &&
        Objects.equals(this.steward, jsonAtlasRelatedTermHeader.steward) &&
        Objects.equals(this.termGuid, jsonAtlasRelatedTermHeader.termGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayText, expression, relationGuid, source, status, steward, termGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonAtlasRelatedTermHeader {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    relationGuid: ").append(toIndentedString(relationGuid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steward: ").append(toIndentedString(steward)).append("\n");
    sb.append("    termGuid: ").append(toIndentedString(termGuid)).append("\n");
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

