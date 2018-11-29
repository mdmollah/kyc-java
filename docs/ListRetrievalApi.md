# ListRetrievalApi

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**counterpartiesMyGet**](ListRetrievalApi.md#counterpartiesMyGet) | **GET** /entities/counterparty | Get My Counterparties
[**entitiesMyGet**](ListRetrievalApi.md#entitiesMyGet) | **GET** /entities/my | Get My Entities


<a name="counterpartiesMyGet"></a>
# **counterpartiesMyGet**
> ListOfCounterparties counterpartiesMyGet()

Get My Counterparties

This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.

### Example
```java
// Import classes:
//import com.swift.kyc.ApiClient;
//import com.swift.kyc.ApiException;
//import com.swift.kyc.Configuration;
//import com.swift.kyc.auth.*;
//import com.swift.kyc.api.ListRetrievalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ListRetrievalApi apiInstance = new ListRetrievalApi();
try {
    ListOfCounterparties result = apiInstance.counterpartiesMyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListRetrievalApi#counterpartiesMyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListOfCounterparties**](ListOfCounterparties.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="entitiesMyGet"></a>
# **entitiesMyGet**
> EntityList entitiesMyGet()

Get My Entities

This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group

### Example
```java
// Import classes:
//import com.swift.kyc.ApiClient;
//import com.swift.kyc.ApiException;
//import com.swift.kyc.Configuration;
//import com.swift.kyc.auth.*;
//import com.swift.kyc.api.ListRetrievalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ListRetrievalApi apiInstance = new ListRetrievalApi();
try {
    EntityList result = apiInstance.entitiesMyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListRetrievalApi#entitiesMyGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EntityList**](EntityList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

