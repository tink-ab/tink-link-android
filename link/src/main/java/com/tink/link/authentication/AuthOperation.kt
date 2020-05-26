package com.tink.link.authentication

import android.app.Activity
import com.tink.core.Tink
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.getUserContext
import com.tink.model.authentication.ThirdPartyAppAuthentication
import com.tink.model.misc.Field
import com.tink.service.handler.ResultHandler

sealed class AuthOperation(
    internal val credentialsId: String
) {
    class SupplementalInformation(
        val fields: List<Field>,
        internal val credentialsRepository: CredentialsRepository,
        credentialsId: String
    ) : AuthOperation(credentialsId) {

        fun submit(fields: Map<String, String>) {
            Tink.getUserContext()!!.credentialsRepository.supplementInformation()
        }

        fun cancel() {
            Tink.getUserContext()!!.credentialsRepository.cancelSupplementalInformation(credentialsId)
        }

    }

    class ThirdPartyAuthentication(
        val thirdPartyAppAuthentication: ThirdPartyAppAuthentication,
        credentialsId: String
    ) :
        AuthOperation(
            credentialsId
        ) {

        fun launch(
            activity: Activity,
            onAppNotInstalled: () -> Unit,
            onAppNeedsUpgrade: () -> Unit
        ) {
            //TODO
        }
    }
}
