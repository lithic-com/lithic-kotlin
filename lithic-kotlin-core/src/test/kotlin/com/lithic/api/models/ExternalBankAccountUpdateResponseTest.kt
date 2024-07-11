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
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountUpdateResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
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
                .companyId("company_id")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("doing_business_as")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .userDefinedId("user_defined_id")
                .verificationFailedReason("verification_failed_reason")
                .build()
        assertThat(externalBankAccountUpdateResponse).isNotNull
        assertThat(externalBankAccountUpdateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdateResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountUpdateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountUpdateResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountUpdateResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountUpdateResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountUpdateResponse.ownerType())
            .isEqualTo(ExternalBankAccountUpdateResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountUpdateResponse.routingNumber()).isEqualTo("routing_number")
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
        assertThat(externalBankAccountUpdateResponse.companyId()).isEqualTo("company_id")
        assertThat(externalBankAccountUpdateResponse.dob()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountUpdateResponse.doingBusinessAs())
            .isEqualTo("doing_business_as")
        assertThat(externalBankAccountUpdateResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdateResponse.name()).isEqualTo("name")
        assertThat(externalBankAccountUpdateResponse.userDefinedId()).isEqualTo("user_defined_id")
        assertThat(externalBankAccountUpdateResponse.verificationFailedReason())
            .isEqualTo("verification_failed_reason")
    }
}
