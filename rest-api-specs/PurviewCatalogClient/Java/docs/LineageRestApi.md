# LineageRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lineageRESTGetLineageGraph**](LineageRestApi.md#lineageRESTGetLineageGraph) | **GET** /atlas/v2/lineage/{guid} | 
[**lineageRESTNextLevelLineage**](LineageRestApi.md#lineageRESTNextLevelLineage) | **GET** /atlas/v2/lineage/{guid}/next/ | 


<a name="lineageRESTGetLineageGraph"></a>
# **lineageRESTGetLineageGraph**
> JsonAtlasLineageInfo lineageRESTGetLineageGraph(guid, direction, depth, width, includeParent, getDerivedLineage)



Gets lineage info about the specified entity by GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LineageRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    LineageRestApi apiInstance = new LineageRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    String direction = "direction_example"; // String | The direction of the lineage, which could be INPUT, OUTPUT or BOTH.
    Integer depth = 3; // Integer | The number of hops for lineage.
    Integer width = 10; // Integer | The number of max expanding width in lineage.
    Boolean includeParent = true; // Boolean | True to include the parent chain in the response.
    Boolean getDerivedLineage = true; // Boolean | True to include derived lineage in the response
    try {
      JsonAtlasLineageInfo result = apiInstance.lineageRESTGetLineageGraph(guid, direction, depth, width, includeParent, getDerivedLineage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LineageRestApi#lineageRESTGetLineageGraph");
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
 **direction** | **String**| The direction of the lineage, which could be INPUT, OUTPUT or BOTH. | [enum: BOTH, INPUT, OUTPUT]
 **depth** | **Integer**| The number of hops for lineage. | [optional] [default to 3]
 **width** | **Integer**| The number of max expanding width in lineage. | [optional] [default to 10]
 **includeParent** | **Boolean**| True to include the parent chain in the response. | [optional]
 **getDerivedLineage** | **Boolean**| True to include derived lineage in the response | [optional]

### Return type

[**JsonAtlasLineageInfo**](JsonAtlasLineageInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If Lineage exists for the given entity. |  -  |
**400** | Bad query parameters. |  -  |
**404** | If no lineage is found for the given entity. |  -  |

<a name="lineageRESTNextLevelLineage"></a>
# **lineageRESTNextLevelLineage**
> JsonAtlasLineageInfo lineageRESTNextLevelLineage(guid, direction, getDerivedLineage, offset, limit)



Returns immediate next level lineage info about entity with pagination

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LineageRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    LineageRestApi apiInstance = new LineageRestApi(defaultClient);
    String guid = "guid_example"; // String | The globally unique identifier of the entity.
    String direction = "direction_example"; // String | The direction of the lineage, which could be INPUT, OUTPUT or BOTH.
    Boolean getDerivedLineage = true; // Boolean | True to include derived lineage in the response
    Integer offset = 56; // Integer | The offset for pagination purpose.
    Integer limit = 56; // Integer | The page size - by default there is no paging.
    try {
      JsonAtlasLineageInfo result = apiInstance.lineageRESTNextLevelLineage(guid, direction, getDerivedLineage, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LineageRestApi#lineageRESTNextLevelLineage");
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
 **direction** | **String**| The direction of the lineage, which could be INPUT, OUTPUT or BOTH. | [enum: BOTH, INPUT, OUTPUT]
 **getDerivedLineage** | **Boolean**| True to include derived lineage in the response | [optional]
 **offset** | **Integer**| The offset for pagination purpose. | [optional]
 **limit** | **Integer**| The page size - by default there is no paging. | [optional]

### Return type

[**JsonAtlasLineageInfo**](JsonAtlasLineageInfo.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. If Lineage exists for the given entity. |  -  |
**400** | Bad query parameters. |  -  |
**404** | If no lineage is found for the given entity. |  -  |

