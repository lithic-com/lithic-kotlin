// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderTest {

    @Test
    fun createAccountHolder() {
        val accountHolder =
            AccountHolder.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .parentCompany("parent_company")
                        .build()
                )
                .addBeneficialOwnerIndividual(
                    AccountHolder.AccountHolderIndividualResponse.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    AccountHolder.AccountHolderBusinessResponse.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    AccountHolder.AccountHolderIndividualResponse.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .email("+15555555555")
                .exemptionType(AccountHolder.ExemptionType.AUTHORIZED_USER)
                .externalId("external_id")
                .individual(
                    AccountHolder.AccountHolderIndividualResponse.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("+15555555555")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolder.Status.ACCEPTED)
                .addStatusReason(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
                .userType(AccountHolder.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolder.AccountHolderVerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                        .addStatusReason(
                            AccountHolder.AccountHolderVerificationApplication.StatusReason
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()
        assertThat(accountHolder).isNotNull
        assertThat(accountHolder.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolder.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.beneficialOwnerEntities())
            .containsExactly(
                AccountHolder.AccountHolderBusinessResponse.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolder.beneficialOwnerIndividuals())
            .containsExactly(
                AccountHolder.AccountHolderIndividualResponse.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.businessAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolder.businessEntity())
            .isEqualTo(
                AccountHolder.AccountHolderBusinessResponse.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolder.controlPerson())
            .isEqualTo(
                AccountHolder.AccountHolderIndividualResponse.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.email()).isEqualTo("+15555555555")
        assertThat(accountHolder.exemptionType())
            .isEqualTo(AccountHolder.ExemptionType.AUTHORIZED_USER)
        assertThat(accountHolder.externalId()).isEqualTo("external_id")
        assertThat(accountHolder.individual())
            .isEqualTo(
                AccountHolder.AccountHolderIndividualResponse.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolder.natureOfBusiness()).isEqualTo("nature_of_business")
        assertThat(accountHolder.phoneNumber()).isEqualTo("+15555555555")
        assertThat(accountHolder.requiredDocuments())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(accountHolder.status()).isEqualTo(AccountHolder.Status.ACCEPTED)
        assertThat(accountHolder.statusReasons())
            .containsExactly(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
        assertThat(accountHolder.userType()).isEqualTo(AccountHolder.UserType.BUSINESS)
        assertThat(accountHolder.verificationApplication())
            .isEqualTo(
                AccountHolder.AccountHolderVerificationApplication.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(AccountHolder.AccountHolderVerificationApplication.Status.ACCEPTED)
                    .addStatusReason(
                        AccountHolder.AccountHolderVerificationApplication.StatusReason
                            .ADDRESS_VERIFICATION_FAILURE
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolder.websiteUrl()).isEqualTo("website_url")
    }
}
