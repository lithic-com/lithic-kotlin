// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

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
            .spendLimitDuration(SpendLimitDuration.FOREVER)
            .state(CardUpdateParams.State.OPEN)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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
                .spendLimitDuration(SpendLimitDuration.FOREVER)
                .state(CardUpdateParams.State.OPEN)
                .build()

        val body = params._body()

        assertThat(body.digitalCardArtToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("Updated Name")
        assertThat(body.pin()).isEqualTo("pin")
        assertThat(body.pinStatus()).isEqualTo(CardUpdateParams.PinStatus.OK)
        assertThat(body.spendLimit()).isEqualTo(100L)
        assertThat(body.spendLimitDuration()).isEqualTo(SpendLimitDuration.FOREVER)
        assertThat(body.state()).isEqualTo(CardUpdateParams.State.OPEN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
