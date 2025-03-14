// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionEventEnhancedCommercialDataRetrieveParamsTest {

    @Test
    fun create() {
        TransactionEventEnhancedCommercialDataRetrieveParams.builder()
            .eventToken("00000000-0000-0000-0000-000000000000")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            TransactionEventEnhancedCommercialDataRetrieveParams.builder()
                .eventToken("00000000-0000-0000-0000-000000000000")
                .build()
        assertThat(params).isNotNull
        // path param "eventToken"
        assertThat(params.getPathParam(0)).isEqualTo("00000000-0000-0000-0000-000000000000")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
