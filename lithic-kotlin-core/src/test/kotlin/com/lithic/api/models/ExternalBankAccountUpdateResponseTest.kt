// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountUpdateResponseTest {

    @Test
    fun createExternalBankAccountUpdateResponse() {
        val externalBankAccountUpdateResponse =
            ExternalBankAccountUpdateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(ExternalBankAccountUpdateResponse.OwnerType.BUSINESS)
                .routingNumber("string")
                .state(ExternalBankAccountUpdateResponse.State.ENABLED)
                .type(ExternalBankAccountUpdateResponse.Type.CHECKING)
                .verificationAttempts(123L)
                .verificationMethod(ExternalBankAccountUpdateResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountUpdateResponse.VerificationState.PENDING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    ExternalBankAccountAddress.builder()
                        .address1("x")
                        .city("x")
                        .country("USD")
                        .postalCode("11201")
                        .state("xx")
                        .address2("x")
                        .build()
                )
                .companyId("string")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("string")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .userDefinedId("string")
                .verificationFailedReason("string")
                .build()
        assertThat(externalBankAccountUpdateResponse).isNotNull
        assertThat(externalBankAccountUpdateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdateResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountUpdateResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.ownerType())
            .isEqualTo(ExternalBankAccountUpdateResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountUpdateResponse.routingNumber()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.state())
            .isEqualTo(ExternalBankAccountUpdateResponse.State.ENABLED)
        assertThat(externalBankAccountUpdateResponse.type())
            .isEqualTo(ExternalBankAccountUpdateResponse.Type.CHECKING)
        assertThat(externalBankAccountUpdateResponse.verificationAttempts()).isEqualTo(123L)
        assertThat(externalBankAccountUpdateResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountUpdateResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountUpdateResponse.verificationState())
            .isEqualTo(ExternalBankAccountUpdateResponse.VerificationState.PENDING)
        assertThat(externalBankAccountUpdateResponse.accountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdateResponse.address())
            .isEqualTo(
                ExternalBankAccountAddress.builder()
                    .address1("x")
                    .city("x")
                    .country("USD")
                    .postalCode("11201")
                    .state("xx")
                    .address2("x")
                    .build()
            )
        assertThat(externalBankAccountUpdateResponse.companyId()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.dob()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountUpdateResponse.doingBusinessAs()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdateResponse.name()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.userDefinedId()).isEqualTo("string")
        assertThat(externalBankAccountUpdateResponse.verificationFailedReason()).isEqualTo("string")
    }
}
