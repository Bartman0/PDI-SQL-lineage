# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator (autorest: 3.0.6365, generator: {generator})
# Changes may cause incorrect behavior and will be lost if the code is regenerated.
# --------------------------------------------------------------------------

try:
    from ._models_py3 import ComponentsV9D1InSchemasJsonTypestatisticsPropertiesTypestatisticsAdditionalproperties
    from ._models_py3 import JsonAdvancedSearchResult
    from ._models_py3 import JsonAtlasAttributeDef
    from ._models_py3 import JsonAtlasBaseModelObject
    from ._models_py3 import JsonAtlasBaseTypeDef
    from ._models_py3 import JsonAtlasClassification
    from ._models_py3 import JsonAtlasClassificationDef
    from ._models_py3 import JsonAtlasClassifications
    from ._models_py3 import JsonAtlasConstraintDef
    from ._models_py3 import JsonAtlasEntitiesWithExtInfo
    from ._models_py3 import JsonAtlasEntity
    from ._models_py3 import JsonAtlasEntityDef
    from ._models_py3 import JsonAtlasEntityExtInfo
    from ._models_py3 import JsonAtlasEntityHeader
    from ._models_py3 import JsonAtlasEntityHeaders
    from ._models_py3 import JsonAtlasEntityWithExtInfo
    from ._models_py3 import JsonAtlasEnumDef
    from ._models_py3 import JsonAtlasEnumElementDef
    from ._models_py3 import JsonAtlasError
    from ._models_py3 import JsonAtlasGlossary
    from ._models_py3 import JsonAtlasGlossaryBaseObject
    from ._models_py3 import JsonAtlasGlossaryCategory
    from ._models_py3 import JsonAtlasGlossaryExtInfo
    from ._models_py3 import JsonAtlasGlossaryHeader
    from ._models_py3 import JsonAtlasGlossaryTerm
    from ._models_py3 import JsonAtlasLineageInfo
    from ._models_py3 import JsonAtlasObjectId
    from ._models_py3 import JsonAtlasRelatedCategoryHeader
    from ._models_py3 import JsonAtlasRelatedObjectId
    from ._models_py3 import JsonAtlasRelatedTermHeader
    from ._models_py3 import JsonAtlasRelationship
    from ._models_py3 import JsonAtlasRelationshipDef
    from ._models_py3 import JsonAtlasRelationshipEndDef
    from ._models_py3 import JsonAtlasRelationshipWithExtInfo
    from ._models_py3 import JsonAtlasStruct
    from ._models_py3 import JsonAtlasStructDef
    from ._models_py3 import JsonAtlasTermAssignmentHeader
    from ._models_py3 import JsonAtlasTermCategorizationHeader
    from ._models_py3 import JsonAtlasTypeDefHeader
    from ._models_py3 import JsonAtlasTypesDef
    from ._models_py3 import JsonAtlasUserSavedSearch
    from ._models_py3 import JsonAutocompleteResult
    from ._models_py3 import JsonAutocompleteResultValue
    from ._models_py3 import JsonAzureCatalogUser
    from ._models_py3 import JsonCatalogCreationRequest
    from ._models_py3 import JsonCatalogDeletionRequest
    from ._models_py3 import JsonClassificationAssociateRequest
    from ._models_py3 import JsonContactBasic
    from ._models_py3 import JsonContactSearchResultValue
    from ._models_py3 import JsonContext
    from ._models_py3 import JsonDataScanPermissionCheckRequest
    from ._models_py3 import JsonDataScanPermissionCheckResponse
    from ._models_py3 import JsonDateFormat
    from ._models_py3 import JsonEntityAuditEventV2
    from ._models_py3 import JsonEntityCreateRequestV2
    from ._models_py3 import JsonEntityDeleteRequestV2
    from ._models_py3 import JsonEntityMutationResponse
    from ._models_py3 import JsonEntityPartialUpdateRequestV2
    from ._models_py3 import JsonEntityUpdateRequestV2
    from ._models_py3 import JsonError
    from ._models_py3 import JsonFilterCriteria
    from ._models_py3 import JsonHookNotification
    from ._models_py3 import JsonImportCSVOperation
    from ._models_py3 import JsonImportCSVOperationError
    from ._models_py3 import JsonImportCSVOperationProperties
    from ._models_py3 import JsonLineageRelation
    from ._models_py3 import JsonListRoleAssignmentResponse
    from ._models_py3 import JsonNumberFormat
    from ._models_py3 import JsonParentRelation
    from ._models_py3 import JsonPlist
    from ._models_py3 import JsonResourceLink
    from ._models_py3 import JsonRoleAssignmentEntry
    from ._models_py3 import JsonSearchFacetItemValue
    from ._models_py3 import JsonSearchFacetResultValue
    from ._models_py3 import JsonSearchFilter
    from ._models_py3 import JsonSearchHighlights
    from ._models_py3 import JsonSearchParameters
    from ._models_py3 import JsonSearchRequest
    from ._models_py3 import JsonSearchResultValue
    from ._models_py3 import JsonSuggestRequest
    from ._models_py3 import JsonSuggestResult
    from ._models_py3 import JsonSuggestResultValue
    from ._models_py3 import JsonTermSearchResultValue
    from ._models_py3 import JsonTermTemplateDef
    from ._models_py3 import JsonTimeBoundary
    from ._models_py3 import JsonTimeZone
    from ._models_py3 import JsonTypeStatistics
    from ._models_py3 import JsonUpdateRoleAssignmentRequest
    from ._models_py3 import Paths16Dpt11AtlasV2GlossaryNameGlossarynameTermsImportPostRequestbodyContentMultipartFormDataSchema
    from ._models_py3 import PathsVoxj8WAtlasV2GlossaryGlossaryguidTermsImportPostRequestbodyContentMultipartFormDataSchema
    from ._models_py3 import XmlNs0Plist
    from ._models_py3 import XmlNs0SearchFilter
    from ._models_py3 import XmlNs0TimeBoundary
