// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRuleListParamsTest {

    @Test
    fun createAuthRuleListParams() {
        AuthRuleListParams.builder()
            .endingBefore("string")
            .pageSize(100L)
            .startingAfter("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AuthRuleListParams.builder()
                .endingBefore("string")
                .pageSize(100L)
                .startingAfter("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("string"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AuthRuleListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
