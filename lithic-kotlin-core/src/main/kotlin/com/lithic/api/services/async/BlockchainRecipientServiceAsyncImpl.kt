// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams
import com.lithic.api.models.BlockchainRecipientRetrieveParams

class BlockchainRecipientServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BlockchainRecipientServiceAsync {

    private val withRawResponse: BlockchainRecipientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BlockchainRecipientServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): BlockchainRecipientServiceAsync =
        BlockchainRecipientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: BlockchainRecipientCreateParams,
        requestOptions: RequestOptions,
    ): BlockchainRecipient =
        // post /v1/blockchain_recipients
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BlockchainRecipientRetrieveParams,
        requestOptions: RequestOptions,
    ): BlockchainRecipient =
        // get /v1/blockchain_recipients/{blockchain_recipient_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlockchainRecipientServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BlockchainRecipientServiceAsync.WithRawResponse =
            BlockchainRecipientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BlockchainRecipient> =
            jsonHandler<BlockchainRecipient>(clientOptions.jsonMapper)

        override suspend fun create(
            params: BlockchainRecipientCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockchainRecipient> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "blockchain_recipients")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BlockchainRecipient> =
            jsonHandler<BlockchainRecipient>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: BlockchainRecipientRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockchainRecipient> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blockchainRecipientToken", params.blockchainRecipientToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "blockchain_recipients", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
