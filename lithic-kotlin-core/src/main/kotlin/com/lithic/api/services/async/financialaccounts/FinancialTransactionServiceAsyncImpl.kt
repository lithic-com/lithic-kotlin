// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
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
import com.lithic.api.models.financialaccounts.FinancialTransaction
import com.lithic.api.models.financialaccounts.financialtransactions.FinancialTransactionListPageAsync
import com.lithic.api.models.financialaccounts.financialtransactions.FinancialTransactionListParams
import com.lithic.api.models.financialaccounts.financialtransactions.FinancialTransactionRetrieveParams

class FinancialTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FinancialTransactionServiceAsync {

    private val withRawResponse: FinancialTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FinancialTransactionServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): FinancialTransaction =
        // get
        // /v1/financial_accounts/{financial_account_token}/financial_transactions/{financial_transaction_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions,
    ): FinancialTransactionListPageAsync =
        // get /v1/financial_accounts/{financial_account_token}/financial_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinancialTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FinancialTransaction> =
            jsonHandler<FinancialTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "financial_transactions",
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

        private val listHandler: Handler<FinancialTransactionListPageAsync.Response> =
            jsonHandler<FinancialTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialTransactionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "financial_transactions",
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
                        FinancialTransactionListPageAsync.of(
                            FinancialTransactionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
