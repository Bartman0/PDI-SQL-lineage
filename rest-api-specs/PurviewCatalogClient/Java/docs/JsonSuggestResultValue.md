

# JsonSuggestResultValue

The value item of the search suggest.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**atSearchScore** | **Float** | The search score calculated by the search engine. The results are ordered by search score by default. |  [optional]
**atSearchText** | **String** | The target text that contains the keyword as prefix. The keyword is wrapped with emphasis mark. |  [optional]
**description** | **String** | The description of the record. |  [optional]
**id** | **String** | The GUID of the record. |  [optional]
**name** | **String** | The name of the record. |  [optional]
**owner** | **String** | The owner of the record. This is an Atlas native attribute. |  [optional]
**qualifiedName** | **String** | The qualified name of the record. |  [optional]
**entityType** | **String** | The type name of the record. |  [optional]
**classification** | **List&lt;String&gt;** | The classifications of the record. |  [optional]
**label** | **List&lt;String&gt;** | The labels of the record. |  [optional]
**term** | [**List&lt;JsonTermSearchResultValue&gt;**](JsonTermSearchResultValue.md) | The terms assigned to the record. |  [optional]
**contact** | [**List&lt;JsonContactSearchResultValue&gt;**](JsonContactSearchResultValue.md) | The contacts of the record. |  [optional]
**assetType** | **List&lt;String&gt;** | The asset types of the record. |  [optional]



