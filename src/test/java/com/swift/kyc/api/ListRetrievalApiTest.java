/*
 * KYC API
 * Move your app forward with the kyc API
 */




package com.swift.kyc.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.kyc.ApiException;
import com.swift.kyc.model.EntityList;
import com.swift.kyc.model.ListOfCounterparties;

/**
 * API tests for ListRetrievalApi
 */

public class ListRetrievalApiTest {

   ListRetrievalApi api = mock(ListRetrievalApi.class);
   
    
    /**
     * Get My Counterparties
     *
     * This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void counterpartiesMyGetTest() throws ApiException {
        ListOfCounterparties mock_ApiResponse = mock(ListOfCounterparties.class);
        when(api.counterpartiesMyGet()).thenReturn(mock_ApiResponse);
        Assert.assertEquals(api.counterpartiesMyGet(),mock_ApiResponse);
        System.out.println("Passed Test counterpartiesMyGetTest");
    }
    
    /**
     * Get My Entities
     *
     * This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entitiesMyGetTest() throws ApiException {
        
        EntityList mock_ApiResponse = mock(EntityList.class);
        when(api.entitiesMyGet()).thenReturn(mock_ApiResponse);
        Assert.assertEquals(api.entitiesMyGet(),mock_ApiResponse);
        System.out.println("Passed Test entitiesMyGetTest");
    }
    
}
