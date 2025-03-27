// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateAuthorizationParamsTest {

    @Test
    fun create() {
        TransactionSimulateAuthorizationParams.builder()
            .amount(3831L)
            .descriptor("COFFEE SHOP")
            .pan("4111111289144142")
            .mcc("5812")
            .merchantAcceptorId("OODKZAPJVN4YS7O")
            .merchantAmount(0L)
            .merchantCurrency("GBP")
            .partialApprovalCapable(true)
            .pin("1234")
            .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateAuthorizationParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .mcc("5812")
                .merchantAcceptorId("OODKZAPJVN4YS7O")
                .merchantAmount(0L)
                .merchantCurrency("GBP")
                .partialApprovalCapable(true)
                .pin("1234")
                .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
        assertThat(body.mcc()).isEqualTo("5812")
        assertThat(body.merchantAcceptorId()).isEqualTo("OODKZAPJVN4YS7O")
        assertThat(body.merchantAmount()).isEqualTo(0L)
        assertThat(body.merchantCurrency()).isEqualTo("GBP")
        assertThat(body.partialApprovalCapable()).isEqualTo(true)
        assertThat(body.pin()).isEqualTo("1234")
        assertThat(body.status())
            .isEqualTo(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateAuthorizationParams.builder()
                .amount(3831L)
                .descriptor("COFFEE SHOP")
                .pan("4111111289144142")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(3831L)
        assertThat(body.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(body.pan()).isEqualTo("4111111289144142")
    }
}
