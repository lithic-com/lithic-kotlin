// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.accountHolders

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountHolderEntity
import com.lithic.api.models.AccountHolderEntityCreateParams
import com.lithic.api.models.AccountHolderEntityDeleteParams
import com.lithic.api.models.EntityCreateResponse

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntityServiceAsync

    /**
     * Create a new beneficial owner individual or replace the control person entity on an existing
     * KYB account holder. This endpoint is only applicable for account holders enrolled through a
     * KYB workflow with the Persona KYB provider. A new control person can only replace the
     * existing one. A maximum of 4 beneficial owners can be associated with an account holder.
     */
    suspend fun create(
        accountHolderToken: String,
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityCreateResponse =
        create(params.toBuilder().accountHolderToken(accountHolderToken).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityCreateResponse

    /**
     * Deactivate a beneficial owner individual on an existing KYB account holder. Only beneficial
     * owner individuals can be deactivated.
     */
    suspend fun delete(
        entityToken: String,
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderEntity =
        delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderEntity

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/account_holders/{account_holder_token}/entities`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            accountHolderToken: String,
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityCreateResponse> =
            create(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityCreateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/account_holders/{account_holder_token}/entities/{entity_token}`, but is otherwise the
         * same as [EntityServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            entityToken: String,
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderEntity> =
            delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderEntity>
    }
}
