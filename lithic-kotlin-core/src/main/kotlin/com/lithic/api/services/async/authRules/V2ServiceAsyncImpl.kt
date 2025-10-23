// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

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
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
import com.lithic.api.models.AuthRuleV2ListPageResponse
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2RetrieveFeaturesParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2ApplyResponse
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2RetrieveFeaturesResponse
import com.lithic.api.models.V2RetrieveReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsync
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsyncImpl

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backtests: BacktestServiceAsync by lazy { BacktestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun backtests(): BacktestServiceAsync = backtests

    override suspend fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions,
    ): V2CreateResponse =
        // post /v2/auth_rules
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions,
    ): V2RetrieveResponse =
        // get /v2/auth_rules/{auth_rule_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions,
    ): V2UpdateResponse =
        // patch /v2/auth_rules/{auth_rule_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions,
    ): AuthRuleV2ListPageAsync =
        // get /v2/auth_rules
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: AuthRuleV2DeleteParams, requestOptions: RequestOptions) {
        // delete /v2/auth_rules/{auth_rule_token}
        withRawResponse().delete(params, requestOptions)
    }

    @Deprecated("deprecated")
    override suspend fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions,
    ): V2ApplyResponse =
        // post /v2/auth_rules/{auth_rule_token}/apply
        withRawResponse().apply(params, requestOptions).parse()

    override suspend fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions,
    ): V2DraftResponse =
        // post /v2/auth_rules/{auth_rule_token}/draft
        withRawResponse().draft(params, requestOptions).parse()

    override suspend fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions,
    ): V2PromoteResponse =
        // post /v2/auth_rules/{auth_rule_token}/promote
        withRawResponse().promote(params, requestOptions).parse()

    override suspend fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams,
        requestOptions: RequestOptions,
    ): V2RetrieveFeaturesResponse =
        // get /v2/auth_rules/{auth_rule_token}/features
        withRawResponse().retrieveFeatures(params, requestOptions).parse()

    override suspend fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions,
    ): V2RetrieveReportResponse =
        // get /v2/auth_rules/{auth_rule_token}/report
        withRawResponse().retrieveReport(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val backtests: BacktestServiceAsync.WithRawResponse by lazy {
            BacktestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun backtests(): BacktestServiceAsync.WithRawResponse = backtests

        private val createHandler: Handler<V2CreateResponse> =
            jsonHandler<V2CreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2CreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
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

        private val retrieveHandler: Handler<V2RetrieveResponse> =
            jsonHandler<V2RetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
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

        private val updateHandler: Handler<V2UpdateResponse> =
            jsonHandler<V2UpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2UpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
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

        private val listHandler: Handler<AuthRuleV2ListPageResponse> =
            jsonHandler<AuthRuleV2ListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AuthRuleV2ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthRuleV2ListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
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
                        AuthRuleV2ListPageAsync.builder()
                            .service(V2ServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val applyHandler: Handler<V2ApplyResponse> =
            jsonHandler<V2ApplyResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun apply(
            params: AuthRuleV2ApplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2ApplyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "apply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { applyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val draftHandler: Handler<V2DraftResponse> =
            jsonHandler<V2DraftResponse>(clientOptions.jsonMapper)

        override suspend fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2DraftResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { draftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val promoteHandler: Handler<V2PromoteResponse> =
            jsonHandler<V2PromoteResponse>(clientOptions.jsonMapper)

        override suspend fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2PromoteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "promote")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { promoteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveFeaturesHandler: Handler<V2RetrieveFeaturesResponse> =
            jsonHandler<V2RetrieveFeaturesResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveFeaturesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "features")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveFeaturesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveReportHandler: Handler<V2RetrieveReportResponse> =
            jsonHandler<V2RetrieveReportResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveReportResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "report")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveReportHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
