// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers
import com.lithic.api.core.UnwrapWebhookParams
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.errors.LithicWebhookException
import com.lithic.api.models.ParsedWebhookEvent

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync

    /**
     * Unwraps a webhook event from its JSON representation and validates the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    suspend fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue

    /** Verifies the signature of a webhook event. */
    suspend fun verifySignature(payload: String, headers: Headers, secret: String?)

    /**
     * Parses a webhook event from its JSON representation and validates the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    suspend fun parse(body: String, headers: Headers, secret: String?): ParsedWebhookEvent

    /**
     * Parses a webhook event from its JSON representation without validating the signature.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     */
    suspend fun parseUnsafe(body: String): ParsedWebhookEvent

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws LithicInvalidDataException if the body could not be parsed.
     * @throws LithicWebhookException if the webhook signature could not be verified
     */
    fun parsed(unwrapParams: UnwrapWebhookParams): ParsedWebhookEvent

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse
    }
}
