// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.balances.BalanceListPageAsync
import com.lithic.api.models.balances.BalanceListParams

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a program, business, or a given end-user account */
    suspend fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BalanceListPageAsync =
        list(BalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BalanceListPageAsync> =
            list(BalanceListParams.none(), requestOptions)
    }
}
