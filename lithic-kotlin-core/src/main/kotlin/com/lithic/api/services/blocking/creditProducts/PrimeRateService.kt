// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse

interface PrimeRateService {

    /** Post Credit Product Prime Rate */
    fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Get Credit Product Prime Rates */
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PrimeRateRetrieveResponse
}
