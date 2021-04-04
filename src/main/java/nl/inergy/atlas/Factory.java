package nl.inergy.atlas;

import org.apache.atlas.AtlasClientV2;
import org.apache.atlas.model.typedef.AtlasBaseTypeDef;
import org.apache.atlas.model.typedef.AtlasEntityDef;
import org.apache.atlas.model.typedef.AtlasRelationshipDef;
import org.apache.atlas.model.typedef.AtlasStructDef;
import org.apache.atlas.model.typedef.AtlasTypesDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.singleton;
import static org.apache.atlas.model.typedef.AtlasBaseTypeDef.ATLAS_TYPE_BOOLEAN;
import static org.apache.atlas.model.typedef.AtlasBaseTypeDef.ATLAS_TYPE_STRING;
import static org.apache.atlas.model.typedef.AtlasRelationshipDef.RelationshipCategory.COMPOSITION;
import static org.apache.atlas.model.typedef.AtlasRelationshipDef.RelationshipCategory.ASSOCIATION;
import static org.apache.atlas.model.typedef.AtlasStructDef.AtlasAttributeDef.Cardinality.SET;
import static org.apache.atlas.model.typedef.AtlasStructDef.AtlasAttributeDef.Cardinality.SINGLE;
import static org.apache.atlas.type.AtlasTypeUtil.*;

public class Factory {

    public Factory() {
    }

    private static final Logger logger = LoggerFactory.getLogger(Factory.class);

    private AtlasClientV2 atlasClient;
    private final AtlasTypesDef atlasTypes = new AtlasTypesDef();

    private AtlasEntityDef createPentahoJobDef() {
        return createClassTypeDef(TypeDefs.PENTAHO_JOB,
                singleton(TypeDefs.PENTAHO_JOB),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createRequiredAttrDef(Attributes.DESCRIPTION, ATLAS_TYPE_STRING),
                createOptionalAttrDef(Attributes.COMMENT, ATLAS_TYPE_STRING)
        );
    }

    private AtlasEntityDef createDatabaseDef() {
        return createClassTypeDef(TypeDefs.DATABASE,
                singleton(TypeDefs.DATABASE),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createOptionalAttrDef(Attributes.URI, ATLAS_TYPE_STRING),
                new AtlasStructDef.AtlasAttributeDef(TypeDefs.TABLE,
                        AtlasBaseTypeDef.getArrayTypeName(TypeDefs.TABLE),
                        true, SET)
        );
    }

    private AtlasEntityDef createTableDef() {
        return createClassTypeDef(TypeDefs.TABLE,
                singleton(TypeDefs.TABLE),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createOptionalAttrDef(Attributes.TEMPORARY, ATLAS_TYPE_BOOLEAN),
                createOptionalAttrDef(Attributes.COMMENT, ATLAS_TYPE_STRING),
                new AtlasStructDef.AtlasAttributeDef(TypeDefs.COLUMN,
                        AtlasBaseTypeDef.getArrayTypeName(TypeDefs.COLUMN),
                        true, SET)
        );
    }

    private AtlasEntityDef createColumnDef() {
        return createClassTypeDef(TypeDefs.COLUMN,
                singleton(TypeDefs.COLUMN),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createRequiredAttrDef(Attributes.TYPE, ATLAS_TYPE_STRING),
                createOptionalAttrDef(Attributes.COMMENT, ATLAS_TYPE_STRING)
        );
    }

    private AtlasEntityDef createSqlJobDef() {
        return createClassTypeDef(TypeDefs.SQL_JOB,
                singleton(TypeDefs.SQL_JOB),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createRequiredAttrDef(Attributes.DESCRIPTION, ATLAS_TYPE_STRING),
                createRequiredAttrDef(Attributes.SCRIPT, ATLAS_TYPE_STRING)
        );
    }

    private AtlasEntityDef createSqlStatementDef() {
        return createClassTypeDef(TypeDefs.SQL_STATEMENT,
                singleton(TypeDefs.SQL_STATEMENT),
                createRequiredAttrDef(Attributes.NAME, ATLAS_TYPE_STRING),
                createRequiredAttrDef(Attributes.QUERY, ATLAS_TYPE_STRING)
        );
    }

    public AtlasClientV2 getClient(String[] urls, String[] authentication) {
        if (atlasClient == null) {
            atlasClient = new AtlasClientV2(urls, authentication);
        }
        return atlasClient;
    }

