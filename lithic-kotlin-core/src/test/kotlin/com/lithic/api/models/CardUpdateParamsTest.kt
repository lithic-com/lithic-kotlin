// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("Updated Name")
            .pin("pin")
            .pinStatus(CardUpdateParams.PinStatus.OK)
            .spendLimit(100L)
            .spendLimitDuration(SpendLimitDuration.ANNUALLY)
            .state(CardUpdateParams.State.CLOSED)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardUpdateParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("Updated Name")
                .pin("pin")
                .pinStatus(CardUpdateParams.PinStatus.OK)
                .spendLimit(100L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardUpdateParams.State.CLOSED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.digitalCardArtToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("Updated Name")
        assertThat(body.pin()).isEqualTo("pin")
        assertThat(body.pinStatus()).isEqualTo(CardUpdateParams.PinStatus.OK)
        assertThat(body.spendLimit()).isEqualTo(100L)
        assertThat(body.spendLimitDuration()).isEqualTo(SpendLimitDuration.ANNUALLY)
        assertThat(body.state()).isEqualTo(CardUpdateParams.State.CLOSED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
