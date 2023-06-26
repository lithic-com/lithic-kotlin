@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.google.common.collect.ListMultimap
import com.lithic.api.core.JsonValue

interface WebhookServiceAsync {

    suspend fun unwrap(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ): JsonValue

    suspend fun verifySignature(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    )
}
