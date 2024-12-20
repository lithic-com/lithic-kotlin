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
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = AccountHolderSimulateEnrollmentReviewResponse.Builder::class)
@NoAutoDetect
class AccountHolderSimulateEnrollmentReviewResponse
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val businessAccountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val exemptionType: JsonField<ExemptionType>,
    private val externalId: JsonField<String>,
    private val userType: JsonField<UserType>,
    private val verificationApplication: JsonField<VerificationApplication>,
    private val individual: JsonField<Individual>,
    private val businessEntity: JsonField<KybBusinessEntity>,
    private val beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>,
    private val beneficialOwnerIndividuals: JsonField<List<Individual>>,
    private val controlPerson: JsonField<Individual>,
    private val natureOfBusiness: JsonField<String>,
    private val websiteUrl: JsonField<String>,
    private val email: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val statusReasons: JsonField<List<StatusReasons>>,
    private val requiredDocuments: JsonField<List<RequiredDocument>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for the account holder. */
    fun token(): String? = token.getNullable("token")

    /** Globally unique identifier for the account. */
    fun accountToken(): String? = accountToken.getNullable("account_token")

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): String? = businessAccountToken.getNullable("business_account_token")

    /** Timestamp of when the account holder was created. */
    fun created(): OffsetDateTime? = created.getNullable("created")

    /**
     * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder is
     * not KYC-Exempt.
     */
    fun exemptionType(): ExemptionType? = exemptionType.getNullable("exemption_type")

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present.
     *
     * If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities",
     *
     * "nature_of_business", and "website_url" attributes will be present.
     */
    fun userType(): UserType? = userType.getNullable("user_type")

    /** Information about the most recent identity verification attempt */
    fun verificationApplication(): VerificationApplication? =
        verificationApplication.getNullable("verification_application")

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    fun individual(): Individual? = individual.getNullable("individual")

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    fun businessEntity(): KybBusinessEntity? = businessEntity.getNullable("business_entity")

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    fun beneficialOwnerEntities(): List<KybBusinessEntity>? =
        beneficialOwnerEntities.getNullable("beneficial_owner_entities")

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    fun beneficialOwnerIndividuals(): List<Individual>? =
        beneficialOwnerIndividuals.getNullable("beneficial_owner_individuals")

    /**
     * Only present when user_type == "BUSINESS".
     *
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer,
     *
     * Managing Member, General Partner, President, Vice President, or Treasurer). This can be an
     * executive, or someone who will have program-wide access
     *
     * to the cards that Lithic will provide. In some cases, this individual could also be a
     * beneficial owner listed above.
     */
    fun controlPerson(): Individual? = controlPerson.getNullable("control_person")

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    fun natureOfBusiness(): String? = natureOfBusiness.getNullable("nature_of_business")

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    fun websiteUrl(): String? = websiteUrl.getNullable("website_url")

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    fun email(): String? = email.getNullable("email")

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
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    fun statusReasons(): List<StatusReasons>? = statusReasons.getNullable("status_reasons")

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    fun requiredDocuments(): List<RequiredDocument>? =
        requiredDocuments.getNullable("required_documents")

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken() = businessAccountToken

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder is
     * not KYC-Exempt.
     */
    @JsonProperty("exemption_type") @ExcludeMissing fun _exemptionType() = exemptionType

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present.
     *
     * If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities",
     *
     * "nature_of_business", and "website_url" attributes will be present.
     */
    @JsonProperty("user_type") @ExcludeMissing fun _userType() = userType

    /** Information about the most recent identity verification attempt */
    @JsonProperty("verification_application")
    @ExcludeMissing
    fun _verificationApplication() = verificationApplication

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    @JsonProperty("business_entity") @ExcludeMissing fun _businessEntity() = businessEntity

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
     * Only present when user_type == "BUSINESS".
     *
     * An individual with significant responsibility for managing the legal entity (e.g., a Chief
     * Executive Officer, Chief Financial Officer, Chief Operating Officer,
     *
     * Managing Member, General Partner, President, Vice President, or Treasurer). This can be an
     * executive, or someone who will have program-wide access
     *
     * to the cards that Lithic will provide. In some cases, this individual could also be a
     * beneficial owner listed above.
     */
    @JsonProperty("control_person") @ExcludeMissing fun _controlPerson() = controlPerson

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    @JsonProperty("nature_of_business") @ExcludeMissing fun _natureOfBusiness() = natureOfBusiness

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl() = websiteUrl

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

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
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    @JsonProperty("required_documents") @ExcludeMissing fun _requiredDocuments() = requiredDocuments

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolderSimulateEnrollmentReviewResponse = apply {
        if (!validated) {
            token()
            accountToken()
            businessAccountToken()
            created()
            exemptionType()
            externalId()
            userType()
            verificationApplication()?.validate()
            individual()?.validate()
            businessEntity()?.validate()
            beneficialOwnerEntities()?.forEach { it.validate() }
            beneficialOwnerIndividuals()?.forEach { it.validate() }
            controlPerson()?.validate()
            natureOfBusiness()
            websiteUrl()
            email()
            phoneNumber()
            status()
            statusReasons()
            requiredDocuments()?.forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exemptionType: JsonField<ExemptionType> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var userType: JsonField<UserType> = JsonMissing.of()
        private var verificationApplication: JsonField<VerificationApplication> = JsonMissing.of()
        private var individual: JsonField<Individual> = JsonMissing.of()
        private var businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of()
        private var beneficialOwnerEntities: JsonField<List<KybBusinessEntity>> = JsonMissing.of()
        private var beneficialOwnerIndividuals: JsonField<List<Individual>> = JsonMissing.of()
        private var controlPerson: JsonField<Individual> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of()
        private var requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            accountHolderSimulateEnrollmentReviewResponse:
                AccountHolderSimulateEnrollmentReviewResponse
        ) = apply {
            this.token = accountHolderSimulateEnrollmentReviewResponse.token
            this.accountToken = accountHolderSimulateEnrollmentReviewResponse.accountToken
            this.businessAccountToken =
                accountHolderSimulateEnrollmentReviewResponse.businessAccountToken
            this.created = accountHolderSimulateEnrollmentReviewResponse.created
            this.exemptionType = accountHolderSimulateEnrollmentReviewResponse.exemptionType
            this.externalId = accountHolderSimulateEnrollmentReviewResponse.externalId
            this.userType = accountHolderSimulateEnrollmentReviewResponse.userType
            this.verificationApplication =
                accountHolderSimulateEnrollmentReviewResponse.verificationApplication
            this.individual = accountHolderSimulateEnrollmentReviewResponse.individual
            this.businessEntity = accountHolderSimulateEnrollmentReviewResponse.businessEntity
            this.beneficialOwnerEntities =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities
            this.beneficialOwnerIndividuals =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals
            this.controlPerson = accountHolderSimulateEnrollmentReviewResponse.controlPerson
            this.natureOfBusiness = accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness
            this.websiteUrl = accountHolderSimulateEnrollmentReviewResponse.websiteUrl
            this.email = accountHolderSimulateEnrollmentReviewResponse.email
            this.phoneNumber = accountHolderSimulateEnrollmentReviewResponse.phoneNumber
            this.status = accountHolderSimulateEnrollmentReviewResponse.status
            this.statusReasons = accountHolderSimulateEnrollmentReviewResponse.statusReasons
            this.requiredDocuments = accountHolderSimulateEnrollmentReviewResponse.requiredDocuments
            additionalProperties(accountHolderSimulateEnrollmentReviewResponse.additionalProperties)
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

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

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder
         * is not KYC-Exempt.
         */
        fun exemptionType(exemptionType: ExemptionType) = exemptionType(JsonField.of(exemptionType))

        /**
         * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder
         * is not KYC-Exempt.
         */
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
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present.
         *
         * If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities",
         *
         * "nature_of_business", and "website_url" attributes will be present.
         */
        fun userType(userType: UserType) = userType(JsonField.of(userType))

        /**
         * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will
         * be present.
         *
         * If the type is "BUSINESS" then the "business_entity", "control_person",
         * "beneficial_owner_individuals", "beneficial_owner_entities",
         *
         * "nature_of_business", and "website_url" attributes will be present.
         */
        @JsonProperty("user_type")
        @ExcludeMissing
        fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: VerificationApplication) =
            verificationApplication(JsonField.of(verificationApplication))

        /** Information about the most recent identity verification attempt */
        @JsonProperty("verification_application")
        @ExcludeMissing
        fun verificationApplication(verificationApplication: JsonField<VerificationApplication>) =
            apply {
                this.verificationApplication = verificationApplication
            }

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        @JsonProperty("individual")
        @ExcludeMissing
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        fun businessEntity(businessEntity: KybBusinessEntity) =
            businessEntity(JsonField.of(businessEntity))

        /**
         * Only present when user_type == "BUSINESS". Information about the business for which the
         * account is being opened and KYB is being run.
         */
        @JsonProperty("business_entity")
        @ExcludeMissing
        fun businessEntity(businessEntity: JsonField<KybBusinessEntity>) = apply {
            this.businessEntity = businessEntity
        }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun beneficialOwnerEntities(beneficialOwnerEntities: List<KybBusinessEntity>) =
            beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        @JsonProperty("beneficial_owner_entities")
        @ExcludeMissing
        fun beneficialOwnerEntities(beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>) =
            apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities
            }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<Individual>) =
            beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        @JsonProperty("beneficial_owner_individuals")
        @ExcludeMissing
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: JsonField<List<Individual>>) =
            apply {
                this.beneficialOwnerIndividuals = beneficialOwnerIndividuals
            }

        /**
         * Only present when user_type == "BUSINESS".
         *
         * An individual with significant responsibility for managing the legal entity (e.g., a
         * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer,
         *
         * Managing Member, General Partner, President, Vice President, or Treasurer). This can be
         * an executive, or someone who will have program-wide access
         *
         * to the cards that Lithic will provide. In some cases, this individual could also be a
         * beneficial owner listed above.
         */
        fun controlPerson(controlPerson: Individual) = controlPerson(JsonField.of(controlPerson))

        /**
         * Only present when user_type == "BUSINESS".
         *
         * An individual with significant responsibility for managing the legal entity (e.g., a
         * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer,
         *
         * Managing Member, General Partner, President, Vice President, or Treasurer). This can be
         * an executive, or someone who will have program-wide access
         *
         * to the cards that Lithic will provide. In some cases, this individual could also be a
         * beneficial owner listed above.
         */
        @JsonProperty("control_person")
        @ExcludeMissing
        fun controlPerson(controlPerson: JsonField<Individual>) = apply {
            this.controlPerson = controlPerson
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

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

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
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * <Deprecated. Use verification_application.status instead>
         *
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun statusReasons(statusReasons: List<StatusReasons>) =
            statusReasons(JsonField.of(statusReasons))

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
            this.statusReasons = statusReasons
        }

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

        fun build(): AccountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse(
                token,
                accountToken,
                businessAccountToken,
                created,
                exemptionType,
                externalId,
                userType,
                verificationApplication,
                individual,
                businessEntity,
                beneficialOwnerEntities.map { it.toImmutable() },
                beneficialOwnerIndividuals.map { it.toImmutable() },
                controlPerson,
                natureOfBusiness,
                websiteUrl,
                email,
                phoneNumber,
                status,
                statusReasons.map { it.toImmutable() },
                requiredDocuments.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = KybBusinessEntity.Builder::class)
    @NoAutoDetect
    class KybBusinessEntity
    private constructor(
        private val address: JsonField<Address2>,
        private val dbaBusinessName: JsonField<String>,
        private val governmentId: JsonField<String>,
        private val legalBusinessName: JsonField<String>,
        private val parentCompany: JsonField<String>,
        private val phoneNumbers: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(): Address2 = address.getRequired("address")

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(): String? = dbaBusinessName.getNullable("dba_business_name")

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

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): KybBusinessEntity = apply {
            if (!validated) {
                address().validate()
                dbaBusinessName()
                governmentId()
                legalBusinessName()
                parentCompany()
                phoneNumbers()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address2> = JsonMissing.of()
            private var dbaBusinessName: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var legalBusinessName: JsonField<String> = JsonMissing.of()
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(kybBusinessEntity: KybBusinessEntity) = apply {
                this.address = kybBusinessEntity.address
                this.dbaBusinessName = kybBusinessEntity.dbaBusinessName
                this.governmentId = kybBusinessEntity.governmentId
                this.legalBusinessName = kybBusinessEntity.legalBusinessName
                this.parentCompany = kybBusinessEntity.parentCompany
                this.phoneNumbers = kybBusinessEntity.phoneNumbers
                additionalProperties(kybBusinessEntity.additionalProperties)
            }

            /**
             * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            fun address(address: Address2) = address(JsonField.of(address))

            /**
             * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address2>) = apply { this.address = address }

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

            fun build(): KybBusinessEntity =
                KybBusinessEntity(
                    address,
                    dbaBusinessName,
                    governmentId,
                    legalBusinessName,
                    parentCompany,
                    phoneNumbers.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @JsonDeserialize(builder = Address2.Builder::class)
        @NoAutoDetect
        class Address2
        private constructor(
            private val address1: JsonField<String>,
            private val address2: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Valid deliverable address (no PO boxes). */
            fun address1(): String = address1.getRequired("address1")

            /** Unit or apartment number (if applicable). */
            fun address2(): String? = address2.getNullable("address2")

            /** Name of city. */
            fun city(): String = city.getRequired("city")

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            fun country(): String = country.getRequired("country")

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(): String = state.getRequired("state")

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

            /** Name of city. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            @JsonProperty("country") @ExcludeMissing fun _country() = country

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address2 = apply {
                if (!validated) {
                    address1()
                    address2()
                    city()
                    country()
                    postalCode()
                    state()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var address1: JsonField<String> = JsonMissing.of()
                private var address2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(address2: Address2) = apply {
                    this.address1 = address2.address1
                    this.address2 = address2.address2
                    this.city = address2.city
                    this.country = address2.country
                    this.postalCode = address2.postalCode
                    this.state = address2.state
                    additionalProperties(address2.additionalProperties)
                }

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: String) = address1(JsonField.of(address1))

                /** Valid deliverable address (no PO boxes). */
                @JsonProperty("address1")
                @ExcludeMissing
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Unit or apartment number (if applicable). */
                fun address2(address2: String) = address2(JsonField.of(address2))

                /** Unit or apartment number (if applicable). */
                @JsonProperty("address2")
                @ExcludeMissing
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                /** Name of city. */
                fun city(city: String) = city(JsonField.of(city))

                /** Name of city. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                @JsonProperty("country")
                @ExcludeMissing
                fun country(country: JsonField<String>) = apply { this.country = country }

                /**
                 * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                 * five-digit ZIP or nine-digit ZIP+4.
                 */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                 * five-digit ZIP or nine-digit ZIP+4.
                 */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address2 =
                    Address2(
                        address1,
                        address2,
                        city,
                        country,
                        postalCode,
                        state,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address2 && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address2{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is KybBusinessEntity && address == other.address && dbaBusinessName == other.dbaBusinessName && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && parentCompany == other.parentCompany && phoneNumbers == other.phoneNumbers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dbaBusinessName, governmentId, legalBusinessName, parentCompany, phoneNumbers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KybBusinessEntity{address=$address, dbaBusinessName=$dbaBusinessName, governmentId=$governmentId, legalBusinessName=$legalBusinessName, parentCompany=$parentCompany, phoneNumbers=$phoneNumbers, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Individual.Builder::class)
    @NoAutoDetect
    class Individual
    private constructor(
        private val address: JsonField<Address2>,
        private val dob: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val governmentId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        fun address(): Address2? = address.getNullable("address")

        /** Individual's date of birth, as an RFC 3339 date. */
        fun dob(): String? = dob.getNullable("dob")

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        fun email(): String? = email.getNullable("email")

        /** Individual's first name, as it appears on government-issued identity documents. */
        fun firstName(): String? = firstName.getNullable("first_name")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String? = lastName.getNullable("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        fun governmentId(): String? = governmentId.getNullable("government_id")

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id") @ExcludeMissing fun _governmentId() = governmentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Individual = apply {
            if (!validated) {
                address()?.validate()
                dob()
                email()
                firstName()
                lastName()
                phoneNumber()
                governmentId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address2> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(individual: Individual) = apply {
                this.address = individual.address
                this.dob = individual.dob
                this.email = individual.email
                this.firstName = individual.firstName
                this.lastName = individual.lastName
                this.phoneNumber = individual.phoneNumber
                this.governmentId = individual.governmentId
                additionalProperties(individual.additionalProperties)
            }

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            fun address(address: Address2) = address(JsonField.of(address))

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address2>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
            @JsonProperty("dob")
            @ExcludeMissing
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
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

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            @JsonProperty("government_id")
            @ExcludeMissing
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
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

            fun build(): Individual =
                Individual(
                    address,
                    dob,
                    email,
                    firstName,
                    lastName,
                    phoneNumber,
                    governmentId,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonDeserialize(builder = Address2.Builder::class)
        @NoAutoDetect
        class Address2
        private constructor(
            private val address1: JsonField<String>,
            private val address2: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Valid deliverable address (no PO boxes). */
            fun address1(): String = address1.getRequired("address1")

            /** Unit or apartment number (if applicable). */
            fun address2(): String? = address2.getNullable("address2")

            /** Name of city. */
            fun city(): String = city.getRequired("city")

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            fun country(): String = country.getRequired("country")

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(): String = state.getRequired("state")

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

            /** Name of city. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            @JsonProperty("country") @ExcludeMissing fun _country() = country

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state") @ExcludeMissing fun _state() = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Address2 = apply {
                if (!validated) {
                    address1()
                    address2()
                    city()
                    country()
                    postalCode()
                    state()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var address1: JsonField<String> = JsonMissing.of()
                private var address2: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(address2: Address2) = apply {
                    this.address1 = address2.address1
                    this.address2 = address2.address2
                    this.city = address2.city
                    this.country = address2.country
                    this.postalCode = address2.postalCode
                    this.state = address2.state
                    additionalProperties(address2.additionalProperties)
                }

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: String) = address1(JsonField.of(address1))

                /** Valid deliverable address (no PO boxes). */
                @JsonProperty("address1")
                @ExcludeMissing
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Unit or apartment number (if applicable). */
                fun address2(address2: String) = address2(JsonField.of(address2))

                /** Unit or apartment number (if applicable). */
                @JsonProperty("address2")
                @ExcludeMissing
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                /** Name of city. */
                fun city(city: String) = city(JsonField.of(city))

                /** Name of city. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Valid country code. Only USA is currently supported, entered in uppercase ISO
                 * 3166-1 alpha-3 three-character format.
                 */
                @JsonProperty("country")
                @ExcludeMissing
                fun country(country: JsonField<String>) = apply { this.country = country }

                /**
                 * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                 * five-digit ZIP or nine-digit ZIP+4.
                 */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                 * five-digit ZIP or nine-digit ZIP+4.
                 */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Valid state code. Only USA state codes are currently supported, entered in
                 * uppercase ISO 3166-2 two-character format.
                 */
                @JsonProperty("state")
                @ExcludeMissing
                fun state(state: JsonField<String>) = apply { this.state = state }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Address2 =
                    Address2(
                        address1,
                        address2,
                        city,
                        country,
                        postalCode,
                        state,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address2 && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, postalCode, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address2{address1=$address1, address2=$address2, city=$city, country=$country, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Individual && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && lastName == other.lastName && phoneNumber == other.phoneNumber && governmentId == other.governmentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, firstName, lastName, phoneNumber, governmentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, governmentId=$governmentId, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is ExemptionType && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

            val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

            val REJECTED = Status(JsonField.of("REJECTED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StatusReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ADDRESS_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("ADDRESS_VERIFICATION_FAILURE"))

            val AGE_THRESHOLD_FAILURE = StatusReasons(JsonField.of("AGE_THRESHOLD_FAILURE"))

            val COMPLETE_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("COMPLETE_VERIFICATION_FAILURE"))

            val DOB_VERIFICATION_FAILURE = StatusReasons(JsonField.of("DOB_VERIFICATION_FAILURE"))

            val ID_VERIFICATION_FAILURE = StatusReasons(JsonField.of("ID_VERIFICATION_FAILURE"))

            val MAX_DOCUMENT_ATTEMPTS = StatusReasons(JsonField.of("MAX_DOCUMENT_ATTEMPTS"))

            val MAX_RESUBMISSION_ATTEMPTS = StatusReasons(JsonField.of("MAX_RESUBMISSION_ATTEMPTS"))

            val NAME_VERIFICATION_FAILURE = StatusReasons(JsonField.of("NAME_VERIFICATION_FAILURE"))

            val OTHER_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("OTHER_VERIFICATION_FAILURE"))

            val RISK_THRESHOLD_FAILURE = StatusReasons(JsonField.of("RISK_THRESHOLD_FAILURE"))

            val WATCHLIST_ALERT_FAILURE = StatusReasons(JsonField.of("WATCHLIST_ALERT_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED"))

            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE"))

            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED"))

            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE"))

            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                StatusReasons(JsonField.of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE"))

            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("CONTROL_PERSON_ID_VERIFICATION_FAILURE"))

            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE"))

            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                StatusReasons(JsonField.of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE"))

            fun of(value: String) = StatusReasons(JsonField.of(value))
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
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
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
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
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
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
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
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReasons: $value")
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

            return /* spotless:off */ other is UserType && value == other.value /* spotless:on */
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
    @JsonDeserialize(builder = VerificationApplication.Builder::class)
    @NoAutoDetect
    class VerificationApplication
    private constructor(
        private val created: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val statusReasons: JsonField<List<StatusReasons>>,
        private val updated: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Timestamp of when the application was created. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        fun status(): Status = status.getRequired("status")

        /** Reason for the evaluation status. */
        fun statusReasons(): List<StatusReasons> = statusReasons.getRequired("status_reasons")

        /** Timestamp of when the application was last updated. */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /** Timestamp of when the application was created. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Reason for the evaluation status. */
        @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

        /** Timestamp of when the application was last updated. */
        @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): VerificationApplication = apply {
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
            private var statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of()
            private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(verificationApplication: VerificationApplication) = apply {
                this.created = verificationApplication.created
                this.status = verificationApplication.status
                this.statusReasons = verificationApplication.statusReasons
                this.updated = verificationApplication.updated
                additionalProperties(verificationApplication.additionalProperties)
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
             * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the
             * `ADVANCED` workflow.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * KYC and KYB evaluation states.
             *
             * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the
             * `ADVANCED` workflow.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: List<StatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reason for the evaluation status. */
            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
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

            fun build(): VerificationApplication =
                VerificationApplication(
                    created,
                    status,
                    statusReasons.map { it.toImmutable() },
                    updated,
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCEPTED = Status(JsonField.of("ACCEPTED"))

                val PENDING_DOCUMENT = Status(JsonField.of("PENDING_DOCUMENT"))

                val PENDING_RESUBMIT = Status(JsonField.of("PENDING_RESUBMIT"))

                val REJECTED = Status(JsonField.of("REJECTED"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
            }

            enum class Value {
                ACCEPTED,
                PENDING_DOCUMENT,
                PENDING_RESUBMIT,
                REJECTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                    REJECTED -> Value.REJECTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                    PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                    REJECTED -> Known.REJECTED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class StatusReasons
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ADDRESS_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("ADDRESS_VERIFICATION_FAILURE"))

                val AGE_THRESHOLD_FAILURE = StatusReasons(JsonField.of("AGE_THRESHOLD_FAILURE"))

                val COMPLETE_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("COMPLETE_VERIFICATION_FAILURE"))

                val DOB_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("DOB_VERIFICATION_FAILURE"))

                val ID_VERIFICATION_FAILURE = StatusReasons(JsonField.of("ID_VERIFICATION_FAILURE"))

                val MAX_DOCUMENT_ATTEMPTS = StatusReasons(JsonField.of("MAX_DOCUMENT_ATTEMPTS"))

                val MAX_RESUBMISSION_ATTEMPTS =
                    StatusReasons(JsonField.of("MAX_RESUBMISSION_ATTEMPTS"))

                val NAME_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("NAME_VERIFICATION_FAILURE"))

                val OTHER_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("OTHER_VERIFICATION_FAILURE"))

                val RISK_THRESHOLD_FAILURE = StatusReasons(JsonField.of("RISK_THRESHOLD_FAILURE"))

                val WATCHLIST_ALERT_FAILURE = StatusReasons(JsonField.of("WATCHLIST_ALERT_FAILURE"))

                val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE"))

                val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                    StatusReasons(
                        JsonField.of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")
                    )

                val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE"))

                val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                    StatusReasons(
                        JsonField.of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")
                    )

                val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE"))

                val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED"))

                val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE"))

                val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE"))

                val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                    StatusReasons(JsonField.of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE"))

                val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                    StatusReasons(JsonField.of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE"))

                val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("CONTROL_PERSON_ID_VERIFICATION_FAILURE"))

                val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE"))

                val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                    StatusReasons(JsonField.of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE"))

                fun of(value: String) = StatusReasons(JsonField.of(value))
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
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
                CONTROL_PERSON_ID_VERIFICATION_FAILURE,
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
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
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
                CONTROL_PERSON_ID_VERIFICATION_FAILURE,
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
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
                    PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                        Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                        Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                    PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                        Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                    PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                    PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                        Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                    CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                        Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                    CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                    CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                    CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                        Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
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
                    PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                    PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                        Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                        Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                    PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                        Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                    PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                    PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                    PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                        Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                    CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                        Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                    CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                    CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                    CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                        Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                    else -> throw LithicInvalidDataException("Unknown StatusReasons: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationApplication && created == other.created && status == other.status && statusReasons == other.statusReasons && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(created, status, statusReasons, updated, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationApplication{created=$created, status=$status, statusReasons=$statusReasons, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewResponse && token == other.token && accountToken == other.accountToken && businessAccountToken == other.businessAccountToken && created == other.created && exemptionType == other.exemptionType && externalId == other.externalId && userType == other.userType && verificationApplication == other.verificationApplication && individual == other.individual && businessEntity == other.businessEntity && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && controlPerson == other.controlPerson && natureOfBusiness == other.natureOfBusiness && websiteUrl == other.websiteUrl && email == other.email && phoneNumber == other.phoneNumber && status == other.status && statusReasons == other.statusReasons && requiredDocuments == other.requiredDocuments && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, businessAccountToken, created, exemptionType, externalId, userType, verificationApplication, individual, businessEntity, beneficialOwnerEntities, beneficialOwnerIndividuals, controlPerson, natureOfBusiness, websiteUrl, email, phoneNumber, status, statusReasons, requiredDocuments, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderSimulateEnrollmentReviewResponse{token=$token, accountToken=$accountToken, businessAccountToken=$businessAccountToken, created=$created, exemptionType=$exemptionType, externalId=$externalId, userType=$userType, verificationApplication=$verificationApplication, individual=$individual, businessEntity=$businessEntity, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, controlPerson=$controlPerson, natureOfBusiness=$natureOfBusiness, websiteUrl=$websiteUrl, email=$email, phoneNumber=$phoneNumber, status=$status, statusReasons=$statusReasons, requiredDocuments=$requiredDocuments, additionalProperties=$additionalProperties}"
}
