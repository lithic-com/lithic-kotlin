// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRegisterAccountNumberParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import com.lithic.api.services.blocking.financialAccounts.StatementService

interface FinancialAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FinancialAccountService

    fun balances(): BalanceService

    fun financialTransactions(): FinancialTransactionService

    fun creditConfiguration(): CreditConfigurationService

    fun statements(): StatementService

    fun loanTapes(): LoanTapeService

    /** Create a new financial account */
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Get a financial account */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** @see retrieve */
    fun retrieve(financialAccountToken: String, requestOptions: RequestOptions): FinancialAccount =
        retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

    /** Update a financial account */
    fun update(
        financialAccountToken: String,
        params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        update(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** @see update */
    fun update(financialAccountToken: String, requestOptions: RequestOptions): FinancialAccount =
        update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

    /** Retrieve information on your financial accounts including routing and account number. */
    fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): FinancialAccountListPage =
        list(FinancialAccountListParams.none(), requestOptions)

    /** Register account number */
    fun registerAccountNumber(
        financialAccountToken: String,
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        registerAccountNumber(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see registerAccountNumber */
    fun registerAccountNumber(
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Update financial account status */
    fun updateStatus(
        financialAccountToken: String,
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount =
        updateStatus(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see updateStatus */
    fun updateStatus(
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /**
     * A view of [FinancialAccountService] that provides access to raw HTTP responses for each
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
        ): FinancialAccountService.WithRawResponse

        fun balances(): BalanceService.WithRawResponse

        fun financialTransactions(): FinancialTransactionService.WithRawResponse

        fun creditConfiguration(): CreditConfigurationService.WithRawResponse

        fun statements(): StatementService.WithRawResponse

        fun loanTapes(): LoanTapeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> =
            retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountService.update].
         */
        @MustBeClosed
        fun update(
            financialAccountToken: String,
            params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            update(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /** @see update */
        @MustBeClosed
        fun update(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> =
            update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FinancialAccountListPage> =
            list(FinancialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/register_account_number`, but is
         * otherwise the same as [FinancialAccountService.registerAccountNumber].
         */
        @MustBeClosed
        fun registerAccountNumber(
            financialAccountToken: String,
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            registerAccountNumber(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see registerAccountNumber */
        @MustBeClosed
        fun registerAccountNumber(
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/update_status`, but is otherwise the
         * same as [FinancialAccountService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(
            financialAccountToken: String,
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount> =
            updateStatus(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>
    }
}
