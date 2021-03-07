

# JsonAtlasClassification

An instance of a classification; it doesn't have an identity, this object exists only when associated with an entity.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** | The attributes of the struct. |  [optional]
**typeName** | **String** | The name of the type. |  [optional]
**lastModifiedTS** | **String** | ETag for concurrency control. |  [optional]
**entityGuid** | **String** | The GUID of the entity. |  [optional]
**entityStatus** | **JsonStatus** |  |  [optional]
**propagate** | **Boolean** | Determines if the classification will be propagated. |  [optional]
**removePropagationsOnEntityDelete** | **Boolean** | Determines if propagations will be removed on entity deletion. |  [optional]
**validityPeriods** | [**List&lt;JsonTimeBoundary&gt;**](JsonTimeBoundary.md) | An array of time boundaries indicating validity periods. |  [optional]
**source** | **String** | indicate the source who create the classification detail |  [optional]
**sourceDetails** | **Map&lt;String, Object&gt;** | more detail on source information |  [optional]



