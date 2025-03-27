// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListPage
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateResponse
import com.lithic.api.services.blocking.externalbankaccounts.MicroDepositService

interface ExternalBankAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun microDeposits(): MicroDepositService

    /** Creates an external bank account within a program or Lithic account. */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ExternalBankAccountCreateResponse =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse

    /** Update the external bank account by token. */
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse

    /** List all the external bank accounts for the provided search criteria. */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExternalBankAccountListPage =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse

    /** Retry external bank account prenote verification. */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryPrenoteResponse

    /**
     * A view of [ExternalBankAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun microDeposits(): MicroDepositService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountService.update].
         */
        @MustBeClosed
        fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalBankAccountListPage> =
            list(ExternalBankAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits`, but is
         * otherwise the same as [ExternalBankAccountService.retryMicroDeposits].
         */
        @MustBeClosed
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountService.retryPrenote].
         */
        @MustBeClosed
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse>
    }
}
