// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
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
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

class ManagementOperationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ManagementOperationServiceAsync {

    private val withRawResponse: ManagementOperationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ManagementOperationServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // post /v1/management_operations
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // get /v1/management_operations/{management_operation_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions,
    ): ManagementOperationListPageAsync =
        // get /v1/management_operations
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // post /v1/management_operations/{management_operation_token}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManagementOperationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "management_operations")
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

        private val retrieveHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "management_operations", params._pathParam(0))
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

        private val listHandler: Handler<ManagementOperationListPageAsync.Response> =
            jsonHandler<ManagementOperationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ManagementOperationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "management_operations")
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
                        ManagementOperationListPageAsync.of(
                            ManagementOperationServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val reverseHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "management_operations", params._pathParam(0), "reverse")
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
