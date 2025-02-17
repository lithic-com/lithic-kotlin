// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeDSDecisioningSimulateChallengeResponseParamsTest {

    @Test
    fun create() {
        ThreeDSDecisioningSimulateChallengeResponseParams.builder()
            .challengeResponse(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreeDSDecisioningSimulateChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreeDSDecisioningSimulateChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                ChallengeResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .challengeResponse(ChallengeResult.APPROVE)
                    .build()
            )
    }
}
