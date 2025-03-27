// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.events.EventSubscription
import com.lithic.api.models.events.subscriptions.SubscriptionCreateParams
import com.lithic.api.models.events.subscriptions.SubscriptionDeleteParams
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsPageAsync
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsParams
import com.lithic.api.models.events.subscriptions.SubscriptionListPageAsync
import com.lithic.api.models.events.subscriptions.SubscriptionListParams
import com.lithic.api.models.events.subscriptions.SubscriptionRecoverParams
import com.lithic.api.models.events.subscriptions.SubscriptionReplayMissingParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretResponse
import com.lithic.api.models.events.subscriptions.SubscriptionRotateSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionSendSimulatedExampleParams
import com.lithic.api.models.events.subscriptions.SubscriptionUpdateParams

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new event subscription. */
    suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    suspend fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Update an event subscription. */
    suspend fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    suspend fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): SubscriptionListPageAsync =
        list(SubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    suspend fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all the message attempts for a given event subscription. */
    suspend fun listAttempts(
        params: SubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListAttemptsPageAsync

    /** Resend all failed messages since a given time. */
    suspend fun recover(
        params: SubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    suspend fun replayMissing(
        params: SubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the secret for an event subscription. */
    suspend fun retrieveSecret(
        params: SubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    suspend fun rotateSecret(
        params: SubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Send an example message for event. */
    suspend fun sendSimulatedExample(
        params: SubscriptionSendSimulatedExampleParams,
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
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions/{event_subscription_token}`,
         * but is otherwise the same as [SubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /v1/event_subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionListPageAsync> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionServiceAsync.listAttempts].
         */
        @MustBeClosed
        suspend fun listAttempts(
            params: SubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListAttemptsPageAsync>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionServiceAsync.recover].
         */
        @MustBeClosed
        suspend fun recover(
            params: SubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionServiceAsync.replayMissing].
         */
        @MustBeClosed
        suspend fun replayMissing(
            params: SubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: SubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            params: SubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionServiceAsync.sendSimulatedExample].
         */
        @MustBeClosed
        suspend fun sendSimulatedExample(
            params: SubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
