// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditProducts.PrimeRateService

interface CreditProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditProductService

    fun extendedCredit(): ExtendedCreditService

    fun primeRates(): PrimeRateService

    /**
     * A view of [CreditProductService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditProductService.WithRawResponse

        fun extendedCredit(): ExtendedCreditService.WithRawResponse

        fun primeRates(): PrimeRateService.WithRawResponse
    }
}
