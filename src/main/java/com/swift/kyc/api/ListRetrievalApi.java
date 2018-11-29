/*
 * KYC API
 * Move your app forward with the kyc API
 */


package com.swift.kyc.api;

import com.swift.kyc.ApiCallback;
import com.swift.kyc.ApiClient;
import com.swift.kyc.ApiException;
import com.swift.kyc.ApiResponse;
import com.swift.kyc.Configuration;
import com.swift.kyc.Pair;
import com.swift.kyc.ProgressRequestBody;
import com.swift.kyc.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.swift.kyc.model.EntityList;
import com.swift.kyc.model.ListOfCounterparties;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListRetrievalApi {
    private ApiClient apiClient;

    public ListRetrievalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListRetrievalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for counterpartiesMyGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call counterpartiesMyGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entities/counterparty";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call counterpartiesMyGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = counterpartiesMyGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get My Counterparties
     * This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.
     * @return ListOfCounterparties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListOfCounterparties counterpartiesMyGet() throws ApiException {
        ApiResponse<ListOfCounterparties> resp = counterpartiesMyGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get My Counterparties
     * This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.
     * @return ApiResponse&lt;ListOfCounterparties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListOfCounterparties> counterpartiesMyGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = counterpartiesMyGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ListOfCounterparties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get My Counterparties (asynchronously)
     * This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call counterpartiesMyGetAsync(final ApiCallback<ListOfCounterparties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = counterpartiesMyGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListOfCounterparties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for entitiesMyGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entitiesMyGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entities/my";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call entitiesMyGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = entitiesMyGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get My Entities
     * This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group
     * @return EntityList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityList entitiesMyGet() throws ApiException {
        ApiResponse<EntityList> resp = entitiesMyGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get My Entities
     * This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group
     * @return ApiResponse&lt;EntityList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityList> entitiesMyGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = entitiesMyGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<EntityList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get My Entities (asynchronously)
     * This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entitiesMyGetAsync(final ApiCallback<EntityList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = entitiesMyGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
