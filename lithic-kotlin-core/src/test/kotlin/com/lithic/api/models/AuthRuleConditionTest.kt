// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleConditionTest {

    @Test
    fun create() {
        val authRuleCondition =
            AuthRuleCondition.builder()
                .attribute(ConditionalAttribute.MCC)
                .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                .value("string")
                .build()

        assertThat(authRuleCondition.attribute()).isEqualTo(ConditionalAttribute.MCC)
        assertThat(authRuleCondition.operation()).isEqualTo(AuthRuleCondition.Operation.IS_ONE_OF)
        assertThat(authRuleCondition.value()).isEqualTo(AuthRuleCondition.Value.ofRegex("string"))
    }
}
