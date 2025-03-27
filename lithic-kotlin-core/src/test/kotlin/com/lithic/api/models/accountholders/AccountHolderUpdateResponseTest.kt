// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.accountholders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderUpdateResponseTest {

    @Test
    fun create() {
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.builder()
                .token("token")
                .businessAccountToken("business_account_token")
                .email("email")
                .phoneNumber("phone_number")
                .build()

        assertThat(accountHolderUpdateResponse.token()).isEqualTo("token")
        assertThat(accountHolderUpdateResponse.businessAccountToken())
            .isEqualTo("business_account_token")
        assertThat(accountHolderUpdateResponse.email()).isEqualTo("email")
        assertThat(accountHolderUpdateResponse.phoneNumber()).isEqualTo("phone_number")
    }
}
