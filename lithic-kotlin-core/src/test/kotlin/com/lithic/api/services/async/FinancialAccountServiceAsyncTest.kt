// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FinancialAccountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccount =
            financialAccountServiceAsync.create(
                FinancialAccountCreateParams.builder()
                    .idempotencyKey("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .type(FinancialAccountCreateParams.Type.OPERATING)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isForBenefitOf(true)
                    .build()
            )

        financialAccount.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccount =
            financialAccountServiceAsync.retrieve(
                FinancialAccountRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        financialAccount.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccount =
            financialAccountServiceAsync.update(
                FinancialAccountUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .nickname("nickname")
                    .build()
            )

        financialAccount.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val page = financialAccountServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun updateStatus() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialAccountServiceAsync = client.financialAccounts()

        val financialAccount =
            financialAccountServiceAsync.updateStatus(
                FinancialAccountUpdateStatusParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(FinancialAccountUpdateStatusParams.FinancialAccountStatus.OPEN)
                    .substatus(
                        FinancialAccountUpdateStatusParams.UpdateFinancialAccountSubstatus
                            .CHARGED_OFF_FRAUD
                    )
                    .build()
            )

        financialAccount.validate()
    }
}
