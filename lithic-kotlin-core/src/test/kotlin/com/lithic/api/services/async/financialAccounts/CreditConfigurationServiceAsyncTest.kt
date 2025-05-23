// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditConfigurationServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationServiceAsync = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfig =
            creditConfigurationServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        financialAccountCreditConfig.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val creditConfigurationServiceAsync = client.financialAccounts().creditConfiguration()

        val financialAccountCreditConfig =
            creditConfigurationServiceAsync.update(
                FinancialAccountCreditConfigurationUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditLimit(0L)
                    .creditProductToken("credit_product_token")
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tier("x")
                    .build()
            )

        financialAccountCreditConfig.validate()
    }
}
