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
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPageAsync
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get account configuration such as spend limits. */
    override suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "accounts", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update account configuration such as state or spend limits. Can only be run on accounts that
     * are part of the program managed by this API key. Accounts that are in the `PAUSED` state will
     * not be able to transact or create new cards.
     */
    override suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "accounts", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<AccountListPageAsync.Response> =
        jsonHandler<AccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List account configurations. */
    override suspend fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): AccountListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "accounts")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { AccountListPageAsync.of(this, params, it) }
    }

    private val retrieveSpendLimitsHandler: Handler<AccountSpendLimits> =
        jsonHandler<AccountSpendLimits>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get an Account's available spend limits, which is based on the spend limit configured on the
     * Account and the amount already spent over the spend limit's duration. For example, if the
     * Account has a daily spend limit of $1000 configured, and has spent $600 in the last 24 hours,
     * the available spend limit returned would be $400.
     */
    override suspend fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions,
    ): AccountSpendLimits {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "accounts", params.getPathParam(0), "spend_limits")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveSpendLimitsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
