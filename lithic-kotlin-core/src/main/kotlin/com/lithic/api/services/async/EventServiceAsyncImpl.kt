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
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPageAsync
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsyncImpl

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    private val retrieveHandler: Handler<Event> =
        jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an event. */
    override suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions,
    ): Event {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "events", params.getPathParam(0))
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

    private val listHandler: Handler<EventListPageAsync.Response> =
        jsonHandler<EventListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all events. */
    override suspend fun list(
        params: EventListParams,
        requestOptions: RequestOptions,
    ): EventListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "events")
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
            .let { EventListPageAsync.of(this, params, it) }
    }

    private val listAttemptsHandler: Handler<EventListAttemptsPageAsync.Response> =
        jsonHandler<EventListAttemptsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the message attempts for a given event. */
    override suspend fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions,
    ): EventListAttemptsPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "events", params.getPathParam(0), "attempts")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listAttemptsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { EventListAttemptsPageAsync.of(this, params, it) }
    }
}
