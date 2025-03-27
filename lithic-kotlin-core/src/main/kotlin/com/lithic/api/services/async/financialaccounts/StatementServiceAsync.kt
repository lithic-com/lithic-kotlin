// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.statements.Statement
import com.lithic.api.models.financialaccounts.statements.StatementListPageAsync
import com.lithic.api.models.financialaccounts.statements.StatementListParams
import com.lithic.api.models.financialaccounts.statements.StatementRetrieveParams
import com.lithic.api.services.async.financialaccounts.statements.LineItemServiceAsync

interface StatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemServiceAsync

    /** Get a specific statement for a given financial account. */
    suspend fun retrieve(
        params: StatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Statement

    /** List the statements for a given financial account. */
    suspend fun list(
        params: StatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementListPageAsync

    /**
     * A view of [StatementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}`, but is
         * otherwise the same as [StatementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: StatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Statement>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements`, but is otherwise the same
         * as [StatementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: StatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementListPageAsync>
    }
}
