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
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret

class TokenizationDecisioningServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    TokenizationDecisioningServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveSecretHandler: Handler<TokenizationSecret> =
        jsonHandler<TokenizationSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the Tokenization Decisioning secret key. If one does not exist your program yet,
     * calling this endpoint will create one for you. The headers of the Tokenization Decisioning
     * request will contain a hmac signature which you can use to verify requests originate from
     * Lithic. See [this page](https://docs.lithic.com/docs/events-api#verifying-webhooks) for more
     * detail about verifying Tokenization Decisioning requests.
     */
    override suspend fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tokenization_decisioning", "secret")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveSecretHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val rotateSecretHandler: Handler<TokenizationDecisioningRotateSecretResponse> =
        jsonHandler<TokenizationDecisioningRotateSecretResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization Decisioning secret
     * key will be deactivated 24 hours after a successful request to this endpoint.
     */
    override suspend fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationDecisioningRotateSecretResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tokenization_decisioning", "secret", "rotate")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { rotateSecretHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
