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
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPageAsync
import com.lithic.api.models.ExternalPaymentListPageResponse
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams

class ExternalPaymentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPaymentServiceAsync {

    private val withRawResponse: ExternalPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ExternalPaymentServiceAsync =
        ExternalPaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // post /v1/external_payments
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // get /v1/external_payments/{external_payment_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ExternalPaymentListParams,
        requestOptions: RequestOptions,
    ): ExternalPaymentListPageAsync =
        // get /v1/external_payments
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // post /v1/external_payments/{external_payment_token}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override suspend fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // post /v1/external_payments/{external_payment_token}/release
        withRawResponse().release(params, requestOptions).parse()

    override suspend fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // post /v1/external_payments/{external_payment_token}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    override suspend fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        // post /v1/external_payments/{external_payment_token}/settle
        withRawResponse().settle(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalPaymentServiceAsync.WithRawResponse =
            ExternalPaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPaymentToken", params.externalPaymentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments", params._pathParam(0))
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

        private val listHandler: Handler<ExternalPaymentListPageResponse> =
            jsonHandler<ExternalPaymentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ExternalPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPaymentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments")
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
                        ExternalPaymentListPageAsync.builder()
                            .service(ExternalPaymentServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun cancel(
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPaymentToken", params.externalPaymentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val releaseHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun release(
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPaymentToken", params.externalPaymentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "release")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { releaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reverseHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun reverse(
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPaymentToken", params.externalPaymentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val settleHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPaymentToken", params.externalPaymentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "settle")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { settleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
