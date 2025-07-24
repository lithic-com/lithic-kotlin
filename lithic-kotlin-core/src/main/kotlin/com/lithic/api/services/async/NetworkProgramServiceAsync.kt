// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkProgram
import com.lithic.api.models.NetworkProgramListPageAsync
import com.lithic.api.models.NetworkProgramListParams
import com.lithic.api.models.NetworkProgramRetrieveParams

interface NetworkProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NetworkProgramServiceAsync

    /** Get network program. */
    suspend fun retrieve(
        networkProgramToken: String,
        params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgram =
        retrieve(
            params.toBuilder().networkProgramToken(networkProgramToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: NetworkProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgram

    /** @see retrieve */
    suspend fun retrieve(
        networkProgramToken: String,
        requestOptions: RequestOptions,
    ): NetworkProgram =
        retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

    /** List network programs. */
    suspend fun list(
        params: NetworkProgramListParams = NetworkProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgramListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): NetworkProgramListPageAsync =
        list(NetworkProgramListParams.none(), requestOptions)

    /**
     * A view of [NetworkProgramServiceAsync] that provides access to raw HTTP responses for each
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
        ): NetworkProgramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/network_programs/{network_program_token}`, but
         * is otherwise the same as [NetworkProgramServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            networkProgramToken: String,
            params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgram> =
            retrieve(
                params.toBuilder().networkProgramToken(networkProgramToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: NetworkProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgram>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            networkProgramToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkProgram> =
            retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/network_programs`, but is otherwise the same as
         * [NetworkProgramServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: NetworkProgramListParams = NetworkProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgramListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NetworkProgramListPageAsync> =
            list(NetworkProgramListParams.none(), requestOptions)
    }
}
