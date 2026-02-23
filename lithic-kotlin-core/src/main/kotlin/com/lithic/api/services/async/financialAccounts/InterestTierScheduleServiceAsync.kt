// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInterestTierScheduleCreateParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleDeleteParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleListPageAsync
import com.lithic.api.models.FinancialAccountInterestTierScheduleListParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleRetrieveParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleUpdateParams
import com.lithic.api.models.InterestTierSchedule
import java.time.LocalDate

interface InterestTierScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InterestTierScheduleServiceAsync

    /** Create a new interest tier schedule entry for a supported financial account */
    suspend fun create(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule =
        create(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        params: FinancialAccountInterestTierScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule

    /** Get a specific interest tier schedule by effective date */
    suspend fun retrieve(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule =
        retrieve(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: FinancialAccountInterestTierScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule

    /** Update an existing interest tier schedule */
    suspend fun update(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule =
        update(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: FinancialAccountInterestTierScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InterestTierSchedule

    /**
     * List interest tier schedules for a financial account with optional date filtering.
     *
     * If no date parameters are provided, returns all tier schedules. If date parameters are
     * provided, uses filtering to return matching schedules (max 100).
     * - for_date: Returns exact match (takes precedence over other dates)
     * - before_date: Returns schedules with effective_date <= before_date
     * - after_date: Returns schedules with effective_date >= after_date
     * - Both before_date and after_date: Returns schedules in range
     */
    suspend fun list(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleListParams =
            FinancialAccountInterestTierScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInterestTierScheduleListPageAsync =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    suspend fun list(
        params: FinancialAccountInterestTierScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInterestTierScheduleListPageAsync

    /** @see list */
    suspend fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountInterestTierScheduleListPageAsync =
        list(
            financialAccountToken,
            FinancialAccountInterestTierScheduleListParams.none(),
            requestOptions,
        )

    /**
     * Delete an interest tier schedule entry.
     *
     * Returns:
     * - 400 Bad Request: Invalid effective_date format OR attempting to delete the earliest tier
     *   schedule entry for a non-PENDING account
     * - 404 Not Found: Tier schedule entry not found for the given effective_date OR ledger account
     *   not found
     *
     * Note: PENDING accounts can delete the earliest tier schedule entry (account hasn't opened
     * yet). Active/non-PENDING accounts cannot delete the earliest entry to prevent orphaning the
     * account.
     *
     * If the deleted tier schedule has a past effective_date and the account is ACTIVE, the loan
     * tape rebuild configuration will be updated to trigger rebuilds from that date.
     */
    suspend fun delete(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: FinancialAccountInterestTierScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [InterestTierScheduleServiceAsync] that provides access to raw HTTP responses for
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
        ): InterestTierScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule`, but is
         * otherwise the same as [InterestTierScheduleServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule> =
            create(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: FinancialAccountInterestTierScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule> =
            retrieve(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountInterestTierScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule>

        /**
         * Returns a raw HTTP response for `put
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule> =
            update(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: FinancialAccountInterestTierScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InterestTierSchedule>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule`, but is
         * otherwise the same as [InterestTierScheduleServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleListParams =
                FinancialAccountInterestTierScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountInterestTierScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync> =
            list(
                financialAccountToken,
                FinancialAccountInterestTierScheduleListParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: FinancialAccountInterestTierScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
