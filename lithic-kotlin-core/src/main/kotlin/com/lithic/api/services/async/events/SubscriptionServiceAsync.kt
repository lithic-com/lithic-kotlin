// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EventSubscription
import com.lithic.api.models.EventSubscriptionCreateParams
import com.lithic.api.models.EventSubscriptionDeleteParams
import com.lithic.api.models.EventSubscriptionListAttemptsPageAsync
import com.lithic.api.models.EventSubscriptionListAttemptsParams
import com.lithic.api.models.EventSubscriptionListPageAsync
import com.lithic.api.models.EventSubscriptionListParams
import com.lithic.api.models.EventSubscriptionRecoverParams
import com.lithic.api.models.EventSubscriptionReplayMissingParams
import com.lithic.api.models.EventSubscriptionRetrieveParams
import com.lithic.api.models.EventSubscriptionRetrieveSecretParams
import com.lithic.api.models.EventSubscriptionRotateSecretParams
import com.lithic.api.models.EventSubscriptionSendSimulatedExampleParams
import com.lithic.api.models.EventSubscriptionUpdateParams
import com.lithic.api.models.SubscriptionRetrieveSecretResponse

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new event subscription. */
    suspend fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    suspend fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Update an event subscription. */
    suspend fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    suspend fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPageAsync

    /** List all the event subscriptions. */
    suspend fun list(requestOptions: RequestOptions): EventSubscriptionListPageAsync =
        list(EventSubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    suspend fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all the message attempts for a given event subscription. */
    suspend fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPageAsync

    /** Resend all failed messages since a given time. */
    suspend fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    suspend fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the secret for an event subscription. */
    suspend fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    suspend fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an example message for event. */
    suspend fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions/{event_subscription_token}`,
         * but is otherwise the same as [SubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListPageAsync>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<EventSubscriptionListPageAsync> =
            list(EventSubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionServiceAsync.listAttempts].
         */
        @MustBeClosed
        suspend fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPageAsync>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionServiceAsync.recover].
         */
        @MustBeClosed
        suspend fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionServiceAsync.replayMissing].
         */
        @MustBeClosed
        suspend fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionServiceAsync.sendSimulatedExample].
         */
        @MustBeClosed
        suspend fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
