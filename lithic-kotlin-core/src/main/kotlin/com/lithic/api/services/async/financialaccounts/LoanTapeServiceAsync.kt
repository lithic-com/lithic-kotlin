// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.loantapes.LoanTape
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListPageAsync
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListParams
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeRetrieveParams

interface LoanTapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a specific loan tape for a given financial account. */
    suspend fun retrieve(
        params: LoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape

    /** List the loan tapes for a given financial account. */
    suspend fun list(
        params: LoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTapeListPageAsync

    /**
     * A view of [LoanTapeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTapeListPageAsync>
    }
}
