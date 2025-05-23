// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountSpendLimitsTest {

    @Test
    fun create() {
        val accountSpendLimits =
            AccountSpendLimits.builder()
                .availableSpendLimit(
                    AccountSpendLimits.AvailableSpendLimit.builder()
                        .daily(100000L)
                        .lifetime(300000L)
                        .monthly(200000L)
                        .build()
                )
                .spendLimit(
                    AccountSpendLimits.SpendLimit.builder()
                        .daily(500000L)
                        .lifetime(500000L)
                        .monthly(500000L)
                        .build()
                )
                .spendVelocity(
                    AccountSpendLimits.SpendVelocity.builder()
                        .daily(40000L)
                        .lifetime(20000L)
                        .monthly(30000L)
                        .build()
                )
                .build()

        assertThat(accountSpendLimits.availableSpendLimit())
            .isEqualTo(
                AccountSpendLimits.AvailableSpendLimit.builder()
                    .daily(100000L)
                    .lifetime(300000L)
                    .monthly(200000L)
                    .build()
            )
        assertThat(accountSpendLimits.spendLimit())
            .isEqualTo(
                AccountSpendLimits.SpendLimit.builder()
                    .daily(500000L)
                    .lifetime(500000L)
                    .monthly(500000L)
                    .build()
            )
        assertThat(accountSpendLimits.spendVelocity())
            .isEqualTo(
                AccountSpendLimits.SpendVelocity.builder()
                    .daily(40000L)
                    .lifetime(20000L)
                    .monthly(30000L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountSpendLimits =
            AccountSpendLimits.builder()
                .availableSpendLimit(
                    AccountSpendLimits.AvailableSpendLimit.builder()
                        .daily(100000L)
                        .lifetime(300000L)
                        .monthly(200000L)
                        .build()
                )
                .spendLimit(
                    AccountSpendLimits.SpendLimit.builder()
                        .daily(500000L)
                        .lifetime(500000L)
                        .monthly(500000L)
                        .build()
                )
                .spendVelocity(
                    AccountSpendLimits.SpendVelocity.builder()
                        .daily(40000L)
                        .lifetime(20000L)
                        .monthly(30000L)
                        .build()
                )
                .build()

        val roundtrippedAccountSpendLimits =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountSpendLimits),
                jacksonTypeRef<AccountSpendLimits>(),
            )

        assertThat(roundtrippedAccountSpendLimits).isEqualTo(accountSpendLimits)
    }
}
