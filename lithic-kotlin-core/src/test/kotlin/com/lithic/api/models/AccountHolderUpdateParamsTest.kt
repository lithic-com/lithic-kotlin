// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateParamsTest {

    @Test
    fun createAccountHolderUpdateParams() {
        AccountHolderUpdateParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .businessAccountToken("string")
            .email("string")
            .phoneNumber("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessAccountToken("string")
                .email("string")
                .phoneNumber("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.businessAccountToken()).isEqualTo("string")
        assertThat(body.email()).isEqualTo("string")
        assertThat(body.phoneNumber()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
