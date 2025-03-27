// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeds

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.threeds.decisioning.ChallengeResponse
import com.lithic.api.models.threeds.decisioning.ChallengeResult
import com.lithic.api.models.threeds.decisioning.DecisioningChallengeResponseParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeResponseParams
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
            DecisioningChallengeResponseParams.builder()
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

    @Test
    suspend fun simulateChallenge() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningServiceAsync = client.threeDS().decisioning()

        val response =
            decisioningServiceAsync.simulateChallenge(
                DecisioningSimulateChallengeParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateChallengeResponse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val decisioningServiceAsync = client.threeDS().decisioning()

        decisioningServiceAsync.simulateChallengeResponse(
            DecisioningSimulateChallengeResponseParams.builder()
                .challengeResponse(
                    ChallengeResponse.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .challengeResponse(ChallengeResult.APPROVE)
                        .build()
                )
                .build()
        )
    }
}
