// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.installmentPlans

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPageAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import com.lithic.api.models.InstallmentPlanStatement

interface StatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatementServiceAsync

    /** Get a specific statement snapshot for a given installment plan. */
    suspend fun retrieve(
        statementToken: String,
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlanStatement =
        retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlanStatement

    /** List the statement snapshots for a given installment plan. */
    suspend fun list(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanStatementListPageAsync =
        list(params.toBuilder().installmentPlanToken(installmentPlanToken).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanStatementListPageAsync

    /**
     * A view of [StatementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements/{statement_token}`,
         * but is otherwise the same as [StatementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            statementToken: String,
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlanStatement> =
            retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlanStatement>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements`,
         * but is otherwise the same as [StatementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync> =
            list(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>
    }
}
