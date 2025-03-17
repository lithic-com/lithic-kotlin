// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenizationSimulateResponseTest {

    @Test
    fun createTokenizationSimulateResponse() {
        val tokenizationSimulateResponse =
            TokenizationSimulateResponse.builder()
                .addData(
                    Tokenization.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dpan("dpan")
                        .status(Tokenization.Status.ACTIVE)
                        .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                        .tokenUniqueReference("token_unique_reference")
                        .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addEvent(
                            Tokenization.TokenizationEvent.builder()
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .result(Tokenization.TokenizationEvent.Result.APPROVED)
                                .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                                .build()
                        )
                        .paymentAccountReferenceId("payment_account_reference_id")
                        .build()
                )
                .build()
        assertThat(tokenizationSimulateResponse).isNotNull
        assertThat(tokenizationSimulateResponse.data())
            .containsExactly(
                Tokenization.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dpan("dpan")
                    .status(Tokenization.Status.ACTIVE)
                    .tokenRequestorName(Tokenization.TokenRequestorName.AMAZON_ONE)
                    .tokenUniqueReference("token_unique_reference")
                    .tokenizationChannel(Tokenization.TokenizationChannel.DIGITAL_WALLET)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEvent(
                        Tokenization.TokenizationEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(Tokenization.TokenizationEvent.Result.APPROVED)
                            .type(Tokenization.TokenizationEvent.Type.TOKENIZATION_2_FA)
                            .build()
                    )
                    .paymentAccountReferenceId("payment_account_reference_id")
                    .build()
            )
    }
}
