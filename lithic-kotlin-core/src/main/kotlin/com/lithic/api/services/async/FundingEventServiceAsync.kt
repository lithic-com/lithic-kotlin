// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FundingEventListPageAsync
import com.lithic.api.models.FundingEventListParams
import com.lithic.api.models.FundingEventRetrieveDetailsParams
import com.lithic.api.models.FundingEventRetrieveDetailsResponse
import com.lithic.api.models.FundingEventRetrieveParams
import com.lithic.api.models.FundingEventRetrieveResponse

interface FundingEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FundingEventServiceAsync

    /** Get funding event for program by id */
    suspend fun retrieve(
        fundingEventToken: String,
        params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveResponse =
        retrieve(params.toBuilder().fundingEventToken(fundingEventToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: FundingEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveResponse =
        retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

    /** Get all funding events for program */
    suspend fun list(
        params: FundingEventListParams = FundingEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): FundingEventListPageAsync =
        list(FundingEventListParams.none(), requestOptions)

    /** Get funding event details by id */
    suspend fun retrieveDetails(
        fundingEventToken: String,
        params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveDetailsResponse =
        retrieveDetails(
            params.toBuilder().fundingEventToken(fundingEventToken).build(),
            requestOptions,
        )

    /** @see [retrieveDetails] */
    suspend fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundingEventRetrieveDetailsResponse

    /** @see [retrieveDetails] */
    suspend fun retrieveDetails(
        fundingEventToken: String,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveDetailsResponse =
        retrieveDetails(fundingEventToken, FundingEventRetrieveDetailsParams.none(), requestOptions)

    /**
     * A view of [FundingEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): FundingEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}`, but is
         * otherwise the same as [FundingEventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            fundingEventToken: String,
            params: FundingEventRetrieveParams = FundingEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: FundingEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveResponse> =
            retrieve(fundingEventToken, FundingEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events`, but is otherwise the same as
         * [FundingEventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FundingEventListParams = FundingEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<FundingEventListPageAsync> =
            list(FundingEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/funding_events/{funding_event_token}/details`,
         * but is otherwise the same as [FundingEventServiceAsync.retrieveDetails].
         */
        @MustBeClosed
        suspend fun retrieveDetails(
            fundingEventToken: String,
            params: FundingEventRetrieveDetailsParams = FundingEventRetrieveDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(
                params.toBuilder().fundingEventToken(fundingEventToken).build(),
                requestOptions,
            )

        /** @see [retrieveDetails] */
        @MustBeClosed
        suspend fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse>

        /** @see [retrieveDetails] */
        @MustBeClosed
        suspend fun retrieveDetails(
            fundingEventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> =
            retrieveDetails(
                fundingEventToken,
                FundingEventRetrieveDetailsParams.none(),
                requestOptions,
            )
    }
}
