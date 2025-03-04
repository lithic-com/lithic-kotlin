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
import com.lithic.api.models.FinancialAccountStatementListPageAsync
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsyncImpl

class StatementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    override fun lineItems(): LineItemServiceAsync = lineItems

    private val retrieveHandler: Handler<Statement> =
        jsonHandler<Statement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific statement for a given financial account. */
    override suspend fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): Statement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "statements",
                    params.getPathParam(1),
                )
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

    private val listHandler: Handler<FinancialAccountStatementListPageAsync.Response> =
        jsonHandler<FinancialAccountStatementListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the statements for a given financial account. */
    override suspend fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0), "statements")
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
            .let { FinancialAccountStatementListPageAsync.of(this, params, it) }
    }
}
