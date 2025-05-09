// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPage
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams

interface CardProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get card program. */
    fun retrieve(
        cardProgramToken: String,
        params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgram =
        retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgram

    /** @see [retrieve] */
    fun retrieve(cardProgramToken: String, requestOptions: RequestOptions): CardProgram =
        retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

    /** List card programs. */
    fun list(
        params: CardProgramListParams = CardProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProgramListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardProgramListPage =
        list(CardProgramListParams.none(), requestOptions)

    /**
     * A view of [CardProgramService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/card_programs/{card_program_token}`, but is
         * otherwise the same as [CardProgramService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardProgramToken: String,
            params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgram> =
            retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgram>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardProgramToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProgram> =
            retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/card_programs`, but is otherwise the same as
         * [CardProgramService.list].
         */
        @MustBeClosed
        fun list(
            params: CardProgramListParams = CardProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProgramListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardProgramListPage> =
            list(CardProgramListParams.none(), requestOptions)
    }
}
