// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.events.EventSubscription
import com.lithic.api.models.events.subscriptions.SubscriptionCreateParams
import com.lithic.api.models.events.subscriptions.SubscriptionDeleteParams
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsPageAsync
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsParams
import com.lithic.api.models.events.subscriptions.SubscriptionListPageAsync
import com.lithic.api.models.events.subscriptions.SubscriptionListParams
import com.lithic.api.models.events.subscriptions.SubscriptionRecoverParams
import com.lithic.api.models.events.subscriptions.SubscriptionReplayMissingParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretResponse
import com.lithic.api.models.events.subscriptions.SubscriptionRotateSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionSendSimulatedExampleParams
import com.lithic.api.models.events.subscriptions.SubscriptionUpdateParams

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // post /v1/event_subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // get /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // patch /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPageAsync =
        // get /v1/event_subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: SubscriptionDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/event_subscriptions/{event_subscription_token}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listAttempts(
        params: SubscriptionListAttemptsParams,
        requestOptions: RequestOptions,
    ): SubscriptionListAttemptsPageAsync =
        // get /v1/event_subscriptions/{event_subscription_token}/attempts
        withRawResponse().listAttempts(params, requestOptions).parse()

    override suspend fun recover(
        params: SubscriptionRecoverParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/event_subscriptions/{event_subscription_token}/recover
        withRawResponse().recover(params, requestOptions)
    }

    override suspend fun replayMissing(
        params: SubscriptionReplayMissingParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/event_subscriptions/{event_subscription_token}/replay_missing
        withRawResponse().replayMissing(params, requestOptions)
    }

    override suspend fun retrieveSecret(
        params: SubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveSecretResponse =
        // get /v1/event_subscriptions/{event_subscription_token}/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override suspend fun rotateSecret(
        params: SubscriptionRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/event_subscriptions/{event_subscription_token}/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions)
    }

    override suspend fun sendSimulatedExample(
        params: SubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/simulate/event_subscriptions/{event_subscription_token}/send_example
        withRawResponse().sendSimulatedExample(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "event_subscriptions")
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

        private val retrieveHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
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

        private val updateHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SubscriptionListPageAsync.Response> =
            jsonHandler<SubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "event_subscriptions")
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
                        SubscriptionListPageAsync.of(
                            SubscriptionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val listAttemptsHandler: Handler<SubscriptionListAttemptsPageAsync.Response> =
            jsonHandler<SubscriptionListAttemptsPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listAttempts(
            params: SubscriptionListAttemptsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListAttemptsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "attempts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listAttemptsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SubscriptionListAttemptsPageAsync.of(
                            SubscriptionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val recoverHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun recover(
            params: SubscriptionRecoverParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "recover")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { recoverHandler.handle(it) } }
        }

        private val replayMissingHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun replayMissing(
            params: SubscriptionReplayMissingParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "event_subscriptions",
                        params._pathParam(0),
                        "replay_missing",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { replayMissingHandler.handle(it) } }
        }

        private val retrieveSecretHandler: Handler<SubscriptionRetrieveSecretResponse> =
            jsonHandler<SubscriptionRetrieveSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveSecret(
            params: SubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "event_subscriptions", params._pathParam(0), "secret")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun rotateSecret(
            params: SubscriptionRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "event_subscriptions",
                        params._pathParam(0),
                        "secret",
                        "rotate",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { rotateSecretHandler.handle(it) } }
        }

        private val sendSimulatedExampleHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun sendSimulatedExample(
            params: SubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "simulate",
                        "event_subscriptions",
                        params._pathParam(0),
                        "send_example",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { sendSimulatedExampleHandler.handle(it) } }
        }
    }
}
