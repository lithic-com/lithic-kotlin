// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DecisioningSimulateChallengeResponseTest {

    @Test
    fun createDecisioningSimulateChallengeResponse() {
        val decisioningSimulateChallengeResponse =
            DecisioningSimulateChallengeResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(decisioningSimulateChallengeResponse).isNotNull
        assertThat(decisioningSimulateChallengeResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}