// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2RetrieveResponseTest {

    @Test
    fun createV2RetrieveResponse() {
        val v2RetrieveResponse =
            V2RetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2RetrieveResponse.CurrentVersion.builder()
                        .parameters(
                            V2RetrieveResponse.CurrentVersion.Parameters
                                .ofConditionalBlockParameters(
                                    ConditionalBlockParameters.builder()
                                        .addCondition(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
                                                .build()
                                        )
                                        .build()
                                )
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    V2RetrieveResponse.DraftVersion.builder()
                        .parameters(
                            V2RetrieveResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .name("name")
                .programLevel(true)
                .state(V2RetrieveResponse.AuthRuleState.ACTIVE)
                .type(V2RetrieveResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(v2RetrieveResponse).isNotNull
        assertThat(v2RetrieveResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2RetrieveResponse.currentVersion())
            .isEqualTo(
                V2RetrieveResponse.CurrentVersion.builder()
                    .parameters(
                        V2RetrieveResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                        .value(AuthRuleCondition.Value.ofString("string"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2RetrieveResponse.draftVersion())
            .isEqualTo(
                V2RetrieveResponse.DraftVersion.builder()
                    .parameters(
                        V2RetrieveResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .addCondition(
                                    AuthRuleCondition.builder()
                                        .attribute(ConditionalAttribute.MCC)
                                        .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                        .value(AuthRuleCondition.Value.ofString("string"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2RetrieveResponse.name()).isEqualTo("name")
        assertThat(v2RetrieveResponse.programLevel()).isEqualTo(true)
        assertThat(v2RetrieveResponse.state()).isEqualTo(V2RetrieveResponse.AuthRuleState.ACTIVE)
        assertThat(v2RetrieveResponse.type())
            .isEqualTo(V2RetrieveResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2RetrieveResponse.excludedCardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
