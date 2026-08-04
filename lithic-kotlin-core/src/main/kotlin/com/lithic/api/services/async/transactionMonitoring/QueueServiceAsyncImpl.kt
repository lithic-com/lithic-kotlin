// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
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
import com.lithic.api.models.Queue
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueDeleteParams
import com.lithic.api.models.TransactionMonitoringQueueListPageAsync
import com.lithic.api.models.TransactionMonitoringQueueListPageResponse
import com.lithic.api.models.TransactionMonitoringQueueListParams
import com.lithic.api.models.TransactionMonitoringQueueRetrieveParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams

class QueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueServiceAsync {

    private val withRawResponse: QueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QueueServiceAsync =
        QueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: TransactionMonitoringQueueCreateParams,
        requestOptions: RequestOptions,
    ): Queue =
        // post /v1/transaction_monitoring/queues
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: TransactionMonitoringQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): Queue =
        // get /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: TransactionMonitoringQueueUpdateParams,
        requestOptions: RequestOptions,
    ): Queue =
        // patch /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionMonitoringQueueListParams,
        requestOptions: RequestOptions,
    ): TransactionMonitoringQueueListPageAsync =
        // get /v1/transaction_monitoring/queues
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: TransactionMonitoringQueueDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QueueServiceAsync.WithRawResponse =
            QueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override suspend fun create(
            params: TransactionMonitoringQueueCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Queue> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues")
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

        private val retrieveHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Queue> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
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

        private val updateHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TransactionMonitoringQueueUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Queue> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
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

        private val listHandler: Handler<TransactionMonitoringQueueListPageResponse> =
            jsonHandler<TransactionMonitoringQueueListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TransactionMonitoringQueueListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringQueueListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues")
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
                        TransactionMonitoringQueueListPageAsync.builder()
                            .service(QueueServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: TransactionMonitoringQueueDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
