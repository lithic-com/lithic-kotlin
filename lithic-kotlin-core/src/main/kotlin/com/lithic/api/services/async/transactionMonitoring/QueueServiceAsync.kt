// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Queue
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueDeleteParams
import com.lithic.api.models.TransactionMonitoringQueueListPageAsync
import com.lithic.api.models.TransactionMonitoringQueueListParams
import com.lithic.api.models.TransactionMonitoringQueueRetrieveParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QueueServiceAsync

    /** Creates a new queue for grouping transaction monitoring cases. */
    suspend fun create(
        params: TransactionMonitoringQueueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** Retrieves a single transaction monitoring queue. */
    suspend fun retrieve(
        queueToken: String,
        params: TransactionMonitoringQueueRetrieveParams =
            TransactionMonitoringQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue = retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionMonitoringQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** @see retrieve */
    suspend fun retrieve(queueToken: String, requestOptions: RequestOptions): Queue =
        retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

    /** Updates a transaction monitoring queue. */
    suspend fun update(
        queueToken: String,
        params: TransactionMonitoringQueueUpdateParams =
            TransactionMonitoringQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue = update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TransactionMonitoringQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Queue

    /** @see update */
    suspend fun update(queueToken: String, requestOptions: RequestOptions): Queue =
        update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

    /** Lists transaction monitoring queues. */
    suspend fun list(
        params: TransactionMonitoringQueueListParams = TransactionMonitoringQueueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionMonitoringQueueListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransactionMonitoringQueueListPageAsync =
        list(TransactionMonitoringQueueListParams.none(), requestOptions)

    /** Deletes a transaction monitoring queue. */
    suspend fun delete(
        queueToken: String,
        params: TransactionMonitoringQueueDeleteParams =
            TransactionMonitoringQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TransactionMonitoringQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(queueToken: String, requestOptions: RequestOptions) =
        delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transaction_monitoring/queues`, but is
         * otherwise the same as [QueueServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransactionMonitoringQueueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            queueToken: String,
            params: TransactionMonitoringQueueRetrieveParams =
                TransactionMonitoringQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue> =
            retrieve(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            queueToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Queue> =
            retrieve(queueToken, TransactionMonitoringQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            queueToken: String,
            params: TransactionMonitoringQueueUpdateParams =
                TransactionMonitoringQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue> =
            update(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TransactionMonitoringQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Queue>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            queueToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Queue> =
            update(queueToken, TransactionMonitoringQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction_monitoring/queues`, but is otherwise
         * the same as [QueueServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionMonitoringQueueListParams =
                TransactionMonitoringQueueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionMonitoringQueueListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionMonitoringQueueListPageAsync> =
            list(TransactionMonitoringQueueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction_monitoring/queues/{queue_token}`,
         * but is otherwise the same as [QueueServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            queueToken: String,
            params: TransactionMonitoringQueueDeleteParams =
                TransactionMonitoringQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().queueToken(queueToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TransactionMonitoringQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(queueToken: String, requestOptions: RequestOptions): HttpResponse =
            delete(queueToken, TransactionMonitoringQueueDeleteParams.none(), requestOptions)
    }
}
