# kyc-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swift</groupId>
    <artifactId>kyc-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swift:kyc-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/kyc-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swift.*;
import com.swift.auth.*;
import com.swift.model.*;
import com.swift.api.ConsumptionApi;

import java.io.File;
import java.util.*;

public class ConsumptionApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        ConsumptionApi apiInstance = new ConsumptionApi();
        String BIC = "BIC_example"; // String | BIC of the entity for which the data needs to be extracted
        String documentId = "documentId_example"; // String | This Id is generated for each document
        try {
            Object result = apiInstance.documentNameByBicAndFolderIdGet(BIC, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumptionApi#documentNameByBicAndFolderIdGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsumptionApi* | [**documentNameByBicAndFolderIdGet**](docs/ConsumptionApi.md#documentNameByBicAndFolderIdGet) | **GET** /entities/folders/document/download | Get KYC Document by Id
*ConsumptionApi* | [**entityFoldersProfileByBicGet**](docs/ConsumptionApi.md#entityFoldersProfileByBicGet) | **GET** /entities/folders/{BIC}/download | Download KYC Counterparties Data As Zip by BIC
*ListRetrievalApi* | [**counterpartiesMyGet**](docs/ListRetrievalApi.md#counterpartiesMyGet) | **GET** /entities/counterparty | Get My Counterparties
*ListRetrievalApi* | [**entitiesMyGet**](docs/ListRetrievalApi.md#entitiesMyGet) | **GET** /entities/my | Get My Entities


## Documentation for Models

 - [Data11](docs/Data11.md)
 - [DataMycounterparty](docs/DataMycounterparty.md)
 - [DataMyentity](docs/DataMyentity.md)
 - [Document201](docs/Document201.md)
 - [DocumentObj](docs/DocumentObj.md)
 - [EntityList](docs/EntityList.md)
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
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Hassan.MOLLAH@swift.com

