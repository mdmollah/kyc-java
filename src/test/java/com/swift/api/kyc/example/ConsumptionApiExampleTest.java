package com.swift.api.kyc.example;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.swift.api.kyc.ApiClient;
import com.swift.api.kyc.ApiException;
import com.swift.api.kyc.Configuration;
import com.swift.api.kyc.api.ConsumptionApi;
import com.swift.api.kyc.auth.OAuth;
import com.swift.api.kyc.model.EntityList;
import com.swift.api.kyc.model.ListOfCounterparties;

import junitparams.JUnitParamsRunner;

@Ignore
@RunWith(JUnitParamsRunner.class)
public class ConsumptionApiExampleTest {

	@Test
	public void counterpartiesMyGetTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
			ListOfCounterparties result = apiInstance.counterpartiesMyGet();
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling ConsumptionApi#counterpartiesMyGet");
			e.printStackTrace();
		}
	}
	@Test
	public void entitiesMyGetTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
		    EntityList result = apiInstance.entitiesMyGet();
		    System.out.println(result);
		} catch (ApiException e) {
		    System.err.println("Exception when calling ConsumptionApi#entitiesMyGet");
		    e.printStackTrace();
		}
	}
}
