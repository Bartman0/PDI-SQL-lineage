# EntityRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityRESTAddClassification**](EntityRestApi.md#entityRESTAddClassification) | **POST** /atlas/v2/entity/bulk/classification | 
[**entityRESTAddClassifications**](EntityRestApi.md#entityRESTAddClassifications) | **POST** /atlas/v2/entity/guid/{guid}/classifications | 
[**entityRESTAddClassificationsByUniqueAttribute**](EntityRestApi.md#entityRESTAddClassificationsByUniqueAttribute) | **POST** /atlas/v2/entity/uniqueAttribute/type/{typeName}/classifications | 
[**entityRESTBulkDelete**](EntityRestApi.md#entityRESTBulkDelete) | **DELETE** /atlas/v2/entity/bulk | 
[**entityRESTCreateOrUpdate**](EntityRestApi.md#entityRESTCreateOrUpdate) | **POST** /atlas/v2/entity | 
[**entityRESTCreateOrUpdateBulk**](EntityRestApi.md#entityRESTCreateOrUpdateBulk) | **POST** /atlas/v2/entity/bulk | 
[**entityRESTDeleteByGuid**](EntityRestApi.md#entityRESTDeleteByGuid) | **DELETE** /atlas/v2/entity/guid/{guid} | 
[**entityRESTDeleteByUniqueAttribute**](EntityRestApi.md#entityRESTDeleteByUniqueAttribute) | **DELETE** /atlas/v2/entity/uniqueAttribute/type/{typeName} | 
[**entityRESTDeleteClassification**](EntityRestApi.md#entityRESTDeleteClassification) | **DELETE** /atlas/v2/entity/guid/{guid}/classification/{classificationName} | 
[**entityRESTDeleteClassificationByUniqueAttribute**](EntityRestApi.md#entityRESTDeleteClassificationByUniqueAttribute) | **DELETE** /atlas/v2/entity/uniqueAttribute/type/{typeName}/classification/{classificationName} | 
[**entityRESTGetByGuids**](EntityRestApi.md#entityRESTGetByGuids) | **GET** /atlas/v2/entity/bulk | 
[**entityRESTGetById**](EntityRestApi.md#entityRESTGetById) | **GET** /atlas/v2/entity/guid/{guid} | 
[**entityRESTGetByUniqueAttributes**](EntityRestApi.md#entityRESTGetByUniqueAttributes) | **GET** /atlas/v2/entity/uniqueAttribute/type/{typeName} | 
[**entityRESTGetClassification**](EntityRestApi.md#entityRESTGetClassification) | **GET** /atlas/v2/entity/guid/{guid}/classification/{classificationName} | 
[**entityRESTGetClassifications**](EntityRestApi.md#entityRESTGetClassifications) | **GET** /atlas/v2/entity/guid/{guid}/classifications | 
[**entityRESTGetEntitiesByUniqueAttributes**](EntityRestApi.md#entityRESTGetEntitiesByUniqueAttributes) | **GET** /atlas/v2/entity/bulk/uniqueAttribute/type/{typeName} | 
[**entityRESTGetHeaderById**](EntityRestApi.md#entityRESTGetHeaderById) | **GET** /atlas/v2/entity/guid/{guid}/header | Get entity header given its GUID.
[**entityRESTPartialUpdateEntityAttrByGuid**](EntityRestApi.md#entityRESTPartialUpdateEntityAttrByGuid) | **PUT** /atlas/v2/entity/guid/{guid} | 
[**entityRESTPartialUpdateEntityByUniqueAttrs**](EntityRestApi.md#entityRESTPartialUpdateEntityByUniqueAttrs) | **PUT** /atlas/v2/entity/uniqueAttribute/type/{typeName} | 
[**entityRESTSetClassifications**](EntityRestApi.md#entityRESTSetClassifications) | **POST** /atlas/v2/entity/bulk/setClassifications | 
[**entityRESTUpdateClassifications**](EntityRestApi.md#entityRESTUpdateClassifications) | **PUT** /atlas/v2/entity/guid/{guid}/classifications | 
[**entityRESTUpdateClassificationsByUniqueAttribute**](EntityRestApi.md#entityRESTUpdateClassificationsByUniqueAttribute) | **PUT** /atlas/v2/entity/uniqueAttribute/type/{typeName}/classifications | 


<a name="entityRESTAddClassification"></a>
# **entityRESTAddClassification**
> entityRESTAddClassification(request)



Associates a classification to multiple entities in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    JsonClassificationAssociateRequest request = new JsonClassificationAssociateRequest(); // JsonClassificationAssociateRequest | The request to associate a classification to multiple entities.
    try {
      apiInstance.entityRESTAddClassification(request);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTAddClassification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**JsonClassificationAssociateRequest**](JsonClassificationAssociateRequest.md)| The request to associate a classification to multiple entities. |

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

<a name="entityRESTAddClassifications"></a>
# **entityRESTAddClassifications**
> entityRESTAddClassifications(guid, classifications)



Adds classifications to an existing entity represented by a GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    List<JsonAtlasClassification> classifications = Arrays.asList(null); // List<JsonAtlasClassification> | An array of classifications to be added.
    try {
      apiInstance.entityRESTAddClassifications(guid, classifications);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTAddClassifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **classifications** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md)| An array of classifications to be added. |

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

<a name="entityRESTAddClassificationsByUniqueAttribute"></a>
# **entityRESTAddClassificationsByUniqueAttribute**
> entityRESTAddClassificationsByUniqueAttribute(typeName, atlasClassificationArray, attrColonQualifiedName)



Adds classification to the entity identified by its type and unique attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    List<JsonAtlasClassification> atlasClassificationArray = Arrays.asList(null); // List<JsonAtlasClassification> | An array of classification to be added.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      apiInstance.entityRESTAddClassificationsByUniqueAttribute(typeName, atlasClassificationArray, attrColonQualifiedName);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTAddClassificationsByUniqueAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **atlasClassificationArray** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md)| An array of classification to be added. |
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

<a name="entityRESTBulkDelete"></a>
# **entityRESTBulkDelete**
> JsonEntityMutationResponse entityRESTBulkDelete(guid)



Deletes a list of entities in bulk identified by their GUIDs or unique attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    List<String> guid = Arrays.asList(); // List<String> | An array of GUIDs of entities to delete.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTBulkDelete(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTBulkDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | [**List&lt;String&gt;**](String.md)| An array of GUIDs of entities to delete. |

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Deleted with EntityMutationResponse. |  -  |

<a name="entityRESTCreateOrUpdate"></a>
# **entityRESTCreateOrUpdate**
> JsonEntityMutationResponse entityRESTCreateOrUpdate(entity)



Creates or updates an entity in Atlas. Existing entity is matched using its unique guid if supplied or by its unique attributes eg: qualifiedName. Map and array of collections are not well supported. E.g., array&lt;array&lt;int&gt;&gt;, array&lt;map&lt;string, int&gt;&gt;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    JsonAtlasEntityWithExtInfo entity = new JsonAtlasEntityWithExtInfo(); // JsonAtlasEntityWithExtInfo | Atlas entity with extended information.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTCreateOrUpdate(entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTCreateOrUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**JsonAtlasEntityWithExtInfo**](JsonAtlasEntityWithExtInfo.md)| Atlas entity with extended information. |

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created with EntityMutationResponse. |  -  |

<a name="entityRESTCreateOrUpdateBulk"></a>
# **entityRESTCreateOrUpdateBulk**
> JsonEntityMutationResponse entityRESTCreateOrUpdateBulk(entities)



Creates or updates entities in Atlas in bulk. Existing entity is matched using its unique guid if supplied or by its unique attributes eg: qualifiedName. Map and array of collections are not well supported. E.g., array&lt;array&lt;int&gt;&gt;, array&lt;map&lt;string, int&gt;&gt;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    JsonAtlasEntitiesWithExtInfo entities = new JsonAtlasEntitiesWithExtInfo(); // JsonAtlasEntitiesWithExtInfo | An array of entities to create or update.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTCreateOrUpdateBulk(entities);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTCreateOrUpdateBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entities** | [**JsonAtlasEntitiesWithExtInfo**](JsonAtlasEntitiesWithExtInfo.md)| An array of entities to create or update. |

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok. |  -  |

<a name="entityRESTDeleteByGuid"></a>
# **entityRESTDeleteByGuid**
> JsonEntityMutationResponse entityRESTDeleteByGuid(guid)



Deletes an entity identified by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTDeleteByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTDeleteByGuid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Deleted with EntityMutationResponse. |  -  |

<a name="entityRESTDeleteByUniqueAttribute"></a>
# **entityRESTDeleteByUniqueAttribute**
> JsonEntityMutationResponse entityRESTDeleteByUniqueAttribute(typeName, attrColonQualifiedName)



Deletes an entity identified by its type and unique attributes. In addition to the typeName path parameter, attribute key-value pair(s) can be provided in the following format: attr:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;. NOTE: The attrName and attrValue should be unique across entities, eg. qualifiedName. The REST request would look something like this: DELETE /v2/entity/uniqueAttribute/type/aType?attr:aTypeAttribute&#x3D;someValue.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTDeleteByUniqueAttribute(typeName, attrColonQualifiedName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTDeleteByUniqueAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Deleted with EntityMutationResponse. |  -  |

<a name="entityRESTDeleteClassification"></a>
# **entityRESTDeleteClassification**
> entityRESTDeleteClassification(guid, classificationName)



Deletes a given classification from an existing entity represented by a GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    String classificationName = "classificationName_example"; // String | The name of the classification.
    try {
      apiInstance.entityRESTDeleteClassification(guid, classificationName);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTDeleteClassification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **classificationName** | **String**| The name of the classification. |

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

<a name="entityRESTDeleteClassificationByUniqueAttribute"></a>
# **entityRESTDeleteClassificationByUniqueAttribute**
> entityRESTDeleteClassificationByUniqueAttribute(typeName, classificationName, attrColonQualifiedName)



Deletes a given classification from an entity identified by its type and unique attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    String classificationName = "classificationName_example"; // String | The name of the classification.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      apiInstance.entityRESTDeleteClassificationByUniqueAttribute(typeName, classificationName, attrColonQualifiedName);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTDeleteClassificationByUniqueAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **classificationName** | **String**| The name of the classification. |
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |
**404** | Not Found. |  -  |

<a name="entityRESTGetByGuids"></a>
# **entityRESTGetByGuids**
> JsonAtlasEntitiesWithExtInfo entityRESTGetByGuids(guid, minExtInfo, ignoreRelationships)



Lists entities in bulk identified by its GUIDs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    List<String> guid = Arrays.asList(); // List<String> | An array of GUIDs of entities to create.
    Boolean minExtInfo = false; // Boolean | Whether to return minimal information for referred entities.
    Boolean ignoreRelationships = false; // Boolean | Whether to ignore relationship attributes.
    try {
      JsonAtlasEntitiesWithExtInfo result = apiInstance.entityRESTGetByGuids(guid, minExtInfo, ignoreRelationships);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetByGuids");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | [**List&lt;String&gt;**](String.md)| An array of GUIDs of entities to create. |
 **minExtInfo** | **Boolean**| Whether to return minimal information for referred entities. | [optional] [default to false]
 **ignoreRelationships** | **Boolean**| Whether to ignore relationship attributes. | [optional] [default to false]

### Return type

[**JsonAtlasEntitiesWithExtInfo**](JsonAtlasEntitiesWithExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |
**404** | No entity is found. |  -  |

<a name="entityRESTGetById"></a>
# **entityRESTGetById**
> JsonAtlasEntityWithExtInfo entityRESTGetById(guid, minExtInfo, ignoreRelationships)



Gets complete definition of an entity given its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    Boolean minExtInfo = false; // Boolean | Whether to return minimal information for referred entities.
    Boolean ignoreRelationships = false; // Boolean | Whether to ignore relationship attributes.
    try {
      JsonAtlasEntityWithExtInfo result = apiInstance.entityRESTGetById(guid, minExtInfo, ignoreRelationships);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **minExtInfo** | **Boolean**| Whether to return minimal information for referred entities. | [optional] [default to false]
 **ignoreRelationships** | **Boolean**| Whether to ignore relationship attributes. | [optional] [default to false]

### Return type

[**JsonAtlasEntityWithExtInfo**](JsonAtlasEntityWithExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |

<a name="entityRESTGetByUniqueAttributes"></a>
# **entityRESTGetByUniqueAttributes**
> JsonAtlasEntityWithExtInfo entityRESTGetByUniqueAttributes(typeName, minExtInfo, ignoreRelationships, attrColonQualifiedName)



Gets complete definition of an entity given its type and unique attribute. In addition to the typeName path parameter, attribute key-value pair(s) can be provided in the following format: attr:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;. NOTE: The attrName and attrValue should be unique across entities, eg. qualifiedName. The REST request would look something like this: GET /v2/entity/uniqueAttribute/type/aType?attr:aTypeAttribute&#x3D;someValue.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    Boolean minExtInfo = false; // Boolean | Whether to return minimal information for referred entities.
    Boolean ignoreRelationships = false; // Boolean | Whether to ignore relationship attributes.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      JsonAtlasEntityWithExtInfo result = apiInstance.entityRESTGetByUniqueAttributes(typeName, minExtInfo, ignoreRelationships, attrColonQualifiedName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetByUniqueAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **minExtInfo** | **Boolean**| Whether to return minimal information for referred entities. | [optional] [default to false]
 **ignoreRelationships** | **Boolean**| Whether to ignore relationship attributes. | [optional] [default to false]
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

[**JsonAtlasEntityWithExtInfo**](JsonAtlasEntityWithExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | AtlasEntityWithExtInfo. |  -  |

<a name="entityRESTGetClassification"></a>
# **entityRESTGetClassification**
> JsonAtlasClassification entityRESTGetClassification(guid, classificationName)



Lists classifications for a given entity represented by a GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    String classificationName = "classificationName_example"; // String | The name of the classification.
    try {
      JsonAtlasClassification result = apiInstance.entityRESTGetClassification(guid, classificationName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetClassification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **classificationName** | **String**| The name of the classification. |

### Return type

[**JsonAtlasClassification**](JsonAtlasClassification.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The classification for the given entity GUID. |  -  |

<a name="entityRESTGetClassifications"></a>
# **entityRESTGetClassifications**
> JsonAtlasClassifications entityRESTGetClassifications(guid)



Lists classifications for a given entity represented by a GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    try {
      JsonAtlasClassifications result = apiInstance.entityRESTGetClassifications(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetClassifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |

### Return type

[**JsonAtlasClassifications**](JsonAtlasClassifications.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of classifications for the given entity GUID. |  -  |

<a name="entityRESTGetEntitiesByUniqueAttributes"></a>
# **entityRESTGetEntitiesByUniqueAttributes**
> JsonAtlasEntitiesWithExtInfo entityRESTGetEntitiesByUniqueAttributes(typeName, minExtInfo, ignoreRelationships, attrNColonQualifiedName)



Bulk API to retrieve list of entities identified by its unique attributes.  In addition to the typeName path parameter, attribute key-value pair(s) can be provided in the following format  typeName&#x3D;&lt;typeName&gt;&amp;attr_1:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;&amp;attr_2:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;&amp;attr_3:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;  NOTE: The attrName should be an unique attribute for the given entity-type  The REST request would look something like this  GET /v2/entity/bulk/uniqueAttribute/type/hive_db?attr_0:qualifiedName&#x3D;db1@cl1&amp;attr_2:qualifiedName&#x3D;db2@cl1

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    Boolean minExtInfo = false; // Boolean | Whether to return minimal information for referred entities.
    Boolean ignoreRelationships = false; // Boolean | Whether to ignore relationship attributes.
    String attrNColonQualifiedName = "attrNColonQualifiedName_example"; // String | Qualified name of an entity. E.g. to find 2 entities you can set attrs_0:qualifiedName=db1@cl1&attrs_2:qualifiedName=db2@cl1
    try {
      JsonAtlasEntitiesWithExtInfo result = apiInstance.entityRESTGetEntitiesByUniqueAttributes(typeName, minExtInfo, ignoreRelationships, attrNColonQualifiedName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetEntitiesByUniqueAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **minExtInfo** | **Boolean**| Whether to return minimal information for referred entities. | [optional] [default to false]
 **ignoreRelationships** | **Boolean**| Whether to ignore relationship attributes. | [optional] [default to false]
 **attrNColonQualifiedName** | **String**| Qualified name of an entity. E.g. to find 2 entities you can set attrs_0:qualifiedName&#x3D;db1@cl1&amp;attrs_2:qualifiedName&#x3D;db2@cl1 | [optional]

### Return type

[**JsonAtlasEntitiesWithExtInfo**](JsonAtlasEntitiesWithExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |

<a name="entityRESTGetHeaderById"></a>
# **entityRESTGetHeaderById**
> JsonAtlasEntityHeader entityRESTGetHeaderById(guid)

Get entity header given its GUID.

Get entity header given its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    try {
      JsonAtlasEntityHeader result = apiInstance.entityRESTGetHeaderById(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTGetHeaderById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |

### Return type

[**JsonAtlasEntityHeader**](JsonAtlasEntityHeader.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | AtlasEntityHeader |  -  |

<a name="entityRESTPartialUpdateEntityAttrByGuid"></a>
# **entityRESTPartialUpdateEntityAttrByGuid**
> JsonEntityMutationResponse entityRESTPartialUpdateEntityAttrByGuid(guid, name, body)



Updates entity partially - creates or updates entity attribute identified by its GUID. Supports only primitive attribute type and entity references. It does not support updation of complex types like arrays, and maps. Null updates are not possible.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    String name = "name_example"; // String | The name of the attribute.
    Object body = null; // Object | The value of the attribute.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTPartialUpdateEntityAttrByGuid(guid, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTPartialUpdateEntityAttrByGuid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **name** | **String**| The name of the attribute. |
 **body** | **Object**| The value of the attribute. |

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated with EntityMutationResponse. |  -  |

<a name="entityRESTPartialUpdateEntityByUniqueAttrs"></a>
# **entityRESTPartialUpdateEntityByUniqueAttrs**
> JsonEntityMutationResponse entityRESTPartialUpdateEntityByUniqueAttrs(typeName, atlasEntityWithExtInfo, attrColonQualifiedName)



Updates entity partially - Allows a subset of attributes to be updated on an entity which is identified by its type and unique attribute  eg: Referenceable.qualifiedName. Null updates are not possible. In addition to the typeName path parameter, attribute key-value pair(s) can be provided in the following format: attr:&lt;attrName&gt;&#x3D;&lt;attrValue&gt;. NOTE: The attrName and attrValue should be unique across entities, eg. qualifiedName. The REST request would look something like this: PUT /v2/entity/uniqueAttribute/type/aType?attr:aTypeAttribute&#x3D;someValue.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    JsonAtlasEntityWithExtInfo atlasEntityWithExtInfo = new JsonAtlasEntityWithExtInfo(); // JsonAtlasEntityWithExtInfo | Atlas entity with extended information.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      JsonEntityMutationResponse result = apiInstance.entityRESTPartialUpdateEntityByUniqueAttrs(typeName, atlasEntityWithExtInfo, attrColonQualifiedName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTPartialUpdateEntityByUniqueAttrs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **atlasEntityWithExtInfo** | [**JsonAtlasEntityWithExtInfo**](JsonAtlasEntityWithExtInfo.md)| Atlas entity with extended information. |
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

[**JsonEntityMutationResponse**](JsonEntityMutationResponse.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated with EntityMutationResponse. |  -  |

<a name="entityRESTSetClassifications"></a>
# **entityRESTSetClassifications**
> List&lt;String&gt; entityRESTSetClassifications(entityHeaders)



set classifications on entities in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    JsonAtlasEntityHeaders entityHeaders = new JsonAtlasEntityHeaders(); // JsonAtlasEntityHeaders | Atlas entity headers.
    try {
      List<String> result = apiInstance.entityRESTSetClassifications(entityHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTSetClassifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityHeaders** | [**JsonAtlasEntityHeaders**](JsonAtlasEntityHeaders.md)| Atlas entity headers. |

### Return type

**List&lt;String&gt;**

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="entityRESTUpdateClassifications"></a>
# **entityRESTUpdateClassifications**
> entityRESTUpdateClassifications(guid, classifications)



Updates classifications to an existing entity represented by a guid.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    List<JsonAtlasClassification> classifications = Arrays.asList(null); // List<JsonAtlasClassification> | An array of classifications to be updated.
    try {
      apiInstance.entityRESTUpdateClassifications(guid, classifications);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTUpdateClassifications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The globally unique identifier of the entity. |
 **classifications** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md)| An array of classifications to be updated. |

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

<a name="entityRESTUpdateClassificationsByUniqueAttribute"></a>
# **entityRESTUpdateClassificationsByUniqueAttribute**
> entityRESTUpdateClassificationsByUniqueAttribute(typeName, atlasClassificationArray, attrColonQualifiedName)



Updates classification on an entity identified by its type and unique attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntityRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    EntityRestApi apiInstance = new EntityRestApi(defaultClient);
    String typeName = "typeName_example"; // String | The name of the type.
    List<JsonAtlasClassification> atlasClassificationArray = Arrays.asList(null); // List<JsonAtlasClassification> | An array of classification to be updated.
    String attrColonQualifiedName = "attrColonQualifiedName_example"; // String | The qualified name of the entity.
    try {
      apiInstance.entityRESTUpdateClassificationsByUniqueAttribute(typeName, atlasClassificationArray, attrColonQualifiedName);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityRestApi#entityRESTUpdateClassificationsByUniqueAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **String**| The name of the type. |
 **atlasClassificationArray** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md)| An array of classification to be updated. |
 **attrColonQualifiedName** | **String**| The qualified name of the entity. | [optional]

### Return type

null (empty response body)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content. |  -  |

