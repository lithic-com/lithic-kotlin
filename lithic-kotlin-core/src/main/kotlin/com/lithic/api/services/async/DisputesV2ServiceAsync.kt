// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DisputeV2
import com.lithic.api.models.DisputesV2ListPageAsync
import com.lithic.api.models.DisputesV2ListParams
import com.lithic.api.models.DisputesV2RetrieveParams

interface DisputesV2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputesV2ServiceAsync

    /** Retrieves a specific dispute by its token. */
    suspend fun retrieve(
        disputeToken: String,
        params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeV2 = retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DisputesV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeV2

    /** @see retrieve */
    suspend fun retrieve(disputeToken: String, requestOptions: RequestOptions): DisputeV2 =
        retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

    /** Returns a paginated list of disputes. */
    suspend fun list(
        params: DisputesV2ListParams = DisputesV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputesV2ListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DisputesV2ListPageAsync =
        list(DisputesV2ListParams.none(), requestOptions)

    /**
     * A view of [DisputesV2ServiceAsync] that provides access to raw HTTP responses for each
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
        ): DisputesV2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputesV2ServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            disputeToken: String,
            params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeV2> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DisputesV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeV2>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeV2> =
            retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/disputes`, but is otherwise the same as
         * [DisputesV2ServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DisputesV2ListParams = DisputesV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputesV2ListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DisputesV2ListPageAsync> =
            list(DisputesV2ListParams.none(), requestOptions)
    }
}
