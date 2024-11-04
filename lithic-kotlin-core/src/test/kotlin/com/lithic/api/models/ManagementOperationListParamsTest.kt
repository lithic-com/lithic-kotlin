// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ManagementOperationListParamsTest {

    @Test
    fun createManagementOperationListParams() {
        ManagementOperationListParams.builder()
            .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .category(ManagementOperationListParams.ManagementOperationCategory.MANAGEMENT_FEE)
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore("ending_before")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(100L)
            .startingAfter("starting_after")
            .status(ManagementOperationListParams.TransactionStatus.PENDING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ManagementOperationListParams.builder()
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ManagementOperationListParams.ManagementOperationCategory.MANAGEMENT_FEE)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore("ending_before")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(100L)
                .startingAfter("starting_after")
                .status(ManagementOperationListParams.TransactionStatus.PENDING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("begin", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("business_account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put(
            "category",
            listOf(
                ManagementOperationListParams.ManagementOperationCategory.MANAGEMENT_FEE.toString()
            )
        )
        expected.put("end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("ending_before", listOf("ending_before"))
        expected.put("financial_account_token", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("page_size", listOf("100"))
        expected.put("starting_after", listOf("starting_after"))
        expected.put(
            "status",
            listOf(ManagementOperationListParams.TransactionStatus.PENDING.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ManagementOperationListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}