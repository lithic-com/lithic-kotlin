// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.events

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.events.subscriptions.SubscriptionCreateParams
import com.lithic.api.models.events.subscriptions.SubscriptionDeleteParams
import com.lithic.api.models.events.subscriptions.SubscriptionListAttemptsParams
import com.lithic.api.models.events.subscriptions.SubscriptionRecoverParams
import com.lithic.api.models.events.subscriptions.SubscriptionReplayMissingParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveParams
import com.lithic.api.models.events.subscriptions.SubscriptionRetrieveSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionRotateSecretParams
import com.lithic.api.models.events.subscriptions.SubscriptionSendSimulatedExampleParams
import com.lithic.api.models.events.subscriptions.SubscriptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscription =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionCreateParams.EventType.ACCOUNT_HOLDER_CREATED)
                    .build()
            )

        eventSubscription.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscription =
            subscriptionServiceAsync.retrieve(
                SubscriptionRetrieveParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        eventSubscription.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val eventSubscription =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .url("https://example.com")
                    .description("description")
                    .disabled(true)
                    .addEventType(SubscriptionUpdateParams.EventType.ACCOUNT_HOLDER_CREATED)
                    .build()
            )

        eventSubscription.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val page = subscriptionServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        subscriptionServiceAsync.delete(
            SubscriptionDeleteParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        )
    }

    @Test
    suspend fun listAttempts() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val page =
            subscriptionServiceAsync.listAttempts(
                SubscriptionListAttemptsParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    suspend fun recover() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        subscriptionServiceAsync.recover(
            SubscriptionRecoverParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    suspend fun replayMissing() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        subscriptionServiceAsync.replayMissing(
            SubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Test
    suspend fun retrieveSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        val response =
            subscriptionServiceAsync.retrieveSecret(
                SubscriptionRetrieveSecretParams.builder()
                    .eventSubscriptionToken("event_subscription_token")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism Mock server doesnt want Accept header, but server requires it.")
    @Test
    suspend fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        subscriptionServiceAsync.rotateSecret(
            SubscriptionRotateSecretParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        )
    }

    @Test
    suspend fun sendSimulatedExample() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val subscriptionServiceAsync = client.events().subscriptions()

        subscriptionServiceAsync.sendSimulatedExample(
            SubscriptionSendSimulatedExampleParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .eventType(SubscriptionSendSimulatedExampleParams.EventType.ACCOUNT_HOLDER_CREATED)
                .build()
        )
    }
}
