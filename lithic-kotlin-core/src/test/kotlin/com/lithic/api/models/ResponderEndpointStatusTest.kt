// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponderEndpointStatusTest {

    @Test
    fun create() {
        val responderEndpointStatus =
            ResponderEndpointStatus.builder().enrolled(true).url("https://example.com").build()

        assertThat(responderEndpointStatus.enrolled()).isEqualTo(true)
        assertThat(responderEndpointStatus.url()).isEqualTo("https://example.com")
    }
}
