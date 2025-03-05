// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BalanceListPage
import com.lithic.api.models.BalanceListParams

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a program, business, or a given end-user account */
    fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPage

    /** Get the balances for a program, business, or a given end-user account */
    fun list(requestOptions: RequestOptions): BalanceListPage =
        list(BalanceListParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/balances`, but is otherwise the same as
         * [BalanceService.list].
         */
        @MustBeClosed
        fun list(
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPage>

        /**
         * Returns a raw HTTP response for `get /v1/balances`, but is otherwise the same as
         * [BalanceService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BalanceListPage> =
            list(BalanceListParams.none(), requestOptions)
    }
}
