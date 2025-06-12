// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointCreateResponse
import com.lithic.api.models.ResponderEndpointDeleteParams
import com.lithic.api.models.ResponderEndpointStatus

interface ResponderEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponderEndpointServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ResponderEndpointServiceAsync.WithRawResponse

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
