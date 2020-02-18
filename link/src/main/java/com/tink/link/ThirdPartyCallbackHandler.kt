package com.tink.link

import android.net.Uri
import android.net.UrlQuerySanitizer
import com.tink.link.core.credentials.CredentialRepository
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration
import javax.inject.Inject
import javax.inject.Singleton

@TinkLinkScope
internal class ThirdPartyCallbackHandler @Inject constructor(
    private val credentialRepository: CredentialRepository,
    tinkLinkConfiguration: TinkConfiguration
) {
    private val applicationRedirectUri = tinkLinkConfiguration.redirectUri

    fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>? = null) =
        uri
            .takeIf { it.matches(applicationRedirectUri) }
            ?.let { callbackUri ->
                UrlQuerySanitizer(callbackUri.toString())
                    .apply { allowUnregisteredParamaters = true }
                    .parameterList
                    .let { parameterList ->
                        val state =
                            parameterList.firstOrNull { it.mParameter == "state" }?.mValue ?: ""
                        val parameters =
                            parameterList
                                .asSequence()
                                .filterNot { it.mParameter == "state" }
                                .mapNotNull { it.mParameter to it.mValue }
                                .toMap()
                        credentialRepository.thirdPartyCallback(
                            state = state,
                            parameters = parameters,
                            handler = resultHandler ?: ResultHandler({}, {})
                        )
                        true
                    }
            }
            ?: false
}

private fun Uri.matches(uri: Uri) = toString().startsWith(uri.toString())