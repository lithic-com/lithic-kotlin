// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

interface BookTransferService {

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** List book transfers */
    fun list(
        params: BookTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferListPage

    /** Reverse a book transfer */
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse
}
