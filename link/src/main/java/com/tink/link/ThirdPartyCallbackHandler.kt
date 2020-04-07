package com.tink.link

import android.net.Uri
import android.net.UrlQuerySanitizer
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration
import javax.inject.Inject

@TinkLinkScope
internal class ThirdPartyCallbackHandler @Inject constructor(
    private val credentialsRepository: CredentialsRepository,
    tinkConfiguration: TinkConfiguration
) {
    private val applicationRedirectUri = tinkConfiguration.redirectUri

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
                        credentialsRepository.thirdPartyCallback(
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