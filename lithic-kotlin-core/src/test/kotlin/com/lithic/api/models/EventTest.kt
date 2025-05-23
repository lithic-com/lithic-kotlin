// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventTest {

    @Test
    fun create() {
        val event =
            Event.builder()
                .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(Event.EventType.ACCOUNT_HOLDER_CREATED)
                .payload(Event.Payload.builder().build())
                .build()

        assertThat(event.token()).isEqualTo("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
        assertThat(event.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.eventType()).isEqualTo(Event.EventType.ACCOUNT_HOLDER_CREATED)
        assertThat(event.payload()).isEqualTo(Event.Payload.builder().build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.builder()
                .token("msg_1srOrx2ZWZBpBUvZwXKQmoEYga1")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(Event.EventType.ACCOUNT_HOLDER_CREATED)
                .payload(Event.Payload.builder().build())
                .build()

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }
}
