// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions

class InternalTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InternalTransactionServiceAsync {

    private val withRawResponse: InternalTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InternalTransactionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InternalTransactionServiceAsync =
        InternalTransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalTransactionServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InternalTransactionServiceAsync.WithRawResponse =
            InternalTransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
