// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPageAsync
import com.lithic.api.models.BookTransferListPageResponse
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

class BookTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BookTransferServiceAsync {

    private val withRawResponse: BookTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookTransferServiceAsync =
        BookTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // post /v1/book_transfers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // get /v1/book_transfers/{book_transfer_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: BookTransferListParams,
        requestOptions: RequestOptions,
    ): BookTransferListPageAsync =
        // get /v1/book_transfers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // post /v1/book_transfers/{book_transfer_token}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookTransferServiceAsync.WithRawResponse =
            BookTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookTransferToken", params.bookTransferToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BookTransferListPageResponse> =
            jsonHandler<BookTransferListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: BookTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BookTransferListPageAsync.builder()
                            .service(BookTransferServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val reverseHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookTransferToken", params.bookTransferToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
