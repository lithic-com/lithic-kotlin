// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.responderendpoints.ResponderEndpointCheckStatusParams
import com.lithic.api.models.responderendpoints.ResponderEndpointCreateParams
import com.lithic.api.models.responderendpoints.ResponderEndpointCreateResponse
import com.lithic.api.models.responderendpoints.ResponderEndpointDeleteParams
import com.lithic.api.models.responderendpoints.ResponderEndpointStatus

interface ResponderEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Enroll a responder endpoint */
    suspend fun create(
        params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponderEndpointCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): ResponderEndpointCreateResponse =
        create(ResponderEndpointCreateParams.none(), requestOptions)

    /** Disenroll a responder endpoint */
    suspend fun delete(
        params: ResponderEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Check the status of a responder endpoint */
    suspend fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponderEndpointStatus

    /**
     * A view of [ResponderEndpointServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ResponderEndpointCreateParams = ResponderEndpointCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponderEndpointCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<ResponderEndpointCreateResponse> =
            create(ResponderEndpointCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/responder_endpoints`, but is otherwise the
         * same as [ResponderEndpointServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: ResponderEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/responder_endpoints`, but is otherwise the same
         * as [ResponderEndpointServiceAsync.checkStatus].
         */
        @MustBeClosed
        suspend fun checkStatus(
            params: ResponderEndpointCheckStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponderEndpointStatus>
    }
}
