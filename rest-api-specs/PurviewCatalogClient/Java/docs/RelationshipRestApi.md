# RelationshipRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationshipRESTCreate**](RelationshipRestApi.md#relationshipRESTCreate) | **POST** /atlas/v2/relationship | 
[**relationshipRESTDeleteById**](RelationshipRestApi.md#relationshipRESTDeleteById) | **DELETE** /atlas/v2/relationship/guid/{guid} | 
[**relationshipRESTGetById2**](RelationshipRestApi.md#relationshipRESTGetById2) | **GET** /atlas/v2/relationship/guid/{guid} | 
[**relationshipRESTUpdate**](RelationshipRestApi.md#relationshipRESTUpdate) | **PUT** /atlas/v2/relationship | 


<a name="relationshipRESTCreate"></a>
# **relationshipRESTCreate**
> JsonAtlasRelationship relationshipRESTCreate(relationship)



Creates a new relationship between entities.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationshipRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipRestApi apiInstance = new RelationshipRestApi(defaultClient);
    JsonAtlasRelationship relationship = new JsonAtlasRelationship(); // JsonAtlasRelationship | The AtlasRelationship object containing the information for the relationship to be created.
    try {
      JsonAtlasRelationship result = apiInstance.relationshipRESTCreate(relationship);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipRestApi#relationshipRESTCreate");
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
 **relationship** | [**JsonAtlasRelationship**](JsonAtlasRelationship.md)| The AtlasRelationship object containing the information for the relationship to be created. |

### Return type

[**JsonAtlasRelationship**](JsonAtlasRelationship.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK. The relationship is created. |  -  |

<a name="relationshipRESTDeleteById"></a>
# **relationshipRESTDeleteById**
> relationshipRESTDeleteById(guid)



Deletes a relationship between entities by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationshipRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipRestApi apiInstance = new RelationshipRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the relationship.
    try {
      apiInstance.relationshipRESTDeleteById(guid);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipRestApi#relationshipRESTDeleteById");
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
 **guid** | **String**| The globally unique identifier of the relationship. |

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
**204** | OK. The relationship is deleted. |  -  |

<a name="relationshipRESTGetById2"></a>
# **relationshipRESTGetById2**
> JsonAtlasRelationshipWithExtInfo relationshipRESTGetById2(guid, extendedInfo)



Gets relationship information between entities by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationshipRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipRestApi apiInstance = new RelationshipRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the relationship.
    Boolean extendedInfo = true; // Boolean | Limits whether includes extended information.
    try {
      JsonAtlasRelationshipWithExtInfo result = apiInstance.relationshipRESTGetById2(guid, extendedInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipRestApi#relationshipRESTGetById2");
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
 **guid** | **String**| The globally unique identifier of the relationship. |
 **extendedInfo** | **Boolean**| Limits whether includes extended information. | [optional]

### Return type

[**JsonAtlasRelationshipWithExtInfo**](JsonAtlasRelationshipWithExtInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |

<a name="relationshipRESTUpdate"></a>
# **relationshipRESTUpdate**
> JsonAtlasRelationship relationshipRESTUpdate(relationship)



Updates an existing relationship between entities.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationshipRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipRestApi apiInstance = new RelationshipRestApi(defaultClient);
    JsonAtlasRelationship relationship = new JsonAtlasRelationship(); // JsonAtlasRelationship | The AtlasRelationship object containing the information for the relationship to be created.
    try {
      JsonAtlasRelationship result = apiInstance.relationshipRESTUpdate(relationship);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipRestApi#relationshipRESTUpdate");
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
 **relationship** | [**JsonAtlasRelationship**](JsonAtlasRelationship.md)| The AtlasRelationship object containing the information for the relationship to be created. |

### Return type

[**JsonAtlasRelationship**](JsonAtlasRelationship.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | OK. The relationship is updated. |  -  |

