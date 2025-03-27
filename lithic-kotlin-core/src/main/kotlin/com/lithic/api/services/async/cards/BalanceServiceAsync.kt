// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cards.balances.BalanceListPageAsync
import com.lithic.api.models.cards.balances.BalanceListParams

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given card. */
    suspend fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPageAsync

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPageAsync>
    }
}
