// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionListParamsTest {

    @Test
    fun create() {
        EventSubscriptionListParams.builder()
            .endingBefore("ending_before")
            .pageSize(1L)
            .startingAfter("starting_after")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventSubscriptionListParams.builder()
                .endingBefore("ending_before")
                .pageSize(1L)
                .startingAfter("starting_after")
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "ending_before")
        expected.put("page_size", "1")
        expected.put("starting_after", "starting_after")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventSubscriptionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
