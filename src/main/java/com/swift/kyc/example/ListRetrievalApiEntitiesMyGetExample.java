package com.swift.kyc.example;

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