except (SyntaxError, ImportError):
    from ._models import ComponentsV9D1InSchemasJsonTypestatisticsPropertiesTypestatisticsAdditionalproperties  # type: ignore
    from ._models import JsonAdvancedSearchResult  # type: ignore
    from ._models import JsonAtlasAttributeDef  # type: ignore
    from ._models import JsonAtlasBaseModelObject  # type: ignore
    from ._models import JsonAtlasBaseTypeDef  # type: ignore
    from ._models import JsonAtlasClassification  # type: ignore
    from ._models import JsonAtlasClassificationDef  # type: ignore
    from ._models import JsonAtlasClassifications  # type: ignore
    from ._models import JsonAtlasConstraintDef  # type: ignore
    from ._models import JsonAtlasEntitiesWithExtInfo  # type: ignore
    from ._models import JsonAtlasEntity  # type: ignore
    from ._models import JsonAtlasEntityDef  # type: ignore
    from ._models import JsonAtlasEntityExtInfo  # type: ignore
    from ._models import JsonAtlasEntityHeader  # type: ignore
    from ._models import JsonAtlasEntityHeaders  # type: ignore
    from ._models import JsonAtlasEntityWithExtInfo  # type: ignore
    from ._models import JsonAtlasEnumDef  # type: ignore
    from ._models import JsonAtlasEnumElementDef  # type: ignore
    from ._models import JsonAtlasError  # type: ignore
    from ._models import JsonAtlasGlossary  # type: ignore
    from ._models import JsonAtlasGlossaryBaseObject  # type: ignore
    from ._models import JsonAtlasGlossaryCategory  # type: ignore
    from ._models import JsonAtlasGlossaryExtInfo  # type: ignore
    from ._models import JsonAtlasGlossaryHeader  # type: ignore
    from ._models import JsonAtlasGlossaryTerm  # type: ignore
    from ._models import JsonAtlasLineageInfo  # type: ignore
    from ._models import JsonAtlasObjectId  # type: ignore
    from ._models import JsonAtlasRelatedCategoryHeader  # type: ignore
    from ._models import JsonAtlasRelatedObjectId  # type: ignore
    from ._models import JsonAtlasRelatedTermHeader  # type: ignore
    from ._models import JsonAtlasRelationship  # type: ignore
    from ._models import JsonAtlasRelationshipDef  # type: ignore
    from ._models import JsonAtlasRelationshipEndDef  # type: ignore
    from ._models import JsonAtlasRelationshipWithExtInfo  # type: ignore
    from ._models import JsonAtlasStruct  # type: ignore
    from ._models import JsonAtlasStructDef  # type: ignore
    from ._models import JsonAtlasTermAssignmentHeader  # type: ignore
    from ._models import JsonAtlasTermCategorizationHeader  # type: ignore
    from ._models import JsonAtlasTypeDefHeader  # type: ignore
    from ._models import JsonAtlasTypesDef  # type: ignore
    from ._models import JsonAtlasUserSavedSearch  # type: ignore
    from ._models import JsonAutocompleteResult  # type: ignore
    from ._models import JsonAutocompleteResultValue  # type: ignore
    from ._models import JsonAzureCatalogUser  # type: ignore
    from ._models import JsonCatalogCreationRequest  # type: ignore
    from ._models import JsonCatalogDeletionRequest  # type: ignore
    from ._models import JsonClassificationAssociateRequest  # type: ignore
    from ._models import JsonContactBasic  # type: ignore
    from ._models import JsonContactSearchResultValue  # type: ignore
    from ._models import JsonContext  # type: ignore
    from ._models import JsonDataScanPermissionCheckRequest  # type: ignore
    from ._models import JsonDataScanPermissionCheckResponse  # type: ignore
    from ._models import JsonDateFormat  # type: ignore
    from ._models import JsonEntityAuditEventV2  # type: ignore
    from ._models import JsonEntityCreateRequestV2  # type: ignore
    from ._models import JsonEntityDeleteRequestV2  # type: ignore
    from ._models import JsonEntityMutationResponse  # type: ignore
    from ._models import JsonEntityPartialUpdateRequestV2  # type: ignore
    from ._models import JsonEntityUpdateRequestV2  # type: ignore
    from ._models import JsonError  # type: ignore
    from ._models import JsonFilterCriteria  # type: ignore
    from ._models import JsonHookNotification  # type: ignore
    from ._models import JsonImportCSVOperation  # type: ignore
    from ._models import JsonImportCSVOperationError  # type: ignore
    from ._models import JsonImportCSVOperationProperties  # type: ignore
    from ._models import JsonLineageRelation  # type: ignore
    from ._models import JsonListRoleAssignmentResponse  # type: ignore
    from ._models import JsonNumberFormat  # type: ignore
    from ._models import JsonParentRelation  # type: ignore
    from ._models import JsonPlist  # type: ignore
    from ._models import JsonResourceLink  # type: ignore
    from ._models import JsonRoleAssignmentEntry  # type: ignore
    from ._models import JsonSearchFacetItemValue  # type: ignore
    from ._models import JsonSearchFacetResultValue  # type: ignore
    from ._models import JsonSearchFilter  # type: ignore
    from ._models import JsonSearchHighlights  # type: ignore
    from ._models import JsonSearchParameters  # type: ignore
    from ._models import JsonSearchRequest  # type: ignore
    from ._models import JsonSearchResultValue  # type: ignore
    from ._models import JsonSuggestRequest  # type: ignore
    from ._models import JsonSuggestResult  # type: ignore
    from ._models import JsonSuggestResultValue  # type: ignore
    from ._models import JsonTermSearchResultValue  # type: ignore
    from ._models import JsonTermTemplateDef  # type: ignore
    from ._models import JsonTimeBoundary  # type: ignore
    from ._models import JsonTimeZone  # type: ignore
    from ._models import JsonTypeStatistics  # type: ignore
    from ._models import JsonUpdateRoleAssignmentRequest  # type: ignore
    from ._models import Paths16Dpt11AtlasV2GlossaryNameGlossarynameTermsImportPostRequestbodyContentMultipartFormDataSchema  # type: ignore
    from ._models import PathsVoxj8WAtlasV2GlossaryGlossaryguidTermsImportPostRequestbodyContentMultipartFormDataSchema  # type: ignore
    from ._models import XmlNs0Plist  # type: ignore
    from ._models import XmlNs0SearchFilter  # type: ignore
    from ._models import XmlNs0TimeBoundary  # type: ignore

