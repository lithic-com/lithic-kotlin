// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseCard
import com.lithic.api.models.MonitoringCase
import com.lithic.api.models.TransactionMonitoringCaseListActivityPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListActivityParams
import com.lithic.api.models.TransactionMonitoringCaseListPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListParams
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveCardsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveParams
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import com.lithic.api.services.async.transactionMonitoring.cases.CommentServiceAsync
import com.lithic.api.services.async.transactionMonitoring.cases.FileServiceAsync

interface CaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseServiceAsync

    fun comments(): CommentServiceAsync

    fun files(): FileServiceAsync

    /** Retrieves a single transaction monitoring case. */
    suspend fun retrieve(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveParams =
            TransactionMonitoringCaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase = retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase

    /** @see retrieve */
    suspend fun retrieve(caseToken: String, requestOptions: RequestOptions): MonitoringCase =
        retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring case. */
    suspend fun update(
        caseToken: String,
        params: TransactionMonitoringCaseUpdateParams =
            TransactionMonitoringCaseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase = update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TransactionMonitoringCaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase

    /** @see update */
    suspend fun update(caseToken: String, requestOptions: RequestOptions): MonitoringCase =
        update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring cases, optionally filtered. */
    suspend fun list(
        params: TransactionMonitoringCaseListParams = TransactionMonitoringCaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransactionMonitoringCaseListPageAsync =
        list(TransactionMonitoringCaseListParams.none(), requestOptions)

    /** Lists the activity feed for a case. */
    suspend fun listActivity(
        caseToken: String,
        params: TransactionMonitoringCaseListActivityParams =
            TransactionMonitoringCaseListActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListActivityPageAsync =
        listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listActivity */
    suspend fun listActivity(
        params: TransactionMonitoringCaseListActivityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListActivityPageAsync

    /** @see listActivity */
    suspend fun listActivity(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListActivityPageAsync =
        listActivity(caseToken, TransactionMonitoringCaseListActivityParams.none(), requestOptions)

    /** Lists the transactions associated with a case. */
    suspend fun listTransactions(
        caseToken: String,
        params: TransactionMonitoringCaseListTransactionsParams =
            TransactionMonitoringCaseListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListTransactionsPageAsync =
        listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListTransactionsPageAsync

    /** @see listTransactions */
    suspend fun listTransactions(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListTransactionsPageAsync =
        listTransactions(
            caseToken,
            TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions,
        )

    /** Lists the cards involved in a case, with per-card transaction counts. */
    suspend fun retrieveCards(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveCardsParams =
            TransactionMonitoringCaseRetrieveCardsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CaseCard> =
        retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieveCards */
    suspend fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CaseCard>

    /** @see retrieveCards */
    suspend fun retrieveCards(caseToken: String, requestOptions: RequestOptions): List<CaseCard> =
        retrieveCards(
            caseToken,
            TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions,
        )

    /** A view of [CaseServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases/{case_token}`, but
         * is otherwise the same as [CaseServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveParams =
                TransactionMonitoringCaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase> =
            retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> =
            retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/cases/{case_token}`,
         * but is otherwise the same as [CaseServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            caseToken: String,
            params: TransactionMonitoringCaseUpdateParams =
                TransactionMonitoringCaseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase> =
            update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TransactionMonitoringCaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> =
            update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases`, but is otherwise
         * the same as [CaseServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionMonitoringCaseListParams =
                TransactionMonitoringCaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionMonitoringCaseListPageAsync> =
            list(TransactionMonitoringCaseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/activity`, but is otherwise the same as
         * [CaseServiceAsync.listActivity].
         */
        @MustBeClosed
        suspend fun listActivity(
            caseToken: String,
            params: TransactionMonitoringCaseListActivityParams =
                TransactionMonitoringCaseListActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync> =
            listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listActivity */
        @MustBeClosed
        suspend fun listActivity(
            params: TransactionMonitoringCaseListActivityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>

        /** @see listActivity */
        @MustBeClosed
        suspend fun listActivity(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync> =
            listActivity(
                caseToken,
                TransactionMonitoringCaseListActivityParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/transactions`, but is otherwise the same as
         * [CaseServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            caseToken: String,
            params: TransactionMonitoringCaseListTransactionsParams =
                TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync> =
            listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: TransactionMonitoringCaseListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync> =
            listTransactions(
                caseToken,
                TransactionMonitoringCaseListTransactionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/cards`, but is otherwise the same as
         * [CaseServiceAsync.retrieveCards].
         */
        @MustBeClosed
        suspend fun retrieveCards(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveCardsParams =
                TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CaseCard>> =
            retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieveCards */
        @MustBeClosed
        suspend fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CaseCard>>

        /** @see retrieveCards */
        @MustBeClosed
        suspend fun retrieveCards(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CaseCard>> =
            retrieveCards(
                caseToken,
                TransactionMonitoringCaseRetrieveCardsParams.none(),
                requestOptions,
            )
    }
}
