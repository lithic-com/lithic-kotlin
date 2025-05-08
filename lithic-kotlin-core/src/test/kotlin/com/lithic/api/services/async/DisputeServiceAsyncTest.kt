// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DisputeServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val dispute =
            disputeServiceAsync.create(
                DisputeCreateParams.builder()
                    .amount(10000L)
                    .reason(DisputeCreateParams.Reason.FRAUD_CARD_PRESENT)
                    .transactionToken("12345624-aa69-4cbc-a946-30d90181b621")
                    .customerFiledDate(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                    .customerNote("customer_note")
                    .build()
            )

        dispute.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val dispute = disputeServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dispute.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val dispute =
            disputeServiceAsync.update(
                DisputeUpdateParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerNote("customer_note")
                    .reason(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
                    .build()
            )

        dispute.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val page = disputeServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val dispute = disputeServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dispute.validate()
    }

    @Test
    suspend fun deleteEvidence() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidence =
            disputeServiceAsync.deleteEvidence(
                DisputeDeleteEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        disputeEvidence.validate()
    }

    @Test
    suspend fun initiateEvidenceUpload() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidence =
            disputeServiceAsync.initiateEvidenceUpload(
                DisputeInitiateEvidenceUploadParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filename("filename")
                    .build()
            )

        disputeEvidence.validate()
    }

    @Test
    suspend fun listEvidences() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val page = disputeServiceAsync.listEvidences("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    suspend fun retrieveEvidence() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeServiceAsync = client.disputes()

        val disputeEvidence =
            disputeServiceAsync.retrieveEvidence(
                DisputeRetrieveEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        disputeEvidence.validate()
    }
}
