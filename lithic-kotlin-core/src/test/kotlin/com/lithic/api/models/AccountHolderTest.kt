package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderTest {

    @Test
    fun createAccountHolder() {
        val accountHolder =
            AccountHolder.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(AccountHolder.Status.ACCEPTED)
                .statusReasons(listOf(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE))
                .build()
        assertThat(accountHolder).isNotNull
        assertThat(accountHolder.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.businessAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.status()).isEqualTo(AccountHolder.Status.ACCEPTED)
        assertThat(accountHolder.statusReasons())
            .containsExactly(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
    }
}
