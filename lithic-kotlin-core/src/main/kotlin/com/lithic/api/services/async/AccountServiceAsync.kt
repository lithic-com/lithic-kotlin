// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPageAsync
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /** Get account configuration such as spend limits. */
    suspend fun retrieve(
        accountToken: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see retrieve */
    suspend fun retrieve(accountToken: String, requestOptions: RequestOptions): Account =
        retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

    /**
     * Update account configuration such as state or spend limits. Can only be run on accounts that
     * are part of the program managed by this API key. Accounts that are in the `PAUSED` state will
     * not be able to transact or create new cards.
     */
    suspend fun update(
        accountToken: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see update */
    suspend fun update(accountToken: String, requestOptions: RequestOptions): Account =
        update(accountToken, AccountUpdateParams.none(), requestOptions)

    /** List account configurations. */
    suspend fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountListPageAsync =
        list(AccountListParams.none(), requestOptions)

    /**
     * Get an Account's available spend limits, which is based on the spend limit configured on the
     * Account and the amount already spent over the spend limit's duration. For example, if the
     * Account has a daily spend limit of $1000 configured, and has spent $600 in the last 24 hours,
     * the available spend limit returned would be $400.
     */
    suspend fun retrieveSpendLimits(
        accountToken: String,
        params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSpendLimits =
        retrieveSpendLimits(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieveSpendLimits */
    suspend fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSpendLimits

    /** @see retrieveSpendLimits */
    suspend fun retrieveSpendLimits(
        accountToken: String,
        requestOptions: RequestOptions,
    ): AccountSpendLimits =
        retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}`, but is otherwise the
         * same as [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            accountToken: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> =
            retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_token}`, but is otherwise
         * the same as [AccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            accountToken: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> =
            update(accountToken, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPageAsync> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}/spend_limits`, but is
         * otherwise the same as [AccountServiceAsync.retrieveSpendLimits].
         */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            accountToken: String,
            params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(
                params.toBuilder().accountToken(accountToken).build(),
                requestOptions,
            )

        /** @see retrieveSpendLimits */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSpendLimits>

        /** @see retrieveSpendLimits */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(
                accountToken,
                AccountRetrieveSpendLimitsParams.none(),
                requestOptions,
            )
    }
}