    public AtlasTypesDef getTypes() {
        if (atlasTypes.isEmpty()) {
            AtlasTypesDef typesDef = new AtlasTypesDef(Collections.emptyList(),
                    Collections.emptyList(),
                    Collections.emptyList(),
                    Arrays.asList(createDatabaseDef(), createTableDef(), createColumnDef(),
                            createPentahoJobDef(), createSqlJobDef(), createSqlStatementDef()),
                    Arrays.asList(createRelationshipInputToStatementDef(), createRelationshipOutputOfStatementDef(),
                            createRelationshipTableColumnDef(), createRelationshipPentahoJobSqlJobDef(),
                            createRelationshipSqlJobStatementDef())
            );
            for (AtlasEntityDef entityDef : typesDef.getEntityDefs()) {
                if (atlasClient.typeWithNameExists(entityDef.getName())) {
                    logger.info(entityDef.getName() + ": type already exists. Skipping");
                } else {
                    atlasTypes.getEntityDefs().add(entityDef);
                }
            }
            for (AtlasRelationshipDef relationshipDef : typesDef.getRelationshipDefs()) {
                if (atlasClient.typeWithNameExists(relationshipDef.getName())) {
                    logger.info(relationshipDef.getName() + ": type already exists. Skipping");
                } else {
                    atlasTypes.getRelationshipDefs().add(relationshipDef);
                }
            }
        }
        return atlasTypes;
    }

    private AtlasRelationshipDef createRelationshipTableColumnDef() {
        return createRelationshipTypeDef(Relationships.COLUMN_PART_OF_TABLE, Relationships.COLUMN_PART_OF_TABLE,
                "1.0", COMPOSITION, AtlasRelationshipDef.PropagateTags.NONE,
                createRelationshipEndDef(TypeDefs.TABLE, TypeDefs.COLUMN, SET, true),
                createRelationshipEndDef(TypeDefs.COLUMN, TypeDefs.TABLE, SINGLE, false));
    }

    private AtlasRelationshipDef createRelationshipPentahoJobSqlJobDef() {
        return createRelationshipTypeDef(Relationships.SQL_JOB_PART_OF_PENTAHO_JOB, Relationships.SQL_JOB_PART_OF_PENTAHO_JOB,
                "1.0", COMPOSITION, AtlasRelationshipDef.PropagateTags.NONE,
                createRelationshipEndDef(TypeDefs.PENTAHO_JOB, TypeDefs.SQL_JOB, SET, true),
                createRelationshipEndDef(TypeDefs.SQL_JOB, TypeDefs.PENTAHO_JOB, SINGLE, false));
    }

    private AtlasRelationshipDef createRelationshipSqlJobStatementDef() {
        return createRelationshipTypeDef(Relationships.STATEMENT_PART_OF_JOB, Relationships.STATEMENT_PART_OF_JOB,
                "1.0", COMPOSITION, AtlasRelationshipDef.PropagateTags.NONE,
                createRelationshipEndDef(TypeDefs.SQL_JOB, TypeDefs.SQL_STATEMENT, SET, true),
                createRelationshipEndDef(TypeDefs.SQL_STATEMENT, TypeDefs.SQL_JOB, SINGLE, false));
    }

    private AtlasRelationshipDef createRelationshipInputToStatementDef() {
        return createRelationshipTypeDef(Relationships.INPUT_TO_STATEMENT, Relationships.INPUT_TO_STATEMENT,
                "1.0", ASSOCIATION, AtlasRelationshipDef.PropagateTags.NONE,
                createRelationshipEndDef(TypeDefs.TABLE, TypeDefs.SQL_STATEMENT, SET, true),
                createRelationshipEndDef(TypeDefs.SQL_STATEMENT, TypeDefs.TABLE, SINGLE, false));
    }

    private AtlasRelationshipDef createRelationshipOutputOfStatementDef() {
        return createRelationshipTypeDef(Relationships.OUTPUT_OF_STATEMENT, Relationships.OUTPUT_OF_STATEMENT,
                "1.0", ASSOCIATION, AtlasRelationshipDef.PropagateTags.NONE,
                createRelationshipEndDef(TypeDefs.TABLE, TypeDefs.SQL_STATEMENT, SINGLE, true),
                createRelationshipEndDef(TypeDefs.SQL_STATEMENT, TypeDefs.TABLE, SINGLE, false));
    }
}
