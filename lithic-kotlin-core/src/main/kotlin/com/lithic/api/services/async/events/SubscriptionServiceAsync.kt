// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionServiceAsync

    /** Create a new event subscription. */
    suspend fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Get an event subscription. */
    suspend fun retrieve(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        retrieve(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** @see [retrieve] */
    suspend fun retrieve(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): EventSubscription =
        retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

    /** Update an event subscription. */
    suspend fun update(
        eventSubscriptionToken: String,
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        update(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [update] */
    suspend fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List all the event subscriptions. */
    suspend fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): EventSubscriptionListPageAsync =
        list(EventSubscriptionListParams.none(), requestOptions)

    /** Delete an event subscription. */
    suspend fun delete(
        eventSubscriptionToken: String,
        params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [delete] */
    suspend fun delete(
        params: EventSubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

    /** List all the message attempts for a given event subscription. */
    suspend fun listAttempts(
        eventSubscriptionToken: String,
        params: EventSubscriptionListAttemptsParams = EventSubscriptionListAttemptsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPageAsync =
        listAttempts(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [listAttempts] */
    suspend fun listAttempts(
        params: EventSubscriptionListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListAttemptsPageAsync

    /** @see [listAttempts] */
    suspend fun listAttempts(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): EventSubscriptionListAttemptsPageAsync =
        listAttempts(
            eventSubscriptionToken,
            EventSubscriptionListAttemptsParams.none(),
            requestOptions,
        )

    /** Resend all failed messages since a given time. */
    suspend fun recover(
        eventSubscriptionToken: String,
        params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        recover(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [recover] */
    suspend fun recover(
        params: EventSubscriptionRecoverParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [recover] */
    suspend fun recover(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

    /**
     * Replays messages to the endpoint. Only messages that were created after `begin` will be sent.
     * Messages that were previously sent to the endpoint are not resent. Message will be retried if
     * endpoint responds with a non-2xx status code. See
     * [Retry Schedule](https://docs.lithic.com/docs/events-api#retry-schedule) for details.
     */
    suspend fun replayMissing(
        eventSubscriptionToken: String,
        params: EventSubscriptionReplayMissingParams = EventSubscriptionReplayMissingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        replayMissing(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [replayMissing] */
    suspend fun replayMissing(
        params: EventSubscriptionReplayMissingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [replayMissing] */
    suspend fun replayMissing(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        replayMissing(
            eventSubscriptionToken,
            EventSubscriptionReplayMissingParams.none(),
            requestOptions,
        )

    /** Get the secret for an event subscription. */
    suspend fun retrieveSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRetrieveSecretParams =
            EventSubscriptionRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse =
        retrieveSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [retrieveSecret] */
    suspend fun retrieveSecret(
        params: EventSubscriptionRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveSecretResponse

    /** @see [retrieveSecret] */
    suspend fun retrieveSecret(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveSecretResponse =
        retrieveSecret(
            eventSubscriptionToken,
            EventSubscriptionRetrieveSecretParams.none(),
            requestOptions,
        )

    /**
     * Rotate the secret for an event subscription. The previous secret will be valid for the next
     * 24 hours.
     */
    suspend fun rotateSecret(
        eventSubscriptionToken: String,
        params: EventSubscriptionRotateSecretParams = EventSubscriptionRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rotateSecret(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [rotateSecret] */
    suspend fun rotateSecret(
        params: EventSubscriptionRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [rotateSecret] */
    suspend fun rotateSecret(eventSubscriptionToken: String, requestOptions: RequestOptions) =
        rotateSecret(
            eventSubscriptionToken,
            EventSubscriptionRotateSecretParams.none(),
            requestOptions,
        )

    /** Send an example message for event. */
    suspend fun sendSimulatedExample(
        eventSubscriptionToken: String,
        params: EventSubscriptionSendSimulatedExampleParams =
            EventSubscriptionSendSimulatedExampleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        sendSimulatedExample(
            params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
            requestOptions,
        )

    /** @see [sendSimulatedExample] */
    suspend fun sendSimulatedExample(
        params: EventSubscriptionSendSimulatedExampleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [sendSimulatedExample] */
    suspend fun sendSimulatedExample(
        eventSubscriptionToken: String,
        requestOptions: RequestOptions,
    ) =
        sendSimulatedExample(
            eventSubscriptionToken,
            EventSubscriptionSendSimulatedExampleParams.none(),
            requestOptions,
        )

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionServiceAsync.WithRawResponse

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
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            retrieve(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> =
            retrieve(eventSubscriptionToken, EventSubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/event_subscriptions/{event_subscription_token}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            eventSubscriptionToken: String,
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            update(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [update] */
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

        /** @see [list] */
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
            eventSubscriptionToken: String,
            params: EventSubscriptionDeleteParams = EventSubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: EventSubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            delete(eventSubscriptionToken, EventSubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/attempts`, but is otherwise the same
         * as [SubscriptionServiceAsync.listAttempts].
         */
        @MustBeClosed
        suspend fun listAttempts(
            eventSubscriptionToken: String,
            params: EventSubscriptionListAttemptsParams =
                EventSubscriptionListAttemptsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPageAsync> =
            listAttempts(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [listAttempts] */
        @MustBeClosed
        suspend fun listAttempts(
            params: EventSubscriptionListAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListAttemptsPageAsync>

        /** @see [listAttempts] */
        @MustBeClosed
        suspend fun listAttempts(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscriptionListAttemptsPageAsync> =
            listAttempts(
                eventSubscriptionToken,
                EventSubscriptionListAttemptsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/recover`, but is otherwise the same as
         * [SubscriptionServiceAsync.recover].
         */
        @MustBeClosed
        suspend fun recover(
            eventSubscriptionToken: String,
            params: EventSubscriptionRecoverParams = EventSubscriptionRecoverParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            recover(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [recover] */
        @MustBeClosed
        suspend fun recover(
            params: EventSubscriptionRecoverParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [recover] */
        @MustBeClosed
        suspend fun recover(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            recover(eventSubscriptionToken, EventSubscriptionRecoverParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/replay_missing`, but is otherwise the
         * same as [SubscriptionServiceAsync.replayMissing].
         */
        @MustBeClosed
        suspend fun replayMissing(
            eventSubscriptionToken: String,
            params: EventSubscriptionReplayMissingParams =
                EventSubscriptionReplayMissingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            replayMissing(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [replayMissing] */
        @MustBeClosed
        suspend fun replayMissing(
            params: EventSubscriptionReplayMissingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [replayMissing] */
        @MustBeClosed
        suspend fun replayMissing(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            replayMissing(
                eventSubscriptionToken,
                EventSubscriptionReplayMissingParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/event_subscriptions/{event_subscription_token}/secret`, but is otherwise the same as
         * [SubscriptionServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRetrieveSecretParams =
                EventSubscriptionRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [retrieveSecret] */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: EventSubscriptionRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse>

        /** @see [retrieveSecret] */
        @MustBeClosed
        suspend fun retrieveSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveSecretResponse> =
            retrieveSecret(
                eventSubscriptionToken,
                EventSubscriptionRetrieveSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/event_subscriptions/{event_subscription_token}/secret/rotate`, but is otherwise the
         * same as [SubscriptionServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            eventSubscriptionToken: String,
            params: EventSubscriptionRotateSecretParams =
                EventSubscriptionRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rotateSecret(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [rotateSecret] */
        @MustBeClosed
        suspend fun rotateSecret(
            params: EventSubscriptionRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [rotateSecret] */
        @MustBeClosed
        suspend fun rotateSecret(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            rotateSecret(
                eventSubscriptionToken,
                EventSubscriptionRotateSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/simulate/event_subscriptions/{event_subscription_token}/send_example`, but is
         * otherwise the same as [SubscriptionServiceAsync.sendSimulatedExample].
         */
        @MustBeClosed
        suspend fun sendSimulatedExample(
            eventSubscriptionToken: String,
            params: EventSubscriptionSendSimulatedExampleParams =
                EventSubscriptionSendSimulatedExampleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendSimulatedExample(
                params.toBuilder().eventSubscriptionToken(eventSubscriptionToken).build(),
                requestOptions,
            )

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        suspend fun sendSimulatedExample(
            params: EventSubscriptionSendSimulatedExampleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [sendSimulatedExample] */
        @MustBeClosed
        suspend fun sendSimulatedExample(
            eventSubscriptionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            sendSimulatedExample(
                eventSubscriptionToken,
                EventSubscriptionSendSimulatedExampleParams.none(),
                requestOptions,
            )
    }
}
