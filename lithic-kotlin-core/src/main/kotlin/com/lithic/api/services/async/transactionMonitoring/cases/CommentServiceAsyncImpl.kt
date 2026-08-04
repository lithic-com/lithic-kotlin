// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

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
import com.lithic.api.models.CaseActivityEntry
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams

class CommentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentServiceAsync {

    private val withRawResponse: CommentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CommentServiceAsync =
        CommentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions,
    ): CaseActivityEntry =
        // post /v1/transaction_monitoring/cases/{case_token}/comments
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions,
    ): CaseActivityEntry =
        // patch /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CommentServiceAsync.WithRawResponse =
            CommentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CaseActivityEntry> =
            jsonHandler<CaseActivityEntry>(clientOptions.jsonMapper)

        override suspend fun create(
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CaseActivityEntry> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "comments",
                    )
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

        private val updateHandler: Handler<CaseActivityEntry> =
            jsonHandler<CaseActivityEntry>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CaseActivityEntry> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentToken", params.commentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "comments",
                        params._pathParam(1),
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentToken", params.commentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "comments",
                        params._pathParam(1),
                    )
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
