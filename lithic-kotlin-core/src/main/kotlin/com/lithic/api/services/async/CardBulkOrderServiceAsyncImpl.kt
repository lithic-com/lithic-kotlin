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
import com.lithic.api.models.CardBulkOrder
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderListPageAsync
import com.lithic.api.models.CardBulkOrderListPageResponse
import com.lithic.api.models.CardBulkOrderListParams
import com.lithic.api.models.CardBulkOrderRetrieveParams
import com.lithic.api.models.CardBulkOrderUpdateParams

class CardBulkOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardBulkOrderServiceAsync {

    private val withRawResponse: CardBulkOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardBulkOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardBulkOrderServiceAsync =
        CardBulkOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CardBulkOrderCreateParams,
        requestOptions: RequestOptions,
    ): CardBulkOrder =
        // post /v1/card_bulk_orders
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardBulkOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CardBulkOrder =
        // get /v1/card_bulk_orders/{bulk_order_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CardBulkOrder =
        // patch /v1/card_bulk_orders/{bulk_order_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CardBulkOrderListParams,
        requestOptions: RequestOptions,
    ): CardBulkOrderListPageAsync =
        // get /v1/card_bulk_orders
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardBulkOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardBulkOrderServiceAsync.WithRawResponse =
            CardBulkOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CardBulkOrder> =
            jsonHandler<CardBulkOrder>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CardBulkOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_bulk_orders")
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

        private val retrieveHandler: Handler<CardBulkOrder> =
            jsonHandler<CardBulkOrder>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardBulkOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bulkOrderToken", params.bulkOrderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_bulk_orders", params._pathParam(0))
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

        private val updateHandler: Handler<CardBulkOrder> =
            jsonHandler<CardBulkOrder>(clientOptions.jsonMapper)

        override suspend fun update(
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bulkOrderToken", params.bulkOrderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_bulk_orders", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CardBulkOrderListPageResponse> =
            jsonHandler<CardBulkOrderListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardBulkOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrderListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_bulk_orders")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CardBulkOrderListPageAsync.builder()
                            .service(CardBulkOrderServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
