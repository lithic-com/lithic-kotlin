// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateResponseTest {

    @Test
    fun createAccountHolderUpdateResponse() {
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.builder()
                .token("token")
                .businessAccountToken("business_account_token")
                .email("email")
                .phoneNumber("phone_number")
                .build()
        assertThat(accountHolderUpdateResponse).isNotNull
        assertThat(accountHolderUpdateResponse.token()).isEqualTo("token")
        assertThat(accountHolderUpdateResponse.businessAccountToken())
            .isEqualTo("business_account_token")
        assertThat(accountHolderUpdateResponse.email()).isEqualTo("email")
        assertThat(accountHolderUpdateResponse.phoneNumber()).isEqualTo("phone_number")
    }
}
