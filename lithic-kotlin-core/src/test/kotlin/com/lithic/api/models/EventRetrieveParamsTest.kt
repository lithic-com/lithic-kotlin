// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventRetrieveParamsTest {

    @Test
    fun create() {
        EventRetrieveParams.builder().eventToken("event_token").build()
    }

    @Test
    fun pathParams() {
        val params = EventRetrieveParams.builder().eventToken("event_token").build()

        assertThat(params._pathParam(0)).isEqualTo("event_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
