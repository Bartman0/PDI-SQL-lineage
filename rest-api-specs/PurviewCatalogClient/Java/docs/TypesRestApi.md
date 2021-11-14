# TypesRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**typesRESTCreateAtlasTypeDefs**](TypesRestApi.md#typesRESTCreateAtlasTypeDefs) | **POST** /atlas/v2/types/typedefs | 
[**typesRESTDeleteAtlasTypeByName**](TypesRestApi.md#typesRESTDeleteAtlasTypeByName) | **DELETE** /atlas/v2/types/typedef/name/{name} | Delete API for type identified by its name.
[**typesRESTDeleteAtlasTypeDefs**](TypesRestApi.md#typesRESTDeleteAtlasTypeDefs) | **DELETE** /atlas/v2/types/typedefs | 
[**typesRESTGetAllTypeDefs**](TypesRestApi.md#typesRESTGetAllTypeDefs) | **GET** /atlas/v2/types/typedefs | 
[**typesRESTGetClassificationDefByGuid**](TypesRestApi.md#typesRESTGetClassificationDefByGuid) | **GET** /atlas/v2/types/classificationdef/guid/{guid} | 
[**typesRESTGetClassificationDefByName**](TypesRestApi.md#typesRESTGetClassificationDefByName) | **GET** /atlas/v2/types/classificationdef/name/{name} | 
[**typesRESTGetEntityDefByGuid**](TypesRestApi.md#typesRESTGetEntityDefByGuid) | **GET** /atlas/v2/types/entitydef/guid/{guid} | 
[**typesRESTGetEntityDefByName**](TypesRestApi.md#typesRESTGetEntityDefByName) | **GET** /atlas/v2/types/entitydef/name/{name} | 
[**typesRESTGetEnumDefByGuid**](TypesRestApi.md#typesRESTGetEnumDefByGuid) | **GET** /atlas/v2/types/enumdef/guid/{guid} | 
[**typesRESTGetEnumDefByName**](TypesRestApi.md#typesRESTGetEnumDefByName) | **GET** /atlas/v2/types/enumdef/name/{name} | 
[**typesRESTGetRelationshipDefByGuid**](TypesRestApi.md#typesRESTGetRelationshipDefByGuid) | **GET** /atlas/v2/types/relationshipdef/guid/{guid} | 
[**typesRESTGetRelationshipDefByName**](TypesRestApi.md#typesRESTGetRelationshipDefByName) | **GET** /atlas/v2/types/relationshipdef/name/{name} | 
[**typesRESTGetStructDefByGuid**](TypesRestApi.md#typesRESTGetStructDefByGuid) | **GET** /atlas/v2/types/structdef/guid/{guid} | 
[**typesRESTGetStructDefByName**](TypesRestApi.md#typesRESTGetStructDefByName) | **GET** /atlas/v2/types/structdef/name/{name} | 
[**typesRESTGetTermTemplateDefByGuid**](TypesRestApi.md#typesRESTGetTermTemplateDefByGuid) | **GET** /atlas/v2/types/termtemplatedef/guid/{guid} | 
[**typesRESTGetTermTemplateDefByName**](TypesRestApi.md#typesRESTGetTermTemplateDefByName) | **GET** /atlas/v2/types/termtemplatedef/name/{name} | 
[**typesRESTGetTypeDefByGuid**](TypesRestApi.md#typesRESTGetTypeDefByGuid) | **GET** /atlas/v2/types/typedef/guid/{guid} | 
[**typesRESTGetTypeDefByName**](TypesRestApi.md#typesRESTGetTypeDefByName) | **GET** /atlas/v2/types/typedef/name/{name} | 
[**typesRESTGetTypeDefHeaders**](TypesRestApi.md#typesRESTGetTypeDefHeaders) | **GET** /atlas/v2/types/typedefs/headers | 
[**typesRESTGetTypeStatistics**](TypesRestApi.md#typesRESTGetTypeStatistics) | **GET** /atlas/v2/types/statistics | 
[**typesRESTUpdateAtlasTypeDefs**](TypesRestApi.md#typesRESTUpdateAtlasTypeDefs) | **PUT** /atlas/v2/types/typedefs | 


<a name="typesRESTCreateAtlasTypeDefs"></a>
# **typesRESTCreateAtlasTypeDefs**
> JsonAtlasTypesDef typesRESTCreateAtlasTypeDefs(typesDef)



Creates all atlas type definitions in bulk, only new definitions will be created. Any changes to the existing definitions will be discarded.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    JsonAtlasTypesDef typesDef = new JsonAtlasTypesDef(); // JsonAtlasTypesDef | A composite wrapper object with corresponding lists of the type definition.
    try {
      JsonAtlasTypesDef result = apiInstance.typesRESTCreateAtlasTypeDefs(typesDef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTCreateAtlasTypeDefs");
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
 **typesDef** | [**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)| A composite wrapper object with corresponding lists of the type definition. |

### Return type

[**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful update of requested type definitions. |  -  |
**400** | On validation failure for any type definitions. |  -  |

<a name="typesRESTDeleteAtlasTypeByName"></a>
# **typesRESTDeleteAtlasTypeByName**
> typesRESTDeleteAtlasTypeByName(name)

Delete API for type identified by its name.

Delete API for type identified by its name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the type.
    try {
      apiInstance.typesRESTDeleteAtlasTypeByName(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTDeleteAtlasTypeByName");
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
 **name** | **String**| The name of the type. |

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
**204** | On successful deletion of the requested type definitions |  -  |
**400** | On validation failure for any type definitions |  -  |

<a name="typesRESTDeleteAtlasTypeDefs"></a>
# **typesRESTDeleteAtlasTypeDefs**
> typesRESTDeleteAtlasTypeDefs(typesDef)



Deletes API for all types in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    JsonAtlasTypesDef typesDef = new JsonAtlasTypesDef(); // JsonAtlasTypesDef | A composite object that captures all types to be deleted
    try {
      apiInstance.typesRESTDeleteAtlasTypeDefs(typesDef);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTDeleteAtlasTypeDefs");
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
 **typesDef** | [**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)| A composite object that captures all types to be deleted |

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
**204** | OK. On successful deletion of the requested type definitions. |  -  |
**400** | On validation failure for any type definitions. |  -  |

<a name="typesRESTGetAllTypeDefs"></a>
# **typesRESTGetAllTypeDefs**
> JsonAtlasTypesDef typesRESTGetAllTypeDefs(includeTermTemplate, type)



Gets all type definitions in Atlas in bulk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    Boolean includeTermTemplate = false; // Boolean | Whether include termtemplatedef when return all typedefs. This is always true when search filter type=term_template
    String type = "false"; // String | Typedef name as search filter when get typedefs.
    try {
      JsonAtlasTypesDef result = apiInstance.typesRESTGetAllTypeDefs(includeTermTemplate, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetAllTypeDefs");
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
 **includeTermTemplate** | **Boolean**| Whether include termtemplatedef when return all typedefs. This is always true when search filter type&#x3D;term_template | [optional] [default to false]
 **type** | **String**| Typedef name as search filter when get typedefs. | [optional] [default to false] [enum: enum, entity, classification, relationship, struct, term_template]

### Return type

[**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. AtlasTypesDef with type definitions matching the search criteria or else returns empty list of type definitions. |  -  |

<a name="typesRESTGetClassificationDefByGuid"></a>
# **typesRESTGetClassificationDefByGuid**
> JsonAtlasClassificationDef typesRESTGetClassificationDefByGuid(guid)



Gets the classification definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the classification.
    try {
      JsonAtlasClassificationDef result = apiInstance.typesRESTGetClassificationDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetClassificationDefByGuid");
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
 **guid** | **String**| The globally unique identifier of the classification. |

### Return type

[**JsonAtlasClassificationDef**](JsonAtlasClassificationDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the classification definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetClassificationDefByName"></a>
# **typesRESTGetClassificationDefByName**
> JsonAtlasClassificationDef typesRESTGetClassificationDefByName(name)



Gets the classification definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the classification.
    try {
      JsonAtlasClassificationDef result = apiInstance.typesRESTGetClassificationDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetClassificationDefByName");
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
 **name** | **String**| The name of the classification. |

### Return type

[**JsonAtlasClassificationDef**](JsonAtlasClassificationDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the classification definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetEntityDefByGuid"></a>
# **typesRESTGetEntityDefByGuid**
> JsonAtlasEntityDef typesRESTGetEntityDefByGuid(guid)



Gets the Entity definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    try {
      JsonAtlasEntityDef result = apiInstance.typesRESTGetEntityDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetEntityDefByGuid");
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

[**JsonAtlasEntityDef**](JsonAtlasEntityDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the entity definition by its GUID. |  -  |
**404** | On Failed lookup for the given GUID. |  -  |

<a name="typesRESTGetEntityDefByName"></a>
# **typesRESTGetEntityDefByName**
> JsonAtlasEntityDef typesRESTGetEntityDefByName(name)



Gets the entity definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the entity.
    try {
      JsonAtlasEntityDef result = apiInstance.typesRESTGetEntityDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetEntityDefByName");
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
 **name** | **String**| The name of the entity. |

### Return type

[**JsonAtlasEntityDef**](JsonAtlasEntityDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the entity definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetEnumDefByGuid"></a>
# **typesRESTGetEnumDefByGuid**
> JsonAtlasEnumDef typesRESTGetEnumDefByGuid(guid)



Gets the enum definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the enum.
    try {
      JsonAtlasEnumDef result = apiInstance.typesRESTGetEnumDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetEnumDefByGuid");
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
 **guid** | **String**| The globally unique identifier of the enum. |

### Return type

[**JsonAtlasEnumDef**](JsonAtlasEnumDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the enum definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetEnumDefByName"></a>
# **typesRESTGetEnumDefByName**
> JsonAtlasEnumDef typesRESTGetEnumDefByName(name)



Gets the enum definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the enum.
    try {
      JsonAtlasEnumDef result = apiInstance.typesRESTGetEnumDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetEnumDefByName");
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
 **name** | **String**| The name of the enum. |

### Return type

[**JsonAtlasEnumDef**](JsonAtlasEnumDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the enum definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetRelationshipDefByGuid"></a>
# **typesRESTGetRelationshipDefByGuid**
> JsonAtlasRelationshipDef typesRESTGetRelationshipDefByGuid(guid)



Gets the relationship definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the relationship.
    try {
      JsonAtlasRelationshipDef result = apiInstance.typesRESTGetRelationshipDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetRelationshipDefByGuid");
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

[**JsonAtlasRelationshipDef**](JsonAtlasRelationshipDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the relationship definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetRelationshipDefByName"></a>
# **typesRESTGetRelationshipDefByName**
> JsonAtlasRelationshipDef typesRESTGetRelationshipDefByName(name)



Gets the relationship definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the relationship.
    try {
      JsonAtlasRelationshipDef result = apiInstance.typesRESTGetRelationshipDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetRelationshipDefByName");
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
 **name** | **String**| The name of the relationship. |

### Return type

[**JsonAtlasRelationshipDef**](JsonAtlasRelationshipDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the relationship definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetStructDefByGuid"></a>
# **typesRESTGetStructDefByGuid**
> JsonAtlasStructDef typesRESTGetStructDefByGuid(guid)



Gets the struct definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the struct.
    try {
      JsonAtlasStructDef result = apiInstance.typesRESTGetStructDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetStructDefByGuid");
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
 **guid** | **String**| The globally unique identifier of the struct. |

### Return type

[**JsonAtlasStructDef**](JsonAtlasStructDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the struct definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetStructDefByName"></a>
# **typesRESTGetStructDefByName**
> JsonAtlasStructDef typesRESTGetStructDefByName(name)



Gets the struct definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the struct.
    try {
      JsonAtlasStructDef result = apiInstance.typesRESTGetStructDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetStructDefByName");
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
 **name** | **String**| The name of the struct. |

### Return type

[**JsonAtlasStructDef**](JsonAtlasStructDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the struct definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetTermTemplateDefByGuid"></a>
# **typesRESTGetTermTemplateDefByGuid**
> JsonTermTemplateDef typesRESTGetTermTemplateDefByGuid(guid)



Gets the term template definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the term template.
    try {
      JsonTermTemplateDef result = apiInstance.typesRESTGetTermTemplateDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTermTemplateDefByGuid");
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
 **guid** | **String**| The globally unique identifier of the term template. |

### Return type

[**JsonTermTemplateDef**](JsonTermTemplateDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the term template definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetTermTemplateDefByName"></a>
# **typesRESTGetTermTemplateDefByName**
> JsonTermTemplateDef typesRESTGetTermTemplateDefByName(name)



Gets the term template definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the term template.
    try {
      JsonTermTemplateDef result = apiInstance.typesRESTGetTermTemplateDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTermTemplateDefByName");
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
 **name** | **String**| The name of the term template. |

### Return type

[**JsonTermTemplateDef**](JsonTermTemplateDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the term template definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetTypeDefByGuid"></a>
# **typesRESTGetTypeDefByGuid**
> JsonAtlasBaseTypeDef typesRESTGetTypeDefByGuid(guid)



Gets the type definition for the given GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the type.
    try {
      JsonAtlasBaseTypeDef result = apiInstance.typesRESTGetTypeDefByGuid(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTypeDefByGuid");
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
 **guid** | **String**| The globally unique identifier of the type. |

### Return type

[**JsonAtlasBaseTypeDef**](JsonAtlasBaseTypeDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the type definition by its GUID. |  -  |
**404** | On failed lookup for the given GUID. |  -  |

<a name="typesRESTGetTypeDefByName"></a>
# **typesRESTGetTypeDefByName**
> JsonAtlasBaseTypeDef typesRESTGetTypeDefByName(name)



Gets the type definition by its name (unique).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    String name = "name_example"; // String | The name of the type.
    try {
      JsonAtlasBaseTypeDef result = apiInstance.typesRESTGetTypeDefByName(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTypeDefByName");
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
 **name** | **String**| The name of the type. |

### Return type

[**JsonAtlasBaseTypeDef**](JsonAtlasBaseTypeDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the the type definition by its name. |  -  |
**404** | On failed lookup for the given name. |  -  |

<a name="typesRESTGetTypeDefHeaders"></a>
# **typesRESTGetTypeDefHeaders**
> List&lt;JsonAtlasTypeDefHeader&gt; typesRESTGetTypeDefHeaders(includeTermTemplate, type)



Lists all type definitions returned as a list of minimal information header.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    Boolean includeTermTemplate = false; // Boolean | Whether include termtemplatedef when return all typedefs. This is always true when search filter type=term_template
    String type = "false"; // String | Typedef name as search filter when get typedefs.
    try {
      List<JsonAtlasTypeDefHeader> result = apiInstance.typesRESTGetTypeDefHeaders(includeTermTemplate, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTypeDefHeaders");
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
 **includeTermTemplate** | **Boolean**| Whether include termtemplatedef when return all typedefs. This is always true when search filter type&#x3D;term_template | [optional] [default to false]
 **type** | **String**| Typedef name as search filter when get typedefs. | [optional] [default to false] [enum: enum, entity, classification, relationship, struct, term_template]

### Return type

[**List&lt;JsonAtlasTypeDefHeader&gt;**](JsonAtlasTypeDefHeader.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of AtlasTypeDefHeader matching the search criteria or an empty list if no match. |  -  |

<a name="typesRESTGetTypeStatistics"></a>
# **typesRESTGetTypeStatistics**
> JsonTypeStatistics typesRESTGetTypeStatistics()



Gets type statistics.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    try {
      JsonTypeStatistics result = apiInstance.typesRESTGetTypeStatistics();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTGetTypeStatistics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonTypeStatistics**](JsonTypeStatistics.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful retrieve types and corresponding statistics. |  -  |

<a name="typesRESTUpdateAtlasTypeDefs"></a>
# **typesRESTUpdateAtlasTypeDefs**
> JsonAtlasTypesDef typesRESTUpdateAtlasTypeDefs(typesDef)



Updates all types in bulk, changes detected in the type definitions would be persisted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TypesRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    TypesRestApi apiInstance = new TypesRestApi(defaultClient);
    JsonAtlasTypesDef typesDef = new JsonAtlasTypesDef(); // JsonAtlasTypesDef | A composite object that captures all type definition changes.
    try {
      JsonAtlasTypesDef result = apiInstance.typesRESTUpdateAtlasTypeDefs(typesDef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypesRestApi#typesRESTUpdateAtlasTypeDefs");
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
 **typesDef** | [**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)| A composite object that captures all type definition changes. |

### Return type

[**JsonAtlasTypesDef**](JsonAtlasTypesDef.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful update of requested type definitions. |  -  |
**400** | On validation failure for any type definitions. |  -  |

