// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse

interface PrimeRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Post Credit Product Prime Rate */
    suspend fun create(
        creditProductToken: String,
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get Credit Product Prime Rates */
    suspend fun retrieve(
        creditProductToken: String,
        params: CreditProductPrimeRateRetrieveParams = CreditProductPrimeRateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrimeRateRetrieveResponse =
        retrieve(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrimeRateRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        creditProductToken: String,
        requestOptions: RequestOptions,
    ): PrimeRateRetrieveResponse =
        retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none(), requestOptions)

    /**
     * A view of [PrimeRateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            creditProductToken: String,
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            creditProductToken: String,
            params: CreditProductPrimeRateRetrieveParams =
                CreditProductPrimeRateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CreditProductPrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            creditProductToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(
                creditProductToken,
                CreditProductPrimeRateRetrieveParams.none(),
                requestOptions,
            )
    }
}
