

# JsonAtlasEntityDef

class that captures details of a entity-type.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **JsonTypeCategory** |  |  [optional]
**createTime** | **BigDecimal** | The created time of the record. |  [optional]
**createdBy** | **String** | The user who created the record. |  [optional]
**dateFormatter** | [**JsonDateFormat**](JsonDateFormat.md) |  |  [optional]
**description** | **String** | The description of the type definition. |  [optional]
**guid** | **String** | The GUID of the type definition. |  [optional]
**name** | **String** | The name of the type definition. |  [optional]
**options** | **Map&lt;String, String&gt;** | The options for the type definition. |  [optional]
**serviceType** | **String** | The service type. |  [optional]
**typeVersion** | **String** | The version of the type. |  [optional]
**updateTime** | **BigDecimal** | The update time of the record. |  [optional]
**updatedBy** | **String** | The user who updated the record. |  [optional]
**version** | **BigDecimal** | The version of the record. |  [optional]
**lastModifiedTS** | **String** | ETag for concurrency control. |  [optional]
**attributeDefs** | [**List&lt;JsonAtlasAttributeDef&gt;**](JsonAtlasAttributeDef.md) | An array of attribute definitions. |  [optional]
**subTypes** | **List&lt;String&gt;** | An array of sub types. |  [optional]
**superTypes** | **List&lt;String&gt;** | An array of super types. |  [optional]



