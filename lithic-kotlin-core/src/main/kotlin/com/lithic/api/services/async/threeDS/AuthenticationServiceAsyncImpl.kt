// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams

class AuthenticationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AuthenticationServiceAsync {

    private val withRawResponse: AuthenticationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): AuthenticationServiceAsync =
        AuthenticationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions,
    ): AuthenticationRetrieveResponse =
        // get /v1/three_ds_authentication/{three_ds_authentication_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions,
    ): AuthenticationSimulateResponse =
        // post /v1/three_ds_authentication/simulate
        withRawResponse().simulate(params, requestOptions).parse()

    override suspend fun simulateOtpEntry(
        params: ThreeDSAuthenticationSimulateOtpEntryParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/three_ds_decisioning/simulate/enter_otp
        withRawResponse().simulateOtpEntry(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthenticationServiceAsync.WithRawResponse =
            AuthenticationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AuthenticationRetrieveResponse> =
            jsonHandler<AuthenticationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threeDSAuthenticationToken", params.threeDSAuthenticationToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_authentication", params._pathParam(0))
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

        private val simulateHandler: Handler<AuthenticationSimulateResponse> =
            jsonHandler<AuthenticationSimulateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulate(
            params: ThreeDSAuthenticationSimulateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationSimulateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_authentication", "simulate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateOtpEntryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun simulateOtpEntry(
            params: ThreeDSAuthenticationSimulateOtpEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_decisioning", "simulate", "enter_otp")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { simulateOtpEntryHandler.handle(it) } }
        }
    }
}
