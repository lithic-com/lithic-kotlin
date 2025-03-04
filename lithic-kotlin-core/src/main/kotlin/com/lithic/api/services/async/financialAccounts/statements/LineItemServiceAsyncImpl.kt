// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.statements

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountStatementLineItemListPageAsync
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

class LineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemServiceAsync {

    private val withRawResponse: LineItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementLineItemListPageAsync =
        // get
        // /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<FinancialAccountStatementLineItemListPageAsync.Response> =
            jsonHandler<FinancialAccountStatementLineItemListPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountStatementLineItemListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params.getPathParam(0),
                        "statements",
                        params.getPathParam(1),
                        "line_items",
                    )
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
                        FinancialAccountStatementLineItemListPageAsync.of(
                            LineItemServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
