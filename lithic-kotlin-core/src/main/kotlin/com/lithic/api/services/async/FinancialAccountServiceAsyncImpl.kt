// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountChargeOffParams
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsyncImpl

class FinancialAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FinancialAccountServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    private val creditConfiguration: CreditConfigurationServiceAsync by lazy {
        CreditConfigurationServiceAsyncImpl(clientOptions)
    }

    private val statements: StatementServiceAsync by lazy {
        StatementServiceAsyncImpl(clientOptions)
    }

    private val loanTapes: LoanTapeServiceAsync by lazy { LoanTapeServiceAsyncImpl(clientOptions) }

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    override fun creditConfiguration(): CreditConfigurationServiceAsync = creditConfiguration

    override fun statements(): StatementServiceAsync = statements

    override fun loanTapes(): LoanTapeServiceAsync = loanTapes

    private val createHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new financial account */
    override suspend fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions,
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "financial_accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a financial account */
    override suspend fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a financial account */
    override suspend fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions,
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<FinancialAccountListPageAsync.Response> =
        jsonHandler<FinancialAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve information on your financial accounts including routing and account number. */
    override suspend fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { FinancialAccountListPageAsync.of(this, params, it) }
    }

    private val chargeOffHandler: Handler<FinancialAccountCreditConfig> =
        jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update issuing account state to charged off */
    override suspend fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0), "charge_off")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { chargeOffHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
