// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FinancialTransactionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialTransactionServiceAsync = client.cards().financialTransactions()

        val financialTransaction =
            financialTransactionServiceAsync.retrieve(
                CardFinancialTransactionRetrieveParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        financialTransaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val financialTransactionServiceAsync = client.cards().financialTransactions()

        val page =
            financialTransactionServiceAsync.list(
                CardFinancialTransactionListParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        page.response().validate()
    }
}
