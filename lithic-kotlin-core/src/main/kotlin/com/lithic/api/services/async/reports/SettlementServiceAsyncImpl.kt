// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

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
import com.lithic.api.models.reports.SettlementReport
import com.lithic.api.models.reports.settlement.SettlementListDetailsPageAsync
import com.lithic.api.models.reports.settlement.SettlementListDetailsParams
import com.lithic.api.models.reports.settlement.SettlementSummaryParams

class SettlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettlementServiceAsync {

    private val withRawResponse: SettlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettlementServiceAsync.WithRawResponse = withRawResponse

    override suspend fun listDetails(
        params: SettlementListDetailsParams,
        requestOptions: RequestOptions,
    ): SettlementListDetailsPageAsync =
        // get /v1/reports/settlement/details/{report_date}
        withRawResponse().listDetails(params, requestOptions).parse()

    override suspend fun summary(
        params: SettlementSummaryParams,
        requestOptions: RequestOptions,
    ): SettlementReport =
        // get /v1/reports/settlement/summary/{report_date}
        withRawResponse().summary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listDetailsHandler: Handler<SettlementListDetailsPageAsync.Response> =
            jsonHandler<SettlementListDetailsPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listDetails(
            params: SettlementListDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettlementListDetailsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "reports", "settlement", "details", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SettlementListDetailsPageAsync.of(
                            SettlementServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val summaryHandler: Handler<SettlementReport> =
            jsonHandler<SettlementReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun summary(
            params: SettlementSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettlementReport> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "reports", "settlement", "summary", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { summaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
