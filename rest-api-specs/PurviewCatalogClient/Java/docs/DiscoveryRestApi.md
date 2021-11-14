# DiscoveryRestApi

All URIs are relative to *https://catalog.purview.azure.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoveryRESTAutoComplete**](DiscoveryRestApi.md#discoveryRESTAutoComplete) | **GET** /atlas/v2/search/autocomplete | 
[**discoveryRESTSearchAdvanced**](DiscoveryRestApi.md#discoveryRESTSearchAdvanced) | **POST** /atlas/v2/search/advanced | 
[**discoveryRESTSuggest**](DiscoveryRestApi.md#discoveryRESTSuggest) | **POST** /atlas/v2/search/suggest | 


<a name="discoveryRESTAutoComplete"></a>
# **discoveryRESTAutoComplete**
> JsonAutocompleteResult discoveryRESTAutoComplete(keyword, limit)



Gets auto complete options.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    DiscoveryRestApi apiInstance = new DiscoveryRestApi(defaultClient);
    String keyword = "keyword_example"; // String | The keyword to get auto complete.
    Integer limit = 56; // Integer | Limits the result set to only include the specified number of entries.
    try {
      JsonAutocompleteResult result = apiInstance.discoveryRESTAutoComplete(keyword, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryRestApi#discoveryRESTAutoComplete");
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
 **keyword** | **String**| The keyword to get auto complete. |
 **limit** | **Integer**| Limits the result set to only include the specified number of entries. | [optional]

### Return type

[**JsonAutocompleteResult**](JsonAutocompleteResult.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the auto complete options. |  -  |
**400** | Illegal argument: Keyword is required |  -  |

<a name="discoveryRESTSearchAdvanced"></a>
# **discoveryRESTSearchAdvanced**
> JsonAdvancedSearchResult discoveryRESTSearchAdvanced(searchRequest)



Gets data using advanced search.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    DiscoveryRestApi apiInstance = new DiscoveryRestApi(defaultClient);
    JsonSearchRequest searchRequest = new JsonSearchRequest(); // JsonSearchRequest | An object specifying the search criteria.
    try {
      JsonAdvancedSearchResult result = apiInstance.discoveryRESTSearchAdvanced(searchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryRestApi#discoveryRESTSearchAdvanced");
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
 **searchRequest** | [**JsonSearchRequest**](JsonSearchRequest.md)| An object specifying the search criteria. |

### Return type

[**JsonAdvancedSearchResult**](JsonAdvancedSearchResult.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the advanced search. |  -  |
**400** | Illegal argument exception thrown. |  -  |

<a name="discoveryRESTSuggest"></a>
# **discoveryRESTSuggest**
> JsonSuggestResult discoveryRESTSuggest(suggestRequest)



Gets search suggestions by query criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoveryRestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://catalog.purview.azure.com/api");
    
    // Configure OAuth2 access token for authorization: azure_auth
    OAuth azure_auth = (OAuth) defaultClient.getAuthentication("azure_auth");
    azure_auth.setAccessToken("YOUR ACCESS TOKEN");

    DiscoveryRestApi apiInstance = new DiscoveryRestApi(defaultClient);
    JsonSuggestRequest suggestRequest = new JsonSuggestRequest(); // JsonSuggestRequest | An object specifying the suggest criteria.
    try {
      JsonSuggestResult result = apiInstance.discoveryRESTSuggest(suggestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryRestApi#discoveryRESTSuggest");
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
 **suggestRequest** | [**JsonSuggestRequest**](JsonSuggestRequest.md)| An object specifying the suggest criteria. |

### Return type

[**JsonSuggestResult**](JsonSuggestResult.md)

### Authorization

[azure_auth](../README.md#azure_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. On successful lookup of the suggestions. |  -  |
**400** | Illegal argument exception thrown. |  -  |

