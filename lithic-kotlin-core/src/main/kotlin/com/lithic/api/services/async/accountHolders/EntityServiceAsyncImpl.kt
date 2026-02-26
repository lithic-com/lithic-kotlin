// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.accountHolders

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
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.AccountHolderEntity
import com.lithic.api.models.AccountHolderEntityCreateParams
import com.lithic.api.models.AccountHolderEntityDeleteParams
import com.lithic.api.models.EntityCreateResponse

class EntityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityServiceAsync {

    private val withRawResponse: EntityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntityServiceAsync =
        EntityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions,
    ): EntityCreateResponse =
        // post /v1/account_holders/{account_holder_token}/entities
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun delete(
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions,
    ): AccountHolderEntity =
        // delete /v1/account_holders/{account_holder_token}/entities/{entity_token}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityServiceAsync.WithRawResponse =
            EntityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EntityCreateResponse> =
            jsonHandler<EntityCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountHolderToken", params.accountHolderToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_holders", params._pathParam(0), "entities")
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

        private val deleteHandler: Handler<AccountHolderEntity> =
            jsonHandler<AccountHolderEntity>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountHolderEntity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityToken", params.entityToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "account_holders",
                        params._pathParam(0),
                        "entities",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
