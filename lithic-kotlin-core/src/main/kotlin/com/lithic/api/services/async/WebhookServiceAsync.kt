// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers

interface WebhookServiceAsync {

    suspend fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue

    suspend fun verifySignature(payload: String, headers: Headers, secret: String?)
}
