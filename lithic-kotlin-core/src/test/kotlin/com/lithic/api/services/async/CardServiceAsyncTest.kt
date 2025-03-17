// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardRetrieveSpendLimitsParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.models.Carrier
import com.lithic.api.models.ShippingAddress
import com.lithic.api.models.SpendLimitDuration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.create(
                CardCreateParams.builder()
                    .type(CardCreateParams.Type.MERCHANT_LOCKED)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expMonth("06")
                    .expYear("2027")
                    .memo("New Card")
                    .pin("pin")
                    .productId("1")
                    .replacementAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .replacementFor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Michael")
                            .lastName("Bluth")
                            .postalCode("10001-1809")
                            .state("NY")
                            .address2("Unit 25A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                    .spendLimit(1000L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(CardCreateParams.State.OPEN)
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.retrieve(
                CardRetrieveParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.update(
                CardUpdateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("Updated Name")
                    .pin("pin")
                    .pinStatus(CardUpdateParams.PinStatus.OK)
                    .spendLimit(100L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(CardUpdateParams.State.CLOSED)
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val page = cardServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun convertPhysical() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.convertPhysical(
                CardConvertPhysicalParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .productId("100")
                    .shippingMethod(CardConvertPhysicalParams.ShippingMethod._2_DAY)
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun embed() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        cardServiceAsync.embed(
            CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
        )
    }

    @Test
    suspend fun provision() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val response =
            cardServiceAsync.provision(
                CardProvisionParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .certificate("U3RhaW5sZXNzIHJvY2tz")
                    .clientDeviceId("client_device_id")
                    .clientWalletAccountId("client_wallet_account_id")
                    .digitalWallet(CardProvisionParams.DigitalWallet.APPLE_PAY)
                    .nonce("U3RhaW5sZXNzIHJvY2tz")
                    .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun reissue() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.reissue(
                CardReissueParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .productId("100")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .shippingMethod(CardReissueParams.ShippingMethod._2_DAY)
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun renew() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.renew(
                CardRenewParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .expMonth("06")
                    .expYear("2027")
                    .productId("100")
                    .shippingMethod(CardRenewParams.ShippingMethod._2_DAY)
                    .build()
            )

        card.validate()
    }

    @Test
    suspend fun retrieveSpendLimits() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardSpendLimits =
            cardServiceAsync.retrieveSpendLimits(
                CardRetrieveSpendLimitsParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        cardSpendLimits.validate()
    }

    @Test
    suspend fun searchByPan() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val card =
            cardServiceAsync.searchByPan(
                CardSearchByPanParams.builder().pan("4111111289144142").build()
            )

        card.validate()
    }
}
