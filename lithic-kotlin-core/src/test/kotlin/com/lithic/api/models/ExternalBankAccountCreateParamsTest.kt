// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalBankAccountCreateParams.builder()
            .body(
                ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                    .builder()
                    .accountNumber("12345678901234567")
                    .country("USD")
                    .currency("USD")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .owner("owner")
                    .ownerType(OwnerType.INDIVIDUAL)
                    .routingNumber("123456789")
                    .type(
                        ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                            .AccountType
                            .CHECKING
                    )
                    .verificationMethod(VerificationMethod.MANUAL)
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
                    .companyId("sq")
                    .dob(LocalDate.parse("2019-12-27"))
                    .doingBusinessAs("x")
                    .name("name")
                    .userDefinedId("x")
                    .verificationEnforcement(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalBankAccountCreateParams.builder()
                .body(
                    ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                        .builder()
                        .accountNumber("12345678901234567")
                        .country("USD")
                        .currency("USD")
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .owner("owner")
                        .ownerType(OwnerType.INDIVIDUAL)
                        .routingNumber("123456789")
                        .type(
                            ExternalBankAccountCreateParams.Body
                                .BankVerifiedCreateBankAccountApiRequest
                                .AccountType
                                .CHECKING
                        )
                        .verificationMethod(VerificationMethod.MANUAL)
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
                        .companyId("sq")
                        .dob(LocalDate.parse("2019-12-27"))
                        .doingBusinessAs("x")
                        .name("name")
                        .userDefinedId("x")
                        .verificationEnforcement(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBankAccountCreateParams.Body.ofBankVerifiedCreateBankAccountApiRequest(
                    ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                        .builder()
                        .accountNumber("12345678901234567")
                        .country("USD")
                        .currency("USD")
                        .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .owner("owner")
                        .ownerType(OwnerType.INDIVIDUAL)
                        .routingNumber("123456789")
                        .type(
                            ExternalBankAccountCreateParams.Body
                                .BankVerifiedCreateBankAccountApiRequest
                                .AccountType
                                .CHECKING
                        )
                        .verificationMethod(VerificationMethod.MANUAL)
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
                        .companyId("sq")
                        .dob(LocalDate.parse("2019-12-27"))
                        .doingBusinessAs("x")
                        .name("name")
                        .userDefinedId("x")
                        .verificationEnforcement(true)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExternalBankAccountCreateParams.builder().build()

        val body = params._body()
    }
}
