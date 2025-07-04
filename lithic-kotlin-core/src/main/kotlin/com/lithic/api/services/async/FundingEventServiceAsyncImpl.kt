// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

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
import com.lithic.api.models.FundingEventListPageAsync
import com.lithic.api.models.FundingEventListPageResponse
import com.lithic.api.models.FundingEventListParams
import com.lithic.api.models.FundingEventRetrieveDetailsParams
import com.lithic.api.models.FundingEventRetrieveDetailsResponse
import com.lithic.api.models.FundingEventRetrieveParams
import com.lithic.api.models.FundingEventRetrieveResponse

class FundingEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FundingEventServiceAsync {

    private val withRawResponse: FundingEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FundingEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FundingEventServiceAsync =
        FundingEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: FundingEventRetrieveParams,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveResponse =
        // get /v1/funding_events/{funding_event_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: FundingEventListParams,
        requestOptions: RequestOptions,
    ): FundingEventListPageAsync =
        // get /v1/funding_events
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveDetailsResponse =
        // get /v1/funding_events/{funding_event_token}/details
        withRawResponse().retrieveDetails(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FundingEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FundingEventServiceAsync.WithRawResponse =
            FundingEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<FundingEventRetrieveResponse> =
            jsonHandler<FundingEventRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: FundingEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fundingEventToken", params.fundingEventToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events", params._pathParam(0))
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

        private val listHandler: Handler<FundingEventListPageResponse> =
            jsonHandler<FundingEventListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: FundingEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events")
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
                        FundingEventListPageAsync.builder()
                            .service(FundingEventServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveDetailsHandler: Handler<FundingEventRetrieveDetailsResponse> =
            jsonHandler<FundingEventRetrieveDetailsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fundingEventToken", params.fundingEventToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events", params._pathParam(0), "details")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
