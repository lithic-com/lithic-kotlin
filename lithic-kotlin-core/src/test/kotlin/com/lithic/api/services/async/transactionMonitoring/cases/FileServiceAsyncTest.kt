// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val caseFile =
            fileServiceAsync.create(
                TransactionMonitoringCaseFileCreateParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        caseFile.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val caseFile =
            fileServiceAsync.retrieve(
                TransactionMonitoringCaseFileRetrieveParams.builder()
                    .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        caseFile.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        val page = fileServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fileServiceAsync = client.transactionMonitoring().cases().files()

        fileServiceAsync.delete(
            TransactionMonitoringCaseFileDeleteParams.builder()
                .caseToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
