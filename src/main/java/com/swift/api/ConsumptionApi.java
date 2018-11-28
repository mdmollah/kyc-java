/*
 * KYC API
 */



package com.swift.api;

import com.swift.ApiCallback;
import com.swift.ApiClient;
import com.swift.ApiException;
import com.swift.ApiResponse;
import com.swift.Configuration;
import com.swift.Pair;
import com.swift.ProgressRequestBody;
import com.swift.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumptionApi {
    private ApiClient apiClient;

    public ConsumptionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsumptionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for documentNameByBicAndFolderIdGet
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param documentId This Id is generated for each document (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call documentNameByBicAndFolderIdGetCall(String BIC, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entities/folders/document/download"
            .replaceAll("\\{" + "BIC" + "\\}", apiClient.escapeString(BIC.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (documentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("documentId", documentId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private com.squareup.okhttp.Call documentNameByBicAndFolderIdGetValidateBeforeCall(String BIC, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'BIC' is set
        if (BIC == null) {
            throw new ApiException("Missing the required parameter 'BIC' when calling documentNameByBicAndFolderIdGet(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling documentNameByBicAndFolderIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = documentNameByBicAndFolderIdGetCall(BIC, documentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get KYC Document by Id
     * This API is a consumption query that enables you to download an evidencing document for the BIC specified.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param documentId This Id is generated for each document (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object documentNameByBicAndFolderIdGet(String BIC, String documentId) throws ApiException {
        ApiResponse<Object> resp = documentNameByBicAndFolderIdGetWithHttpInfo(BIC, documentId);
        return resp.getData();
    }

    /**
     * Get KYC Document by Id
     * This API is a consumption query that enables you to download an evidencing document for the BIC specified.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param documentId This Id is generated for each document (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> documentNameByBicAndFolderIdGetWithHttpInfo(String BIC, String documentId) throws ApiException {
        com.squareup.okhttp.Call call = documentNameByBicAndFolderIdGetValidateBeforeCall(BIC, documentId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get KYC Document by Id (asynchronously)
     * This API is a consumption query that enables you to download an evidencing document for the BIC specified.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param documentId This Id is generated for each document (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call documentNameByBicAndFolderIdGetAsync(String BIC, String documentId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = documentNameByBicAndFolderIdGetValidateBeforeCall(BIC, documentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for entityFoldersProfileByBicGet
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param lastPublishedSince This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call entityFoldersProfileByBicGetCall(String BIC, String lastPublishedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entities/folders/{BIC}/download"
            .replaceAll("\\{" + "BIC" + "\\}", apiClient.escapeString(BIC.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lastPublishedSince != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lastPublishedSince", lastPublishedSince));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
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
    private com.squareup.okhttp.Call entityFoldersProfileByBicGetValidateBeforeCall(String BIC, String lastPublishedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'BIC' is set
        if (BIC == null) {
            throw new ApiException("Missing the required parameter 'BIC' when calling entityFoldersProfileByBicGet(Async)");
        }
        

        com.squareup.okhttp.Call call = entityFoldersProfileByBicGetCall(BIC, lastPublishedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download KYC Counterparties Data As Zip by BIC
     * This API is a consumption query that enables you to extract the KYC profile in zip data folder which includes all data points (in PDFs, json, and xml) and evidencing documents spread across the 5 folder categories of the baseline for the BIC specified. Please note this API will not include the annual report and signatory list which can be downloaded via GetKYCDocument.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param lastPublishedSince This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object entityFoldersProfileByBicGet(String BIC, String lastPublishedSince) throws ApiException {
        ApiResponse<Object> resp = entityFoldersProfileByBicGetWithHttpInfo(BIC, lastPublishedSince);
        return resp.getData();
    }

    /**
     * Download KYC Counterparties Data As Zip by BIC
     * This API is a consumption query that enables you to extract the KYC profile in zip data folder which includes all data points (in PDFs, json, and xml) and evidencing documents spread across the 5 folder categories of the baseline for the BIC specified. Please note this API will not include the annual report and signatory list which can be downloaded via GetKYCDocument.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param lastPublishedSince This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> entityFoldersProfileByBicGetWithHttpInfo(String BIC, String lastPublishedSince) throws ApiException {
        com.squareup.okhttp.Call call = entityFoldersProfileByBicGetValidateBeforeCall(BIC, lastPublishedSince, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download KYC Counterparties Data As Zip by BIC (asynchronously)
     * This API is a consumption query that enables you to extract the KYC profile in zip data folder which includes all data points (in PDFs, json, and xml) and evidencing documents spread across the 5 folder categories of the baseline for the BIC specified. Please note this API will not include the annual report and signatory list which can be downloaded via GetKYCDocument.
     * @param BIC BIC of the entity for which the data needs to be extracted (required)
     * @param lastPublishedSince This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call entityFoldersProfileByBicGetAsync(String BIC, String lastPublishedSince, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = entityFoldersProfileByBicGetValidateBeforeCall(BIC, lastPublishedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
