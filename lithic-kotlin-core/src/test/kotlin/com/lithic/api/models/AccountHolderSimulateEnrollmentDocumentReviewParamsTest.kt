// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderSimulateEnrollmentDocumentReviewParamsTest {

    @Test
    fun create() {
        AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
            .documentUploadToken("document_upload_token")
            .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
            .addAcceptedEntityStatusReason("string")
            .statusReason(
                AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                    .DOCUMENT_MISSING_REQUIRED_DATA
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                .documentUploadToken("document_upload_token")
                .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                .addAcceptedEntityStatusReason("string")
                .statusReason(
                    AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                        .DOCUMENT_MISSING_REQUIRED_DATA
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.documentUploadToken()).isEqualTo("document_upload_token")
        assertThat(body.status())
            .isEqualTo(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
        assertThat(body.acceptedEntityStatusReasons()).isEqualTo(listOf("string"))
        assertThat(body.statusReason())
            .isEqualTo(
                AccountHolderSimulateEnrollmentDocumentReviewParams.DocumentUploadStatusReasons
                    .DOCUMENT_MISSING_REQUIRED_DATA
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderSimulateEnrollmentDocumentReviewParams.builder()
                .documentUploadToken("document_upload_token")
                .status(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.documentUploadToken()).isEqualTo("document_upload_token")
        assertThat(body.status())
            .isEqualTo(AccountHolderSimulateEnrollmentDocumentReviewParams.Status.UPLOADED)
    }
}
