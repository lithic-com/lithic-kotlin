// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPageAsync
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.EventSubscriptionServiceAsync
import com.lithic.api.services.async.events.SubscriptionServiceAsync

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun subscriptions(): SubscriptionServiceAsync

    fun eventSubscriptions(): EventSubscriptionServiceAsync

    /** Get an event. */
    suspend fun retrieve(
        eventToken: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event = retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** @see [retrieve] */
    suspend fun retrieve(eventToken: String, requestOptions: RequestOptions): Event =
        retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

    /** List all events. */
    suspend fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): EventListPageAsync =
        list(EventListParams.none(), requestOptions)

    /** List all the message attempts for a given event. */
    suspend fun listAttempts(
        eventToken: String,
        params: EventListAttemptsParams = EventListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListAttemptsPageAsync =
        listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [listAttempts] */
    suspend fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListAttemptsPageAsync

    /** @see [listAttempts] */
    suspend fun listAttempts(
        eventToken: String,
        requestOptions: RequestOptions,
    ): EventListAttemptsPageAsync =
        listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        fun eventSubscriptions(): EventSubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}`, but is otherwise the same
         * as [EventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            eventToken: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event> =
            retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            eventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Event> = retrieve(eventToken, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPageAsync> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/events/{event_token}/attempts`, but is otherwise
         * the same as [EventServiceAsync.listAttempts].
         */
        @MustBeClosed
        suspend fun listAttempts(
            eventToken: String,
            params: EventListAttemptsParams = EventListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListAttemptsPageAsync> =
            listAttempts(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [listAttempts] */
        @MustBeClosed
        suspend fun listAttempts(
            params: EventListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListAttemptsPageAsync>

        /** @see [listAttempts] */
        @MustBeClosed
        suspend fun listAttempts(
            eventToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListAttemptsPageAsync> =
            listAttempts(eventToken, EventListAttemptsParams.none(), requestOptions)
    }
}
