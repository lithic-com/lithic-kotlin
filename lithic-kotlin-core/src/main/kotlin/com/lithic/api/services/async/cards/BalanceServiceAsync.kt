// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBalanceListPageAsync
import com.lithic.api.models.CardBalanceListParams

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync

    /** Get the balances for a given card. */
    suspend fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBalanceListPageAsync =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBalanceListPageAsync

    /** @see list */
    suspend fun list(cardToken: String, requestOptions: RequestOptions): CardBalanceListPageAsync =
        list(cardToken, CardBalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBalanceListPageAsync> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: CardBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBalanceListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBalanceListPageAsync> =
            list(cardToken, CardBalanceListParams.none(), requestOptions)
    }
}
