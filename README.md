# kyc-java [![Build Status](https://travis-ci.com/swiftinc/kyc-java.svg?branch=master)](https://travis-ci.com/swiftinc/kyc-java)

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
    <groupId>com.swift.kyc</groupId>
    <artifactId>kyc-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swift.kyc:kyc-java:1.0.0"
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

import com.swift.kyc.ApiClient;
import com.swift.kyc.ApiException;
import com.swift.kyc.Configuration;
import com.swift.kyc.api.ListRetrievalApi;
import com.swift.kyc.auth.OAuth;
import com.swift.kyc.model.EntityList;

public class ListRetrievalApiEntitiesMyGetExample {

	public static void main(String[] args) {
		
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("your_access_token");

		ListRetrievalApi apiInstance = new ListRetrievalApi();
		try {
		    EntityList result = apiInstance.entitiesMyGet();
		    System.out.println(result);
		} catch (ApiException e) {
		    System.err.println("Exception when calling ListRetrievalApi#entitiesMyGet");
		    e.printStackTrace();
		}
	}

}


```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
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

