package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DecisioningRetrieveSecretResponseTest {

    @Test
    fun createDecisioningRetrieveSecretResponse() {
        val decisioningRetrieveSecretResponse =
            DecisioningRetrieveSecretResponse.builder()
                .secret("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
                .build()
        assertThat(decisioningRetrieveSecretResponse).isNotNull
        assertThat(decisioningRetrieveSecretResponse.secret())
            .isEqualTo("whsec_1NDsYinMGr951KuDEaj78VtWzlyPaOnwUVagFiWIPJs=")
    }
}
