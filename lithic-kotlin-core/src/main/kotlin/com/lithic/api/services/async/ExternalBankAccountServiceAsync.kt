// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalBankAccount
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPageAsync
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountUnpauseParams
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalBankAccounts.MicroDepositServiceAsync

interface ExternalBankAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalBankAccountServiceAsync

    fun microDeposits(): MicroDepositServiceAsync

    /** Creates an external bank account within a program or Lithic account. */
    suspend fun create(
        params: ExternalBankAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse

    /** @see create */
    suspend fun create(
        body: ExternalBankAccountCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse =
        create(ExternalBankAccountCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    suspend fun create(
        bankVerifiedCreateBankAccountApiRequest:
            ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse =
        create(
            ExternalBankAccountCreateParams.Body.ofBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest
            ),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        externallyVerified:
            ExternalBankAccountCreateParams.Body.ExternallyVerifiedCreateBankAccountApiRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse =
        create(
            ExternalBankAccountCreateParams.Body.ofExternallyVerified(externallyVerified),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        unverified: ExternalBankAccountCreateParams.Body.UnverifiedCreateBankAccountApiRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse =
        create(ExternalBankAccountCreateParams.Body.ofUnverified(unverified), requestOptions)

    /** Get the external bank account by token. */
    suspend fun retrieve(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse =
        retrieve(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetrieveResponse =
        retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none(), requestOptions)

    /** Update the external bank account by token. */
    suspend fun update(
        externalBankAccountToken: String,
        params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse =
        update(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see update */
    suspend fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse

    /** @see update */
    suspend fun update(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountUpdateResponse =
        update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

    /** List all the external bank accounts for the provided search criteria. */
    suspend fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ExternalBankAccountListPageAsync =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    suspend fun retryMicroDeposits(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryMicroDepositsParams =
            ExternalBankAccountRetryMicroDepositsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retryMicroDeposits */
    suspend fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse

    /** @see retryMicroDeposits */
    suspend fun retryMicroDeposits(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(
            externalBankAccountToken,
            ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions,
        )

    /** Retry external bank account prenote verification. */
    suspend fun retryPrenote(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryPrenoteParams =
            ExternalBankAccountRetryPrenoteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccount =
        retryPrenote(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retryPrenote */
    suspend fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccount

    /** @see retryPrenote */
    suspend fun retryPrenote(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccount =
        retryPrenote(
            externalBankAccountToken,
            ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions,
        )

    /** Unpause an external bank account */
    suspend fun unpause(
        externalBankAccountToken: String,
        params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccount =
        unpause(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see unpause */
    suspend fun unpause(
        params: ExternalBankAccountUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccount

    /** @see unpause */
    suspend fun unpause(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccount =
        unpause(externalBankAccountToken, ExternalBankAccountUnpauseParams.none(), requestOptions)

    /**
     * A view of [ExternalBankAccountServiceAsync] that provides access to raw HTTP responses for
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
        ): ExternalBankAccountServiceAsync.WithRawResponse

        fun microDeposits(): MicroDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExternalBankAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            body: ExternalBankAccountCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            bankVerifiedCreateBankAccountApiRequest:
                ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(
                ExternalBankAccountCreateParams.Body.ofBankVerifiedCreateBankAccountApiRequest(
                    bankVerifiedCreateBankAccountApiRequest
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            externallyVerified:
                ExternalBankAccountCreateParams.Body.ExternallyVerifiedCreateBankAccountApiRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(
                ExternalBankAccountCreateParams.Body.ofExternallyVerified(externallyVerified),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            unverified: ExternalBankAccountCreateParams.Body.UnverifiedCreateBankAccountApiRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.Body.ofUnverified(unverified), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(
                externalBankAccountToken,
                ExternalBankAccountRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            externalBankAccountToken: String,
            params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountListPageAsync>

        /** @see list */
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
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryMicroDepositsParams =
                ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retryMicroDeposits */
        @MustBeClosed
        suspend fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>

        /** @see retryMicroDeposits */
        @MustBeClosed
        suspend fun retryMicroDeposits(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(
                externalBankAccountToken,
                ExternalBankAccountRetryMicroDepositsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountServiceAsync.retryPrenote].
         */
        @MustBeClosed
        suspend fun retryPrenote(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryPrenoteParams =
                ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccount> =
            retryPrenote(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retryPrenote */
        @MustBeClosed
        suspend fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccount>

        /** @see retryPrenote */
        @MustBeClosed
        suspend fun retryPrenote(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccount> =
            retryPrenote(
                externalBankAccountToken,
                ExternalBankAccountRetryPrenoteParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/unpause`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.unpause].
         */
        @MustBeClosed
        suspend fun unpause(
            externalBankAccountToken: String,
            params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccount> =
            unpause(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see unpause */
        @MustBeClosed
        suspend fun unpause(
            params: ExternalBankAccountUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccount>

        /** @see unpause */
        @MustBeClosed
        suspend fun unpause(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccount> =
            unpause(
                externalBankAccountToken,
                ExternalBankAccountUnpauseParams.none(),
                requestOptions,
            )
    }
}
