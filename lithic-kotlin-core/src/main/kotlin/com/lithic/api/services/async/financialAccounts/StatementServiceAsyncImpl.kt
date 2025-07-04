// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.FinancialAccountStatementListPageAsync
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.models.Statements
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsyncImpl

class StatementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementServiceAsync {

    private val withRawResponse: StatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): StatementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StatementServiceAsync =
        StatementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun lineItems(): LineItemServiceAsync = lineItems

    override suspend fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): Statement =
        // get /v1/financial_accounts/{financial_account_token}/statements/{statement_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementListPageAsync =
        // get /v1/financial_accounts/{financial_account_token}/statements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val lineItems: LineItemServiceAsync.WithRawResponse by lazy {
            LineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StatementServiceAsync.WithRawResponse =
            StatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun lineItems(): LineItemServiceAsync.WithRawResponse = lineItems

        private val retrieveHandler: Handler<Statement> =
            jsonHandler<Statement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Statement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statementToken", params.statementToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "statements",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<Statements> =
            jsonHandler<Statements>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: FinancialAccountStatementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountStatementListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "statements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FinancialAccountStatementListPageAsync.builder()
                            .service(StatementServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
