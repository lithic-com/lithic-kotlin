// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams

class BalanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<FinancialAccountBalanceListPageAsync.Response> =
        jsonHandler<FinancialAccountBalanceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the balances for a given financial account. */
    override suspend fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountBalanceListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0), "balances")
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
            .let { FinancialAccountBalanceListPageAsync.of(this, params, it) }
    }
}
