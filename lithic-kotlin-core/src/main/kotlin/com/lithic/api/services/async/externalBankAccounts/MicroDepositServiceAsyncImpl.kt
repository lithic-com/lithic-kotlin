// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.externalBankAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

class MicroDepositServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : MicroDepositServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<MicroDepositCreateResponse> =
        jsonHandler<MicroDepositCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Verify the external bank account by providing the micro deposit amounts. */
    override suspend fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions
    ): MicroDepositCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "external_bank_accounts",
                    params.getPathParam(0),
                    "micro_deposits"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
