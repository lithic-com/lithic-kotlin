// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = AccountHolder.Builder::class)
@NoAutoDetect
class AccountHolder
private constructor(
    private val accountToken: JsonField<String>,
    private val beneficialOwnerEntities: JsonField<List<AccountHolderBusinessResponse>>,
    private val beneficialOwnerIndividuals: JsonField<List<AccountHolderIndividualResponse>>,
    private val businessAccountToken: JsonField<String>,
    private val businessEntity: JsonField<AccountHolderBusinessResponse>,
    private val controlPerson: JsonField<AccountHolderIndividualResponse>,
    private val created: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val exemptionType: JsonField<ExemptionType>,
    private val externalId: JsonField<String>,
    private val individual: JsonField<AccountHolderIndividualResponse>,
    private val natureOfBusiness: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val statusReasons: JsonField<List<StatusReason>>,
    private val token: JsonField<String>,
    private val userType: JsonField<UserType>,
    private val verificationApplication: JsonField<AccountHolderVerificationApplication>,
    private val requiredDocuments: JsonField<List<RequiredDocument>>,
    private val websiteUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for the account. */
    fun accountToken(): String? = accountToken.getNullable("account_token")

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    fun beneficialOwnerEntities(): List<AccountHolderBusinessResponse>? =
        beneficialOwnerEntities.getNullable("beneficial_owner_entities")

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    fun beneficialOwnerIndividuals(): List<AccountHolderIndividualResponse>? =
        beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals")

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): String? = businessAccountToken.getNullable("business_account_token")

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    fun businessEntity(): AccountHolderBusinessResponse? =
        businessEntity.getNullable("business_entity")

    /**
     * Only present when user_type == "BUSINESS". An individual with significant responsibility for
     * managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer, Chief
     * Operating Officer, Managing Member, General Partner, President, Vice President, or
     * Treasurer). This can be an executive, or someone who will have program-wide access to the
     * cards that Lithic will provide. In some cases, this individual could also be a beneficial
     * owner listed above.
     */
    fun controlPerson(): AccountHolderIndividualResponse? =
        controlPerson.getNullable("control_person")

    /** Timestamp of when the account holder was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    fun email(): String? = email.getNullable("email")

    /** The type of KYC exemption for a KYC-Exempt Account Holder. */
    fun exemptionType(): ExemptionType? = exemptionType.getNullable("exemption_type")

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    fun individual(): AccountHolderIndividualResponse? = individual.getNullable("individual")

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    fun natureOfBusiness(): String? = natureOfBusiness.getNullable("nature_of_business")

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
     *   workflow.
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    fun statusReasons(): List<StatusReason>? = statusReasons.getNullable("status_reasons")

    /** Globally unique identifier for the account holder. */
    fun token(): String = token.getRequired("token")

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present. If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
     * "website_url" attributes will be present.
     */
    fun userType(): UserType? = userType.getNullable("user_type")

    /** Information about the most recent identity verification attempt */
    fun verificationApplication(): AccountHolderVerificationApplication? =
        verificationApplication.getNullable("verification_application")

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    fun requiredDocuments(): List<RequiredDocument>? =
        requiredDocuments.getNullable("required_documents")

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    fun websiteUrl(): String? = websiteUrl.getNullable("website_url")

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities() = beneficialOwnerEntities

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals() = beneficialOwnerIndividuals

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken() = businessAccountToken

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    @JsonProperty("business_entity") @ExcludeMissing fun _businessEntity() = businessEntity

    /**
     * Only present when user_type == "BUSINESS". An individual with significant responsibility for
     * managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer, Chief
     * Operating Officer, Managing Member, General Partner, President, Vice President, or
     * Treasurer). This can be an executive, or someone who will have program-wide access to the
     * cards that Lithic will provide. In some cases, this individual could also be a beneficial
     * owner listed above.
     */
    @JsonProperty("control_person") @ExcludeMissing fun _controlPerson() = controlPerson

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** The type of KYC exemption for a KYC-Exempt Account Holder. */
    @JsonProperty("exemption_type") @ExcludeMissing fun _exemptionType() = exemptionType

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    @JsonProperty("nature_of_business") @ExcludeMissing fun _natureOfBusiness() = natureOfBusiness

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
     *   workflow.
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present. If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
     * "website_url" attributes will be present.
     */
    @JsonProperty("user_type") @ExcludeMissing fun _userType() = userType

    /** Information about the most recent identity verification attempt */
    @JsonProperty("verification_application")
    @ExcludeMissing
    fun _verificationApplication() = verificationApplication

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    @JsonProperty("required_documents") @ExcludeMissing fun _requiredDocuments() = requiredDocuments

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl() = websiteUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolder = apply {
        if (!validated) {
            accountToken()
            beneficialOwnerEntities()?.forEach { it.validate() }
            beneficialOwnerIndividuals()?.forEach { it.validate() }
            businessAccountToken()
            businessEntity()?.validate()
            controlPerson()?.validate()
            created()
            email()
            exemptionType()
            externalId()
            individual()?.validate()
            natureOfBusiness()
            phoneNumber()
            status()
            statusReasons()
            token()
            userType()
            verificationApplication()?.validate()
            requiredDocuments()?.forEach { it.validate() }
            websiteUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var beneficialOwnerEntities: JsonField<List<AccountHolderBusinessResponse>> =
            JsonMissing.of()
        private var beneficialOwnerIndividuals: JsonField<List<AccountHolderIndividualResponse>> =
            JsonMissing.of()
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var businessEntity: JsonField<AccountHolderBusinessResponse> = JsonMissing.of()
        private var controlPerson: JsonField<AccountHolderIndividualResponse> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var exemptionType: JsonField<ExemptionType> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var individual: JsonField<AccountHolderIndividualResponse> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var userType: JsonField<UserType> = JsonMissing.of()
        private var verificationApplication: JsonField<AccountHolderVerificationApplication> =
            JsonMissing.of()
        private var requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountHolder: AccountHolder) = apply {
            this.accountToken = accountHolder.accountToken
            this.beneficialOwnerEntities = accountHolder.beneficialOwnerEntities
            this.beneficialOwnerIndividuals = accountHolder.beneficialOwnerIndividuals
            this.businessAccountToken = accountHolder.businessAccountToken
            this.businessEntity = accountHolder.businessEntity
            this.controlPerson = accountHolder.controlPerson
            this.created = accountHolder.created
            this.email = accountHolder.email
            this.exemptionType = accountHolder.exemptionType
            this.externalId = accountHolder.externalId
            this.individual = accountHolder.individual
            this.natureOfBusiness = accountHolder.natureOfBusiness
            this.phoneNumber = accountHolder.phoneNumber
            this.status = accountHolder.status
            this.statusReasons = accountHolder.statusReasons
            this.token = accountHolder.token
            this.userType = accountHolder.userType
            this.verificationApplication = accountHolder.verificationApplication
            this.requiredDocuments = accountHolder.requiredDocuments
            this.websiteUrl = accountHolder.websiteUrl
            additionalProperties(accountHolder.additionalProperties)
        }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: List<AccountHolderBusinessResponse>) =
            beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        @JsonProperty("beneficial_owner_entities")
        @ExcludeMissing
        fun beneficialOwnerEntities(
            beneficialOwnerEntities: JsonField<List<AccountHolderBusinessResponse>>
        ) = apply { this.beneficialOwnerEntities = beneficialOwnerEntities }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun beneficialOwnerIndividuals(
            beneficialOwnerIndividuals: List<AccountHolderIndividualResponse>
        ) = beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        @JsonProperty("beneficial_owner_individuals")
        @ExcludeMissing
        fun beneficialOwnerIndividuals(
            beneficialOwnerIndividuals: JsonField<List<AccountHolderIndividualResponse>>
        ) = apply { this.beneficialOwnerIndividuals = beneficialOwnerIndividuals }

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        fun businessAccountToken(businessAccountToken: String) =
            businessAccountToken(JsonField.of(businessAccountToken))

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Pass the account_token of the enrolled business associated with the
         * AUTHORIZED_USER in this field.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        fun businessEntity(businessEntity: AccountHolderBusinessResponse) =
            businessEntity(JsonField.of(businessEntity))

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        @JsonProperty("business_entity")
        @ExcludeMissing
        fun businessEntity(businessEntity: JsonField<AccountHolderBusinessResponse>) = apply {
            this.businessEntity = businessEntity
        }

        /**
         * Only present when user_type == "BUSINESS". An individual with significant responsibility
         * for managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer,
         * Chief Operating Officer, Managing Member, General Partner, President, Vice President, or
         * Treasurer). This can be an executive, or someone who will have program-wide access to the
         * cards that Lithic will provide. In some cases, this individual could also be a beneficial
         * owner listed above.
         */
        fun controlPerson(controlPerson: AccountHolderIndividualResponse) =
            controlPerson(JsonField.of(controlPerson))

        /**
         * Only present when user_type == "BUSINESS". An individual with significant responsibility
         * for managing the legal entity (e.g., a Chief Executive Officer, Chief Financial Officer,
         * Chief Operating Officer, Managing Member, General Partner, President, Vice President, or
         * Treasurer). This can be an executive, or someone who will have program-wide access to the
         * cards that Lithic will provide. In some cases, this individual could also be a beneficial
         * owner listed above.
         */
        @JsonProperty("control_person")
        @ExcludeMissing
        fun controlPerson(controlPerson: JsonField<AccountHolderIndividualResponse>) = apply {
            this.controlPerson = controlPerson
        }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary email of Account Holder.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary email of Account Holder.
         */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The type of KYC exemption for a KYC-Exempt Account Holder. */
        fun exemptionType(exemptionType: ExemptionType) = exemptionType(JsonField.of(exemptionType))

        /** The type of KYC exemption for a KYC-Exempt Account Holder. */
        @JsonProperty("exemption_type")
        @ExcludeMissing
        fun exemptionType(exemptionType: JsonField<ExemptionType>) = apply {
            this.exemptionType = exemptionType
        }

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: AccountHolderIndividualResponse) =
            individual(JsonField.of(individual))

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        @JsonProperty("individual")
        @ExcludeMissing
        fun individual(individual: JsonField<AccountHolderIndividualResponse>) = apply {
            this.individual = individual
        }

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
        fun natureOfBusiness(natureOfBusiness: String) =
            natureOfBusiness(JsonField.of(natureOfBusiness))

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
        @JsonProperty("nature_of_business")
        @ExcludeMissing
        fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
            this.natureOfBusiness = natureOfBusiness
        }

        /**
         * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary phone of Account Holder, entered in E.164 format.
         */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
         * individual.phone_number when user_type == "INDIVIDUAL".
         * > Primary phone of Account Holder, entered in E.164 format.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun statusReasons(statusReasons: List<StatusReason>) =
            statusReasons(JsonField.of(statusReasons))

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
            this.statusReasons = statusReasons
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present. If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
         * "website_url" attributes will be present.
         */
        fun userType(userType: UserType) = userType(JsonField.of(userType))

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present. If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities", "nature_of_business", and
         * "website_url" attributes will be present.
         */
        @JsonProperty("user_type")
        @ExcludeMissing
        fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: AccountHolderVerificationApplication) =
            verificationApplication(JsonField.of(verificationApplication))

        /** Information about the most recent identity verification attempt */
        @JsonProperty("verification_application")
        @ExcludeMissing
        fun verificationApplication(
            verificationApplication: JsonField<AccountHolderVerificationApplication>
        ) = apply { this.verificationApplication = verificationApplication }

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        @JsonProperty("required_documents")
        @ExcludeMissing
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments
        }

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AccountHolder =
            AccountHolder(
                accountToken,
                beneficialOwnerEntities.map { it.toUnmodifiable() },
                beneficialOwnerIndividuals.map { it.toUnmodifiable() },
                businessAccountToken,
                businessEntity,
                controlPerson,
                created,
                email,
                exemptionType,
                externalId,
                individual,
                natureOfBusiness,
                phoneNumber,
                status,
                statusReasons.map { it.toUnmodifiable() },
                token,
                userType,
                verificationApplication,
                requiredDocuments.map { it.toUnmodifiable() },
                websiteUrl,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AccountHolderBusinessResponse.Builder::class)
    @NoAutoDetect
    class AccountHolderBusinessResponse
    private constructor(
        private val address: JsonField<Address>,
        private val dbaBusinessName: JsonField<String>,
        private val governmentId: JsonField<String>,
        private val legalBusinessName: JsonField<String>,
        private val parentCompany: JsonField<String>,
        private val phoneNumbers: JsonField<List<String>>,
        private val entityToken: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(): String = dbaBusinessName.getRequired("dba_business_name")

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /** Legal (formal) business name. */
        fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

        /** Parent company name (if applicable). */
        fun parentCompany(): String? = parentCompany.getNullable("parent_company")

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /** Globally unique identifier for the entity. */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /**
         * Business's physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        @JsonProperty("dba_business_name") @ExcludeMissing fun _dbaBusinessName() = dbaBusinessName

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        @JsonProperty("government_id") @ExcludeMissing fun _governmentId() = governmentId

        /** Legal (formal) business name. */
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        fun _legalBusinessName() = legalBusinessName

        /** Parent company name (if applicable). */
        @JsonProperty("parent_company") @ExcludeMissing fun _parentCompany() = parentCompany

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountHolderBusinessResponse = apply {
            if (!validated) {
                address().validate()
                dbaBusinessName()
                governmentId()
                legalBusinessName()
                parentCompany()
                phoneNumbers()
                entityToken()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dbaBusinessName: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var legalBusinessName: JsonField<String> = JsonMissing.of()
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<List<String>> = JsonMissing.of()
            private var entityToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountHolderBusinessResponse: AccountHolderBusinessResponse) =
                apply {
                    this.address = accountHolderBusinessResponse.address
                    this.dbaBusinessName = accountHolderBusinessResponse.dbaBusinessName
                    this.governmentId = accountHolderBusinessResponse.governmentId
                    this.legalBusinessName = accountHolderBusinessResponse.legalBusinessName
                    this.parentCompany = accountHolderBusinessResponse.parentCompany
                    this.phoneNumbers = accountHolderBusinessResponse.phoneNumbers
                    this.entityToken = accountHolderBusinessResponse.entityToken
                    additionalProperties(accountHolderBusinessResponse.additionalProperties)
                }

            /**
             * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Business's physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * Any name that the business operates under that is not its legal business name (if
             * applicable).
             */
            fun dbaBusinessName(dbaBusinessName: String) =
                dbaBusinessName(JsonField.of(dbaBusinessName))

            /**
             * Any name that the business operates under that is not its legal business name (if
             * applicable).
             */
            @JsonProperty("dba_business_name")
            @ExcludeMissing
            fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
                this.dbaBusinessName = dbaBusinessName
            }

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
             */
            @JsonProperty("government_id")
            @ExcludeMissing
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Legal (formal) business name. */
            fun legalBusinessName(legalBusinessName: String) =
                legalBusinessName(JsonField.of(legalBusinessName))

            /** Legal (formal) business name. */
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                this.legalBusinessName = legalBusinessName
            }

            /** Parent company name (if applicable). */
            fun parentCompany(parentCompany: String) = parentCompany(JsonField.of(parentCompany))

            /** Parent company name (if applicable). */
            @JsonProperty("parent_company")
            @ExcludeMissing
            fun parentCompany(parentCompany: JsonField<String>) = apply {
                this.parentCompany = parentCompany
            }

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /** Globally unique identifier for the entity. */
            @JsonProperty("entity_token")
            @ExcludeMissing
            fun entityToken(entityToken: JsonField<String>) = apply {
                this.entityToken = entityToken
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountHolderBusinessResponse =
                AccountHolderBusinessResponse(
                    address,
                    dbaBusinessName,
                    governmentId,
                    legalBusinessName,
                    parentCompany,
                    phoneNumbers.map { it.toUnmodifiable() },
                    entityToken,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderBusinessResponse && this.address == other.address && this.dbaBusinessName == other.dbaBusinessName && this.governmentId == other.governmentId && this.legalBusinessName == other.legalBusinessName && this.parentCompany == other.parentCompany && this.phoneNumbers == other.phoneNumbers && this.entityToken == other.entityToken && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, dbaBusinessName, governmentId, legalBusinessName, parentCompany, phoneNumbers, entityToken, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderBusinessResponse{address=$address, dbaBusinessName=$dbaBusinessName, governmentId=$governmentId, legalBusinessName=$legalBusinessName, parentCompany=$parentCompany, phoneNumbers=$phoneNumbers, entityToken=$entityToken, additionalProperties=$additionalProperties}"
    }

    /**
     * Information about an individual associated with an account holder. A subset of the
     * information provided via KYC. For example, we do not return the government id.
     */
    @JsonDeserialize(builder = AccountHolderIndividualResponse.Builder::class)
    @NoAutoDetect
    class AccountHolderIndividualResponse
    private constructor(
        private val address: JsonField<Address>,
        private val dob: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val entityToken: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Individual's current address */
        fun address(): Address = address.getRequired("address")

        /** Individual's date of birth, as an RFC 3339 date. */
        fun dob(): String = dob.getRequired("dob")

        /** Individual's email address. */
        fun email(): String = email.getRequired("email")

        /** Individual's first name, as it appears on government-issued identity documents. */
        fun firstName(): String = firstName.getRequired("first_name")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /** Globally unique identifier for the entity. */
        fun entityToken(): String = entityToken.getRequired("entity_token")

        /** Individual's current address */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

        /** Individual's email address. */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountHolderIndividualResponse = apply {
            if (!validated) {
                address().validate()
                dob()
                email()
                firstName()
                lastName()
                phoneNumber()
                entityToken()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var entityToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountHolderIndividualResponse: AccountHolderIndividualResponse) =
                apply {
                    this.address = accountHolderIndividualResponse.address
                    this.dob = accountHolderIndividualResponse.dob
                    this.email = accountHolderIndividualResponse.email
                    this.firstName = accountHolderIndividualResponse.firstName
                    this.lastName = accountHolderIndividualResponse.lastName
                    this.phoneNumber = accountHolderIndividualResponse.phoneNumber
                    this.entityToken = accountHolderIndividualResponse.entityToken
                    additionalProperties(accountHolderIndividualResponse.additionalProperties)
                }

            /** Individual's current address */
            fun address(address: Address) = address(JsonField.of(address))

            /** Individual's current address */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
            @JsonProperty("dob")
            @ExcludeMissing
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /** Individual's email address. */
            fun email(email: String) = email(JsonField.of(email))

            /** Individual's email address. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** Individual's first name, as it appears on government-issued identity documents. */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** Individual's last name, as it appears on government-issued identity documents. */
            @JsonProperty("last_name")
            @ExcludeMissing
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /** Individual's phone number, entered in E.164 format. */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Globally unique identifier for the entity. */
            fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

            /** Globally unique identifier for the entity. */
            @JsonProperty("entity_token")
            @ExcludeMissing
            fun entityToken(entityToken: JsonField<String>) = apply {
                this.entityToken = entityToken
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountHolderIndividualResponse =
                AccountHolderIndividualResponse(
                    address,
                    dob,
                    email,
                    firstName,
                    lastName,
                    phoneNumber,
                    entityToken,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderIndividualResponse && this.address == other.address && this.dob == other.dob && this.email == other.email && this.firstName == other.firstName && this.lastName == other.lastName && this.phoneNumber == other.phoneNumber && this.entityToken == other.entityToken && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, dob, email, firstName, lastName, phoneNumber, entityToken, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderIndividualResponse{address=$address, dob=$dob, email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, entityToken=$entityToken, additionalProperties=$additionalProperties}"
    }

    class ExemptionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExemptionType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val AUTHORIZED_USER = ExemptionType(JsonField.of("AUTHORIZED_USER"))

            val PREPAID_CARD_USER = ExemptionType(JsonField.of("PREPAID_CARD_USER"))

            fun of(value: String) = ExemptionType(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
        }

        enum class Value {
            AUTHORIZED_USER,
            PREPAID_CARD_USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZED_USER -> Value.AUTHORIZED_USER
                PREPAID_CARD_USER -> Value.PREPAID_CARD_USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZED_USER -> Known.AUTHORIZED_USER
                PREPAID_CARD_USER -> Known.PREPAID_CARD_USER
                else -> throw LithicInvalidDataException("Unknown ExemptionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            val PENDING_REVIEW = Status(JsonField.of("PENDING_REVIEW"))

            val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

            val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

            val REJECTED = Status(JsonField.of("REJECTED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StatusReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ADDRESS_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("ADDRESS_VERIFICATION_FAILURE"))

            val AGE_THRESHOLD_FAILURE = StatusReason(JsonField.of("AGE_THRESHOLD_FAILURE"))

            val COMPLETE_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("COMPLETE_VERIFICATION_FAILURE"))

            val DOB_VERIFICATION_FAILURE = StatusReason(JsonField.of("DOB_VERIFICATION_FAILURE"))

            val ID_VERIFICATION_FAILURE = StatusReason(JsonField.of("ID_VERIFICATION_FAILURE"))

            val MAX_DOCUMENT_ATTEMPTS = StatusReason(JsonField.of("MAX_DOCUMENT_ATTEMPTS"))

            val MAX_RESUBMISSION_ATTEMPTS = StatusReason(JsonField.of("MAX_RESUBMISSION_ATTEMPTS"))

            val NAME_VERIFICATION_FAILURE = StatusReason(JsonField.of("NAME_VERIFICATION_FAILURE"))

            val OTHER_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("OTHER_VERIFICATION_FAILURE"))

            val RISK_THRESHOLD_FAILURE = StatusReason(JsonField.of("RISK_THRESHOLD_FAILURE"))

            val WATCHLIST_ALERT_FAILURE = StatusReason(JsonField.of("WATCHLIST_ALERT_FAILURE"))

            fun of(value: String) = StatusReason(JsonField.of(value))
        }

        enum class Known {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
        }

        enum class Value {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class UserType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UserType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BUSINESS = UserType(JsonField.of("BUSINESS"))

            val INDIVIDUAL = UserType(JsonField.of("INDIVIDUAL"))

            fun of(value: String) = UserType(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown UserType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Information about the most recent identity verification attempt */
    @JsonDeserialize(builder = AccountHolderVerificationApplication.Builder::class)
    @NoAutoDetect
    class AccountHolderVerificationApplication
    private constructor(
        private val created: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val statusReasons: JsonField<List<StatusReason>>,
        private val updated: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Timestamp of when the application was created. */
        fun created(): OffsetDateTime? = created.getNullable("created")

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(): Status? = status.getNullable("status")

        /** Reason for the evaluation status. */
        fun statusReasons(): List<StatusReason>? = statusReasons.getNullable("status_reasons")

        /** Timestamp of when the application was last updated. */
        fun updated(): OffsetDateTime? = updated.getNullable("updated")

        /** Timestamp of when the application was created. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `KYC_ADVANCED`
         *   workflow.
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Reason for the evaluation status. */
        @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

        /** Timestamp of when the application was last updated. */
        @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountHolderVerificationApplication = apply {
            if (!validated) {
                created()
                status()
                statusReasons()
                updated()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
            private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                accountHolderVerificationApplication: AccountHolderVerificationApplication
            ) = apply {
                this.created = accountHolderVerificationApplication.created
                this.status = accountHolderVerificationApplication.status
                this.statusReasons = accountHolderVerificationApplication.statusReasons
                this.updated = accountHolderVerificationApplication.updated
                additionalProperties(accountHolderVerificationApplication.additionalProperties)
            }

            /** Timestamp of when the application was created. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Timestamp of when the application was created. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * KYC and KYB evaluation states.
             *
             * Note:
             * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the
             *   `KYC_ADVANCED` workflow.
             * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * KYC and KYB evaluation states.
             *
             * Note:
             * - `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the
             *   `KYC_ADVANCED` workflow.
             * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reason for the evaluation status. */
            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
                this.statusReasons = statusReasons
            }

            /** Timestamp of when the application was last updated. */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /** Timestamp of when the application was last updated. */
            @JsonProperty("updated")
            @ExcludeMissing
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountHolderVerificationApplication =
                AccountHolderVerificationApplication(
                    created,
                    status,
                    statusReasons.map { it.toUnmodifiable() },
                    updated,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCEPTED = Status(JsonField.of("ACCEPTED"))

                val PENDING_REVIEW = Status(JsonField.of("PENDING_REVIEW"))

                val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

                val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

                val REJECTED = Status(JsonField.of("REJECTED"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                PENDING_REVIEW,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
            }

            enum class Value {
                ACCEPTED,
                PENDING_REVIEW,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    PENDING_REVIEW -> Value.PENDING_REVIEW
                    PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                    REJECTED -> Value.REJECTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    PENDING_REVIEW -> Known.PENDING_REVIEW
                    PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                    REJECTED -> Known.REJECTED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class StatusReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ADDRESS_VERIFICATION_FAILURE =
                    StatusReason(JsonField.of("ADDRESS_VERIFICATION_FAILURE"))

                val AGE_THRESHOLD_FAILURE = StatusReason(JsonField.of("AGE_THRESHOLD_FAILURE"))

                val COMPLETE_VERIFICATION_FAILURE =
                    StatusReason(JsonField.of("COMPLETE_VERIFICATION_FAILURE"))

                val DOB_VERIFICATION_FAILURE =
                    StatusReason(JsonField.of("DOB_VERIFICATION_FAILURE"))

                val ID_VERIFICATION_FAILURE = StatusReason(JsonField.of("ID_VERIFICATION_FAILURE"))

                val MAX_DOCUMENT_ATTEMPTS = StatusReason(JsonField.of("MAX_DOCUMENT_ATTEMPTS"))

                val MAX_RESUBMISSION_ATTEMPTS =
                    StatusReason(JsonField.of("MAX_RESUBMISSION_ATTEMPTS"))

                val NAME_VERIFICATION_FAILURE =
                    StatusReason(JsonField.of("NAME_VERIFICATION_FAILURE"))

                val OTHER_VERIFICATION_FAILURE =
                    StatusReason(JsonField.of("OTHER_VERIFICATION_FAILURE"))

                val RISK_THRESHOLD_FAILURE = StatusReason(JsonField.of("RISK_THRESHOLD_FAILURE"))

                val WATCHLIST_ALERT_FAILURE = StatusReason(JsonField.of("WATCHLIST_ALERT_FAILURE"))

                fun of(value: String) = StatusReason(JsonField.of(value))
            }

            enum class Known {
                ADDRESS_VERIFICATION_FAILURE,
                AGE_THRESHOLD_FAILURE,
                COMPLETE_VERIFICATION_FAILURE,
                DOB_VERIFICATION_FAILURE,
                ID_VERIFICATION_FAILURE,
                MAX_DOCUMENT_ATTEMPTS,
                MAX_RESUBMISSION_ATTEMPTS,
                NAME_VERIFICATION_FAILURE,
                OTHER_VERIFICATION_FAILURE,
                RISK_THRESHOLD_FAILURE,
                WATCHLIST_ALERT_FAILURE,
            }

            enum class Value {
                ADDRESS_VERIFICATION_FAILURE,
                AGE_THRESHOLD_FAILURE,
                COMPLETE_VERIFICATION_FAILURE,
                DOB_VERIFICATION_FAILURE,
                ID_VERIFICATION_FAILURE,
                MAX_DOCUMENT_ATTEMPTS,
                MAX_RESUBMISSION_ATTEMPTS,
                NAME_VERIFICATION_FAILURE,
                OTHER_VERIFICATION_FAILURE,
                RISK_THRESHOLD_FAILURE,
                WATCHLIST_ALERT_FAILURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                    AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                    COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                    DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                    ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                    MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                    MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                    NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                    OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                    RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                    WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                    AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                    COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                    DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                    ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                    MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                    MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                    NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                    OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                    RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                    WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                    else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderVerificationApplication && this.created == other.created && this.status == other.status && this.statusReasons == other.statusReasons && this.updated == other.updated && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(created, status, statusReasons, updated, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderVerificationApplication{created=$created, status=$status, statusReasons=$statusReasons, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolder && this.accountToken == other.accountToken && this.beneficialOwnerEntities == other.beneficialOwnerEntities && this.beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && this.businessAccountToken == other.businessAccountToken && this.businessEntity == other.businessEntity && this.controlPerson == other.controlPerson && this.created == other.created && this.email == other.email && this.exemptionType == other.exemptionType && this.externalId == other.externalId && this.individual == other.individual && this.natureOfBusiness == other.natureOfBusiness && this.phoneNumber == other.phoneNumber && this.status == other.status && this.statusReasons == other.statusReasons && this.token == other.token && this.userType == other.userType && this.verificationApplication == other.verificationApplication && this.requiredDocuments == other.requiredDocuments && this.websiteUrl == other.websiteUrl && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountToken, beneficialOwnerEntities, beneficialOwnerIndividuals, businessAccountToken, businessEntity, controlPerson, created, email, exemptionType, externalId, individual, natureOfBusiness, phoneNumber, status, statusReasons, token, userType, verificationApplication, requiredDocuments, websiteUrl, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolder{accountToken=$accountToken, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessAccountToken=$businessAccountToken, businessEntity=$businessEntity, controlPerson=$controlPerson, created=$created, email=$email, exemptionType=$exemptionType, externalId=$externalId, individual=$individual, natureOfBusiness=$natureOfBusiness, phoneNumber=$phoneNumber, status=$status, statusReasons=$statusReasons, token=$token, userType=$userType, verificationApplication=$verificationApplication, requiredDocuments=$requiredDocuments, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
