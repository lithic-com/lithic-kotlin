// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateVoidParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val transaction = transactionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        transaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val page = transactionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun expireAuthorization() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        transactionServiceAsync.expireAuthorization("00000000-0000-0000-0000-000000000000")
    }

    @Test
    suspend fun simulateAuthorization() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateAuthorization(
                TransactionSimulateAuthorizationParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .mcc("5812")
                    .merchantAcceptorId("OODKZAPJVN4YS7O")
                    .merchantAmount(0L)
                    .merchantCurrency("GBP")
                    .partialApprovalCapable(true)
                    .pin("1234")
                    .status(TransactionSimulateAuthorizationParams.Status.AUTHORIZATION)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateAuthorizationAdvice() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateAuthorizationAdvice(
                TransactionSimulateAuthorizationAdviceParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(3831L)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateClearing() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateClearing(
                TransactionSimulateClearingParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateCreditAuthorization() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateCreditAuthorization(
                TransactionSimulateCreditAuthorizationParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .mcc("5812")
                    .merchantAcceptorId("XRKGDPOWEWQRRWU")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateReturn() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateReturn(
                TransactionSimulateReturnParams.builder()
                    .amount(3831L)
                    .descriptor("COFFEE SHOP")
                    .pan("4111111289144142")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateReturnReversal() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateReturnReversal(
                TransactionSimulateReturnReversalParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateVoid() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val response =
            transactionServiceAsync.simulateVoid(
                TransactionSimulateVoidParams.builder()
                    .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                    .amount(100L)
                    .type(TransactionSimulateVoidParams.Type.AUTHORIZATION_EXPIRY)
                    .build()
            )

        response.validate()
    }
}
