// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ChallengeResponse
import com.lithic.api.models.ChallengeResult
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DecisioningServiceAsyncTest {

    @Test
    suspend fun challengeResponse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningServiceAsync = client.threeDS().decisioning()

        decisioningServiceAsync.challengeResponse(
            ThreeDSDecisioningChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()
        )
    }

    @Test
    suspend fun retrieveSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningServiceAsync = client.threeDS().decisioning()

        val response = decisioningServiceAsync.retrieveSecret()

        response.validate()
    }

    @Test
    suspend fun rotateSecret() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningServiceAsync = client.threeDS().decisioning()

        decisioningServiceAsync.rotateSecret()
    }
}
