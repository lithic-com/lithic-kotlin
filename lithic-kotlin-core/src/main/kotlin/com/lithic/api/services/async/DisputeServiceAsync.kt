// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeCreateResponse
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeDeleteResponse
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPageAsync
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPageAsync
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeRetrieveResponse
import com.lithic.api.models.DisputeUpdateParams
import com.lithic.api.models.DisputeUpdateResponse

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeServiceAsync

    /** Initiate a dispute. */
    suspend fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeCreateResponse

    /** Get dispute. */
    suspend fun retrieve(
        disputeToken: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse =
        retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeRetrieveResponse =
        retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

    /** Update dispute. Can only be modified if status is `NEW`. */
    suspend fun update(
        disputeToken: String,
        params: DisputeUpdateParams = DisputeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeUpdateResponse =
        update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeUpdateResponse

    /** @see update */
    suspend fun update(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeUpdateResponse = update(disputeToken, DisputeUpdateParams.none(), requestOptions)

    /** List disputes. */
    suspend fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DisputeListPageAsync =
        list(DisputeListParams.none(), requestOptions)

    /** Withdraw dispute. */
    suspend fun delete(
        disputeToken: String,
        params: DisputeDeleteParams = DisputeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeDeleteResponse =
        delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeDeleteResponse

    /** @see delete */
    suspend fun delete(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeDeleteResponse = delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
    suspend fun deleteEvidence(
        evidenceToken: String,
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see deleteEvidence */
    suspend fun deleteEvidence(
        params: DisputeDeleteEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    /**
     * Use this endpoint to upload evidences for the dispute. It will return a URL to upload your
     * documents to. The URL will expire in 30 minutes.
     *
     * Uploaded documents must either be a `jpg`, `png` or `pdf` file, and each must be less than 5
     * GiB.
     */
    suspend fun initiateEvidenceUpload(
        disputeToken: String,
        params: DisputeInitiateEvidenceUploadParams = DisputeInitiateEvidenceUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        initiateEvidenceUpload(
            params.toBuilder().disputeToken(disputeToken).build(),
            requestOptions,
        )

    /** @see initiateEvidenceUpload */
    suspend fun initiateEvidenceUpload(
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    /** @see initiateEvidenceUpload */
    suspend fun initiateEvidenceUpload(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeEvidence =
        initiateEvidenceUpload(
            disputeToken,
            DisputeInitiateEvidenceUploadParams.none(),
            requestOptions,
        )

    /** List evidence metadata for a dispute. */
    suspend fun listEvidences(
        disputeToken: String,
        params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListEvidencesPageAsync =
        listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see listEvidences */
    suspend fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListEvidencesPageAsync

    /** @see listEvidences */
    suspend fun listEvidences(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): DisputeListEvidencesPageAsync =
        listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

    /** Get a dispute's evidence metadata. */
    suspend fun retrieveEvidence(
        evidenceToken: String,
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence =
        retrieveEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

    /** @see retrieveEvidence */
    suspend fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    suspend fun uploadEvidence(disputeToken: String, file: ByteArray)

    /**
     * A view of [DisputeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: DisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            disputeToken: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(disputeToken, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            disputeToken: String,
            params: DisputeUpdateParams = DisputeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeUpdateResponse> =
            update(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: DisputeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeUpdateResponse> =
            update(disputeToken, DisputeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DisputeListPageAsync> =
            list(DisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/disputes/{dispute_token}`, but is otherwise
         * the same as [DisputeServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            disputeToken: String,
            params: DisputeDeleteParams = DisputeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeDeleteResponse> =
            delete(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: DisputeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeDeleteResponse> =
            delete(disputeToken, DisputeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.deleteEvidence].
         */
        @MustBeClosed
        suspend fun deleteEvidence(
            evidenceToken: String,
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            deleteEvidence(params.toBuilder().evidenceToken(evidenceToken).build(), requestOptions)

        /** @see deleteEvidence */
        @MustBeClosed
        suspend fun deleteEvidence(
            params: DisputeDeleteEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>

        /**
         * Returns a raw HTTP response for `post /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.initiateEvidenceUpload].
         */
        @MustBeClosed
        suspend fun initiateEvidenceUpload(
            disputeToken: String,
            params: DisputeInitiateEvidenceUploadParams =
                DisputeInitiateEvidenceUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(
                params.toBuilder().disputeToken(disputeToken).build(),
                requestOptions,
            )

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        suspend fun initiateEvidenceUpload(
            params: DisputeInitiateEvidenceUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>

        /** @see initiateEvidenceUpload */
        @MustBeClosed
        suspend fun initiateEvidenceUpload(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeEvidence> =
            initiateEvidenceUpload(
                disputeToken,
                DisputeInitiateEvidenceUploadParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/disputes/{dispute_token}/evidences`, but is
         * otherwise the same as [DisputeServiceAsync.listEvidences].
         */
        @MustBeClosed
        suspend fun listEvidences(
            disputeToken: String,
            params: DisputeListEvidencesParams = DisputeListEvidencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListEvidencesPageAsync> =
            listEvidences(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see listEvidences */
        @MustBeClosed
        suspend fun listEvidences(
            params: DisputeListEvidencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListEvidencesPageAsync>

        /** @see listEvidences */
        @MustBeClosed
        suspend fun listEvidences(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeListEvidencesPageAsync> =
            listEvidences(disputeToken, DisputeListEvidencesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/disputes/{dispute_token}/evidences/{evidence_token}`, but is otherwise the same as
         * [DisputeServiceAsync.retrieveEvidence].
         */
        @MustBeClosed
        suspend fun retrieveEvidence(
            evidenceToken: String,
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence> =
            retrieveEvidence(
                params.toBuilder().evidenceToken(evidenceToken).build(),
                requestOptions,
            )

        /** @see retrieveEvidence */
        @MustBeClosed
        suspend fun retrieveEvidence(
            params: DisputeRetrieveEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeEvidence>
    }
}
