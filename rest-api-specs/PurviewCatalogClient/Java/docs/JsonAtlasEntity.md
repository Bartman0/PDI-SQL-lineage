

# JsonAtlasEntity

An instance of an entity - like hive_table, hive_database.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** | The attributes of the struct. |  [optional]
**typeName** | **String** | The name of the type. |  [optional]
**lastModifiedTS** | **String** | ETag for concurrency control. |  [optional]
**classifications** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md) | An array of classifications. |  [optional]
**createTime** | **BigDecimal** | The created time of the record. |  [optional]
**createdBy** | **String** | The user who created the record. |  [optional]
**guid** | **String** | The GUID of the entity. |  [optional]
**homeId** | **String** | The home ID of the entity. |  [optional]
**meanings** | [**List&lt;JsonAtlasTermAssignmentHeader&gt;**](JsonAtlasTermAssignmentHeader.md) | An array of term assignment headers indicating the meanings of the entity. |  [optional]
**provenanceType** | **BigDecimal** | Used to record the provenance of an instance of an entity or relationship. |  [optional]
**proxy** | **Boolean** | Determines if there&#39;s a proxy. |  [optional]
**relationshipAttributes** | **Map&lt;String, Object&gt;** | The attributes of relationship. |  [optional]
**status** | **JsonStatus** |  |  [optional]
**updateTime** | **BigDecimal** | The update time of the record. |  [optional]
**updatedBy** | **String** | The user who updated the record. |  [optional]
**version** | **BigDecimal** | The version of the entity. |  [optional]
**source** | **String** | indicate the source who create the classification detail |  [optional]
**sourceDetails** | **Map&lt;String, Object&gt;** | more detail on source information |  [optional]
**contacts** | [**Map&lt;String, JsonContactBasic&gt;**](JsonContactBasic.md) | The dictionary of contacts for terms. Key could be Expert or Owner. |  [optional]



