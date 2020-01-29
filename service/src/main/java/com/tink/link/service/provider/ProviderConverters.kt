package com.tink.link.service.provider

import com.tink.link.model.misc.Field
import com.tink.link.model.provider.Provider
import com.tink.link.service.credential.toCredentialType
import com.tink.link.service.misc.toField
import com.tink.link.service.misc.toImages

internal typealias ProviderDTO = se.tink.grpc.v1.models.Provider
internal typealias ProviderStatusDTO = se.tink.grpc.v1.models.Provider.Status
internal typealias ProviderTypeDTO = se.tink.grpc.v1.models.Provider.Type
internal typealias ProviderAccessTypeDTO = se.tink.grpc.v1.models.Provider.AccessType

internal fun ProviderDTO.toProvider(): Provider =
    Provider(
        name = name,
        displayName = displayName,
        type = type.toProviderType(),
        status = status.toProviderStatus(),
        credentialType = credentialType.toCredentialType(),
        helpText = helpText,
        isPopular = popular,
        fields = fieldsOrEmpty(),
        groupDisplayName = groupDisplayName,
        displayDescription = displayDescription,
        images = images?.toImages(),
        financialInstitution = Provider.FinancialInstitution(
            financialInstitutionId,
            financialInstitutionName
        ),
        accessType = this.accessType.toAccessType()
    )

internal fun ProviderStatusDTO.toProviderStatus(): Provider.Status =
    when (this) {
        ProviderStatusDTO.UNRECOGNIZED,
        ProviderStatusDTO.STATUS_UNKNOWN -> Provider.Status.UNKNOWN
        ProviderStatusDTO.STATUS_DISABLED -> Provider.Status.DISABLED
        ProviderStatusDTO.STATUS_ENABLED -> Provider.Status.ENABLED
        ProviderStatusDTO.STATUS_OBSOLETE -> Provider.Status.OBSOLETE
        ProviderStatusDTO.STATUS_TEMPORARY_DISABLED -> Provider.Status.TEMPORARY_DISABLED
    }


internal fun ProviderTypeDTO.toProviderType(): Provider.Type =
    when (this) {
        ProviderTypeDTO.UNRECOGNIZED,
        ProviderTypeDTO.TYPE_UNKNOWN -> Provider.Type.UNKNOWN
        ProviderTypeDTO.TYPE_BANK -> Provider.Type.BANK
        ProviderTypeDTO.TYPE_BROKER -> Provider.Type.BROKER
        ProviderTypeDTO.TYPE_CREDIT_CARD -> Provider.Type.CREDIT_CARD
        ProviderTypeDTO.TYPE_FRAUD -> Provider.Type.FRAUD
        ProviderTypeDTO.TYPE_OTHER -> Provider.Type.OTHER
        ProviderTypeDTO.TYPE_TEST -> Provider.Type.TEST
    }

internal fun ProviderDTO.fieldsOrEmpty(): List<Field> =
    fieldsList?.map { it.toField() }.orEmpty()

internal fun ProviderAccessTypeDTO.toAccessType(): Provider.AccessType =
    when (this) {
        ProviderAccessTypeDTO.ACCESS_TYPE_OPEN_BANKING -> Provider.AccessType.OPEN_BANKING
        else -> Provider.AccessType.OTHER
    }