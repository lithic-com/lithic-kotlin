// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountMicroDepositCreateParamsTest {

    @Test
    fun create() {
        ExternalBankAccountMicroDepositCreateParams.builder()
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addMicroDeposit(0L)
            .addMicroDeposit(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalBankAccountMicroDepositCreateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMicroDeposit(0L)
                .addMicroDeposit(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalBankAccountMicroDepositCreateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMicroDeposit(0L)
                .addMicroDeposit(0L)
                .build()

        val body = params._body()

        assertThat(body.microDeposits()).containsExactly(0L, 0L)
    }
}
