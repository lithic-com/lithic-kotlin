package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleRemoveResponseTest {

    @Test
    fun createAuthRuleRemoveResponse() {
        val authRuleRemoveResponse =
            AuthRuleRemoveResponse.builder()
                .accountTokens(listOf("string"))
                .cardTokens(listOf("string"))
                .previousAuthRuleTokens(listOf("string"))
                .programLevel(true)
                .build()
        assertThat(authRuleRemoveResponse).isNotNull
        assertThat(authRuleRemoveResponse.accountTokens()).containsExactly("string")
        assertThat(authRuleRemoveResponse.cardTokens()).containsExactly("string")
        assertThat(authRuleRemoveResponse.previousAuthRuleTokens()).containsExactly("string")
        assertThat(authRuleRemoveResponse.programLevel()).isEqualTo(true)
    }
}
