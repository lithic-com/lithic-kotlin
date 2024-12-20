// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleV2ListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class V2ServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2CreateResponse =
            v2Service.create(
                AuthRuleV2CreateParams.builder()
                    .forCreateAuthRuleRequestAccountTokens(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.builder()
                            .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                            .parameters(
                                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.Parameters
                                    .ofConditionalBlockParameters(
                                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens
                                            .Parameters
                                            .ConditionalBlockParameters
                                            .builder()
                                            .conditions(
                                                listOf(
                                                    AuthRuleV2CreateParams
                                                        .CreateAuthRuleRequestAccountTokens
                                                        .Parameters
                                                        .ConditionalBlockParameters
                                                        .Condition
                                                        .builder()
                                                        .attribute(
                                                            AuthRuleV2CreateParams
                                                                .CreateAuthRuleRequestAccountTokens
                                                                .Parameters
                                                                .ConditionalBlockParameters
                                                                .Condition
                                                                .Attribute
                                                                .MCC
                                                        )
                                                        .operation(
                                                            AuthRuleV2CreateParams
                                                                .CreateAuthRuleRequestAccountTokens
                                                                .Parameters
                                                                .ConditionalBlockParameters
                                                                .Condition
                                                                .Operation
                                                                .IS_ONE_OF
                                                        )
                                                        .value(
                                                            AuthRuleV2CreateParams
                                                                .CreateAuthRuleRequestAccountTokens
                                                                .Parameters
                                                                .ConditionalBlockParameters
                                                                .Condition
                                                                .Value
                                                                .ofString("string")
                                                        )
                                                        .build()
                                                )
                                            )
                                            .build()
                                    )
                            )
                            .type(
                                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens
                                    .AuthRuleType
                                    .CONDITIONAL_BLOCK
                            )
                            .build()
                    )
                    .build()
            )
        println(v2CreateResponse)
        v2CreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2RetrieveResponse =
            v2Service.retrieve(
                AuthRuleV2RetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2RetrieveResponse)
        v2RetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2UpdateResponse =
            v2Service.update(
                AuthRuleV2UpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .state(AuthRuleV2UpdateParams.State.INACTIVE)
                    .build()
            )
        println(v2UpdateResponse)
        v2UpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val response = v2Service.list(AuthRuleV2ListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callApply() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2ApplyResponse =
            v2Service.apply(
                AuthRuleV2ApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .forApplyAuthRuleRequestAccountTokens(
                        AuthRuleV2ApplyParams.ApplyAuthRuleRequestAccountTokens.builder()
                            .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                            .build()
                    )
                    .build()
            )
        println(v2ApplyResponse)
        v2ApplyResponse.validate()
    }

    @Test
    fun callDraft() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2DraftResponse =
            v2Service.draft(
                AuthRuleV2DraftParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parameters(
                        AuthRuleV2DraftParams.Parameters.ofConditionalBlockParameters(
                            AuthRuleV2DraftParams.Parameters.ConditionalBlockParameters.builder()
                                .conditions(
                                    listOf(
                                        AuthRuleV2DraftParams.Parameters.ConditionalBlockParameters
                                            .Condition
                                            .builder()
                                            .attribute(
                                                AuthRuleV2DraftParams.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Attribute
                                                    .MCC
                                            )
                                            .operation(
                                                AuthRuleV2DraftParams.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Operation
                                                    .IS_ONE_OF
                                            )
                                            .value(
                                                AuthRuleV2DraftParams.Parameters
                                                    .ConditionalBlockParameters
                                                    .Condition
                                                    .Value
                                                    .ofString("string")
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(v2DraftResponse)
        v2DraftResponse.validate()
    }

    @Test
    fun callPromote() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2PromoteResponse =
            v2Service.promote(
                AuthRuleV2PromoteParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2PromoteResponse)
        v2PromoteResponse.validate()
    }

    @Test
    fun callReport() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2ReportResponse =
            v2Service.report(
                AuthRuleV2ReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2ReportResponse)
        v2ReportResponse.validate()
    }
}
