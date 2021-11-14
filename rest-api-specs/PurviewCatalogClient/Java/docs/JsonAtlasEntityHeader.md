

# JsonAtlasEntityHeader

An instance of an entity - like hive_table, hive_database.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** | The attributes of the struct. |  [optional]
**typeName** | **String** | The name of the type. |  [optional]
**lastModifiedTS** | **String** | ETag for concurrency control. |  [optional]
**classificationNames** | **List&lt;String&gt;** | An array of classification names. |  [optional]
**classifications** | [**List&lt;JsonAtlasClassification&gt;**](JsonAtlasClassification.md) | An array of classifications. |  [optional]
**displayText** | **String** | The display text. |  [optional]
**guid** | **String** | The GUID of the record. |  [optional]
**meaningNames** | **List&lt;String&gt;** | An array of meanings. |  [optional]
**meanings** | [**List&lt;JsonAtlasTermAssignmentHeader&gt;**](JsonAtlasTermAssignmentHeader.md) | An array of term assignment headers. |  [optional]
**status** | **JsonStatus** |  |  [optional]



