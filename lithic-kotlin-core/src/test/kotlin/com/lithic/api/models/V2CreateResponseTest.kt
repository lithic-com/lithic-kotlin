// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2CreateResponseTest {

    @Test
    fun createV2CreateResponse() {
        val v2CreateResponse =
            V2CreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .cardTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .currentVersion(
                    V2CreateResponse.CurrentVersion.builder()
                        .parameters(
                            V2CreateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .conditions(
                                        listOf(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .draftVersion(
                    V2CreateResponse.DraftVersion.builder()
                        .parameters(
                            V2CreateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                                ConditionalBlockParameters.builder()
                                    .conditions(
                                        listOf(
                                            AuthRuleCondition.builder()
                                                .attribute(ConditionalAttribute.MCC)
                                                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                                .value(AuthRuleCondition.Value.ofString("string"))
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .version(0L)
                        .build()
                )
                .name("name")
                .programLevel(true)
                .state(V2CreateResponse.AuthRuleState.ACTIVE)
                .type(V2CreateResponse.AuthRuleType.CONDITIONAL_BLOCK)
                .excludedCardTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        assertThat(v2CreateResponse).isNotNull
        assertThat(v2CreateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.accountTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.cardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v2CreateResponse.currentVersion())
            .isEqualTo(
                V2CreateResponse.CurrentVersion.builder()
                    .parameters(
                        V2CreateResponse.CurrentVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .conditions(
                                    listOf(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2CreateResponse.draftVersion())
            .isEqualTo(
                V2CreateResponse.DraftVersion.builder()
                    .parameters(
                        V2CreateResponse.DraftVersion.Parameters.ofConditionalBlockParameters(
                            ConditionalBlockParameters.builder()
                                .conditions(
                                    listOf(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value(AuthRuleCondition.Value.ofString("string"))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .version(0L)
                    .build()
            )
        assertThat(v2CreateResponse.name()).isEqualTo("name")
        assertThat(v2CreateResponse.programLevel()).isEqualTo(true)
        assertThat(v2CreateResponse.state()).isEqualTo(V2CreateResponse.AuthRuleState.ACTIVE)
        assertThat(v2CreateResponse.type())
            .isEqualTo(V2CreateResponse.AuthRuleType.CONDITIONAL_BLOCK)
        assertThat(v2CreateResponse.excludedCardTokens())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
