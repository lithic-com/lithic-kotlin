// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AccountHolderSimulateEnrollmentReviewResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    private val beneficialOwnerEntities: JsonField<List<KybBusinessEntity>> = JsonMissing.of(),
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    private val beneficialOwnerIndividuals: JsonField<List<Individual>> = JsonMissing.of(),
    @JsonProperty("business_account_token")
    @ExcludeMissing
    private val businessAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_entity")
    @ExcludeMissing
    private val businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of(),
    @JsonProperty("control_person")
    @ExcludeMissing
    private val controlPerson: JsonField<Individual> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("exemption_type")
    @ExcludeMissing
    private val exemptionType: JsonField<ExemptionType> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual")
    @ExcludeMissing
    private val individual: JsonField<Individual> = JsonMissing.of(),
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    private val natureOfBusiness: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("required_documents")
    @ExcludeMissing
    private val requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("status_reasons")
    @ExcludeMissing
    private val statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of(),
    @JsonProperty("user_type")
    @ExcludeMissing
    private val userType: JsonField<UserType> = JsonMissing.of(),
    @JsonProperty("verification_application")
    @ExcludeMissing
    private val verificationApplication: JsonField<VerificationApplication> = JsonMissing.of(),
    @JsonProperty("website_url")
    @ExcludeMissing
    private val websiteUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account holder. */
    fun token(): String? = token.getNullable("token")

    /** Globally unique identifier for the account. */
    fun accountToken(): String? = accountToken.getNullable("account_token")

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
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    fun businessAccountToken(): String? = businessAccountToken.getNullable("business_account_token")

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    fun businessEntity(): KybBusinessEntity? = businessEntity.getNullable("business_entity")

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

    /** Timestamp of when the account holder was created. */
    fun created(): OffsetDateTime? = created.getNullable("created")

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    fun email(): String? = email.getNullable("email")

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
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    fun individual(): Individual? = individual.getNullable("individual")

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    fun natureOfBusiness(): String? = natureOfBusiness.getNullable("nature_of_business")

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    fun requiredDocuments(): List<RequiredDocument>? =
        requiredDocuments.getNullable("required_documents")

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

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    fun websiteUrl(): String? = websiteUrl.getNullable("website_url")

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_entities")
    @ExcludeMissing
    fun _beneficialOwnerEntities(): JsonField<List<KybBusinessEntity>> = beneficialOwnerEntities

    /**
     * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in the
     * company.
     */
    @JsonProperty("beneficial_owner_individuals")
    @ExcludeMissing
    fun _beneficialOwnerIndividuals(): JsonField<List<Individual>> = beneficialOwnerIndividuals

    /**
     * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
     * businesses. Pass the account_token of the enrolled business associated with the
     * AUTHORIZED_USER in this field.
     */
    @JsonProperty("business_account_token")
    @ExcludeMissing
    fun _businessAccountToken(): JsonField<String> = businessAccountToken

    /**
     * Only present when user_type == "BUSINESS". Information about the business for which the
     * account is being opened and KYB is being run.
     */
    @JsonProperty("business_entity")
    @ExcludeMissing
    fun _businessEntity(): JsonField<KybBusinessEntity> = businessEntity

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
    @JsonProperty("control_person")
    @ExcludeMissing
    fun _controlPerson(): JsonField<Individual> = controlPerson

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * < Deprecated. Use control_person.email when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary email of Account Holder.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder is
     * not KYC-Exempt.
     */
    @JsonProperty("exemption_type")
    @ExcludeMissing
    fun _exemptionType(): JsonField<ExemptionType> = exemptionType

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Only present when user_type == "INDIVIDUAL". Information about the individual for which the
     * account is being opened and KYC is being run.
     */
    @JsonProperty("individual")
    @ExcludeMissing
    fun _individual(): JsonField<Individual> = individual

    /** Only present when user_type == "BUSINESS". User-submitted description of the business. */
    @JsonProperty("nature_of_business")
    @ExcludeMissing
    fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

    /**
     * < Deprecated. Use control_person.phone_number when user_type == "BUSINESS". Use
     * individual.phone_number when user_type == "INDIVIDUAL".
     * > Primary phone of Account Holder, entered in E.164 format.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required for
     * the account holder to be approved.
     */
    @JsonProperty("required_documents")
    @ExcludeMissing
    fun _requiredDocuments(): JsonField<List<RequiredDocument>> = requiredDocuments

    /**
     * <Deprecated. Use verification_application.status instead>
     *
     * KYC and KYB evaluation states.
     *
     * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
     * workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation status.
     */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<StatusReasons>> = statusReasons

    /**
     * The type of Account Holder. If the type is "INDIVIDUAL", the "individual" attribute will be
     * present.
     *
     * If the type is "BUSINESS" then the "business_entity", "control_person",
     * "beneficial_owner_individuals", "beneficial_owner_entities",
     *
     * "nature_of_business", and "website_url" attributes will be present.
     */
    @JsonProperty("user_type") @ExcludeMissing fun _userType(): JsonField<UserType> = userType

    /** Information about the most recent identity verification attempt */
    @JsonProperty("verification_application")
    @ExcludeMissing
    fun _verificationApplication(): JsonField<VerificationApplication> = verificationApplication

    /** Only present when user_type == "BUSINESS". Business's primary website. */
    @JsonProperty("website_url") @ExcludeMissing fun _websiteUrl(): JsonField<String> = websiteUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountHolderSimulateEnrollmentReviewResponse = apply {
        if (validated) {
            return@apply
        }

        token()
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
        requiredDocuments()?.forEach { it.validate() }
        status()
        statusReasons()
        userType()
        verificationApplication()?.validate()
        websiteUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var beneficialOwnerEntities: JsonField<MutableList<KybBusinessEntity>>? = null
        private var beneficialOwnerIndividuals: JsonField<MutableList<Individual>>? = null
        private var businessAccountToken: JsonField<String> = JsonMissing.of()
        private var businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of()
        private var controlPerson: JsonField<Individual> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var exemptionType: JsonField<ExemptionType> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var individual: JsonField<Individual> = JsonMissing.of()
        private var natureOfBusiness: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var requiredDocuments: JsonField<MutableList<RequiredDocument>>? = null
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusReasons: JsonField<MutableList<StatusReasons>>? = null
        private var userType: JsonField<UserType> = JsonMissing.of()
        private var verificationApplication: JsonField<VerificationApplication> = JsonMissing.of()
        private var websiteUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            accountHolderSimulateEnrollmentReviewResponse:
                AccountHolderSimulateEnrollmentReviewResponse
        ) = apply {
            token = accountHolderSimulateEnrollmentReviewResponse.token
            accountToken = accountHolderSimulateEnrollmentReviewResponse.accountToken
            beneficialOwnerEntities =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerEntities.map {
                    it.toMutableList()
                }
            beneficialOwnerIndividuals =
                accountHolderSimulateEnrollmentReviewResponse.beneficialOwnerIndividuals.map {
                    it.toMutableList()
                }
            businessAccountToken =
                accountHolderSimulateEnrollmentReviewResponse.businessAccountToken
            businessEntity = accountHolderSimulateEnrollmentReviewResponse.businessEntity
            controlPerson = accountHolderSimulateEnrollmentReviewResponse.controlPerson
            created = accountHolderSimulateEnrollmentReviewResponse.created
            email = accountHolderSimulateEnrollmentReviewResponse.email
            exemptionType = accountHolderSimulateEnrollmentReviewResponse.exemptionType
            externalId = accountHolderSimulateEnrollmentReviewResponse.externalId
            individual = accountHolderSimulateEnrollmentReviewResponse.individual
            natureOfBusiness = accountHolderSimulateEnrollmentReviewResponse.natureOfBusiness
            phoneNumber = accountHolderSimulateEnrollmentReviewResponse.phoneNumber
            requiredDocuments =
                accountHolderSimulateEnrollmentReviewResponse.requiredDocuments.map {
                    it.toMutableList()
                }
            status = accountHolderSimulateEnrollmentReviewResponse.status
            statusReasons =
                accountHolderSimulateEnrollmentReviewResponse.statusReasons.map {
                    it.toMutableList()
                }
            userType = accountHolderSimulateEnrollmentReviewResponse.userType
            verificationApplication =
                accountHolderSimulateEnrollmentReviewResponse.verificationApplication
            websiteUrl = accountHolderSimulateEnrollmentReviewResponse.websiteUrl
            additionalProperties =
                accountHolderSimulateEnrollmentReviewResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
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
        fun beneficialOwnerEntities(beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>) =
            apply {
                this.beneficialOwnerEntities = beneficialOwnerEntities.map { it.toMutableList() }
            }

        /**
         * Only present when user_type == "BUSINESS". List of all entities with >25% ownership in
         * the company.
         */
        fun addBeneficialOwnerEntity(beneficialOwnerEntity: KybBusinessEntity) = apply {
            beneficialOwnerEntities =
                (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(beneficialOwnerEntity)
                }
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
        fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: JsonField<List<Individual>>) =
            apply {
                this.beneficialOwnerIndividuals =
                    beneficialOwnerIndividuals.map { it.toMutableList() }
            }

        /**
         * Only present when user_type == "BUSINESS". List of all individuals with >25% ownership in
         * the company.
         */
        fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: Individual) = apply {
            beneficialOwnerIndividuals =
                (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(beneficialOwnerIndividual)
                }
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
        fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
            this.businessAccountToken = businessAccountToken
        }

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
        fun businessEntity(businessEntity: JsonField<KybBusinessEntity>) = apply {
            this.businessEntity = businessEntity
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
        fun controlPerson(controlPerson: JsonField<Individual>) = apply {
            this.controlPerson = controlPerson
        }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
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
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder
         * is not KYC-Exempt.
         */
        fun exemptionType(exemptionType: ExemptionType) = exemptionType(JsonField.of(exemptionType))

        /**
         * The type of KYC exemption for a KYC-Exempt Account Holder. "None" if the account holder
         * is not KYC-Exempt.
         */
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
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /**
         * Only present when user_type == "INDIVIDUAL". Information about the individual for which
         * the account is being opened and KYC is being run.
         */
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
        fun natureOfBusiness(natureOfBusiness: String) =
            natureOfBusiness(JsonField.of(natureOfBusiness))

        /**
         * Only present when user_type == "BUSINESS". User-submitted description of the business.
         */
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
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments.map { it.toMutableList() }
        }

        /**
         * Only present for "KYB_BASIC" and "KYC_ADVANCED" workflows. A list of documents required
         * for the account holder to be approved.
         */
        fun addRequiredDocument(requiredDocument: RequiredDocument) = apply {
            requiredDocuments =
                (requiredDocuments ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(requiredDocument)
                }
        }

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
        fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /**
         * <Deprecated. Use verification_application.status_reasons> Reason for the evaluation
         * status.
         */
        fun addStatusReason(statusReason: StatusReasons) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(statusReason)
                }
        }

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
        fun userType(userType: JsonField<UserType>) = apply { this.userType = userType }

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: VerificationApplication) =
            verificationApplication(JsonField.of(verificationApplication))

        /** Information about the most recent identity verification attempt */
        fun verificationApplication(verificationApplication: JsonField<VerificationApplication>) =
            apply {
                this.verificationApplication = verificationApplication
            }

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

        /** Only present when user_type == "BUSINESS". Business's primary website. */
        fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): AccountHolderSimulateEnrollmentReviewResponse =
            AccountHolderSimulateEnrollmentReviewResponse(
                token,
                accountToken,
                (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
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
                (requiredDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                userType,
                verificationApplication,
                websiteUrl,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class KybBusinessEntity
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address2> = JsonMissing.of(),
        @JsonProperty("government_id")
        @ExcludeMissing
        private val governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        private val legalBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        private val dbaBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_company")
        @ExcludeMissing
        private val parentCompany: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        fun address(): Address2 = address.getRequired("address")

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /** Legal (formal) business name. */
        fun legalBusinessName(): String = legalBusinessName.getRequired("legal_business_name")

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        fun dbaBusinessName(): String? = dbaBusinessName.getNullable("dba_business_name")

        /** Parent company name (if applicable). */
        fun parentCompany(): String? = parentCompany.getNullable("parent_company")

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address2> = address

        /**
         * Government-issued identification number. US Federal Employer Identification Numbers (EIN)
         * are currently supported, entered as full nine-digits, with or without hyphens.
         */
        @JsonProperty("government_id")
        @ExcludeMissing
        fun _governmentId(): JsonField<String> = governmentId

        /** Legal (formal) business name. */
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        fun _legalBusinessName(): JsonField<String> = legalBusinessName

        /** One or more of the business's phone number(s), entered as a list in E.164 format. */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

        /**
         * Any name that the business operates under that is not its legal business name (if
         * applicable).
         */
        @JsonProperty("dba_business_name")
        @ExcludeMissing
        fun _dbaBusinessName(): JsonField<String> = dbaBusinessName

        /** Parent company name (if applicable). */
        @JsonProperty("parent_company")
        @ExcludeMissing
        fun _parentCompany(): JsonField<String> = parentCompany

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KybBusinessEntity = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            governmentId()
            legalBusinessName()
            phoneNumbers()
            dbaBusinessName()
            parentCompany()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address2>? = null
            private var governmentId: JsonField<String>? = null
            private var legalBusinessName: JsonField<String>? = null
            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var dbaBusinessName: JsonField<String> = JsonMissing.of()
            private var parentCompany: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(kybBusinessEntity: KybBusinessEntity) = apply {
                address = kybBusinessEntity.address
                governmentId = kybBusinessEntity.governmentId
                legalBusinessName = kybBusinessEntity.legalBusinessName
                phoneNumbers = kybBusinessEntity.phoneNumbers.map { it.toMutableList() }
                dbaBusinessName = kybBusinessEntity.dbaBusinessName
                parentCompany = kybBusinessEntity.parentCompany
                additionalProperties = kybBusinessEntity.additionalProperties.toMutableMap()
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
            fun address(address: JsonField<Address2>) = apply { this.address = address }

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number. US Federal Employer Identification Numbers
             * (EIN) are currently supported, entered as full nine-digits, with or without hyphens.
             */
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Legal (formal) business name. */
            fun legalBusinessName(legalBusinessName: String) =
                legalBusinessName(JsonField.of(legalBusinessName))

            /** Legal (formal) business name. */
            fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                this.legalBusinessName = legalBusinessName
            }

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /** One or more of the business's phone number(s), entered as a list in E.164 format. */
            fun addPhoneNumber(phoneNumber: String) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(phoneNumber)
                    }
            }

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
            fun dbaBusinessName(dbaBusinessName: JsonField<String>) = apply {
                this.dbaBusinessName = dbaBusinessName
            }

            /** Parent company name (if applicable). */
            fun parentCompany(parentCompany: String) = parentCompany(JsonField.of(parentCompany))

            /** Parent company name (if applicable). */
            fun parentCompany(parentCompany: JsonField<String>) = apply {
                this.parentCompany = parentCompany
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): KybBusinessEntity =
                KybBusinessEntity(
                    checkNotNull(address) { "`address` is required but was not set" },
                    checkNotNull(governmentId) { "`governmentId` is required but was not set" },
                    checkNotNull(legalBusinessName) {
                        "`legalBusinessName` is required but was not set"
                    },
                    checkNotNull(phoneNumbers) { "`phoneNumbers` is required but was not set" }
                        .map { it.toImmutable() },
                    dbaBusinessName,
                    parentCompany,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Business''s physical address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable.
         */
        @NoAutoDetect
        class Address2
        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            private val address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2")
            @ExcludeMissing
            private val address2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Valid deliverable address (no PO boxes). */
            fun address1(): String = address1.getRequired("address1")

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

            /** Unit or apartment number (if applicable). */
            fun address2(): String? = address2.getNullable("address2")

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

            /** Name of city. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Address2 = apply {
                if (validated) {
                    return@apply
                }

                address1()
                city()
                country()
                postalCode()
                state()
                address2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var address1: JsonField<String>? = null
                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var address2: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(address2: Address2) = apply {
                    address1 = address2.address1
                    city = address2.city
                    country = address2.country
                    postalCode = address2.postalCode
                    state = address2.state
                    this.address2 = address2.address2
                    additionalProperties = address2.additionalProperties.toMutableMap()
                }

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: String) = address1(JsonField.of(address1))

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Name of city. */
                fun city(city: String) = city(JsonField.of(city))

                /** Name of city. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** Unit or apartment number (if applicable). */
                fun address2(address2: String) = address2(JsonField.of(address2))

                /** Unit or apartment number (if applicable). */
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Address2 =
                    Address2(
                        checkNotNull(address1) { "`address1` is required but was not set" },
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(country) { "`country` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        address2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address2 && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address2{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is KybBusinessEntity && address == other.address && governmentId == other.governmentId && legalBusinessName == other.legalBusinessName && phoneNumbers == other.phoneNumbers && dbaBusinessName == other.dbaBusinessName && parentCompany == other.parentCompany && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, governmentId, legalBusinessName, phoneNumbers, dbaBusinessName, parentCompany, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KybBusinessEntity{address=$address, governmentId=$governmentId, legalBusinessName=$legalBusinessName, phoneNumbers=$phoneNumbers, dbaBusinessName=$dbaBusinessName, parentCompany=$parentCompany, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Individual
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address2> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("government_id")
        @ExcludeMissing
        private val governmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        fun governmentId(): String? = governmentId.getNullable("government_id")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String? = lastName.getNullable("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address2> = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id")
        @ExcludeMissing
        fun _governmentId(): JsonField<String> = governmentId

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            address()?.validate()
            dob()
            email()
            firstName()
            governmentId()
            lastName()
            phoneNumber()
            validated = true
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
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(individual: Individual) = apply {
                address = individual.address
                dob = individual.dob
                email = individual.email
                firstName = individual.firstName
                governmentId = individual.governmentId
                lastName = individual.lastName
                phoneNumber = individual.phoneNumber
                additionalProperties = individual.additionalProperties.toMutableMap()
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
            fun address(address: JsonField<Address2>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
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
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

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
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Individual =
                Individual(
                    address,
                    dob,
                    email,
                    firstName,
                    governmentId,
                    lastName,
                    phoneNumber,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @NoAutoDetect
        class Address2
        @JsonCreator
        private constructor(
            @JsonProperty("address1")
            @ExcludeMissing
            private val address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address2")
            @ExcludeMissing
            private val address2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Valid deliverable address (no PO boxes). */
            fun address1(): String = address1.getRequired("address1")

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

            /** Unit or apartment number (if applicable). */
            fun address2(): String? = address2.getNullable("address2")

            /** Valid deliverable address (no PO boxes). */
            @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

            /** Name of city. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Valid country code. Only USA is currently supported, entered in uppercase ISO 3166-1
             * alpha-3 three-character format.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Valid postal code. Only USA ZIP codes are currently supported, entered as a
             * five-digit ZIP or nine-digit ZIP+4.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** Unit or apartment number (if applicable). */
            @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Address2 = apply {
                if (validated) {
                    return@apply
                }

                address1()
                city()
                country()
                postalCode()
                state()
                address2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var address1: JsonField<String>? = null
                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var address2: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(address2: Address2) = apply {
                    address1 = address2.address1
                    city = address2.city
                    country = address2.country
                    postalCode = address2.postalCode
                    state = address2.state
                    this.address2 = address2.address2
                    additionalProperties = address2.additionalProperties.toMutableMap()
                }

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: String) = address1(JsonField.of(address1))

                /** Valid deliverable address (no PO boxes). */
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Name of city. */
                fun city(city: String) = city(JsonField.of(city))

                /** Name of city. */
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
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** Unit or apartment number (if applicable). */
                fun address2(address2: String) = address2(JsonField.of(address2))

                /** Unit or apartment number (if applicable). */
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Address2 =
                    Address2(
                        checkNotNull(address1) { "`address1` is required but was not set" },
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(country) { "`country` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        address2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address2 && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address2{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Individual && address == other.address && dob == other.dob && email == other.email && firstName == other.firstName && governmentId == other.governmentId && lastName == other.lastName && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dob, email, firstName, governmentId, lastName, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    class ExemptionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUTHORIZED_USER = of("AUTHORIZED_USER")

            val PREPAID_CARD_USER = of("PREPAID_CARD_USER")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExemptionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACCEPTED = of("ACCEPTED")

            val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

            val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

            val REJECTED = of("REJECTED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class StatusReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ADDRESS_VERIFICATION_FAILURE = of("ADDRESS_VERIFICATION_FAILURE")

            val AGE_THRESHOLD_FAILURE = of("AGE_THRESHOLD_FAILURE")

            val COMPLETE_VERIFICATION_FAILURE = of("COMPLETE_VERIFICATION_FAILURE")

            val DOB_VERIFICATION_FAILURE = of("DOB_VERIFICATION_FAILURE")

            val ID_VERIFICATION_FAILURE = of("ID_VERIFICATION_FAILURE")

            val MAX_DOCUMENT_ATTEMPTS = of("MAX_DOCUMENT_ATTEMPTS")

            val MAX_RESUBMISSION_ATTEMPTS = of("MAX_RESUBMISSION_ATTEMPTS")

            val NAME_VERIFICATION_FAILURE = of("NAME_VERIFICATION_FAILURE")

            val OTHER_VERIFICATION_FAILURE = of("OTHER_VERIFICATION_FAILURE")

            val RISK_THRESHOLD_FAILURE = of("RISK_THRESHOLD_FAILURE")

            val WATCHLIST_ALERT_FAILURE = of("WATCHLIST_ALERT_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE = of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class UserType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BUSINESS = of("BUSINESS")

            val INDIVIDUAL = of("INDIVIDUAL")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UserType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Information about the most recent identity verification attempt */
    @NoAutoDetect
    class VerificationApplication
    @JsonCreator
    private constructor(
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("status_reasons")
        @ExcludeMissing
        private val statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * KYC and KYB evaluation states.
         *
         * Note: `PENDING_RESUBMIT` and `PENDING_DOCUMENT` are only applicable for the `ADVANCED`
         * workflow.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** Reason for the evaluation status. */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<StatusReasons>> = statusReasons

        /** Timestamp of when the application was last updated. */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VerificationApplication = apply {
            if (validated) {
                return@apply
            }

            created()
            status()
            statusReasons()
            updated()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var created: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var statusReasons: JsonField<MutableList<StatusReasons>>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(verificationApplication: VerificationApplication) = apply {
                created = verificationApplication.created
                status = verificationApplication.status
                statusReasons = verificationApplication.statusReasons.map { it.toMutableList() }
                updated = verificationApplication.updated
                additionalProperties = verificationApplication.additionalProperties.toMutableMap()
            }

            /** Timestamp of when the application was created. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Timestamp of when the application was created. */
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
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: List<StatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reason for the evaluation status. */
            fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /** Reason for the evaluation status. */
            fun addStatusReason(statusReason: StatusReasons) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(statusReason)
                    }
            }

            /** Timestamp of when the application was last updated. */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /** Timestamp of when the application was last updated. */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): VerificationApplication =
                VerificationApplication(
                    checkNotNull(created) { "`created` is required but was not set" },
                    checkNotNull(status) { "`status` is required but was not set" },
                    checkNotNull(statusReasons) { "`statusReasons` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(updated) { "`updated` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCEPTED = of("ACCEPTED")

                val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

                val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

                val REJECTED = of("REJECTED")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StatusReasons
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ADDRESS_VERIFICATION_FAILURE = of("ADDRESS_VERIFICATION_FAILURE")

                val AGE_THRESHOLD_FAILURE = of("AGE_THRESHOLD_FAILURE")

                val COMPLETE_VERIFICATION_FAILURE = of("COMPLETE_VERIFICATION_FAILURE")

                val DOB_VERIFICATION_FAILURE = of("DOB_VERIFICATION_FAILURE")

                val ID_VERIFICATION_FAILURE = of("ID_VERIFICATION_FAILURE")

                val MAX_DOCUMENT_ATTEMPTS = of("MAX_DOCUMENT_ATTEMPTS")

                val MAX_RESUBMISSION_ATTEMPTS = of("MAX_RESUBMISSION_ATTEMPTS")

                val NAME_VERIFICATION_FAILURE = of("NAME_VERIFICATION_FAILURE")

                val OTHER_VERIFICATION_FAILURE = of("OTHER_VERIFICATION_FAILURE")

                val RISK_THRESHOLD_FAILURE = of("RISK_THRESHOLD_FAILURE")

                val WATCHLIST_ALERT_FAILURE = of("WATCHLIST_ALERT_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                    of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

                val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                    of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

                val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                    of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

                val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

                val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                    of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

                val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                    of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

                val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

                val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

                val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                    of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewResponse && token == other.token && accountToken == other.accountToken && beneficialOwnerEntities == other.beneficialOwnerEntities && beneficialOwnerIndividuals == other.beneficialOwnerIndividuals && businessAccountToken == other.businessAccountToken && businessEntity == other.businessEntity && controlPerson == other.controlPerson && created == other.created && email == other.email && exemptionType == other.exemptionType && externalId == other.externalId && individual == other.individual && natureOfBusiness == other.natureOfBusiness && phoneNumber == other.phoneNumber && requiredDocuments == other.requiredDocuments && status == other.status && statusReasons == other.statusReasons && userType == other.userType && verificationApplication == other.verificationApplication && websiteUrl == other.websiteUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, beneficialOwnerEntities, beneficialOwnerIndividuals, businessAccountToken, businessEntity, controlPerson, created, email, exemptionType, externalId, individual, natureOfBusiness, phoneNumber, requiredDocuments, status, statusReasons, userType, verificationApplication, websiteUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderSimulateEnrollmentReviewResponse{token=$token, accountToken=$accountToken, beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessAccountToken=$businessAccountToken, businessEntity=$businessEntity, controlPerson=$controlPerson, created=$created, email=$email, exemptionType=$exemptionType, externalId=$externalId, individual=$individual, natureOfBusiness=$natureOfBusiness, phoneNumber=$phoneNumber, requiredDocuments=$requiredDocuments, status=$status, statusReasons=$statusReasons, userType=$userType, verificationApplication=$verificationApplication, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
}
