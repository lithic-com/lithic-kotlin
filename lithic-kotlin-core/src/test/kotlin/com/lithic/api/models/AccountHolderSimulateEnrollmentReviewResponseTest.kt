// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentReviewResponseTest {

    @Test
    fun createAccountHolderSimulateEnrollmentReviewResponse() {
        val accountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .beneficialOwnerEntities(
                    listOf(
                        AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.builder()
                            .address(
                                AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity
                                    .Address2
                                    .builder()
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
                            .phoneNumbers(listOf("+12124007676"))
                            .dbaBusinessName("dba_business_name")
                            .parentCompany("parent_company")
                            .build()
                    )
                )
                .beneficialOwnerIndividuals(
                    listOf(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                            .address(
                                AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2
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
                            .governmentId("111-23-1412")
                            .lastName("Bombadil")
                            .phoneNumber("+12124007676")
                            .build()
                    )
                )
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.Address2
                                .builder()
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
                        .phoneNumbers(listOf("+12124007676"))
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                        .address(
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2
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
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
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
                            AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2
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
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .natureOfBusiness("nature_of_business")
                .phoneNumber("phone_number")
                .requiredDocuments(
                    listOf(
                        AccountHolderSimulateEnrollmentReviewResponse.RequiredDocument.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .statusReasons(listOf("string"))
                            .validDocuments(listOf("string"))
                            .build()
                    )
                )
                .status(AccountHolderSimulateEnrollmentReviewResponse.Status.ACCEPTED)
                .statusReasons(
                    listOf(
                        AccountHolderSimulateEnrollmentReviewResponse.StatusReasons
                            .ADDRESS_VERIFICATION_FAILURE
                    )
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
                        .statusReasons(
                            listOf(
                                AccountHolderSimulateEnrollmentReviewResponse
                                    .VerificationApplication
                                    .StatusReasons
                                    .ADDRESS_VERIFICATION_FAILURE
                            )
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()
        assertThat(accountHolderSimulateEnrollmentReviewResponse).isNotNull
        assertThat(accountHolderSimulateEnrollmentReviewResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.accountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.Address2
                            .builder()
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
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2.builder()
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
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.businessEntity())
            .isEqualTo(
                AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.KybBusinessEntity.Address2
                            .builder()
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
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.controlPerson())
            .isEqualTo(
                AccountHolderSimulateEnrollmentReviewResponse.Individual.builder()
                    .address(
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2.builder()
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
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
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
                        AccountHolderSimulateEnrollmentReviewResponse.Individual.Address2.builder()
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
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness())
            .isEqualTo("nature_of_business")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.phoneNumber())
            .isEqualTo("phone_number")
        assertThat(accountHolderSimulateEnrollmentReviewResponse.requiredDocuments())
            .containsExactly(
                AccountHolderSimulateEnrollmentReviewResponse.RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .statusReasons(listOf("string"))
                    .validDocuments(listOf("string"))
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
                    .statusReasons(
                        listOf(
                            AccountHolderSimulateEnrollmentReviewResponse.VerificationApplication
                                .StatusReasons
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountHolderSimulateEnrollmentReviewResponse.websiteUrl())
            .isEqualTo("website_url")
    }
}
