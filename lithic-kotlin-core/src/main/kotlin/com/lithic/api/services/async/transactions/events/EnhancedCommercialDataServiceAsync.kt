// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams

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
     * Get L2/L3 enhanced commercial data associated with a transaction event. Not available in
     * sandbox.
     */
    suspend fun retrieve(
        eventToken: String,
        params: TransactionEventEnhancedCommercialDataRetrieveParams =
            TransactionEventEnhancedCommercialDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedData = retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedData

    /** @see retrieve */
    suspend fun retrieve(eventToken: String, requestOptions: RequestOptions): EnhancedData =
        retrieve(
            eventToken,
            TransactionEventEnhancedCommercialDataRetrieveParams.none(),
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
         * /v1/transactions/events/{event_token}/enhanced_commercial_data`, but is otherwise the
         * same as [EnhancedCommercialDataServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            eventToken: String,
            params: TransactionEventEnhancedCommercialDataRetrieveParams =
                TransactionEventEnhancedCommercialDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedData> =
            retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionEventEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedData>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            eventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedData> =
            retrieve(
                eventToken,
                TransactionEventEnhancedCommercialDataRetrieveParams.none(),
                requestOptions,
            )
    }
}
