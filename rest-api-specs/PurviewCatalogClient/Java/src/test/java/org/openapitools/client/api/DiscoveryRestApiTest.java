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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.JsonAdvancedSearchResult;
import org.openapitools.client.model.JsonAutocompleteResult;
import org.openapitools.client.model.JsonSearchRequest;
import org.openapitools.client.model.JsonSuggestRequest;
import org.openapitools.client.model.JsonSuggestResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiscoveryRestApi
 */
@Ignore
public class DiscoveryRestApiTest {

    private final DiscoveryRestApi api = new DiscoveryRestApi();

    
    /**
     * 
     *
     * Gets auto complete options.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoveryRESTAutoCompleteTest() throws ApiException {
        String keyword = null;
        Integer limit = null;
        JsonAutocompleteResult response = api.discoveryRESTAutoComplete(keyword, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets data using advanced search.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoveryRESTSearchAdvancedTest() throws ApiException {
        JsonSearchRequest searchRequest = null;
        JsonAdvancedSearchResult response = api.discoveryRESTSearchAdvanced(searchRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets search suggestions by query criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoveryRESTSuggestTest() throws ApiException {
        JsonSuggestRequest suggestRequest = null;
        JsonSuggestResult response = api.discoveryRESTSuggest(suggestRequest);

        // TODO: test validations
    }
    
}
