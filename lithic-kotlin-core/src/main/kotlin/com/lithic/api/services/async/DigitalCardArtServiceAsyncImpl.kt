// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPageAsync
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams

class DigitalCardArtServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DigitalCardArtServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DigitalCardArt> =
        jsonHandler<DigitalCardArt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get digital card art by token. */
    override suspend fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions
    ): DigitalCardArt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "digital_card_art", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<DigitalCardArtListPageAsync.Response> =
        jsonHandler<DigitalCardArtListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List digital card art. */
    override suspend fun list(
        params: DigitalCardArtListParams,
        requestOptions: RequestOptions
    ): DigitalCardArtListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "digital_card_art")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { DigitalCardArtListPageAsync.of(this, params, it) }
        }
    }
}
