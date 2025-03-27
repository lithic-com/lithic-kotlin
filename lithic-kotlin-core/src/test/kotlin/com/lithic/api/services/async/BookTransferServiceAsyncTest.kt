// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.booktransfers.BookTransferCreateParams
import com.lithic.api.models.booktransfers.BookTransferRetrieveParams
import com.lithic.api.models.booktransfers.BookTransferReverseParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookTransferServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponse =
            bookTransferServiceAsync.create(
                BookTransferCreateParams.builder()
                    .amount(1L)
                    .category(BookTransferCreateParams.Category.ADJUSTMENT)
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subtype("subtype")
                    .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        bookTransferResponse.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponse =
            bookTransferServiceAsync.retrieve(
                BookTransferRetrieveParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        bookTransferResponse.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val page = bookTransferServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun reverse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val bookTransferServiceAsync = client.bookTransfers()

        val bookTransferResponse =
            bookTransferServiceAsync.reverse(
                BookTransferReverseParams.builder()
                    .bookTransferToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        bookTransferResponse.validate()
    }
}
