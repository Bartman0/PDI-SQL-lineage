

# JsonSuggestRequest

The query of suggest request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywords** | **String** | The keywords applied to all fields that support suggest operation. It must be at least 1 character, and no more than 100 characters. In the index schema we defined a default suggester which lists all the supported fields and specifies a search mode. |  [optional]
**limit** | **Integer** | The number of suggestions we hope to return. The default value is 5. The value must be a number between 1 and 100. |  [optional]
**filter** | **Object** | The filter for the search. |  [optional]



