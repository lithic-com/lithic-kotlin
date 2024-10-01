// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

interface ManagementOperationServiceAsync {

    /** Create management operation */
    suspend fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction

    /** Get management operation */
    suspend fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction

    /** List management operations */
    suspend fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationListPageAsync

    /** Reverse a management operation */
    suspend fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction
}
