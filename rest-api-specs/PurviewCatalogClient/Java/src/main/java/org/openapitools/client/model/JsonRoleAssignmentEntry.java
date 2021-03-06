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
 * A role assignment.
 */
@ApiModel(description = "A role assignment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-21T11:36:33.263002+01:00[Europe/Amsterdam]")
public class JsonRoleAssignmentEntry {
  public static final String SERIALIZED_NAME_PRINCIPAL_ID = "principalId";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ID)
  private String principalId;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;


  public JsonRoleAssignmentEntry principalId(String principalId) {
    
    this.principalId = principalId;
    return this;
  }

   /**
   * The object ID of the AAD user.
   * @return principalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object ID of the AAD user.")

  public String getPrincipalId() {
    return principalId;
  }


  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  public JsonRoleAssignmentEntry role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * The name of the role.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the role.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRoleAssignmentEntry jsonRoleAssignmentEntry = (JsonRoleAssignmentEntry) o;
    return Objects.equals(this.principalId, jsonRoleAssignmentEntry.principalId) &&
        Objects.equals(this.role, jsonRoleAssignmentEntry.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRoleAssignmentEntry {\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

