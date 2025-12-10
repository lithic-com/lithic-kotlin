// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderVerificationWebhookEventTest {

    @Test
    fun create() {
        val accountHolderVerificationWebhookEvent =
            AccountHolderVerificationWebhookEvent.builder()
                .eventType(
                    AccountHolderVerificationWebhookEvent.EventType.ACCOUNT_HOLDER_VERIFICATION
                )
                .token("00000000-0000-0000-0000-000000000001")
                .accountToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(AccountHolderVerificationWebhookEvent.Status.ACCEPTED)
                .addStatusReason("string")
                .build()

        assertThat(accountHolderVerificationWebhookEvent.eventType())
            .isEqualTo(AccountHolderVerificationWebhookEvent.EventType.ACCOUNT_HOLDER_VERIFICATION)
        assertThat(accountHolderVerificationWebhookEvent.token())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(accountHolderVerificationWebhookEvent.accountToken())
            .isEqualTo("00000000-0000-0000-0000-000000000001")
        assertThat(accountHolderVerificationWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderVerificationWebhookEvent.status())
            .isEqualTo(AccountHolderVerificationWebhookEvent.Status.ACCEPTED)
        assertThat(accountHolderVerificationWebhookEvent.statusReasons()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderVerificationWebhookEvent =
            AccountHolderVerificationWebhookEvent.builder()
                .eventType(
                    AccountHolderVerificationWebhookEvent.EventType.ACCOUNT_HOLDER_VERIFICATION
                )
                .token("00000000-0000-0000-0000-000000000001")
                .accountToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(AccountHolderVerificationWebhookEvent.Status.ACCEPTED)
                .addStatusReason("string")
                .build()

        val roundtrippedAccountHolderVerificationWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderVerificationWebhookEvent),
                jacksonTypeRef<AccountHolderVerificationWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderVerificationWebhookEvent)
            .isEqualTo(accountHolderVerificationWebhookEvent)
    }
}
