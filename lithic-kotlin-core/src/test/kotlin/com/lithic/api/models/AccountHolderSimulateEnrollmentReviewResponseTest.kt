// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderSimulateEnrollmentReviewResponseTest {

    @Test
    fun create() {
        val accountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .addBeneficialOwnerIndividual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .exemptionType(
                    AccountHolderSimulateEnrollmentReviewResponse.ExemptionType.AUTHORIZED_USER
                )
                .externalId("external_id")
                .individual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("phone_number")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
                .addStatusReason(
                    AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                        .ADDRESS_VERIFICATION_FAILURE
                )
                .userType(AccountHolderSimulateEnrollmentReviewResponse.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .Status
                                .ACCEPTED
                        )
                        .addStatusReason(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .StatusReasons
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()

        assertThat(accountHolderSimulateEnrollmentReviewResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.accountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities())
            .containsExactly(
                KybBusinessEntity.builder()
                    .address(
                        KybBusinessEntity.Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessEntity())
            .isEqualTo(
                KybBusinessEntity.builder()
                    .address(
                        KybBusinessEntity.Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.controlPerson())
            .isEqualTo(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderSimulateEnrollmentReviewResponse.email()).isEqualTo("email")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.exemptionType())
            .isEqualTo(AccountHolderSimulateEnrollmentReviewResponse.ExemptionType.AUTHORIZED_USER)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.externalId())
            .isEqualTo("external_id")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.individual())
            .isEqualTo(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address.builder()
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
                    .firstName("Tom")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness())
            .isEqualTo("nature_of_business")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.phoneNumber())
            .isEqualTo("phone_number")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.requiredDocuments())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.status())
            .isEqualTo(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.statusReasons())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                    .ADDRESS_VERIFICATION_FAILURE
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.userType())
            .isEqualTo(AccountHolderSimulateEnrollmentReviewResponse.UserType.BUSINESS)
        assertThat(accountHolderSimulateEnrollmentReviewResponse.verificationApplication())
            .isEqualTo(
                AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.Status
                            .ACCEPTED
                    )
                    .addStatusReason(
                        AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                            .StatusReasons
                            .ADDRESS_VERIFICATION_FAILURE
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.websiteUrl())
            .isEqualTo("website_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .addBeneficialOwnerIndividual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .exemptionType(
                    AccountHolderSimulateEnrollmentReviewResponse.ExemptionType.AUTHORIZED_USER
                )
                .externalId("external_id")
                .individual(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address
                                .builder()
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
                        .firstName("Tom")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("phone_number")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
                .addStatusReason(
                    AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                        .ADDRESS_VERIFICATION_FAILURE
                )
                .userType(AccountHolderSimulateEnrollmentReviewResponse.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .Status
                                .ACCEPTED
                        )
                        .addStatusReason(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .StatusReasons
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()

        val roundtrippedAccountHolderSimulateEnrollmentReviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderSimulateEnrollmentReviewResponse),
                jacksonTypeRef<AccountHolderSimulateEnrollmentReviewResponse>(),
            )

        assertThat(roundtrippedAccountHolderSimulateEnrollmentReviewResponse)
            .isEqualTo(accountHolderSimulateEnrollmentReviewResponse)
    }
}
