// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

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
import com.lithic.api.models.AccountActivityListPageAsync
import com.lithic.api.models.AccountActivityListPageResponse
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse

class AccountActivityServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AccountActivityServiceAsync {

    private val withRawResponse: AccountActivityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountActivityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): AccountActivityServiceAsync =
        AccountActivityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: AccountActivityListParams,
        requestOptions: RequestOptions,
    ): AccountActivityListPageAsync =
        // get /v1/account_activity
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions,
    ): AccountActivityRetrieveTransactionResponse =
        // get /v1/account_activity/{transaction_token}
        withRawResponse().retrieveTransaction(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountActivityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountActivityServiceAsync.WithRawResponse =
            AccountActivityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<AccountActivityListPageResponse> =
            jsonHandler<AccountActivityListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AccountActivityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity")
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
                        AccountActivityListPageAsync.builder()
                            .service(AccountActivityServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveTransactionHandler:
            Handler<AccountActivityRetrieveTransactionResponse> =
            jsonHandler<AccountActivityRetrieveTransactionResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionToken", params.transactionToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTransactionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
