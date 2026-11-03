// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TokenizationCreateParams
import com.lithic.api.models.TokenizationCreatePaymentCredentialsParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationSelectTfaMethodParams
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSubmitTfaParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenizationServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenization =
            tokenizationServiceAsync.create(
                TokenizationCreateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .agentToken("20f418a7-27c2-486c-aeee-3ad2beb87c91")
                    .type(TokenizationCreateParams.Type.AGENT)
                    .build()
            )

        tokenization.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenization = tokenizationServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tokenization.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val page = tokenizationServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun activate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.activate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    suspend fun createPaymentCredentials() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val response =
            tokenizationServiceAsync.createPaymentCredentials(
                TokenizationCreatePaymentCredentialsParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .device(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsDevice
                            .builder()
                            .applicationName("Example app")
                            .brand("Example brand")
                            .ipAddress("192.0.2.1")
                            .type("Mobile")
                            .build()
                    )
                    .mandate(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                            .builder()
                            .amount(1250L)
                            .expiresAt(OffsetDateTime.parse("2026-10-29T15:00:00Z"))
                            .frequency(
                                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                    .Frequency
                                    .ONE_TIME
                            )
                            .merchant(
                                TokenizationCreatePaymentCredentialsParams.PaymentCredentialsMandate
                                    .Merchant
                                    .builder()
                                    .name("Example merchant")
                                    .url("https://merchant.example")
                                    .build()
                            )
                            .build()
                    )
                    .type(
                        TokenizationCreatePaymentCredentialsParams.PaymentCredentialsType
                            .HUMAN_IN_THE_LOOP
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun deactivate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.deactivate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    suspend fun pause() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.pause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    suspend fun resendActivationCode() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.resendActivationCode(
            TokenizationResendActivationCodeParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .activationMethodType(
                    TokenizationResendActivationCodeParams.ActivationMethodType
                        .TEXT_TO_CARDHOLDER_NUMBER
                )
                .build()
        )
    }

    @Test
    suspend fun selectTfaMethod() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val response =
            tokenizationServiceAsync.selectTfaMethod(
                TokenizationSelectTfaMethodParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(TokenizationSelectTfaMethodParams.Method.SMS)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenization =
            tokenizationServiceAsync.simulate(
                TokenizationSimulateParams.builder()
                    .cvv("776")
                    .expirationDate("08/29")
                    .pan("4111111289144142")
                    .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                    .accountScore(5L)
                    .deviceScore(5L)
                    .entity("entity")
                    .walletRecommendedDecision(
                        TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
                    )
                    .build()
            )

        tokenization.validate()
    }

    @Test
    suspend fun submitTfa() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val response =
            tokenizationServiceAsync.submitTfa(
                TokenizationSubmitTfaParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value("01929")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun unpause() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.unpause("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    suspend fun updateDigitalCardArt() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenization =
            tokenizationServiceAsync.updateDigitalCardArt(
                TokenizationUpdateDigitalCardArtParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                    .build()
            )

        tokenization.validate()
    }
}
