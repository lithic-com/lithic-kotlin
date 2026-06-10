// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseFile
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileListPageAsync
import com.lithic.api.models.TransactionMonitoringCaseFileListParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync

    /** Creates a file record and returns a presigned URL for uploading the file to the case. */
    suspend fun create(
        caseToken: String,
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile = create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile

    /**
     * Retrieves a single file attached to a case, including a presigned download URL when the file
     * is ready.
     */
    suspend fun retrieve(
        fileToken: String,
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile = retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseFile

    /** Lists the files attached to a case. */
    suspend fun list(
        caseToken: String,
        params: TransactionMonitoringCaseFileListParams =
            TransactionMonitoringCaseFileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseFileListPageAsync =
        list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: TransactionMonitoringCaseFileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseFileListPageAsync

    /** @see list */
    suspend fun list(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseFileListPageAsync =
        list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

    /** Deletes a file from a case. */
    suspend fun delete(
        fileToken: String,
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            caseToken: String,
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile> =
            create(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            fileToken: String,
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile> =
            retrieve(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseFile>

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            caseToken: String,
            params: TransactionMonitoringCaseFileListParams =
                TransactionMonitoringCaseFileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseFileListPageAsync> =
            list(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: TransactionMonitoringCaseFileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseFileListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseFileListPageAsync> =
            list(caseToken, TransactionMonitoringCaseFileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/transaction_monitoring/cases/{case_token}/files/{file_token}`, but is otherwise the
         * same as [FileServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            fileToken: String,
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileToken(fileToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