from ._purview_catalog_service_restapi_document_enums import (
    Enum14,
    Enum7,
    JsonAtlasTermAssignmentStatus,
    JsonAtlasTermRelationshipStatus,
    JsonCardinality,
    JsonCondition,
    JsonEntityAuditActionV2,
    JsonEntityAuditType,
    JsonEntityOperation,
    JsonHookNotificationType,
    JsonImportCSVOperationStatus,
    JsonLineageDirection,
    JsonOperator,
    JsonPropagateTags,
    JsonRelation,
    JsonRelationshipCategory,
    JsonRoundingMode,
    JsonSavedSearchType,
    JsonSortType,
    JsonStatus,
    JsonStatusAtlasRelationship,
    JsonTermStatus,
    JsonTypeCategory,
    XmlNs0SortType,
)

__all__ = [
    'ComponentsV9D1InSchemasJsonTypestatisticsPropertiesTypestatisticsAdditionalproperties',
    'JsonAdvancedSearchResult',
    'JsonAtlasAttributeDef',
    'JsonAtlasBaseModelObject',
    'JsonAtlasBaseTypeDef',
    'JsonAtlasClassification',
    'JsonAtlasClassificationDef',
    'JsonAtlasClassifications',
    'JsonAtlasConstraintDef',
    'JsonAtlasEntitiesWithExtInfo',
    'JsonAtlasEntity',
    'JsonAtlasEntityDef',
    'JsonAtlasEntityExtInfo',
    'JsonAtlasEntityHeader',
    'JsonAtlasEntityHeaders',
    'JsonAtlasEntityWithExtInfo',
    'JsonAtlasEnumDef',
    'JsonAtlasEnumElementDef',
    'JsonAtlasError',
    'JsonAtlasGlossary',
    'JsonAtlasGlossaryBaseObject',
    'JsonAtlasGlossaryCategory',
    'JsonAtlasGlossaryExtInfo',
    'JsonAtlasGlossaryHeader',
    'JsonAtlasGlossaryTerm',
    'JsonAtlasLineageInfo',
    'JsonAtlasObjectId',
    'JsonAtlasRelatedCategoryHeader',
    'JsonAtlasRelatedObjectId',
    'JsonAtlasRelatedTermHeader',
    'JsonAtlasRelationship',
    'JsonAtlasRelationshipDef',
    'JsonAtlasRelationshipEndDef',
    'JsonAtlasRelationshipWithExtInfo',
    'JsonAtlasStruct',
    'JsonAtlasStructDef',
    'JsonAtlasTermAssignmentHeader',
    'JsonAtlasTermCategorizationHeader',
    'JsonAtlasTypeDefHeader',
    'JsonAtlasTypesDef',
    'JsonAtlasUserSavedSearch',
    'JsonAutocompleteResult',
    'JsonAutocompleteResultValue',
    'JsonAzureCatalogUser',
    'JsonCatalogCreationRequest',
    'JsonCatalogDeletionRequest',
    'JsonClassificationAssociateRequest',
    'JsonContactBasic',
    'JsonContactSearchResultValue',
    'JsonContext',
    'JsonDataScanPermissionCheckRequest',
    'JsonDataScanPermissionCheckResponse',
    'JsonDateFormat',
    'JsonEntityAuditEventV2',
    'JsonEntityCreateRequestV2',
    'JsonEntityDeleteRequestV2',
    'JsonEntityMutationResponse',
    'JsonEntityPartialUpdateRequestV2',
    'JsonEntityUpdateRequestV2',
    'JsonError',
    'JsonFilterCriteria',
    'JsonHookNotification',
    'JsonImportCSVOperation',
    'JsonImportCSVOperationError',
    'JsonImportCSVOperationProperties',
    'JsonLineageRelation',
    'JsonListRoleAssignmentResponse',
    'JsonNumberFormat',
    'JsonParentRelation',
    'JsonPlist',
    'JsonResourceLink',
    'JsonRoleAssignmentEntry',
    'JsonSearchFacetItemValue',
    'JsonSearchFacetResultValue',
    'JsonSearchFilter',
    'JsonSearchHighlights',
    'JsonSearchParameters',
    'JsonSearchRequest',
    'JsonSearchResultValue',
    'JsonSuggestRequest',
    'JsonSuggestResult',
    'JsonSuggestResultValue',
    'JsonTermSearchResultValue',
    'JsonTermTemplateDef',
    'JsonTimeBoundary',
    'JsonTimeZone',
    'JsonTypeStatistics',
    'JsonUpdateRoleAssignmentRequest',
    'Paths16Dpt11AtlasV2GlossaryNameGlossarynameTermsImportPostRequestbodyContentMultipartFormDataSchema',
    'PathsVoxj8WAtlasV2GlossaryGlossaryguidTermsImportPostRequestbodyContentMultipartFormDataSchema',
    'XmlNs0Plist',
    'XmlNs0SearchFilter',
    'XmlNs0TimeBoundary',
    'Enum14',
    'Enum7',
    'JsonAtlasTermAssignmentStatus',
    'JsonAtlasTermRelationshipStatus',
    'JsonCardinality',
    'JsonCondition',
    'JsonEntityAuditActionV2',
    'JsonEntityAuditType',
    'JsonEntityOperation',
    'JsonHookNotificationType',
    'JsonImportCSVOperationStatus',
    'JsonLineageDirection',
    'JsonOperator',
    'JsonPropagateTags',
    'JsonRelation',
    'JsonRelationshipCategory',
    'JsonRoundingMode',
    'JsonSavedSearchType',
    'JsonSortType',
    'JsonStatus',
    'JsonStatusAtlasRelationship',
    'JsonTermStatus',
    'JsonTypeCategory',
    'XmlNs0SortType',
]
