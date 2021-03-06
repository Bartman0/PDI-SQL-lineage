# Introduction 
SQLLineage is PoC code to parse out Pentaho workflows including SQL components and their SQL code itself. From these workflow objects, jobs and SQL code, a complete lineage is built up at the table level in Neo4j.
From the Neo4j graph database one can analyse code, determine shortest/longest paths, in/out degree for tables, etc, etc.

# Getting Started
1. Get a Neo4j database running
2. Run the code against a Pentaho workflow with SQL components in there

## Get a Neo4j database running

This part should be easy, I use a Docker image myself for this:
```
docker run -it --rm --publish=7474:7474 --publish=7687:7687 --volume=$HOME/neo4j/data:/data --env NEO4J_AUTH=neo4j/<password> neo4j
```

with APOC package:

```
docker run -it --rm --publish=7474:7474 --publish=7687:7687 --volume=$HOME/neo4j/data:/data --env NEO4J_AUTH=neo4j/k00ijman --name neo4j-apoc -e NEO4J_apoc_export_file_enabled=true -e NEO4J_apoc_import_file_enabled=true -e NEO4J_apoc_import_file_use__neo4j__config=true -e NEO4JLABS_PLUGINS=\[\"apoc\"\] neo4j
```

Please fill in a password of your own choosing. The database itself is simply named 'neo4j'.
For more information see [How-To: Run Neo4j in Docker](https://neo4j.com/developer/docker-run-neo4j/).


## Run the code against a Pentaho workflow with SQL components in there

Example call:
```
java -cp <...> nl.inergy.Main -s bolt://localhost:7687 -u neo4j -P <password> -b neo4j <path_to_pdi_workflow_kjb_file>
```
The password here is the same as the one you set in the previous step.

# Caveat emptor

The code has two hard-coded steps to set variable values within the Pentaho DI integrator context. The related variables are based on conventions we use in our projects.
The names of those variables:
- project_root_dir: essentially the same as `${Internal.Job.Filename.Directory}` appended with `/etl/` subdirectory
- sql_script_name: the name of the SQL script name to use in SQL components that have a file reference such as `${project_root_dir}/sql/da/${Internal.Job.Name}.sql`

I had to use these hacks because I could not find a way to have these variables set by using Pentaho DI API calls. Maybe they are there, but they remain unknown to me. And since this was a PoC I found it acceptable to work around these dependencies we rely upon.
This all means that to use this code in your context, you might need to have to extend these hacks for 'your' specific variables/parameters.

# Next steps

- add graph queries to output information on the resulting lineage
- extend lineage by adding Tableau datasource details: used tables, column aliases, calculated fields
- extend lineage by adding MicroStrategy schema object details: used tables, column aliases, attributes and metrics
- extend lineage to the column level

# Major packages used

* [Pentaho-Kettle](https://github.com/pentaho/pentaho-kettle) for parsing out Kettle jobs.
* [JSQLParser](https://github.com/JSQLParser/JSqlParser) for parsing out SQL code.

# Last remarks

References to Purview still exist in this code. Originally I started this project with Purview as backend in my mind. But at a certain point it just seemed easier to just use Neo4j. This means any visualisation power that Purview might have, can not be used on the lineage graphs. I am still searching for a good alternative for the specific visualisation part. Neo4j Browser is too simple for this. 
