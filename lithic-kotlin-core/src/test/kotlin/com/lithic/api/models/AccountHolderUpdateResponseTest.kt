// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateResponseTest {

    @Test
    fun createAccountHolderUpdateResponse() {
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.builder()
                .token("string")
                .businessAccountToken("string")
                .email("string")
                .phoneNumber("string")
                .build()
        assertThat(accountHolderUpdateResponse).isNotNull
        assertThat(accountHolderUpdateResponse.token()).isEqualTo("string")
        assertThat(accountHolderUpdateResponse.businessAccountToken()).isEqualTo("string")
        assertThat(accountHolderUpdateResponse.email()).isEqualTo("string")
        assertThat(accountHolderUpdateResponse.phoneNumber()).isEqualTo("string")
    }
}
