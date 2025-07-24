// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.fraud

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FraudTransactionReportParams
import com.lithic.api.models.FraudTransactionRetrieveParams
import com.lithic.api.models.TransactionReportResponse
import com.lithic.api.models.TransactionRetrieveResponse

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    /**
     * Retrieve a fraud report for a specific transaction identified by its unique transaction
     * token.
     */
    suspend fun retrieve(
        transactionToken: String,
        params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: FraudTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): TransactionRetrieveResponse =
        retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

    /**
     * Report fraud for a specific transaction token by providing details such as fraud type, fraud
     * status, and any additional comments.
     */
    suspend fun report(
        transactionToken: String,
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionReportResponse =
        report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see report */
    suspend fun report(
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionReportResponse

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FraudTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.report].
         */
        @MustBeClosed
        suspend fun report(
            transactionToken: String,
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionReportResponse> =
            report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see report */
        @MustBeClosed
        suspend fun report(
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionReportResponse>
    }
}
