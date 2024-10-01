// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalPaymentReleaseParamsTest {

    @Test
    fun createExternalPaymentReleaseParams() {
        ExternalPaymentReleaseParams.builder()
            .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .memo("memo")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalPaymentReleaseParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .memo("memo")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.memo()).isEqualTo("memo")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalPaymentReleaseParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalPaymentReleaseParams.builder()
                .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(params).isNotNull
        // path param "externalPaymentToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}