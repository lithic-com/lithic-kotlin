// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRegisterAccountNumberParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync

interface FinancialAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    fun creditConfiguration(): CreditConfigurationServiceAsync

    fun statements(): StatementServiceAsync

    fun loanTapes(): LoanTapeServiceAsync

    /** Create a new financial account */
    suspend fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Get a financial account */
    suspend fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** @see [retrieve] */
    suspend fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

    /** Update a financial account */
    suspend fun update(
        financialAccountToken: String,
        params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        update(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [update] */
    suspend fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** @see [update] */
    suspend fun update(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

    /** Retrieve information on your financial accounts including routing and account number. */
    suspend fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): FinancialAccountListPageAsync =
        list(FinancialAccountListParams.none(), requestOptions)

    /** Register account number */
    suspend fun registerAccountNumber(
        financialAccountToken: String,
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        registerAccountNumber(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [registerAccountNumber] */
    suspend fun registerAccountNumber(
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Update financial account status */
    suspend fun updateStatus(
        financialAccountToken: String,
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        updateStatus(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [updateStatus] */
    suspend fun updateStatus(
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /**
     * A view of [FinancialAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse

        fun creditConfiguration(): CreditConfigurationServiceAsync.WithRawResponse

        fun statements(): StatementServiceAsync.WithRawResponse

        fun loanTapes(): LoanTapeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> =
            retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            financialAccountToken: String,
            params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            update(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> =
            update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<FinancialAccountListPageAsync> =
            list(FinancialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/register_account_number`, but is
         * otherwise the same as [FinancialAccountServiceAsync.registerAccountNumber].
         */
        @MustBeClosed
        suspend fun registerAccountNumber(
            financialAccountToken: String,
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            registerAccountNumber(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [registerAccountNumber] */
        @MustBeClosed
        suspend fun registerAccountNumber(
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/update_status`, but is otherwise the
         * same as [FinancialAccountServiceAsync.updateStatus].
         */
        @MustBeClosed
        suspend fun updateStatus(
            financialAccountToken: String,
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            updateStatus(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [updateStatus] */
        @MustBeClosed
        suspend fun updateStatus(
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>
    }
}
