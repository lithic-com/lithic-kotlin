// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Dispute
import com.lithic.api.models.DisputeCreateParams
import com.lithic.api.models.DisputeDeleteEvidenceParams
import com.lithic.api.models.DisputeDeleteParams
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.models.DisputeInitiateEvidenceUploadParams
import com.lithic.api.models.DisputeListEvidencesPageAsync
import com.lithic.api.models.DisputeListEvidencesParams
import com.lithic.api.models.DisputeListPageAsync
import com.lithic.api.models.DisputeListParams
import com.lithic.api.models.DisputeRetrieveEvidenceParams
import com.lithic.api.models.DisputeRetrieveParams
import com.lithic.api.models.DisputeUpdateParams

interface DisputeServiceAsync {

    /** Initiate a dispute. */
    suspend fun create(
        params: DisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

    /** Get dispute. */
    suspend fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

    /** Update dispute. Can only be modified if status is `NEW`. */
    suspend fun update(
        params: DisputeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

    /** List disputes. */
    suspend fun list(
        params: DisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPageAsync

    /** Withdraw dispute. */
    suspend fun delete(
        params: DisputeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

    /**
     * Soft delete evidence for a dispute. Evidence will not be reviewed or submitted by Lithic
     * after it is withdrawn.
     */
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
        params: DisputeInitiateEvidenceUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence

    /** List evidence metadata for a dispute. */
    suspend fun listEvidences(
        params: DisputeListEvidencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListEvidencesPageAsync

    /** Get a dispute's evidence metadata. */
    suspend fun retrieveEvidence(
        params: DisputeRetrieveEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeEvidence
}
