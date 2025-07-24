// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

interface ManagementOperationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ManagementOperationServiceAsync

    /** Create management operation */
    suspend fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** Get management operation */
    suspend fun retrieve(
        managementOperationToken: String,
        params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction =
        retrieve(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** @see retrieve */
    suspend fun retrieve(
        managementOperationToken: String,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        retrieve(managementOperationToken, ManagementOperationRetrieveParams.none(), requestOptions)

    /** List management operations */
    suspend fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ManagementOperationListPageAsync =
        list(ManagementOperationListParams.none(), requestOptions)

    /** Reverse a management operation */
    suspend fun reverse(
        managementOperationToken: String,
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction =
        reverse(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see reverse */
    suspend fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /**
     * A view of [ManagementOperationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ManagementOperationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /**
         * Returns a raw HTTP response for `get
         * /v1/management_operations/{management_operation_token}`, but is otherwise the same as
         * [ManagementOperationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            managementOperationToken: String,
            params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            managementOperationToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(
                managementOperationToken,
                ManagementOperationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ManagementOperationListPageAsync> =
            list(ManagementOperationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/management_operations/{management_operation_token}/reverse`, but is otherwise the
         * same as [ManagementOperationServiceAsync.reverse].
         */
        @MustBeClosed
        suspend fun reverse(
            managementOperationToken: String,
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction> =
            reverse(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see reverse */
        @MustBeClosed
        suspend fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>
    }
}
