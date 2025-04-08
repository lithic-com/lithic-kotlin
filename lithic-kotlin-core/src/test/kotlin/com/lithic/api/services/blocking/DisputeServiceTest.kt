// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DisputeServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val dispute =
            disputeService.create(
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
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val dispute =
            disputeService.retrieve(
                DisputeRetrieveParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        dispute.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val dispute =
            disputeService.update(
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
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val page = disputeService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val dispute =
            disputeService.delete(
                DisputeDeleteParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        dispute.validate()
    }

    @Test
    fun deleteEvidence() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val disputeEvidence =
            disputeService.deleteEvidence(
                DisputeDeleteEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        disputeEvidence.validate()
    }

    @Test
    fun initiateEvidenceUpload() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val disputeEvidence =
            disputeService.initiateEvidenceUpload(
                DisputeInitiateEvidenceUploadParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filename("filename")
                    .build()
            )

        disputeEvidence.validate()
    }

    @Test
    fun listEvidences() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val page =
            disputeService.listEvidences(
                DisputeListEvidencesParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun retrieveEvidence() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val disputeService = client.disputes()

        val disputeEvidence =
            disputeService.retrieveEvidence(
                DisputeRetrieveEvidenceParams.builder()
                    .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evidenceToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        disputeEvidence.validate()
    }
}
