// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.AuthRuleCondition
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.ConditionalAttribute
import com.lithic.api.models.ConditionalBlockParameters
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V2ServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2 =
            v2ServiceAsync.create(
                AuthRuleV2CreateParams.builder()
                    .body(
                        AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .eventStream(
                                AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                    .EventStream
                                    .AUTHORIZATION
                            )
                            .name("name")
                            .parameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .type(
                                AuthRuleV2CreateParams.Body.CreateAuthRuleRequestAccountTokens
                                    .AuthRuleType
                                    .CONDITIONAL_BLOCK
                            )
                            .build()
                    )
                    .build()
            )

        v2.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2 = v2ServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        v2.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2 =
            v2ServiceAsync.update(
                AuthRuleV2UpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        AuthRuleV2UpdateParams.Body.UnionMember0.builder()
                            .name("name")
                            .state(AuthRuleV2UpdateParams.Body.UnionMember0.State.INACTIVE)
                            .build()
                    )
                    .build()
            )

        v2.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val page = v2ServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        v2ServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    suspend fun apply() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val response =
            v2ServiceAsync.apply(
                AuthRuleV2ApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        AuthRuleV2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addBusinessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun draft() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val response =
            v2ServiceAsync.draft(
                AuthRuleV2DraftParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parameters(
                        ConditionalBlockParameters.builder()
                            .addCondition(
                                AuthRuleCondition.builder()
                                    .attribute(ConditionalAttribute.MCC)
                                    .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                    .value("string")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun promote() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val response = v2ServiceAsync.promote("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Test
    suspend fun report() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val response = v2ServiceAsync.report("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Test
    suspend fun retrieveReport() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val response =
            v2ServiceAsync.retrieveReport(
                AuthRuleV2RetrieveReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .begin(LocalDate.parse("2019-12-27"))
                    .end(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
