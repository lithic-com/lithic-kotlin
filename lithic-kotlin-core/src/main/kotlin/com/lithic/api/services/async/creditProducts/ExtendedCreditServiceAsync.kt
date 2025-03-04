// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit

interface ExtendedCreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the extended credit for a given credit product under a program */
    suspend fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtendedCredit

    /**
     * A view of [ExtendedCreditServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/extended_credit`, but is otherwise the same as
         * [ExtendedCreditServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtendedCredit>
    }
}
