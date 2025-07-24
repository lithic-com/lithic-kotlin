// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams

interface EnhancedCommercialDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EnhancedCommercialDataServiceAsync

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    suspend fun retrieve(
        transactionToken: String,
        params: TransactionEnhancedCommercialDataRetrieveParams =
            TransactionEnhancedCommercialDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): EnhancedCommercialDataRetrieveResponse =
        retrieve(
            transactionToken,
            TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [EnhancedCommercialDataServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EnhancedCommercialDataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/transactions/{transaction_token}/enhanced_commercial_data`, but is otherwise the same
         * as [EnhancedCommercialDataServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            params: TransactionEnhancedCommercialDataRetrieveParams =
                TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(
                transactionToken,
                TransactionEnhancedCommercialDataRetrieveParams.none(),
                requestOptions,
            )
    }
}
