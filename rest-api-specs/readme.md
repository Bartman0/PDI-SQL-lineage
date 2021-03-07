# Azure Purview Catalog Service REST APIs

This is the Swagger for Azure Purview Catalog Service.

### Install Autorest

> see https://aka.ms/autorest

To build the SDK for Azure Purview Catalog, simply [Install AutoRest](https://aka.ms/autorest/install) and in this folder, run:
```bash
`autorest`
```
To see additional help and options, run:
```bash
`autorest --help`
```
Install `node.js` and `npm`
```bash
`npm install -g autorest@V2`
```

### Client SDK Generate

```bash
autorest --input-file=data-plane/preview/purviewcatalog.json --java --output-folder=PurviewCatalogClient/Java --namespace=PurviewCatalog --add-credentials
```

```bash
autorest --input-file=data-plane/preview/purviewcatalog.json --csharp --output-folder=PurviewCatalogClient/CSharp --namespace=PurviewCatalog --add-credentials
```

Client SDK code will be generated under `PurviewCatalogClient` folder
