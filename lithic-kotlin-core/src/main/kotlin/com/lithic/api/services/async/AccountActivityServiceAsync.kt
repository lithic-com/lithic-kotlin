// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountActivityListPageAsync
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse

interface AccountActivityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountActivityServiceAsync

    /** Retrieve a list of transactions across all public accounts. */
    suspend fun list(
        params: AccountActivityListParams = AccountActivityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountActivityListPageAsync =
        list(AccountActivityListParams.none(), requestOptions)

    /** Retrieve a single transaction */
    suspend fun retrieveTransaction(
        transactionToken: String,
        params: AccountActivityRetrieveTransactionParams =
            AccountActivityRetrieveTransactionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see retrieveTransaction */
    suspend fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityRetrieveTransactionResponse

    /** @see retrieveTransaction */
    suspend fun retrieveTransaction(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(
            transactionToken,
            AccountActivityRetrieveTransactionParams.none(),
            requestOptions,
        )

    /**
     * A view of [AccountActivityServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountActivityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/account_activity`, but is otherwise the same as
         * [AccountActivityServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountActivityListParams = AccountActivityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountActivityListPageAsync> =
            list(AccountActivityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/account_activity/{transaction_token}`, but is
         * otherwise the same as [AccountActivityServiceAsync.retrieveTransaction].
         */
        @MustBeClosed
        suspend fun retrieveTransaction(
            transactionToken: String,
            params: AccountActivityRetrieveTransactionParams =
                AccountActivityRetrieveTransactionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see retrieveTransaction */
        @MustBeClosed
        suspend fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse>

        /** @see retrieveTransaction */
        @MustBeClosed
        suspend fun retrieveTransaction(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(
                transactionToken,
                AccountActivityRetrieveTransactionParams.none(),
                requestOptions,
            )
    }
}
