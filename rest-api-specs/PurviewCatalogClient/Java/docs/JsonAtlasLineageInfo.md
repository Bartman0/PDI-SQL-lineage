

# JsonAtlasLineageInfo

The lineage information.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseEntityGuid** | **String** | The GUID of the base entity. |  [optional]
**guidEntityMap** | [**Map&lt;String, JsonAtlasEntityHeader&gt;**](JsonAtlasEntityHeader.md) | The GUID entity map. |  [optional]
**widthCounts** | **Map&lt;String, Map&lt;String, Object&gt;&gt;** | The entity count in specific direction. |  [optional]
**lineageDepth** | **Integer** | The depth of lineage. |  [optional]
**lineageWidth** | **Integer** | The width of lineage. |  [optional]
**includeParent** | **Boolean** | True to return the parent of the base entity. |  [optional]
**childrenCount** | **Integer** | The number of children node. |  [optional]
**lineageDirection** | **JsonLineageDirection** |  |  [optional]
**parentRelations** | [**List&lt;JsonParentRelation&gt;**](JsonParentRelation.md) | An array of parentRelations relations. |  [optional]
**relations** | [**List&lt;JsonLineageRelation&gt;**](JsonLineageRelation.md) | An array of lineage relations. |  [optional]



