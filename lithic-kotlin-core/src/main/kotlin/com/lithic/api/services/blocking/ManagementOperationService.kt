// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPage
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

interface ManagementOperationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create management operation */
    fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** Get management operation */
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** List management operations */
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ManagementOperationListPage =
        list(ManagementOperationListParams.none(), requestOptions)

    /** Reverse a management operation */
    fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /**
     * A view of [ManagementOperationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationService.create].
         */
        @MustBeClosed
        fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /**
         * Returns a raw HTTP response for `get
         * /v1/management_operations/{management_operation_token}`, but is otherwise the same as
         * [ManagementOperationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /**
         * Returns a raw HTTP response for `get /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationService.list].
         */
        @MustBeClosed
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ManagementOperationListPage> =
            list(ManagementOperationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/management_operations/{management_operation_token}/reverse`, but is otherwise the
         * same as [ManagementOperationService.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>
    }
}
