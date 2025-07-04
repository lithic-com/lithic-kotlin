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
import com.lithic.api.models.AccountHolder
import com.lithic.api.models.AccountHolderCreateParams
import com.lithic.api.models.AccountHolderCreateResponse
import com.lithic.api.models.AccountHolderListDocumentsParams
import com.lithic.api.models.AccountHolderListDocumentsResponse
import com.lithic.api.models.AccountHolderListPageAsync
import com.lithic.api.models.AccountHolderListPageResponse
import com.lithic.api.models.AccountHolderListParams
import com.lithic.api.models.AccountHolderRetrieveDocumentParams
import com.lithic.api.models.AccountHolderRetrieveParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentDocumentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewParams
import com.lithic.api.models.AccountHolderSimulateEnrollmentReviewResponse
import com.lithic.api.models.AccountHolderUpdateParams
import com.lithic.api.models.AccountHolderUpdateResponse
import com.lithic.api.models.AccountHolderUploadDocumentParams
import com.lithic.api.models.Document
import java.time.Duration

class AccountHolderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountHolderServiceAsync {

    private val withRawResponse: AccountHolderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountHolderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountHolderServiceAsync =
        AccountHolderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountHolderServiceAsync.WithRawResponse =
            AccountHolderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountHolderToken", params.accountHolderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountHolderToken", params.accountHolderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
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

        private val listHandler: Handler<AccountHolderListPageResponse> =
            jsonHandler<AccountHolderListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AccountHolderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                        AccountHolderListPageAsync.builder()
                            .service(AccountHolderServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountHolderToken", params.accountHolderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentToken", params.documentToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountHolderToken", params.accountHolderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
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
