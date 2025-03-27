// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListPageAsync
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalbankaccounts.MicroDepositServiceAsync

interface ExternalBankAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun microDeposits(): MicroDepositServiceAsync

    /** Creates an external bank account within a program or Lithic account. */
    suspend fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): ExternalBankAccountCreateResponse =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    suspend fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse

    /** Update the external bank account by token. */
    suspend fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse

    /** List all the external bank accounts for the provided search criteria. */
    suspend fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ExternalBankAccountListPageAsync =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    suspend fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse

    /** Retry external bank account prenote verification. */
    suspend fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryPrenoteResponse

    /**
     * A view of [ExternalBankAccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun microDeposits(): MicroDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalBankAccountListPageAsync> =
            list(ExternalBankAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits`, but is
         * otherwise the same as [ExternalBankAccountServiceAsync.retryMicroDeposits].
         */
        @MustBeClosed
        suspend fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountServiceAsync.retryPrenote].
         */
        @MustBeClosed
        suspend fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse>
    }
}
