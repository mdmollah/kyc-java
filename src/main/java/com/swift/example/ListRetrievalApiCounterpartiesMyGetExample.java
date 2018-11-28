package com.swift.example;

import com.swift.ApiClient;
import com.swift.ApiException;
import com.swift.Configuration;
import com.swift.api.ListRetrievalApi;
import com.swift.auth.*;
import com.swift.model.ListOfCounterparties;

public class ListRetrievalApiCounterpartiesMyGetExample {
	public static void main(String[] args) {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("your_access_token");

		ListRetrievalApi apiInstance = new ListRetrievalApi();

		try {
			ListOfCounterparties result = apiInstance.counterpartiesMyGet();
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling ListRetrievalApi#counterpartiesMyGet");
			e.printStackTrace();
		}
	}
}
