// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

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
import com.lithic.api.models.FinancialAccountInterestTierScheduleCreateParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleDeleteParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleListPageAsync
import com.lithic.api.models.FinancialAccountInterestTierScheduleListPageResponse
import com.lithic.api.models.FinancialAccountInterestTierScheduleListParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleRetrieveParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleUpdateParams
import com.lithic.api.models.InterestTierSchedule

class InterestTierScheduleServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InterestTierScheduleServiceAsync {

    private val withRawResponse: InterestTierScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InterestTierScheduleServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InterestTierScheduleServiceAsync =
        InterestTierScheduleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: FinancialAccountInterestTierScheduleCreateParams,
        requestOptions: RequestOptions,
    ): InterestTierSchedule =
        // post /v1/financial_accounts/{financial_account_token}/interest_tier_schedule
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: FinancialAccountInterestTierScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): InterestTierSchedule =
        // get
        // /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: FinancialAccountInterestTierScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): InterestTierSchedule =
        // put
        // /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: FinancialAccountInterestTierScheduleListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountInterestTierScheduleListPageAsync =
        // get /v1/financial_accounts/{financial_account_token}/interest_tier_schedule
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: FinancialAccountInterestTierScheduleDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete
        // /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InterestTierScheduleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InterestTierScheduleServiceAsync.WithRawResponse =
            InterestTierScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<InterestTierSchedule> =
            jsonHandler<InterestTierSchedule>(clientOptions.jsonMapper)

        override suspend fun create(
            params: FinancialAccountInterestTierScheduleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InterestTierSchedule> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "interest_tier_schedule",
                    )
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

        private val retrieveHandler: Handler<InterestTierSchedule> =
            jsonHandler<InterestTierSchedule>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: FinancialAccountInterestTierScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InterestTierSchedule> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("effectiveDate", params.effectiveDate())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "interest_tier_schedule",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<InterestTierSchedule> =
            jsonHandler<InterestTierSchedule>(clientOptions.jsonMapper)

        override suspend fun update(
            params: FinancialAccountInterestTierScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InterestTierSchedule> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("effectiveDate", params.effectiveDate())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "interest_tier_schedule",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<FinancialAccountInterestTierScheduleListPageResponse> =
            jsonHandler<FinancialAccountInterestTierScheduleListPageResponse>(
                clientOptions.jsonMapper
            )

        override suspend fun list(
            params: FinancialAccountInterestTierScheduleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "interest_tier_schedule",
                    )
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
                        FinancialAccountInterestTierScheduleListPageAsync.builder()
                            .service(InterestTierScheduleServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: FinancialAccountInterestTierScheduleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("effectiveDate", params.effectiveDate())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "interest_tier_schedule",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
