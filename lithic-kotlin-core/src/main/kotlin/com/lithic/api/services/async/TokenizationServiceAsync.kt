// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.TokenizationListPageAsync
import com.lithic.api.models.TokenizationListParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationRetrieveResponse
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse

interface TokenizationServiceAsync {

    /** Get tokenization */
    suspend fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationRetrieveResponse

    /** List card tokenizations */
    suspend fun list(
        params: TokenizationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationListPageAsync

    /**
     * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
     * tokenization ecosystem.
     */
    suspend fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationSimulateResponse
}
