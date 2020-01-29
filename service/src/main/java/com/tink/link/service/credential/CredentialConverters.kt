package com.tink.link.service.credential

import com.tink.link.model.authentication.ThirdPartyAppAuthentication
import com.tink.link.model.credential.Credential
import com.tink.link.service.misc.toField
import com.tink.link.service.misc.toInstant
import se.tink.grpc.v1.rpc.CreateCredentialRequest
import se.tink.grpc.v1.rpc.UpdateCredentialRequest

internal typealias CredentialDTO = se.tink.grpc.v1.models.Credential
internal typealias CredentialTypeDTO = se.tink.grpc.v1.models.Credential.Type
internal typealias CredentialStatusDTO = se.tink.grpc.v1.models.Credential.Status
internal typealias ThirdPartyAppAuthenticationDTO = se.tink.grpc.v1.models.ThirdPartyAppAuthentication
internal typealias ThirdPartyAppAuthenticationAndroidDTO = se.tink.grpc.v1.models.ThirdPartyAppAuthentication.Android

internal fun CredentialDTO.toCredential() =
    Credential(
        providerName = providerName,
        type = type.toCredentialType(),
        id = id,
        updated = updated.toInstant(),
        statusUpdated = statusUpdated.toInstant(),
        status = status.toCredentialStatus(),
        statusPayload = statusPayload,
        fields = fieldsMap,
        supplementalInformation = supplementalInformationFieldsList.map { it.toField() },
        sessionExpiryDate = sessionExpiryDate
            .takeIf { hasSessionExpiryDate() }
            ?.toInstant(),
        thirdPartyAppAuthentication = thirdPartyAppAuthentication
            .takeIf { hasThirdPartyAppAuthentication() }
            ?.toThirdPartyAppAuthentication()
    )

internal fun CredentialTypeDTO.toCredentialType() =
    when (this) {
        CredentialTypeDTO.UNRECOGNIZED,
        CredentialTypeDTO.TYPE_UNKNOWN -> Credential.Type.UNKNOWN
        CredentialTypeDTO.TYPE_PASSWORD -> Credential.Type.PASSWORD
        CredentialTypeDTO.TYPE_MOBILE_BANKID -> Credential.Type.MOBILE_BANKID
        CredentialTypeDTO.TYPE_KEYFOB -> Credential.Type.KEYFOB
        CredentialTypeDTO.TYPE_FRAUD -> Credential.Type.FRAUD
        CredentialTypeDTO.TYPE_THIRD_PARTY_AUTHENTICATION -> Credential.Type.THIRD_PARTY_AUTHENTICATION
    }

internal fun CredentialStatusDTO.toCredentialStatus() =
    when (this) {
        CredentialStatusDTO.UNRECOGNIZED,
        CredentialStatusDTO.STATUS_UNKNOWN -> Credential.Status.UNKNOWN
        CredentialStatusDTO.STATUS_CREATED -> Credential.Status.CREATED
        CredentialStatusDTO.STATUS_AUTHENTICATING -> Credential.Status.AUTHENTICATING
        CredentialStatusDTO.STATUS_UPDATING -> Credential.Status.UPDATING
        CredentialStatusDTO.STATUS_UPDATED -> Credential.Status.UPDATED
        CredentialStatusDTO.STATUS_TEMPORARY_ERROR -> Credential.Status.TEMPORARY_ERROR
        CredentialStatusDTO.STATUS_AUTHENTICATION_ERROR -> Credential.Status.AUTHENTICATION_ERROR
        CredentialStatusDTO.STATUS_PERMANENT_ERROR -> Credential.Status.PERMANENT_ERROR
        CredentialStatusDTO.STATUS_AWAITING_MOBILE_BANKID_AUTHENTICATION -> Credential.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION
        CredentialStatusDTO.STATUS_AWAITING_SUPPLEMENTAL_INFORMATION -> Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION
        CredentialStatusDTO.STATUS_DISABLED -> Credential.Status.DISABLED
        CredentialStatusDTO.STATUS_AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> Credential.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION
        CredentialStatusDTO.STATUS_SESSION_EXPIRED -> Credential.Status.SESSION_EXPIRED
    }

internal fun ThirdPartyAppAuthenticationDTO.toThirdPartyAppAuthentication() =
    ThirdPartyAppAuthentication(
        downloadTitle = downloadTitle,
        downloadMessage = downloadMessage,
        upgradeTitle = upgradeTitle,
        upgradeMessage = upgradeMessage,
        android = android.toThirdPartyAndroid()
    )


internal fun ThirdPartyAppAuthenticationAndroidDTO.toThirdPartyAndroid() =
    ThirdPartyAppAuthentication.Android(
        intent = intent,
        packageName = packageName,
        requiredMinimumVersion = requiredMinimumVersion
    )

internal fun CredentialCreationDescriptor.toRequest() =
    CreateCredentialRequest
        .newBuilder()
        .setProviderName(providerName)
        .setType(type.toDTO())
        .putAllFields(fields)
        .setAppUri(appUri.toString())
        .build()

internal fun CredentialUpdateDescriptor.toRequest() =
    UpdateCredentialRequest
        .newBuilder()
        .setCredentialId(id)
        .putAllFields(fields)
        .setAppUri(appUri.toString())
        .build()

internal fun Credential.Type.toDTO() =
    when (this) {
        Credential.Type.UNKNOWN -> CredentialTypeDTO.TYPE_UNKNOWN
        Credential.Type.PASSWORD -> CredentialTypeDTO.TYPE_PASSWORD
        Credential.Type.MOBILE_BANKID -> CredentialTypeDTO.TYPE_MOBILE_BANKID
        Credential.Type.KEYFOB -> CredentialTypeDTO.TYPE_KEYFOB
        Credential.Type.FRAUD -> CredentialTypeDTO.TYPE_FRAUD
        Credential.Type.THIRD_PARTY_AUTHENTICATION -> CredentialTypeDTO.TYPE_THIRD_PARTY_AUTHENTICATION
    }