// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2UpdateResponseTest {

    @Test
    fun createV2UpdateResponse() {
        val v2UpdateResponse =
            V2UpdateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currentVersion(
                    V2UpdateResponse.CurrentVersion.builder()
                        .parameters(
                            V2UpdateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
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
                    V2UpdateResponse.DraftVersion.builder()
                        .parameters(
                            V2UpdateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
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
                .state(V2UpdateResponse.AuthRuleState.ACTIVE)
                .type(V2UpdateResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .addExcludedCardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(v2UpdateResponse).isNotNull
        assertThat(v2UpdateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2UpdateResponse.currentVersion())
            .isEqualTo(
                V2UpdateResponse.CurrentVersion.builder()
                    .parameters(
                        V2UpdateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
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
        assertThat(v2UpdateResponse.draftVersion())
            .isEqualTo(
                V2UpdateResponse.DraftVersion.builder()
                    .parameters(
                        V2UpdateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
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
        assertThat(v2UpdateResponse.name()).isEqualTo("name")
        assertThat(v2UpdateResponse.programLevel()).isEqualTo(true)
        assertThat(v2UpdateResponse.state()).isEqualTo(V2UpdateResponse.AuthRuleState.ACTIVE)
        assertThat(v2UpdateResponse.type())
            .isEqualTo(V2UpdateResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2UpdateResponse.excludedCardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
