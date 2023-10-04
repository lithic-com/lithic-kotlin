// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionSimulateClearingResponseTest {

    @Test
    fun createTransactionSimulateClearingResponse() {
        val transactionSimulateClearingResponse =
            TransactionSimulateClearingResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(transactionSimulateClearingResponse).isNotNull
        assertThat(transactionSimulateClearingResponse.debuggingRequestId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
