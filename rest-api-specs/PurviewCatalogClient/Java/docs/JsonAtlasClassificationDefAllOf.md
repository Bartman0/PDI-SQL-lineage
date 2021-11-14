

# JsonAtlasClassificationDefAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypes** | **List&lt;String&gt;** | Specifying a list of entityType names in the classificationDef, ensures that classifications can only be applied to those entityTypes. &lt;ul&gt; &lt;li&gt;Any subtypes of the entity types inherit the restriction&lt;/li&gt; &lt;li&gt;Any classificationDef subtypes inherit the parents entityTypes restrictions&lt;/li&gt; &lt;li&gt;Any classificationDef subtypes can further restrict the parents entityTypes restrictions by specifying a subset of the entityTypes&lt;/li&gt; &lt;li&gt;An empty entityTypes list when there are no parent restrictions means there are no restrictions&lt;/li&gt; &lt;li&gt;An empty entityTypes list when there are parent restrictions means that the subtype picks up the parents restrictions&lt;/li&gt; &lt;li&gt;If a list of entityTypes are supplied, where one inherits from another, this will be rejected. This should encourage cleaner classificationsDefs&lt;/li&gt; &lt;/ul&gt; |  [optional]
**subTypes** | **List&lt;String&gt;** | An array of sub types. |  [optional]
**superTypes** | **List&lt;String&gt;** | An array of super types. |  [optional]



