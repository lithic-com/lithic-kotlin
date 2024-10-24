// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthRule
import com.lithic.api.models.AuthRuleApplyParams
import com.lithic.api.models.AuthRuleCreateParams
import com.lithic.api.models.AuthRuleListPage
import com.lithic.api.models.AuthRuleListParams
import com.lithic.api.models.AuthRuleMigrateV1ToV2Params
import com.lithic.api.models.AuthRuleRemoveParams
import com.lithic.api.models.AuthRuleRemoveResponse
import com.lithic.api.models.AuthRuleRetrieveParams
import com.lithic.api.models.AuthRuleRetrieveResponse
import com.lithic.api.models.AuthRuleUpdateParams
import com.lithic.api.services.blocking.authRules.V2Service

interface AuthRuleService {

    fun v2(): V2Service

    /**
     * Creates an authorization rule (Auth Rule) and applies it at the program, account, or card
     * level.
     */
    fun create(
        params: AuthRuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /**
     * Detail the properties and entities (program, accounts, and cards) associated with an existing
     * authorization rule (Auth Rule).
     */
    fun retrieve(
        params: AuthRuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleRetrieveResponse

    /** Update the properties associated with an existing authorization rule (Auth Rule). */
    fun update(
        params: AuthRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /** Return all of the Auth Rules under the program. */
    fun list(
        params: AuthRuleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleListPage

    /** Applies an existing authorization rule (Auth Rule) to an program, account, or card level. */
    fun apply(
        params: AuthRuleApplyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /**
     * Migrates an existing V1 authorization rule to a V2 authorization rule. Depending on the
     * configuration of the V1 Auth Rule, this will yield one or two V2 authorization rules. This
     * endpoint will alter the internal structure of the Auth Rule such that the resulting rules
     * become a V2 Authorization Rule that can be operated on through the /v2/auth_rules endpoints.
     *
     * After a V1 Auth Rule has been migrated, it can no longer be operated on through the
     * /v1/auth_rules/\* endpoints. Eventually, Lithic will deprecate the /v1/auth_rules endpoints
     * and migrate all existing V1 Auth Rules to V2 Auth Rules.
     */
    fun migrateV1ToV2(
        params: AuthRuleMigrateV1ToV2Params,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<AuthRule>

    /**
     * Remove an existing authorization rule (Auth Rule) from an program, account, or card-level.
     */
    fun remove(
        params: AuthRuleRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleRemoveResponse
}
