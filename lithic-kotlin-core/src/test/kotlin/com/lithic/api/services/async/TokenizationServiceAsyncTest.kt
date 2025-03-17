// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationPauseParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationUnpauseParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenizationServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val tokenization =
            tokenizationServiceAsync.retrieve(
                TokenizationRetrieveParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

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

        tokenizationServiceAsync.activate(
            TokenizationActivateParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    suspend fun deactivate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.deactivate(
            TokenizationDeactivateParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    suspend fun pause() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        tokenizationServiceAsync.pause(
            TokenizationPauseParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
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
                        .EMAIL_TO_CARDHOLDER_ADDRESS
                )
                .build()
        )
    }

    @Test
    suspend fun simulate() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val response =
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

        tokenizationServiceAsync.unpause(
            TokenizationUnpauseParams.builder()
                .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    suspend fun updateDigitalCardArt() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationServiceAsync = client.tokenizations()

        val response =
            tokenizationServiceAsync.updateDigitalCardArt(
                TokenizationUpdateDigitalCardArtParams.builder()
                    .tokenizationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
