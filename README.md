# KYC Java Client [![Build Status](https://travis-ci.com/swiftinc/kyc-java.svg?branch=master)](https://travis-ci.com/swiftinc/kyc-java)

## Overview

This is the kyc java client project, which allows generation of KYC API client libraries (SDK generation), server stubs and execute the example tests. Currently, the following languages/frameworks are supported:

* Java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

## Test
### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swift.kyc</groupId>
    <artifactId>java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-1.0.0.jar


## Example for API Endpoints

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsumptionApi* | [**counterpartiesMyGet**](docs/ConsumptionApi.md#counterpartiesMyGet) | **GET** /entities/counterparty | Get My Counterparties
*ConsumptionApi* | [**entitiesMyGet**](docs/ConsumptionApi.md#entitiesMyGet) | **GET** /entities/my | Get My Entities

## Documentation for Models

 - [Data](docs/Data.md)
 - [Data11](docs/Data11.md)
 - [DataIoc](docs/DataIoc.md)
 - [DataIocInner](docs/DataIocInner.md)
 - [DataMycounterparty](docs/DataMycounterparty.md)
 - [DataMyentity](docs/DataMyentity.md)
 - [Document201](docs/Document201.md)
 - [DocumentModel](docs/DocumentModel.md)
 - [DocumentObj](docs/DocumentObj.md)
 - [Entity](docs/Entity.md)
 - [EntityList](docs/EntityList.md)
 - [Folders](docs/Folders.md)
 - [IndustryClassifications](docs/IndustryClassifications.md)
 - [LicenceInfo](docs/LicenceInfo.md)
 - [LicenceTypes](docs/LicenceTypes.md)
 - [LicencesInfo](docs/LicencesInfo.md)
 - [ListOfCounterparties](docs/ListOfCounterparties.md)
 - [SICCodes](docs/SICCodes.md)
 - [SanctionsListsInUsed](docs/SanctionsListsInUsed.md)
 - [SanctionsListsInUsedEU](docs/SanctionsListsInUsedEU.md)
 - [SanctionsListsInUsedG7](docs/SanctionsListsInUsedG7.md)
 - [SanctionsListsInUsedOFAC](docs/SanctionsListsInUsedOFAC.md)
 - [SanctionsListsInUsedOFSI](docs/SanctionsListsInUsedOFSI.md)
 - [SanctionsListsInUsedUN](docs/SanctionsListsInUsedUN.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: https://sandbox.swift.com/oauth2/v1
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Hassan.MOLLAH@swift.com

