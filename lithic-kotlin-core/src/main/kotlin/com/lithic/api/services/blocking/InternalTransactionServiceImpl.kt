// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions

class InternalTransactionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InternalTransactionService {

    private val withRawResponse: InternalTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InternalTransactionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InternalTransactionService =
        InternalTransactionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalTransactionService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InternalTransactionService.WithRawResponse =
            InternalTransactionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
