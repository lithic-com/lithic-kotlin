// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionReplayMissingParamsTest {

    @Test
    fun create() {
        EventSubscriptionReplayMissingParams.builder()
            .eventSubscriptionToken("event_subscription_token")
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("begin", "2019-12-27T18:11:19.117Z")
        expected.put("end", "2019-12-27T18:11:19.117Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionReplayMissingParams.builder()
                .eventSubscriptionToken("event_subscription_token")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionToken"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_token")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
