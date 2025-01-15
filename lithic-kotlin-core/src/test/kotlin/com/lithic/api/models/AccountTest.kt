// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account =
            Account.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .spendLimit(
                    Account.SpendLimit.builder()
                        .daily(10000L)
                        .lifetime(100000L)
                        .monthly(40000L)
                        .build()
                )
                .state(Account.State.ACTIVE)
                .accountHolder(
                    Account.AccountHolder.builder()
                        .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
                        .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
                        .email("jack@lithic.com")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .addAuthRuleToken("string")
                .cardholderCurrency("USD")
                .verificationAddress(
                    Account.VerificationAddress.builder()
                        .address1("124 Old Forest Way")
                        .city("Seattle")
                        .country("USA")
                        .postalCode("98109")
                        .state("WA")
                        .address2("Apt 21")
                        .build()
                )
                .build()
        assertThat(account).isNotNull
        assertThat(account.token()).isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(account.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.spendLimit())
            .isEqualTo(
                Account.SpendLimit.builder().daily(10000L).lifetime(100000L).monthly(40000L).build()
            )
        assertThat(account.state()).isEqualTo(Account.State.ACTIVE)
        assertThat(account.accountHolder())
            .isEqualTo(
                Account.AccountHolder.builder()
                    .token("95e5f1b7-cfd5-4520-aa3c-2451bab8608d")
                    .businessAccountToken("e87db14a-4abf-4901-adad-5d5c9f46aff2")
                    .email("jack@lithic.com")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(account.authRuleTokens()).containsExactly("string")
        assertThat(account.cardholderCurrency()).isEqualTo("USD")
        assertThat(account.verificationAddress())
            .isEqualTo(
                Account.VerificationAddress.builder()
                    .address1("124 Old Forest Way")
                    .city("Seattle")
                    .country("USA")
                    .postalCode("98109")
                    .state("WA")
                    .address2("Apt 21")
                    .build()
            )
    }
}
