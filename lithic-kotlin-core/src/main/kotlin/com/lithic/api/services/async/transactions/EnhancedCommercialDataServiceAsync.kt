// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams

interface EnhancedCommercialDataServiceAsync {

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    suspend fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse
}
