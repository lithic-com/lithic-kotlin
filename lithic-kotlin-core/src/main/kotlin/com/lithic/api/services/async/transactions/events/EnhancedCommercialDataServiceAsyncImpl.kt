// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions.events

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams

class EnhancedCommercialDataServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    EnhancedCommercialDataServiceAsync {

    private val withRawResponse: EnhancedCommercialDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnhancedCommercialDataServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): EnhancedCommercialDataServiceAsync =
        EnhancedCommercialDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions,
    ): EnhancedData =
        // get /v1/transactions/events/{event_token}/enhanced_commercial_data
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnhancedCommercialDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EnhancedCommercialDataServiceAsync.WithRawResponse =
            EnhancedCommercialDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<EnhancedData> =
            jsonHandler<EnhancedData>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionEventEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventToken", params.eventToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transactions",
                        "events",
                        params._pathParam(0),
                        "enhanced_commercial_data",
                    )
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
