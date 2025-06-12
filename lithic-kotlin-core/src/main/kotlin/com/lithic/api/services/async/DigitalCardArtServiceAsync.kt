// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPageAsync
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams

interface DigitalCardArtServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DigitalCardArtServiceAsync

    /** Get digital card art by token. */
    suspend fun retrieve(
        digitalCardArtToken: String,
        params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArt =
        retrieve(
            params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArt

    /** @see [retrieve] */
    suspend fun retrieve(
        digitalCardArtToken: String,
        requestOptions: RequestOptions,
    ): DigitalCardArt =
        retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

    /** List digital card art. */
    suspend fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArtListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DigitalCardArtListPageAsync =
        list(DigitalCardArtListParams.none(), requestOptions)

    /**
     * A view of [DigitalCardArtServiceAsync] that provides access to raw HTTP responses for each
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
        ): DigitalCardArtServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art/{digital_card_art_token}`, but
         * is otherwise the same as [DigitalCardArtServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            digitalCardArtToken: String,
            params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArt> =
            retrieve(
                params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArt>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            digitalCardArtToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardArt> =
            retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArtListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DigitalCardArtListPageAsync> =
            list(DigitalCardArtListParams.none(), requestOptions)
    }
}
