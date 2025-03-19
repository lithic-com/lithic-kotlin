// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointCreateResponse
import com.lithic.api.models.ResponderEndpointDeleteParams
import com.lithic.api.models.ResponderEndpointStatus

class ResponderEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ResponderEndpointServiceAsync {

    private val withRawResponse: ResponderEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResponderEndpointServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: ResponderEndpointCreateParams,
        requestOptions: RequestOptions,
    ): ResponderEndpointCreateResponse =
        // post /v1/responder_endpoints
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun delete(
        params: ResponderEndpointDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/responder_endpoints
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions,
    ): ResponderEndpointStatus =
        // get /v1/responder_endpoints
        withRawResponse().checkStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResponderEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ResponderEndpointCreateResponse> =
            jsonHandler<ResponderEndpointCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ResponderEndpointCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponderEndpointCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "responder_endpoints")
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

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: ResponderEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "responder_endpoints")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val checkStatusHandler: Handler<ResponderEndpointStatus> =
            jsonHandler<ResponderEndpointStatus>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkStatus(
            params: ResponderEndpointCheckStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponderEndpointStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "responder_endpoints")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
