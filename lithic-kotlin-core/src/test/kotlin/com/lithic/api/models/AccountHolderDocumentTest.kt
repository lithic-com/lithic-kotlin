// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderDocumentTest {

    @Test
    fun createAccountHolderDocument() {
        val accountHolderDocument =
            AccountHolderDocument.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentType(AccountHolderDocument.DocumentType.EIN_LETTER)
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requiredDocumentUploads(
                    listOf(
                        AccountHolderDocument.RequiredDocumentUpload.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
                            .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
                            .statusReasons(
                                listOf(
                                    AccountHolderDocument.RequiredDocumentUpload.StatusReason
                                        .BACK_IMAGE_BLURRY
                                )
                            )
                            .uploadUrl("upload_url")
                            .build()
                    )
                )
                .build()
        assertThat(accountHolderDocument).isNotNull
        assertThat(accountHolderDocument.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderDocument.accountHolderToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderDocument.documentType())
            .isEqualTo(AccountHolderDocument.DocumentType.EIN_LETTER)
        assertThat(accountHolderDocument.entityToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderDocument.requiredDocumentUploads())
            .containsExactly(
                AccountHolderDocument.RequiredDocumentUpload.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
                    .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
                    .statusReasons(
                        listOf(
                            AccountHolderDocument.RequiredDocumentUpload.StatusReason
                                .BACK_IMAGE_BLURRY
                        )
                    )
                    .uploadUrl("upload_url")
                    .build()
            )
    }
}
