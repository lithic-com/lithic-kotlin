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
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPageAsync
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): Account =
        // get /v1/accounts/{account_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): Account =
        // patch /v1/accounts/{account_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): AccountListPageAsync =
        // get /v1/accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions,
    ): AccountSpendLimits =
        // get /v1/accounts/{account_token}/spend_limits
        withRawResponse().retrieveSpendLimits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "accounts", params._pathParam(0))
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

        private val updateHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "accounts", params._pathParam(0))
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

        private val listHandler: Handler<AccountListPageAsync.Response> =
            jsonHandler<AccountListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "accounts")
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
                        AccountListPageAsync.of(AccountServiceAsyncImpl(clientOptions), params, it)
                    }
            }
        }

        private val retrieveSpendLimitsHandler: Handler<AccountSpendLimits> =
            jsonHandler<AccountSpendLimits>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSpendLimits> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "accounts", params._pathParam(0), "spend_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSpendLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
