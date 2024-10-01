// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.authRules

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2ReportParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2ApplyResponse
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2ReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse

interface V2ServiceAsync {

    /** Creates a new V2 authorization rule in draft mode */
    suspend fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2CreateResponse

    /** Fetches an authorization rule by its token */
    suspend fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2RetrieveResponse

    /** Updates an authorization rule's properties */
    suspend fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2UpdateResponse

    /** Lists V2 authorization rules */
    suspend fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleV2ListPageAsync

    /**
     * Associates an authorization rules with a card program, the provided account(s) or card(s).
     *
     * This endpoint will replace any existing associations with the provided list of entities.
     */
    suspend fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2ApplyResponse

    /**
     * Creates a new draft version of an authorization rules that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    suspend fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2DraftResponse

    /**
     * Promotes a draft version of an authorization rule to the currently active version such that
     * it is enforced in the authorization stream.
     */
    suspend fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2PromoteResponse

    /**
     * Requests a performance report of an authorization rule to be asynchronously generated.
     * Reports can only be run on rules in draft or active mode and will included approved and
     * declined statistics as well as examples. The generated report will be delivered
     * asynchronously through a webhook with `event_type` = `auth_rules.performance_report.created`.
     * See the docs on setting up [webhook subscriptions](https://docs.lithic.com/docs/events-api).
     *
     * Note that generating a report may take up to 15 minutes and that delivery is not guaranteed.
     * Customers are required to have created an event subscription to receive the webhook.
     * Additionally, there is a delay of approximately 15 minutes between when Lithic's transaction
     * processing systems have processed the transaction, and when a transaction will be included in
     * the report.
     */
    suspend fun report(
        params: AuthRuleV2ReportParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2ReportResponse
}