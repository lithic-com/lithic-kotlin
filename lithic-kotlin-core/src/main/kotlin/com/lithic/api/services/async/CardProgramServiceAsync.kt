// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPageAsync
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams

interface CardProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get card program. */
    suspend fun retrieve(
        cardProgramToken: String,
        params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgram =
        retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgram

    /** @see [retrieve] */
    suspend fun retrieve(cardProgramToken: String, requestOptions: RequestOptions): CardProgram =
        retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

    /** List card programs. */
    suspend fun list(
        params: CardProgramListParams = CardProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgramListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardProgramListPageAsync =
        list(CardProgramListParams.none(), requestOptions)

    /**
     * A view of [CardProgramServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/card_programs/{card_program_token}`, but is
         * otherwise the same as [CardProgramServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardProgramToken: String,
            params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgram> =
            retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CardProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgram>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            cardProgramToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProgram> =
            retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/card_programs`, but is otherwise the same as
         * [CardProgramServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardProgramListParams = CardProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgramListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardProgramListPageAsync> =
            list(CardProgramListParams.none(), requestOptions)
    }
}
