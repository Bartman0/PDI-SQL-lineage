

# JsonAtlasGlossaryTermAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abbreviation** | **String** | The abbreviation of the term. |  [optional]
**anchor** | [**JsonAtlasGlossaryHeader**](JsonAtlasGlossaryHeader.md) |  |  [optional]
**antonyms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers as antonyms. |  [optional]
**createTime** | **BigDecimal** | The created time of the record. |  [optional]
**createdBy** | **String** | The user who created the record. |  [optional]
**updateTime** | **BigDecimal** | The update time of the record. |  [optional]
**updatedBy** | **String** | The user who updated the record. |  [optional]
**status** | **JsonTermStatus** |  |  [optional]
**resources** | [**List&lt;JsonResourceLink&gt;**](JsonResourceLink.md) | An array of resource link for term |  [optional]
**contacts** | [**Map&lt;String, JsonContactBasic&gt;**](JsonContactBasic.md) | The dictionary of contacts for terms. Key could be Expert or Steward. |  [optional]
**attributes** | **Map&lt;String, Map&lt;String, Object&gt;&gt;** | The custom attributes of the term, which is map&lt;string,map&lt;string,object&gt;&gt;. The key of the first layer map is term template name. |  [optional]
**assignedEntities** | [**List&lt;JsonAtlasRelatedObjectId&gt;**](JsonAtlasRelatedObjectId.md) | An array of related object IDs. |  [optional]
**categories** | [**List&lt;JsonAtlasTermCategorizationHeader&gt;**](JsonAtlasTermCategorizationHeader.md) | An array of term categorization headers. |  [optional]
**classifies** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers. |  [optional]
**examples** | **List&lt;String&gt;** | An array of examples. |  [optional]
**isA** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers indicating the is-a relationship. |  [optional]
**preferredTerms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of preferred related term headers. |  [optional]
**preferredToTerms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers that are preferred to. |  [optional]
**replacedBy** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers that are replaced by. |  [optional]
**replacementTerms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers for replacement. |  [optional]
**seeAlso** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers for see also. |  [optional]
**synonyms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers as synonyms. |  [optional]
**translatedTerms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of translated related term headers. |  [optional]
**translationTerms** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers for translation. |  [optional]
**usage** | **String** | The usage of the term. |  [optional]
**validValues** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers as valid values. |  [optional]
**validValuesFor** | [**List&lt;JsonAtlasRelatedTermHeader&gt;**](JsonAtlasRelatedTermHeader.md) | An array of related term headers as valid values for other records. |  [optional]



