// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarrierTest {

    @Test
    fun create() {
        val carrier = Carrier.builder().qrCodeUrl("qr_code_url").build()

        assertThat(carrier.qrCodeUrl()).isEqualTo("qr_code_url")
    }
}
