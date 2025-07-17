// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.EventEventSubscriptionResendParams

class EventSubscriptionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EventSubscriptionServiceAsync {

    private val withRawResponse: EventSubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventSubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): EventSubscriptionServiceAsync =
        EventSubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun resend(
        params: EventEventSubscriptionResendParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/events/{event_token}/event_subscriptions/{event_subscription_token}/resend
        withRawResponse().resend(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventSubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EventSubscriptionServiceAsync.WithRawResponse =
            EventSubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val resendHandler: Handler<Void?> = emptyHandler()

        override suspend fun resend(
            params: EventEventSubscriptionResendParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionToken", params.eventSubscriptionToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "events",
                        params._pathParam(0),
                        "event_subscriptions",
                        params._pathParam(1),
                        "resend",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resendHandler.handle(it) }
            }
        }
    }
}
