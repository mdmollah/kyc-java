package com.swift.example;

import com.swift.ApiClient;
import com.swift.ApiException;
import com.swift.Configuration;
import com.swift.api.ListRetrievalApi;
import com.swift.auth.OAuth;
import com.swift.model.EntityList;

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
