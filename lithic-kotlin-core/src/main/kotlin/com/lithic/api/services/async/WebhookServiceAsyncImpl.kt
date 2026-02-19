// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.Headers
import com.lithic.api.models.ParsedWebhookEvent
import com.lithic.api.services.blocking.WebhookServiceImpl

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun unwrap(payload: String, headers: Headers, secret: String?) =
        WebhookServiceImpl(clientOptions).unwrap(payload, headers, secret)

    override suspend fun verifySignature(payload: String, headers: Headers, secret: String?) =
        WebhookServiceImpl(clientOptions).verifySignature(payload, headers, secret)

    /**
     * Parses a webhook event from its JSON representation.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override suspend fun parse(
        body: String,
        headers: Headers,
        secret: String?,
    ): ParsedWebhookEvent = WebhookServiceImpl(clientOptions).parse(body, headers, secret)

    /**
     * Parses a webhook event from its JSON representation without validating the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    override suspend fun parseUnsafe(body: String): ParsedWebhookEvent =
        WebhookServiceImpl(clientOptions).parseUnsafe(body)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
