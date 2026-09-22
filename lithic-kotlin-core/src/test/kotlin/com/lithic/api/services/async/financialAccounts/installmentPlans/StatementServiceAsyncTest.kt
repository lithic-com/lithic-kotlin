// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.installmentPlans

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementServiceAsync = client.financialAccounts().installmentPlans().statements()

        val installmentPlanStatement =
            statementServiceAsync.retrieve(
                FinancialAccountInstallmentPlanStatementRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .installmentPlanToken("installment_plan_token")
                    .statementToken("statement_token")
                    .build()
            )

        installmentPlanStatement.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val statementServiceAsync = client.financialAccounts().installmentPlans().statements()

        val page =
            statementServiceAsync.list(
                FinancialAccountInstallmentPlanStatementListParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .installmentPlanToken("installment_plan_token")
                    .build()
            )

        page.response().validate()
    }
}
