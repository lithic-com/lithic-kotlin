// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2ApplyResponseTest {

    @Test
    fun createV2ApplyResponse() {
        val v2ApplyResponse =
            V2ApplyResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2ApplyResponse.CurrentVersion.builder()
                        .parameters(
                            V2ApplyResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
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
                    V2ApplyResponse.DraftVersion.builder()
                        .parameters(
                            V2ApplyResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
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
                .state(V2ApplyResponse.AuthRuleState.ACTIVE)
                .type(V2ApplyResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(v2ApplyResponse).isNotNull
        assertThat(v2ApplyResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ApplyResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ApplyResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2ApplyResponse.currentVersion())
            .isEqualTo(
                V2ApplyResponse.CurrentVersion.builder()
                    .parameters(
                        V2ApplyResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
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
        assertThat(v2ApplyResponse.draftVersion())
            .isEqualTo(
                V2ApplyResponse.DraftVersion.builder()
                    .parameters(
                        V2ApplyResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
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
        assertThat(v2ApplyResponse.name()).isEqualTo("name")
        assertThat(v2ApplyResponse.programLevel()).isEqualTo(true)
        assertThat(v2ApplyResponse.state()).isEqualTo(V2ApplyResponse.AuthRuleState.ACTIVE)
        assertThat(v2ApplyResponse.type()).isEqualTo(V2ApplyResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2ApplyResponse.excludedCardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
