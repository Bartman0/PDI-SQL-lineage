# GlossaryRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossaryRESTAssignTermToEntities**](GlossaryRestApi.md#glossaryRESTAssignTermToEntities) | **POST** /atlas/v2/glossary/terms/{termGuid}/assignedEntities | 
[**glossaryRESTCreateGlossary**](GlossaryRestApi.md#glossaryRESTCreateGlossary) | **POST** /atlas/v2/glossary | 
[**glossaryRESTCreateGlossaryCategories**](GlossaryRestApi.md#glossaryRESTCreateGlossaryCategories) | **POST** /atlas/v2/glossary/categories | 
[**glossaryRESTCreateGlossaryCategory**](GlossaryRestApi.md#glossaryRESTCreateGlossaryCategory) | **POST** /atlas/v2/glossary/category | 
[**glossaryRESTCreateGlossaryTerm**](GlossaryRestApi.md#glossaryRESTCreateGlossaryTerm) | **POST** /atlas/v2/glossary/term | 
[**glossaryRESTCreateGlossaryTerms**](GlossaryRestApi.md#glossaryRESTCreateGlossaryTerms) | **POST** /atlas/v2/glossary/terms | 
[**glossaryRESTDeleteGlossary**](GlossaryRestApi.md#glossaryRESTDeleteGlossary) | **DELETE** /atlas/v2/glossary/{glossaryGuid} | 
[**glossaryRESTDeleteGlossaryCategory**](GlossaryRestApi.md#glossaryRESTDeleteGlossaryCategory) | **DELETE** /atlas/v2/glossary/category/{categoryGuid} | 
[**glossaryRESTDeleteGlossaryTerm**](GlossaryRestApi.md#glossaryRESTDeleteGlossaryTerm) | **DELETE** /atlas/v2/glossary/term/{termGuid} | 
[**glossaryRESTDeleteTermAssignmentFromEntities**](GlossaryRestApi.md#glossaryRESTDeleteTermAssignmentFromEntities) | **DELETE** /atlas/v2/glossary/terms/{termGuid}/assignedEntities | 
[**glossaryRESTExportGlossaryTermsAsCSV**](GlossaryRestApi.md#glossaryRESTExportGlossaryTermsAsCSV) | **POST** /atlas/v2/glossary/{glossaryGuid}/terms/export | 
[**glossaryRESTGetCategoryTerms**](GlossaryRestApi.md#glossaryRESTGetCategoryTerms) | **GET** /atlas/v2/glossary/category/{categoryGuid}/terms | 
[**glossaryRESTGetDetailedGlossary**](GlossaryRestApi.md#glossaryRESTGetDetailedGlossary) | **GET** /atlas/v2/glossary/{glossaryGuid}/detailed | 
[**glossaryRESTGetEntitiesAssignedWithTerm**](GlossaryRestApi.md#glossaryRESTGetEntitiesAssignedWithTerm) | **GET** /atlas/v2/glossary/terms/{termGuid}/assignedEntities | 
[**glossaryRESTGetGlossaries**](GlossaryRestApi.md#glossaryRESTGetGlossaries) | **GET** /atlas/v2/glossary | 
[**glossaryRESTGetGlossary**](GlossaryRestApi.md#glossaryRESTGetGlossary) | **GET** /atlas/v2/glossary/{glossaryGuid} | 
[**glossaryRESTGetGlossaryCategories**](GlossaryRestApi.md#glossaryRESTGetGlossaryCategories) | **GET** /atlas/v2/glossary/{glossaryGuid}/categories | 
[**glossaryRESTGetGlossaryCategoriesHeaders**](GlossaryRestApi.md#glossaryRESTGetGlossaryCategoriesHeaders) | **GET** /atlas/v2/glossary/{glossaryGuid}/categories/headers | 
[**glossaryRESTGetGlossaryCategory**](GlossaryRestApi.md#glossaryRESTGetGlossaryCategory) | **GET** /atlas/v2/glossary/category/{categoryGuid} | 
[**glossaryRESTGetGlossaryTerm**](GlossaryRestApi.md#glossaryRESTGetGlossaryTerm) | **GET** /atlas/v2/glossary/term/{termGuid} | 
[**glossaryRESTGetGlossaryTermHeaders**](GlossaryRestApi.md#glossaryRESTGetGlossaryTermHeaders) | **GET** /atlas/v2/glossary/{glossaryGuid}/terms/headers | 
[**glossaryRESTGetGlossaryTerms**](GlossaryRestApi.md#glossaryRESTGetGlossaryTerms) | **GET** /atlas/v2/glossary/{glossaryGuid}/terms | 
[**glossaryRESTGetImportCSVOperationStatus**](GlossaryRestApi.md#glossaryRESTGetImportCSVOperationStatus) | **GET** /atlas/v2/glossary/terms/import/{operationGuid} | 
[**glossaryRESTGetRelatedCategories**](GlossaryRestApi.md#glossaryRESTGetRelatedCategories) | **GET** /atlas/v2/glossary/category/{categoryGuid}/related | 
[**glossaryRESTGetRelatedTerms**](GlossaryRestApi.md#glossaryRESTGetRelatedTerms) | **GET** /atlas/v2/glossary/terms/{termGuid}/related | 
[**glossaryRESTGetTermsByGlossaryName**](GlossaryRestApi.md#glossaryRESTGetTermsByGlossaryName) | **GET** /atlas/v2/glossary/name/{glossaryName}/terms | 
[**glossaryRESTImportGlossaryTermsViaCSV**](GlossaryRestApi.md#glossaryRESTImportGlossaryTermsViaCSV) | **POST** /atlas/v2/glossary/{glossaryGuid}/terms/import | 
[**glossaryRESTImportGlossaryTermsViaCSVByGlossaryName**](GlossaryRestApi.md#glossaryRESTImportGlossaryTermsViaCSVByGlossaryName) | **POST** /atlas/v2/glossary/name/{glossaryName}/terms/import | 
[**glossaryRESTPartialUpdateGlossary**](GlossaryRestApi.md#glossaryRESTPartialUpdateGlossary) | **PUT** /atlas/v2/glossary/{glossaryGuid}/partial | 
[**glossaryRESTPartialUpdateGlossaryCategory**](GlossaryRestApi.md#glossaryRESTPartialUpdateGlossaryCategory) | **PUT** /atlas/v2/glossary/category/{categoryGuid}/partial | 
[**glossaryRESTPartialUpdateGlossaryTerm**](GlossaryRestApi.md#glossaryRESTPartialUpdateGlossaryTerm) | **PUT** /atlas/v2/glossary/term/{termGuid}/partial | 
[**glossaryRESTRemoveTermAssignmentFromEntities**](GlossaryRestApi.md#glossaryRESTRemoveTermAssignmentFromEntities) | **PUT** /atlas/v2/glossary/terms/{termGuid}/assignedEntities | 
[**glossaryRESTUpdateGlossary**](GlossaryRestApi.md#glossaryRESTUpdateGlossary) | **PUT** /atlas/v2/glossary/{glossaryGuid} | 
[**glossaryRESTUpdateGlossaryCategory**](GlossaryRestApi.md#glossaryRESTUpdateGlossaryCategory) | **PUT** /atlas/v2/glossary/category/{categoryGuid} | 
[**glossaryRESTUpdateGlossaryTerm**](GlossaryRestApi.md#glossaryRESTUpdateGlossaryTerm) | **PUT** /atlas/v2/glossary/term/{termGuid} | 


<a name="glossaryRESTAssignTermToEntities"></a>
# **glossaryRESTAssignTermToEntities**
> glossaryRESTAssignTermToEntities(termGuid, relatedObjectIds)



Assigns the given term to the provided list of related objects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    List<JsonAtlasRelatedObjectId> relatedObjectIds = Arrays.asList(null); // List<JsonAtlasRelatedObjectId> | An array of related object IDs to which the term has to be associated.
    try {
      apiInstance.glossaryRESTAssignTermToEntities(termGuid, relatedObjectIds);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTAssignTermToEntities");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **relatedObjectIds** | [**List&lt;JsonAtlasRelatedObjectId&gt;**](JsonAtlasRelatedObjectId.md)| An array of related object IDs to which the term has to be associated. |

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
**204** | OK. If the term assignment was successful. |  -  |
**400** | If ANY of the related objects is invalid. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTCreateGlossary"></a>
# **glossaryRESTCreateGlossary**
> JsonAtlasGlossary glossaryRESTCreateGlossary(atlasGlossary)



Creates a glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    JsonAtlasGlossary atlasGlossary = new JsonAtlasGlossary(); // JsonAtlasGlossary | Glossary definition, terms & categories can be anchored to a glossary. Using the anchor attribute when creating the Term/Category.
    try {
      JsonAtlasGlossary result = apiInstance.glossaryRESTCreateGlossary(atlasGlossary);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTCreateGlossary");
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
 **atlasGlossary** | [**JsonAtlasGlossary**](JsonAtlasGlossary.md)| Glossary definition, terms &amp; categories can be anchored to a glossary. Using the anchor attribute when creating the Term/Category. |

### Return type

[**JsonAtlasGlossary**](JsonAtlasGlossary.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary creation was successful. |  -  |
**400** | If glossary definition has invalid or missing information. |  -  |
**409** | If glossary definition already exists (duplicate qualifiedName). |  -  |

<a name="glossaryRESTCreateGlossaryCategories"></a>
# **glossaryRESTCreateGlossaryCategories**
> List&lt;JsonAtlasGlossaryCategory&gt; glossaryRESTCreateGlossaryCategories(glossaryCategory)



Creates glossary category in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    List<JsonAtlasGlossaryCategory> glossaryCategory = Arrays.asList(null); // List<JsonAtlasGlossaryCategory> | An array of glossary category definitions to be created.
    try {
      List<JsonAtlasGlossaryCategory> result = apiInstance.glossaryRESTCreateGlossaryCategories(glossaryCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTCreateGlossaryCategories");
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
 **glossaryCategory** | [**List&lt;JsonAtlasGlossaryCategory&gt;**](JsonAtlasGlossaryCategory.md)| An array of glossary category definitions to be created. |

### Return type

[**List&lt;JsonAtlasGlossaryCategory&gt;**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If bulk glossary category creation was successful. |  -  |
**400** | If ANY glossary category definition has invalid or missing information. |  -  |

<a name="glossaryRESTCreateGlossaryCategory"></a>
# **glossaryRESTCreateGlossaryCategory**
> JsonAtlasGlossaryCategory glossaryRESTCreateGlossaryCategory(glossaryCategory)



Creates a glossary category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    JsonAtlasGlossaryCategory glossaryCategory = new JsonAtlasGlossaryCategory(); // JsonAtlasGlossaryCategory | The glossary category definition. A category must be anchored to a Glossary when creating. Optionally, terms belonging to the category and the hierarchy can also be defined during creation.
    try {
      JsonAtlasGlossaryCategory result = apiInstance.glossaryRESTCreateGlossaryCategory(glossaryCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTCreateGlossaryCategory");
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
 **glossaryCategory** | [**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)| The glossary category definition. A category must be anchored to a Glossary when creating. Optionally, terms belonging to the category and the hierarchy can also be defined during creation. |

### Return type

[**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary category creation was successful. |  -  |
**400** | If glossary category definition has invalid or missing information. |  -  |
**409** | If glossary category already exists (duplicate qualifiedName). |  -  |

<a name="glossaryRESTCreateGlossaryTerm"></a>
# **glossaryRESTCreateGlossaryTerm**
> JsonAtlasGlossaryTerm glossaryRESTCreateGlossaryTerm(glossaryTerm)



Creates a glossary term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    JsonAtlasGlossaryTerm glossaryTerm = new JsonAtlasGlossaryTerm(); // JsonAtlasGlossaryTerm | The glossary term definition. A term must be anchored to a Glossary at the time of creation. Optionally it can be categorized as well.
    try {
      JsonAtlasGlossaryTerm result = apiInstance.glossaryRESTCreateGlossaryTerm(glossaryTerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTCreateGlossaryTerm");
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
 **glossaryTerm** | [**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)| The glossary term definition. A term must be anchored to a Glossary at the time of creation. Optionally it can be categorized as well. |

### Return type

[**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary term creation was successful. |  -  |
**400** | If glossary term definition has invalid or missing information. |  -  |
**409** | If glossary term already exists (duplicate qualifiedName). |  -  |

<a name="glossaryRESTCreateGlossaryTerms"></a>
# **glossaryRESTCreateGlossaryTerms**
> List&lt;JsonAtlasGlossaryTerm&gt; glossaryRESTCreateGlossaryTerms(glossaryTerm)



Creates glossary terms in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    List<JsonAtlasGlossaryTerm> glossaryTerm = Arrays.asList(null); // List<JsonAtlasGlossaryTerm> | An array of glossary term definitions to be created in bulk.
    try {
      List<JsonAtlasGlossaryTerm> result = apiInstance.glossaryRESTCreateGlossaryTerms(glossaryTerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTCreateGlossaryTerms");
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
 **glossaryTerm** | [**List&lt;JsonAtlasGlossaryTerm&gt;**](JsonAtlasGlossaryTerm.md)| An array of glossary term definitions to be created in bulk. |

### Return type

[**List&lt;JsonAtlasGlossaryTerm&gt;**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If bulk glossary terms creation was successful. |  -  |
**400** | If any glossary term definition has invalid or missing information. |  -  |

<a name="glossaryRESTDeleteGlossary"></a>
# **glossaryRESTDeleteGlossary**
> glossaryRESTDeleteGlossary(glossaryGuid)



Deletes a glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    try {
      apiInstance.glossaryRESTDeleteGlossary(glossaryGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTDeleteGlossary");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |

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
**204** | OK. If glossary delete was successful. |  -  |
**404** | If glossary GUID in invalid. |  -  |

<a name="glossaryRESTDeleteGlossaryCategory"></a>
# **glossaryRESTDeleteGlossaryCategory**
> glossaryRESTDeleteGlossaryCategory(categoryGuid)



Deletes a glossary category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    try {
      apiInstance.glossaryRESTDeleteGlossaryCategory(categoryGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTDeleteGlossaryCategory");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |

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
**204** | OK. If glossary category delete was successful. |  -  |
**404** | If glossary category GUID is invalid. |  -  |

<a name="glossaryRESTDeleteGlossaryTerm"></a>
# **glossaryRESTDeleteGlossaryTerm**
> glossaryRESTDeleteGlossaryTerm(termGuid)



Deletes a glossary term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    try {
      apiInstance.glossaryRESTDeleteGlossaryTerm(termGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTDeleteGlossaryTerm");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |

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
**204** | OK. If glossary term delete was successful. |  -  |
**404** | If glossary term guid in invalid. |  -  |

<a name="glossaryRESTDeleteTermAssignmentFromEntities"></a>
# **glossaryRESTDeleteTermAssignmentFromEntities**
> glossaryRESTDeleteTermAssignmentFromEntities(termGuid, relatedObjectIds)



Deletes the term assignment for the given list of related objects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    List<JsonAtlasRelatedObjectId> relatedObjectIds = Arrays.asList(null); // List<JsonAtlasRelatedObjectId> | An array of related object IDs from which the term has to be dissociated.
    try {
      apiInstance.glossaryRESTDeleteTermAssignmentFromEntities(termGuid, relatedObjectIds);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTDeleteTermAssignmentFromEntities");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **relatedObjectIds** | [**List&lt;JsonAtlasRelatedObjectId&gt;**](JsonAtlasRelatedObjectId.md)| An array of related object IDs from which the term has to be dissociated. |

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
**204** | OK. If glossary term dissociation was successful. |  -  |
**400** | If ANY of the related objects is invalid. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTExportGlossaryTermsAsCSV"></a>
# **glossaryRESTExportGlossaryTermsAsCSV**
> glossaryRESTExportGlossaryTermsAsCSV(glossaryGuid, termGuids)



Export Glossary Terms as csv file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    List<String> termGuids = Arrays.asList(); // List<String> | An array of term guids.
    try {
      apiInstance.glossaryRESTExportGlossaryTermsAsCSV(glossaryGuid, termGuids);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTExportGlossaryTermsAsCSV");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **termGuids** | [**List&lt;String&gt;**](String.md)| An array of term guids. |

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
**200** | OK. A csv file contains terms with given term ids will be generated. |  -  |
**400** | If term ids is not belong to the glossary guid |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetCategoryTerms"></a>
# **glossaryRESTGetCategoryTerms**
> List&lt;JsonAtlasRelatedTermHeader&gt; glossaryRESTGetCategoryTerms(categoryGuid, limit, offset, sort)



Gets all terms associated with the specific category.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasRelatedTermHeader> result = apiInstance.glossaryRESTGetCategoryTerms(categoryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetCategoryTerms");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of terms for the given category or an empty list. |  -  |
**404** | If glossary category GUID is invalid. |  -  |

<a name="glossaryRESTGetDetailedGlossary"></a>
# **glossaryRESTGetDetailedGlossary**
> JsonAtlasGlossaryExtInfo glossaryRESTGetDetailedGlossary(glossaryGuid)



Gets a specific glossary with detailed information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    try {
      JsonAtlasGlossaryExtInfo result = apiInstance.glossaryRESTGetDetailedGlossary(glossaryGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetDetailedGlossary");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |

### Return type

[**JsonAtlasGlossaryExtInfo**](JsonAtlasGlossaryExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary exists for given GUID. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetEntitiesAssignedWithTerm"></a>
# **glossaryRESTGetEntitiesAssignedWithTerm**
> List&lt;JsonAtlasRelatedObjectId&gt; glossaryRESTGetEntitiesAssignedWithTerm(termGuid, limit, offset, sort)



Gets all related objects assigned with the specified term.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasRelatedObjectId> result = apiInstance.glossaryRESTGetEntitiesAssignedWithTerm(termGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetEntitiesAssignedWithTerm");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasRelatedObjectId&gt;**](JsonAtlasRelatedObjectId.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of related objects (if any) for the given glossary or an empty list. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaries"></a>
# **glossaryRESTGetGlossaries**
> List&lt;JsonAtlasGlossary&gt; glossaryRESTGetGlossaries(limit, offset, sort)



Gets all glossaries registered with Atlas.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasGlossary> result = apiInstance.glossaryRESTGetGlossaries(limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaries");
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
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasGlossary&gt;**](JsonAtlasGlossary.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of existing glossaries fitting the search criteria or empty list if nothing matches. |  -  |

<a name="glossaryRESTGetGlossary"></a>
# **glossaryRESTGetGlossary**
> JsonAtlasGlossary glossaryRESTGetGlossary(glossaryGuid)



Gets a specific Glossary by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    try {
      JsonAtlasGlossary result = apiInstance.glossaryRESTGetGlossary(glossaryGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossary");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |

### Return type

[**JsonAtlasGlossary**](JsonAtlasGlossary.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary with given guid exists. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaryCategories"></a>
# **glossaryRESTGetGlossaryCategories**
> List&lt;JsonAtlasGlossaryCategory&gt; glossaryRESTGetGlossaryCategories(glossaryGuid, limit, offset, sort)



Gets the categories belonging to a specific glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasGlossaryCategory> result = apiInstance.glossaryRESTGetGlossaryCategories(glossaryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryCategories");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasGlossaryCategory&gt;**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of glossary categories for the given glossary or an empty list. |  -  |
**404** | If glossary guid is invalid. |  -  |

<a name="glossaryRESTGetGlossaryCategoriesHeaders"></a>
# **glossaryRESTGetGlossaryCategoriesHeaders**
> List&lt;JsonAtlasRelatedCategoryHeader&gt; glossaryRESTGetGlossaryCategoriesHeaders(glossaryGuid, limit, offset, sort)



Gets the category headers belonging to a specific glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasRelatedCategoryHeader> result = apiInstance.glossaryRESTGetGlossaryCategoriesHeaders(glossaryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryCategoriesHeaders");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasRelatedCategoryHeader&gt;**](JsonAtlasRelatedCategoryHeader.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of glossary category headers for the given glossary or an empty list. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaryCategory"></a>
# **glossaryRESTGetGlossaryCategory**
> JsonAtlasGlossaryCategory glossaryRESTGetGlossaryCategory(categoryGuid)



Gets specific glossary category by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    try {
      JsonAtlasGlossaryCategory result = apiInstance.glossaryRESTGetGlossaryCategory(categoryGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryCategory");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |

### Return type

[**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary category exists for given GUID. |  -  |
**404** | If glossary category GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaryTerm"></a>
# **glossaryRESTGetGlossaryTerm**
> JsonAtlasGlossaryTerm glossaryRESTGetGlossaryTerm(termGuid)



Gets a specific glossary term by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    try {
      JsonAtlasGlossaryTerm result = apiInstance.glossaryRESTGetGlossaryTerm(termGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryTerm");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |

### Return type

[**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary term exists for given GUID. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaryTermHeaders"></a>
# **glossaryRESTGetGlossaryTermHeaders**
> List&lt;JsonAtlasRelatedTermHeader&gt; glossaryRESTGetGlossaryTermHeaders(glossaryGuid, limit, offset, sort)



Gets term headers belonging to a specific glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasRelatedTermHeader> result = apiInstance.glossaryRESTGetGlossaryTermHeaders(glossaryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryTermHeaders");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of glossary terms for the given glossary or an empty list. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetGlossaryTerms"></a>
# **glossaryRESTGetGlossaryTerms**
> List&lt;JsonAtlasGlossaryTerm&gt; glossaryRESTGetGlossaryTerms(glossaryGuid, limit, offset, sort)



Gets terms belonging to a specific glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      List<JsonAtlasGlossaryTerm> result = apiInstance.glossaryRESTGetGlossaryTerms(glossaryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetGlossaryTerms");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**List&lt;JsonAtlasGlossaryTerm&gt;**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of glossary terms for the given glossary or an empty list. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTGetImportCSVOperationStatus"></a>
# **glossaryRESTGetImportCSVOperationStatus**
> JsonImportCSVOperation glossaryRESTGetImportCSVOperationStatus(operationGuid)



Get the status of import csv operation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String operationGuid = "operationGuid_example"; // String | The globally unique identifier for async operation/job`.
    try {
      JsonImportCSVOperation result = apiInstance.glossaryRESTGetImportCSVOperationStatus(operationGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetImportCSVOperationStatus");
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
 **operationGuid** | **String**| The globally unique identifier for async operation/job&#x60;. |

### Return type

[**JsonImportCSVOperation**](JsonImportCSVOperation.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. Return the status of import csv operation. |  -  |
**404** | If operation GUID is invalid. |  -  |

<a name="glossaryRESTGetRelatedCategories"></a>
# **glossaryRESTGetRelatedCategories**
> Map&lt;String, List&lt;JsonAtlasRelatedCategoryHeader&gt;&gt; glossaryRESTGetRelatedCategories(categoryGuid, limit, offset, sort)



Gets all related categories (parent and children). Limit, offset, and sort parameters are currently not being enabled and won&#39;t work even they are passed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      Map<String, List<JsonAtlasRelatedCategoryHeader>> result = apiInstance.glossaryRESTGetRelatedCategories(categoryGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetRelatedCategories");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**Map&lt;String, List&lt;JsonAtlasRelatedCategoryHeader&gt;&gt;**](List.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. Gets an array of related categories. |  -  |

<a name="glossaryRESTGetRelatedTerms"></a>
# **glossaryRESTGetRelatedTerms**
> Map&lt;String, List&lt;JsonAtlasRelatedTermHeader&gt;&gt; glossaryRESTGetRelatedTerms(termGuid, limit, offset, sort)



Gets all related terms for a specific term by its GUID. Limit, offset, and sort parameters are currently not being enabled and won&#39;t work even they are passed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    String sort = "\"ASC\""; // String | The sort order, ASC (default) or DESC.
    try {
      Map<String, List<JsonAtlasRelatedTermHeader>> result = apiInstance.glossaryRESTGetRelatedTerms(termGuid, limit, offset, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetRelatedTerms");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **sort** | **String**| The sort order, ASC (default) or DESC. | [optional] [default to &quot;ASC&quot;]

### Return type

[**Map&lt;String, List&lt;JsonAtlasRelatedTermHeader&gt;&gt;**](List.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of related glossary terms for the given glossary or an empty list. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTGetTermsByGlossaryName"></a>
# **glossaryRESTGetTermsByGlossaryName**
> List&lt;JsonAtlasGlossaryTerm&gt; glossaryRESTGetTermsByGlossaryName(glossaryName, limit, offset)



Gets terms by glossary name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryName = "glossaryName_example"; // String | The name of the glossary.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    Integer offset = 56; // Integer | The offset for pagination purpose.
    try {
      List<JsonAtlasGlossaryTerm> result = apiInstance.glossaryRESTGetTermsByGlossaryName(glossaryName, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTGetTermsByGlossaryName");
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
 **glossaryName** | **String**| The name of the glossary. |
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]

### Return type

[**List&lt;JsonAtlasGlossaryTerm&gt;**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. An array of glossary terms for the given glossary or an empty list. |  -  |

<a name="glossaryRESTImportGlossaryTermsViaCSV"></a>
# **glossaryRESTImportGlossaryTermsViaCSV**
> JsonImportCSVOperation glossaryRESTImportGlossaryTermsViaCSV(glossaryGuid, file)



Import Glossary Terms from local csv file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    File file = new File("\"Name,Definition,Status,Related Terms,Synonyms,Acronym,Experts,Stewards\""); // File | The csv file to import glossary terms from.
    try {
      JsonImportCSVOperation result = apiInstance.glossaryRESTImportGlossaryTermsViaCSV(glossaryGuid, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTImportGlossaryTermsViaCSV");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **file** | **File**| The csv file to import glossary terms from. | [default to &quot;Name,Definition,Status,Related Terms,Synonyms,Acronym,Experts,Stewards&quot;]

### Return type

[**JsonImportCSVOperation**](JsonImportCSVOperation.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted. A job to import glossary terms via csv has been accepted. |  -  |
**400** | If csv file is not valid |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTImportGlossaryTermsViaCSVByGlossaryName"></a>
# **glossaryRESTImportGlossaryTermsViaCSVByGlossaryName**
> JsonImportCSVOperation glossaryRESTImportGlossaryTermsViaCSVByGlossaryName(glossaryName, file)



Import Glossary Terms from local csv file by glossaryName

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryName = "glossaryName_example"; // String | The name of the glossary.
    File file = new File("\"Name,Definition,Status,Related Terms,Synonyms,Acronym,Experts,Stewards\""); // File | The csv file to import glossary terms from.
    try {
      JsonImportCSVOperation result = apiInstance.glossaryRESTImportGlossaryTermsViaCSVByGlossaryName(glossaryName, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTImportGlossaryTermsViaCSVByGlossaryName");
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
 **glossaryName** | **String**| The name of the glossary. |
 **file** | **File**| The csv file to import glossary terms from. | [default to &quot;Name,Definition,Status,Related Terms,Synonyms,Acronym,Experts,Stewards&quot;]

### Return type

[**JsonImportCSVOperation**](JsonImportCSVOperation.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted. A job to import glossary terms via csv has been accepted. |  -  |
**400** | If csv file is not valid |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTPartialUpdateGlossary"></a>
# **glossaryRESTPartialUpdateGlossary**
> JsonAtlasGlossary glossaryRESTPartialUpdateGlossary(glossaryGuid, partialUpdates)



Updates the glossary partially. Some properties such as qualifiedName are not allowed to be updated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    Map<String, String> partialUpdates = new HashMap(); // Map<String, String> | A map containing keys as attribute names and values as corresponding attribute values.
    try {
      JsonAtlasGlossary result = apiInstance.glossaryRESTPartialUpdateGlossary(glossaryGuid, partialUpdates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTPartialUpdateGlossary");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **partialUpdates** | [**Map&lt;String, String&gt;**](String.md)| A map containing keys as attribute names and values as corresponding attribute values. |

### Return type

[**JsonAtlasGlossary**](JsonAtlasGlossary.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary partial update was successful. |  -  |
**400** | If partial update parameters are invalid. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTPartialUpdateGlossaryCategory"></a>
# **glossaryRESTPartialUpdateGlossaryCategory**
> JsonAtlasGlossaryCategory glossaryRESTPartialUpdateGlossaryCategory(categoryGuid, partialUpdates)



Updates the glossary category partially.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    Map<String, String> partialUpdates = new HashMap(); // Map<String, String> | A map containing keys as attribute names and values as corresponding attribute values for partial update.
    try {
      JsonAtlasGlossaryCategory result = apiInstance.glossaryRESTPartialUpdateGlossaryCategory(categoryGuid, partialUpdates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTPartialUpdateGlossaryCategory");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |
 **partialUpdates** | [**Map&lt;String, String&gt;**](String.md)| A map containing keys as attribute names and values as corresponding attribute values for partial update. |

### Return type

[**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary category partial update was successful. |  -  |
**400** | If category attributes are invalid. |  -  |
**404** | If glossary category GUID is invalid. |  -  |

<a name="glossaryRESTPartialUpdateGlossaryTerm"></a>
# **glossaryRESTPartialUpdateGlossaryTerm**
> JsonAtlasGlossaryTerm glossaryRESTPartialUpdateGlossaryTerm(termGuid, partialUpdates)



Updates the glossary term partially.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    Map<String, String> partialUpdates = new HashMap(); // Map<String, String> | A map containing keys as attribute names and values as corresponding attribute values to be updated.
    try {
      JsonAtlasGlossaryTerm result = apiInstance.glossaryRESTPartialUpdateGlossaryTerm(termGuid, partialUpdates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTPartialUpdateGlossaryTerm");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **partialUpdates** | [**Map&lt;String, String&gt;**](String.md)| A map containing keys as attribute names and values as corresponding attribute values to be updated. |

### Return type

[**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary partial update was successful. |  -  |
**400** | If partial attributes are invalid. |  -  |
**404** | If glossary term guid in invalid. |  -  |

<a name="glossaryRESTRemoveTermAssignmentFromEntities"></a>
# **glossaryRESTRemoveTermAssignmentFromEntities**
> glossaryRESTRemoveTermAssignmentFromEntities(termGuid, relatedObjectIds)



Deletes the term assignment for the given list of related objects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    List<JsonAtlasRelatedObjectId> relatedObjectIds = Arrays.asList(null); // List<JsonAtlasRelatedObjectId> | An array of related object IDs from which the term has to be dissociated.
    try {
      apiInstance.glossaryRESTRemoveTermAssignmentFromEntities(termGuid, relatedObjectIds);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTRemoveTermAssignmentFromEntities");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **relatedObjectIds** | [**List&lt;JsonAtlasRelatedObjectId&gt;**](JsonAtlasRelatedObjectId.md)| An array of related object IDs from which the term has to be dissociated. |

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
**204** | OK. If glossary term dissociation was successful. |  -  |
**400** | If ANY of the related objects is invalid. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

<a name="glossaryRESTUpdateGlossary"></a>
# **glossaryRESTUpdateGlossary**
> JsonAtlasGlossary glossaryRESTUpdateGlossary(glossaryGuid, updatedGlossary)



Updates the given glossary.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String glossaryGuid = "glossaryGuid_example"; // String | The globally unique identifier for glossary.
    JsonAtlasGlossary updatedGlossary = new JsonAtlasGlossary(); // JsonAtlasGlossary | The glossary definition to be updated.
    try {
      JsonAtlasGlossary result = apiInstance.glossaryRESTUpdateGlossary(glossaryGuid, updatedGlossary);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTUpdateGlossary");
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
 **glossaryGuid** | **String**| The globally unique identifier for glossary. |
 **updatedGlossary** | [**JsonAtlasGlossary**](JsonAtlasGlossary.md)| The glossary definition to be updated. |

### Return type

[**JsonAtlasGlossary**](JsonAtlasGlossary.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary update was successful. |  -  |
**400** | If glossary definition has invalid or missing information. |  -  |
**404** | If glossary GUID is invalid. |  -  |

<a name="glossaryRESTUpdateGlossaryCategory"></a>
# **glossaryRESTUpdateGlossaryCategory**
> JsonAtlasGlossaryCategory glossaryRESTUpdateGlossaryCategory(categoryGuid, glossaryCategory)



Updates the given glossary category by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String categoryGuid = "categoryGuid_example"; // String | The globally unique identifier of the category.
    JsonAtlasGlossaryCategory glossaryCategory = new JsonAtlasGlossaryCategory(); // JsonAtlasGlossaryCategory | The glossary category to be updated.
    try {
      JsonAtlasGlossaryCategory result = apiInstance.glossaryRESTUpdateGlossaryCategory(categoryGuid, glossaryCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTUpdateGlossaryCategory");
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
 **categoryGuid** | **String**| The globally unique identifier of the category. |
 **glossaryCategory** | [**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)| The glossary category to be updated. |

### Return type

[**JsonAtlasGlossaryCategory**](JsonAtlasGlossaryCategory.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary category partial update was successful. |  -  |
**400** | If glossary category definition has invalid or missing information. |  -  |
**404** | If glossary category GUID is invalid. |  -  |

<a name="glossaryRESTUpdateGlossaryTerm"></a>
# **glossaryRESTUpdateGlossaryTerm**
> JsonAtlasGlossaryTerm glossaryRESTUpdateGlossaryTerm(termGuid, glossaryTerm)



Updates the given glossary term by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlossaryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    GlossaryRestApi apiInstance = new GlossaryRestApi(defaultClient);
    String termGuid = "termGuid_example"; // String | The globally unique identifier for glossary term.
    JsonAtlasGlossaryTerm glossaryTerm = new JsonAtlasGlossaryTerm(); // JsonAtlasGlossaryTerm | The glossary term to be updated.
    try {
      JsonAtlasGlossaryTerm result = apiInstance.glossaryRESTUpdateGlossaryTerm(termGuid, glossaryTerm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryRestApi#glossaryRESTUpdateGlossaryTerm");
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
 **termGuid** | **String**| The globally unique identifier for glossary term. |
 **glossaryTerm** | [**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)| The glossary term to be updated. |

### Return type

[**JsonAtlasGlossaryTerm**](JsonAtlasGlossaryTerm.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If glossary term update was successful. |  -  |
**400** | If glossary temr definition has invalid or missing information. |  -  |
**404** | If glossary term GUID is invalid. |  -  |

