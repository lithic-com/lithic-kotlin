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
import com.lithic.api.models.Document
import com.lithic.api.models.accountholders.AccountHolder
import com.lithic.api.models.accountholders.AccountHolderCreateParams
import com.lithic.api.models.accountholders.AccountHolderCreateResponse
import com.lithic.api.models.accountholders.AccountHolderListDocumentsParams
import com.lithic.api.models.accountholders.AccountHolderListDocumentsResponse
import com.lithic.api.models.accountholders.AccountHolderListPageAsync
import com.lithic.api.models.accountholders.AccountHolderListParams
import com.lithic.api.models.accountholders.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.accountholders.AccountHolderRetrieveParams
import com.lithic.api.models.accountholders.AccountHolderSimulateEnrollmentDocumentReviewParams
import com.lithic.api.models.accountholders.AccountHolderSimulateEnrollmentReviewParams
import com.lithic.api.models.accountholders.AccountHolderSimulateEnrollmentReviewResponse
import com.lithic.api.models.accountholders.AccountHolderUpdateParams
import com.lithic.api.models.accountholders.AccountHolderUpdateResponse
import com.lithic.api.models.accountholders.AccountHolderUploadDocumentParams
import java.time.Duration

class AccountHolderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountHolderServiceAsync {

    private val withRawResponse: AccountHolderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountHolderServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AccountHolderCreateParams,
        requestOptions: RequestOptions,
    ): AccountHolderCreateResponse =
        // post /v1/account_holders
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AccountHolderRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountHolder =
        // get /v1/account_holders/{account_holder_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AccountHolderUpdateParams,
        requestOptions: RequestOptions,
    ): AccountHolderUpdateResponse =
        // patch /v1/account_holders/{account_holder_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AccountHolderListParams,
        requestOptions: RequestOptions,
    ): AccountHolderListPageAsync =
        // get /v1/account_holders
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun listDocuments(
        params: AccountHolderListDocumentsParams,
        requestOptions: RequestOptions,
    ): AccountHolderListDocumentsResponse =
        // get /v1/account_holders/{account_holder_token}/documents
        withRawResponse().listDocuments(params, requestOptions).parse()

    override suspend fun retrieveDocument(
        params: AccountHolderRetrieveDocumentParams,
        requestOptions: RequestOptions,
    ): Document =
        // get /v1/account_holders/{account_holder_token}/documents/{document_token}
        withRawResponse().retrieveDocument(params, requestOptions).parse()

    override suspend fun simulateEnrollmentDocumentReview(
        params: AccountHolderSimulateEnrollmentDocumentReviewParams,
        requestOptions: RequestOptions,
    ): Document =
        // post /v1/simulate/account_holders/enrollment_document_review
        withRawResponse().simulateEnrollmentDocumentReview(params, requestOptions).parse()

    override suspend fun simulateEnrollmentReview(
        params: AccountHolderSimulateEnrollmentReviewParams,
        requestOptions: RequestOptions,
    ): AccountHolderSimulateEnrollmentReviewResponse =
        // post /v1/simulate/account_holders/enrollment_review
        withRawResponse().simulateEnrollmentReview(params, requestOptions).parse()

    override suspend fun uploadDocument(
        params: AccountHolderUploadDocumentParams,
        requestOptions: RequestOptions,
    ): Document =
        // post /v1/account_holders/{account_holder_token}/documents
        withRawResponse().uploadDocument(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountHolderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountHolderCreateResponse> =
            jsonHandler<AccountHolderCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: AccountHolderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "account_holders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions =
                requestOptions
                    .applyDefaults(RequestOptions.from(clientOptions))
                    .applyDefaults(RequestOptions.builder().timeout(Duration.ofMinutes(5)).build())
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

        private val retrieveHandler: Handler<AccountHolder> =
            jsonHandler<AccountHolder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AccountHolderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "account_holders", params._pathParam(0))
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

        private val updateHandler: Handler<AccountHolderUpdateResponse> =
            jsonHandler<AccountHolderUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: AccountHolderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "account_holders", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccountHolderListPageAsync.Response> =
            jsonHandler<AccountHolderListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AccountHolderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "account_holders")
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
                        AccountHolderListPageAsync.of(
                            AccountHolderServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val listDocumentsHandler: Handler<AccountHolderListDocumentsResponse> =
            jsonHandler<AccountHolderListDocumentsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listDocuments(
            params: AccountHolderListDocumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderListDocumentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "account_holders", params._pathParam(0), "documents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listDocumentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveDocumentHandler: Handler<Document> =
            jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveDocument(
            params: AccountHolderRetrieveDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "account_holders",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveDocumentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateEnrollmentDocumentReviewHandler: Handler<Document> =
            jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun simulateEnrollmentDocumentReview(
            params: AccountHolderSimulateEnrollmentDocumentReviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "simulate",
                        "account_holders",
                        "enrollment_document_review",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateEnrollmentDocumentReviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateEnrollmentReviewHandler:
            Handler<AccountHolderSimulateEnrollmentReviewResponse> =
            jsonHandler<AccountHolderSimulateEnrollmentReviewResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateEnrollmentReview(
            params: AccountHolderSimulateEnrollmentReviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderSimulateEnrollmentReviewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "account_holders", "enrollment_review")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateEnrollmentReviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadDocumentHandler: Handler<Document> =
            jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun uploadDocument(
            params: AccountHolderUploadDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "account_holders", params._pathParam(0), "documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { uploadDocumentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
