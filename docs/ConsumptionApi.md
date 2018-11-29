# ConsumptionApi

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentNameByBicAndFolderIdGet**](ConsumptionApi.md#documentNameByBicAndFolderIdGet) | **GET** /entities/folders/document/download | Get KYC Document by Id
[**entityFoldersProfileByBicGet**](ConsumptionApi.md#entityFoldersProfileByBicGet) | **GET** /entities/folders/{BIC}/download | Download KYC Counterparties Data As Zip by BIC


<a name="documentNameByBicAndFolderIdGet"></a>
# **documentNameByBicAndFolderIdGet**
> Object documentNameByBicAndFolderIdGet(BIC, documentId)

Get KYC Document by Id

This API is a consumption query that enables you to download an evidencing document for the BIC specified.

### Example
```java
// Import classes:
//import com.swift.kyc.ApiClient;
//import com.swift.kyc.ApiException;
//import com.swift.kyc.Configuration;
//import com.swift.kyc.auth.*;
//import com.swift.kyc.api.ConsumptionApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BIC** | **String**| BIC of the entity for which the data needs to be extracted |
 **documentId** | **String**| This Id is generated for each document |

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="entityFoldersProfileByBicGet"></a>
# **entityFoldersProfileByBicGet**
> Object entityFoldersProfileByBicGet(BIC, lastPublishedSince)

Download KYC Counterparties Data As Zip by BIC

This API is a consumption query that enables you to extract the KYC profile in zip data folder which includes all data points (in PDFs, json, and xml) and evidencing documents spread across the 5 folder categories of the baseline for the BIC specified. Please note this API will not include the annual report and signatory list which can be downloaded via GetKYCDocument.

### Example
```java
// Import classes:
//import com.swift.kyc.ApiClient;
//import com.swift.kyc.ApiException;
//import com.swift.kyc.Configuration;
//import com.swift.kyc.auth.*;
//import com.swift.kyc.api.ConsumptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ConsumptionApi apiInstance = new ConsumptionApi();
String BIC = "BIC_example"; // String | BIC of the entity for which the data needs to be extracted
String lastPublishedSince = "lastPublishedSince_example"; // String | This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD).
try {
    Object result = apiInstance.entityFoldersProfileByBicGet(BIC, lastPublishedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsumptionApi#entityFoldersProfileByBicGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BIC** | **String**| BIC of the entity for which the data needs to be extracted |
 **lastPublishedSince** | **String**| This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). | [optional]

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

