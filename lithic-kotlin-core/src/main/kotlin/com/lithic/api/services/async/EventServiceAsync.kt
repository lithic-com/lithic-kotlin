@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Event
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.SubscriptionServiceAsync

interface EventServiceAsync {

    fun subscriptions(): SubscriptionServiceAsync

    /** Get an event. */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Event

    /** List all events. */
    suspend fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListPageAsync

    suspend fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue)
}
