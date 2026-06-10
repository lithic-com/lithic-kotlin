// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CaseCard
import com.lithic.api.models.MonitoringCase
import com.lithic.api.models.TransactionMonitoringCaseListActivityPage
import com.lithic.api.models.TransactionMonitoringCaseListActivityParams
import com.lithic.api.models.TransactionMonitoringCaseListPage
import com.lithic.api.models.TransactionMonitoringCaseListParams
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPage
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveCardsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveParams
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import com.lithic.api.services.blocking.transactionMonitoring.cases.CommentService
import com.lithic.api.services.blocking.transactionMonitoring.cases.FileService

interface CaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseService

    fun comments(): CommentService

    fun files(): FileService

    /** Retrieves a single transaction monitoring case. */
    fun retrieve(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveParams =
            TransactionMonitoringCaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase = retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase

    /** @see retrieve */
    fun retrieve(caseToken: String, requestOptions: RequestOptions): MonitoringCase =
        retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring case. */
    fun update(
        caseToken: String,
        params: TransactionMonitoringCaseUpdateParams =
            TransactionMonitoringCaseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase = update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see update */
    fun update(
        params: TransactionMonitoringCaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitoringCase

    /** @see update */
    fun update(caseToken: String, requestOptions: RequestOptions): MonitoringCase =
        update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring cases, optionally filtered. */
    fun list(
        params: TransactionMonitoringCaseListParams = TransactionMonitoringCaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): TransactionMonitoringCaseListPage =
        list(TransactionMonitoringCaseListParams.none(), requestOptions)

    /** Lists the activity feed for a case. */
    fun listActivity(
        caseToken: String,
        params: TransactionMonitoringCaseListActivityParams =
            TransactionMonitoringCaseListActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListActivityPage =
        listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listActivity */
    fun listActivity(
        params: TransactionMonitoringCaseListActivityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListActivityPage

    /** @see listActivity */
    fun listActivity(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListActivityPage =
        listActivity(caseToken, TransactionMonitoringCaseListActivityParams.none(), requestOptions)

    /** Lists the transactions associated with a case. */
    fun listTransactions(
        caseToken: String,
        params: TransactionMonitoringCaseListTransactionsParams =
            TransactionMonitoringCaseListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListTransactionsPage =
        listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringCaseListTransactionsPage

    /** @see listTransactions */
    fun listTransactions(
        caseToken: String,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListTransactionsPage =
        listTransactions(
            caseToken,
            TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions,
        )

    /** Lists the cards involved in a case, with per-card transaction counts. */
    fun retrieveCards(
        caseToken: String,
        params: TransactionMonitoringCaseRetrieveCardsParams =
            TransactionMonitoringCaseRetrieveCardsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CaseCard> =
        retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

    /** @see retrieveCards */
    fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CaseCard>

    /** @see retrieveCards */
    fun retrieveCards(caseToken: String, requestOptions: RequestOptions): List<CaseCard> =
        retrieveCards(
            caseToken,
            TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions,
        )

    /** A view of [CaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun files(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases/{case_token}`, but
         * is otherwise the same as [CaseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveParams =
                TransactionMonitoringCaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase> =
            retrieve(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> =
            retrieve(caseToken, TransactionMonitoringCaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/cases/{case_token}`,
         * but is otherwise the same as [CaseService.update].
         */
        @MustBeClosed
        fun update(
            caseToken: String,
            params: TransactionMonitoringCaseUpdateParams =
                TransactionMonitoringCaseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase> =
            update(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionMonitoringCaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitoringCase>

        /** @see update */
        @MustBeClosed
        fun update(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> =
            update(caseToken, TransactionMonitoringCaseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/cases`, but is otherwise
         * the same as [CaseService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionMonitoringCaseListParams =
                TransactionMonitoringCaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionMonitoringCaseListPage> =
            list(TransactionMonitoringCaseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/activity`, but is otherwise the same as
         * [CaseService.listActivity].
         */
        @MustBeClosed
        fun listActivity(
            caseToken: String,
            params: TransactionMonitoringCaseListActivityParams =
                TransactionMonitoringCaseListActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPage> =
            listActivity(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listActivity */
        @MustBeClosed
        fun listActivity(
            params: TransactionMonitoringCaseListActivityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPage>

        /** @see listActivity */
        @MustBeClosed
        fun listActivity(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPage> =
            listActivity(
                caseToken,
                TransactionMonitoringCaseListActivityParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/transactions`, but is otherwise the same as
         * [CaseService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            caseToken: String,
            params: TransactionMonitoringCaseListTransactionsParams =
                TransactionMonitoringCaseListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPage> =
            listTransactions(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: TransactionMonitoringCaseListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPage>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            caseToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPage> =
            listTransactions(
                caseToken,
                TransactionMonitoringCaseListTransactionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /v1/transaction_monitoring/cases/{case_token}/cards`, but is otherwise the same as
         * [CaseService.retrieveCards].
         */
        @MustBeClosed
        fun retrieveCards(
            caseToken: String,
            params: TransactionMonitoringCaseRetrieveCardsParams =
                TransactionMonitoringCaseRetrieveCardsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CaseCard>> =
            retrieveCards(params.toBuilder().caseToken(caseToken).build(), requestOptions)

        /** @see retrieveCards */
        @MustBeClosed
        fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CaseCard>>

        /** @see retrieveCards */
        @MustBeClosed
        fun retrieveCards(
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
