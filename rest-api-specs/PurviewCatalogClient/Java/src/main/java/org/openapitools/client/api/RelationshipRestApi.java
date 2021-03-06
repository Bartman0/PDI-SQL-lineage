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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.JsonAtlasRelationship;
import org.openapitools.client.model.JsonAtlasRelationshipWithExtInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationshipRestApi {
    private ApiClient localVarApiClient;

    public RelationshipRestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RelationshipRestApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for relationshipRESTCreate
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> OK. The relationship is created. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTCreateCall(JsonAtlasRelationship relationship, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = relationship;

        // create path and map variables
        String localVarPath = "/atlas/v2/relationship";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "azure_auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call relationshipRESTCreateValidateBeforeCall(JsonAtlasRelationship relationship, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'relationship' is set
        if (relationship == null) {
            throw new ApiException("Missing the required parameter 'relationship' when calling relationshipRESTCreate(Async)");
        }
        

        okhttp3.Call localVarCall = relationshipRESTCreateCall(relationship, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a new relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @return JsonAtlasRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> OK. The relationship is created. </td><td>  -  </td></tr>
     </table>
     */
    public JsonAtlasRelationship relationshipRESTCreate(JsonAtlasRelationship relationship) throws ApiException {
        ApiResponse<JsonAtlasRelationship> localVarResp = relationshipRESTCreateWithHttpInfo(relationship);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a new relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @return ApiResponse&lt;JsonAtlasRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> OK. The relationship is created. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JsonAtlasRelationship> relationshipRESTCreateWithHttpInfo(JsonAtlasRelationship relationship) throws ApiException {
        okhttp3.Call localVarCall = relationshipRESTCreateValidateBeforeCall(relationship, null);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a new relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> OK. The relationship is created. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTCreateAsync(JsonAtlasRelationship relationship, final ApiCallback<JsonAtlasRelationship> _callback) throws ApiException {

        okhttp3.Call localVarCall = relationshipRESTCreateValidateBeforeCall(relationship, _callback);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for relationshipRESTDeleteById
     * @param guid The globally unique identifier of the relationship. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is deleted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTDeleteByIdCall(String guid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/atlas/v2/relationship/guid/{guid}"
            .replaceAll("\\{" + "guid" + "\\}", localVarApiClient.escapeString(guid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "azure_auth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call relationshipRESTDeleteByIdValidateBeforeCall(String guid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiException("Missing the required parameter 'guid' when calling relationshipRESTDeleteById(Async)");
        }
        

        okhttp3.Call localVarCall = relationshipRESTDeleteByIdCall(guid, _callback);
        return localVarCall;

    }

    /**
     * 
     * Deletes a relationship between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is deleted. </td><td>  -  </td></tr>
     </table>
     */
    public void relationshipRESTDeleteById(String guid) throws ApiException {
        relationshipRESTDeleteByIdWithHttpInfo(guid);
    }

    /**
     * 
     * Deletes a relationship between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is deleted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> relationshipRESTDeleteByIdWithHttpInfo(String guid) throws ApiException {
        okhttp3.Call localVarCall = relationshipRESTDeleteByIdValidateBeforeCall(guid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Deletes a relationship between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is deleted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTDeleteByIdAsync(String guid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = relationshipRESTDeleteByIdValidateBeforeCall(guid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for relationshipRESTGetById2
     * @param guid The globally unique identifier of the relationship. (required)
     * @param extendedInfo Limits whether includes extended information. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTGetById2Call(String guid, Boolean extendedInfo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/atlas/v2/relationship/guid/{guid}"
            .replaceAll("\\{" + "guid" + "\\}", localVarApiClient.escapeString(guid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (extendedInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("extendedInfo", extendedInfo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "azure_auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call relationshipRESTGetById2ValidateBeforeCall(String guid, Boolean extendedInfo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiException("Missing the required parameter 'guid' when calling relationshipRESTGetById2(Async)");
        }
        

        okhttp3.Call localVarCall = relationshipRESTGetById2Call(guid, extendedInfo, _callback);
        return localVarCall;

    }

    /**
     * 
     * Gets relationship information between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @param extendedInfo Limits whether includes extended information. (optional)
     * @return JsonAtlasRelationshipWithExtInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
     </table>
     */
    public JsonAtlasRelationshipWithExtInfo relationshipRESTGetById2(String guid, Boolean extendedInfo) throws ApiException {
        ApiResponse<JsonAtlasRelationshipWithExtInfo> localVarResp = relationshipRESTGetById2WithHttpInfo(guid, extendedInfo);
        return localVarResp.getData();
    }

    /**
     * 
     * Gets relationship information between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @param extendedInfo Limits whether includes extended information. (optional)
     * @return ApiResponse&lt;JsonAtlasRelationshipWithExtInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JsonAtlasRelationshipWithExtInfo> relationshipRESTGetById2WithHttpInfo(String guid, Boolean extendedInfo) throws ApiException {
        okhttp3.Call localVarCall = relationshipRESTGetById2ValidateBeforeCall(guid, extendedInfo, null);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationshipWithExtInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Gets relationship information between entities by its GUID.
     * @param guid The globally unique identifier of the relationship. (required)
     * @param extendedInfo Limits whether includes extended information. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTGetById2Async(String guid, Boolean extendedInfo, final ApiCallback<JsonAtlasRelationshipWithExtInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = relationshipRESTGetById2ValidateBeforeCall(guid, extendedInfo, _callback);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationshipWithExtInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for relationshipRESTUpdate
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is updated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTUpdateCall(JsonAtlasRelationship relationship, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = relationship;

        // create path and map variables
        String localVarPath = "/atlas/v2/relationship";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "azure_auth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call relationshipRESTUpdateValidateBeforeCall(JsonAtlasRelationship relationship, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'relationship' is set
        if (relationship == null) {
            throw new ApiException("Missing the required parameter 'relationship' when calling relationshipRESTUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = relationshipRESTUpdateCall(relationship, _callback);
        return localVarCall;

    }

    /**
     * 
     * Updates an existing relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @return JsonAtlasRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is updated. </td><td>  -  </td></tr>
     </table>
     */
    public JsonAtlasRelationship relationshipRESTUpdate(JsonAtlasRelationship relationship) throws ApiException {
        ApiResponse<JsonAtlasRelationship> localVarResp = relationshipRESTUpdateWithHttpInfo(relationship);
        return localVarResp.getData();
    }

    /**
     * 
     * Updates an existing relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @return ApiResponse&lt;JsonAtlasRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is updated. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JsonAtlasRelationship> relationshipRESTUpdateWithHttpInfo(JsonAtlasRelationship relationship) throws ApiException {
        okhttp3.Call localVarCall = relationshipRESTUpdateValidateBeforeCall(relationship, null);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates an existing relationship between entities.
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> OK. The relationship is updated. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call relationshipRESTUpdateAsync(JsonAtlasRelationship relationship, final ApiCallback<JsonAtlasRelationship> _callback) throws ApiException {

        okhttp3.Call localVarCall = relationshipRESTUpdateValidateBeforeCall(relationship, _callback);
        Type localVarReturnType = new TypeToken<JsonAtlasRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
