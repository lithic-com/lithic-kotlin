// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.JsonValue
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardBulkOrderServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrder =
            cardBulkOrderServiceAsync.create(
                CardBulkOrderCreateParams.builder()
                    .customerProductId("custom-card-design-123")
                    .shippingAddress(
                        JsonValue.from(
                            mapOf(
                                "address1" to "123 Main Street",
                                "city" to "NEW YORK",
                                "country" to "USA",
                                "first_name" to "Johnny",
                                "last_name" to "Appleseed",
                                "postal_code" to "10001",
                                "state" to "NY",
                            )
                        )
                    )
                    .shippingMethod(CardBulkOrderCreateParams.ShippingMethod.BULK_EXPEDITED)
                    .build()
            )

        cardBulkOrder.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrder =
            cardBulkOrderServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        cardBulkOrder.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val cardBulkOrder =
            cardBulkOrderServiceAsync.update(
                CardBulkOrderUpdateParams.builder()
                    .bulkOrderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(CardBulkOrderUpdateParams.Status.LOCKED)
                    .build()
            )

        cardBulkOrder.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardBulkOrderServiceAsync = client.cardBulkOrders()

        val page = cardBulkOrderServiceAsync.list()

        page.response().validate()
    }
}
