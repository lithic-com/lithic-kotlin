// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialAccountChargeOffParamsTest {

    @Test
    fun createFinancialAccountChargeOffParams() {
        FinancialAccountChargeOffParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FinancialAccountChargeOffParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FinancialAccountChargeOffParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
    }

    @Test
    fun getPathParam() {
        val params =
            FinancialAccountChargeOffParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason(FinancialAccountChargeOffParams.ChargedOffReason.DELINQUENT)
                .build()
        assertThat(params).isNotNull
        // path param "financialAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
