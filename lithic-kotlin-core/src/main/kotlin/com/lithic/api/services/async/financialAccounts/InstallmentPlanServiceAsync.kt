// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanListPageAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanRetrieveParams
import com.lithic.api.models.InstallmentPlan

interface InstallmentPlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InstallmentPlanServiceAsync

    /** Get a specific installment plan for a given financial account. */
    suspend fun retrieve(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlan =
        retrieve(
            params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlan

    /** List the installment plans for a given financial account. */
    suspend fun list(
        financialAccountToken: String,
        params: FinancialAccountInstallmentPlanListParams =
            FinancialAccountInstallmentPlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanListPageAsync =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    suspend fun list(
        params: FinancialAccountInstallmentPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanListPageAsync

    /** @see list */
    suspend fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountInstallmentPlanListPageAsync =
        list(
            financialAccountToken,
            FinancialAccountInstallmentPlanListParams.none(),
            requestOptions,
        )

    /**
     * A view of [InstallmentPlanServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InstallmentPlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}`,
         * but is otherwise the same as [InstallmentPlanServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlan> =
            retrieve(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlan>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans`, but is otherwise the
         * same as [InstallmentPlanServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            params: FinancialAccountInstallmentPlanListParams =
                FinancialAccountInstallmentPlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountInstallmentPlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync> =
            list(
                financialAccountToken,
                FinancialAccountInstallmentPlanListParams.none(),
                requestOptions,
            )
    }
}
