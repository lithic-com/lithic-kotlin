package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPage
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPage
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.blocking.events.SubscriptionService
import com.lithic.api.services.blocking.events.SubscriptionServiceImpl
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class EventServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EventService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    override fun subscriptions(): SubscriptionService = subscriptions

    private val retrieveHandler: Handler<Event> =
        jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an event. */
    override fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions): Event {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EventListPage.Response> =
        jsonHandler<EventListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all events. */
    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EventListPage.of(this, params, it) }
        }
    }

    private val listAttemptsHandler: Handler<EventListAttemptsPage.Response> =
        jsonHandler<EventListAttemptsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the message attempts for a given event. */
    override fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions
    ): EventListAttemptsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("events", params.getPathParam(0), "attempts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listAttemptsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EventListAttemptsPage.of(this, params, it) }
        }
    }

    override fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "events",
                    eventToken,
                    "event_subscriptions",
                    eventSubscriptionToken,
                    "resend"
                )
                .body(json(clientOptions.jsonMapper, body))
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { emptyHandler().handle(it) }
        }
    }
}
