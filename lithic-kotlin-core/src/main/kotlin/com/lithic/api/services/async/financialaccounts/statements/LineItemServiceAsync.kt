// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts.statements

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.statements.lineitems.LineItemListPageAsync
import com.lithic.api.models.financialaccounts.statements.lineitems.LineItemListParams

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the line items for a given statement within a given financial account. */
    suspend fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPageAsync

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPageAsync>
    }
}
