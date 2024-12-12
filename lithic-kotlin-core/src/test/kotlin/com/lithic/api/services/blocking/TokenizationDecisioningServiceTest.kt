// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TokenizationDecisioningServiceTest {

    @Test
    fun callRetrieveSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningService = client.tokenizationDecisioning()
        val tokenizationSecret =
            tokenizationDecisioningService.retrieveSecret(
                TokenizationDecisioningRetrieveSecretParams.builder().build()
            )
        println(tokenizationSecret)
        tokenizationSecret.validate()
    }

    @Test
    fun callRotateSecret() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val tokenizationDecisioningService = client.tokenizationDecisioning()
        val tokenizationDecisioningRotateSecretResponse =
            tokenizationDecisioningService.rotateSecret(
                TokenizationDecisioningRotateSecretParams.builder().build()
            )
        println(tokenizationDecisioningRotateSecretResponse)
        tokenizationDecisioningRotateSecretResponse.validate()
    }
}
