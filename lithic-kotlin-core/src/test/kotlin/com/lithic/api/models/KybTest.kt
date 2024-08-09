// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KybTest {

    @Test
    fun createKyb() {
        val kyb =
            Kyb.builder()
                .beneficialOwnerEntities(
                    listOf(
                        Kyb.BusinessEntity.builder()
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
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .phoneNumbers(listOf("+12124007676"))
                            .dbaBusinessName("dba_business_name")
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .parentCompany("parent_company")
                            .build()
                    )
                )
                .beneficialOwnerIndividuals(
                    listOf(
                        Kyb.KybIndividual.builder()
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
                            .firstName("Tom")
                            .governmentId("111-23-1412")
                            .lastName("Bombadil")
                            .phoneNumber("+12124007676")
                            .build()
                    )
                )
                .businessEntity(
                    Kyb.BusinessEntity.builder()
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
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .phoneNumbers(listOf("+12124007676"))
                        .dbaBusinessName("dba_business_name")
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    Kyb.KybIndividual.builder()
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
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .natureOfBusiness("Software company selling solutions to the restaurant industry")
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(Kyb.Workflow.KYB_BASIC)
                .externalId("external_id")
                .kybPassedTimestamp("2018-05-29T21:16:05Z")
                .websiteUrl("www.mybusiness.com")
                .build()
        assertThat(kyb).isNotNull
        assertThat(kyb.beneficialOwnerEntities())
            .containsExactly(
                Kyb.BusinessEntity.builder()
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
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(kyb.beneficialOwnerIndividuals())
            .containsExactly(
                Kyb.KybIndividual.builder()
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
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(kyb.businessEntity())
            .isEqualTo(
                Kyb.BusinessEntity.builder()
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
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .phoneNumbers(listOf("+12124007676"))
                    .dbaBusinessName("dba_business_name")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(kyb.controlPerson())
            .isEqualTo(
                Kyb.KybIndividual.builder()
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
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(kyb.natureOfBusiness())
            .isEqualTo("Software company selling solutions to the restaurant industry")
        assertThat(kyb.tosTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(kyb.workflow()).isEqualTo(Kyb.Workflow.KYB_BASIC)
        assertThat(kyb.externalId()).isEqualTo("external_id")
        assertThat(kyb.kybPassedTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(kyb.websiteUrl()).isEqualTo("www.mybusiness.com")
    }
}
