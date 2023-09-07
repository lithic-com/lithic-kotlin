package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenizationSimulateParamsTest {

    @Test
    fun createTokenizationSimulateParams() {
        TokenizationSimulateParams.builder()
            .cvv("776")
            .expirationDate("xxxxx")
            .pan("4111111289144142")
            .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
            .accountScore(123L)
            .deviceScore(123L)
            .walletRecommendedDecision(
                TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TokenizationSimulateParams.builder()
                .cvv("776")
                .expirationDate("xxxxx")
                .pan("4111111289144142")
                .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                .accountScore(123L)
                .deviceScore(123L)
                .walletRecommendedDecision(
                    TokenizationSimulateParams.WalletRecommendedDecision.APPROVED
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cvv()).isEqualTo("776")
        assertThat(body.expirationDate()).isEqualTo("xxxxx")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.tokenizationSource())
            .isEqualTo(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
        assertThat(body.accountScore()).isEqualTo(123L)
        assertThat(body.deviceScore()).isEqualTo(123L)
        assertThat(body.walletRecommendedDecision())
            .isEqualTo(TokenizationSimulateParams.WalletRecommendedDecision.APPROVED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TokenizationSimulateParams.builder()
                .cvv("776")
                .expirationDate("xxxxx")
                .pan("4111111289144142")
                .tokenizationSource(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cvv()).isEqualTo("776")
        assertThat(body.expirationDate()).isEqualTo("xxxxx")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.tokenizationSource())
            .isEqualTo(TokenizationSimulateParams.TokenizationSource.APPLE_PAY)
    }
}
