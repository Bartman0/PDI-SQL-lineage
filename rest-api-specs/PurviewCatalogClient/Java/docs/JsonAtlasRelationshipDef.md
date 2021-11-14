

# JsonAtlasRelationshipDef

AtlasRelationshipDef is a TypeDef that defines a relationship. <p> As with other typeDefs the AtlasRelationshipDef has a name. Once created the RelationshipDef has a guid. The name and the guid are the 2 ways that the RelationshipDef is identified. <p> RelationshipDefs have 2 ends, each of which specify cardinality, an EntityDef type name and name and optionally whether the end is a container. <p> RelationshipDefs can have AttributeDefs - though only primitive types are allowed. <br> RelationshipDefs have a relationshipCategory specifying the UML type of relationship required <br> RelationshipDefs also have a PropogateTag - indicating which way tags could flow over the relationships. <p> The way EntityDefs and RelationshipDefs are intended to be used is that EntityDefs will define AttributeDefs these AttributeDefs will not specify an EntityDef type name as their types. <p> RelationshipDefs introduce new atributes to the entity instances. For example <p> EntityDef A might have attributes attr1,attr2,attr3 <br> EntityDef B might have attributes attr4,attr5,attr6 <br> RelationshipDef AtoB might define 2 ends <br>  <pre>    end1:  type A, name attr7    end2:  type B, name attr8  </pre>  <p> When an instance of EntityDef A is created, it will have attributes attr1,attr2,attr3,attr7 <br> When an instance of EntityDef B is created, it will have attributes attr4,attr5,attr6,attr8 <p> In this way relationshipDefs can be authored separately from entityDefs and can inject relationship attributes into the entity instances
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
**endDef1** | [**JsonAtlasRelationshipEndDef**](JsonAtlasRelationshipEndDef.md) |  |  [optional]
**endDef2** | [**JsonAtlasRelationshipEndDef**](JsonAtlasRelationshipEndDef.md) |  |  [optional]
**propagateTags** | **JsonPropagateTags** |  |  [optional]
**relationshipCategory** | **JsonRelationshipCategory** |  |  [optional]
**relationshipLabel** | **String** | The label of the relationship. |  [optional]



