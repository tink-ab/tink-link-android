package com.tink.link.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tink.core.Tink
import com.tink.core.provider.ProviderRepository
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.core.user.UserContext
import com.tink.link.getUserContext
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import kotlinx.coroutines.launch

internal class MainViewModel : ViewModel() {

    private val userContext: UserContext by lazy { requireNotNull(Tink.getUserContext()) }
    private val credentialsRepository: CredentialsRepository by lazy { userContext.credentialsRepository }
    private val providerRepository: ProviderRepository by lazy { userContext.providerRepository }

    fun setCredentialsId(
        credentialsId: String,
        onSuccess: (CredentialsToProvider) -> Unit,
        onError: (TinkLinkError) -> Unit
    ) {
        viewModelScope.launch {
            credentialsRepository.getCredentials(
                credentialsId,
                ResultHandler(
                    { credentials ->
                        providerRepository.getProvider(
                            credentials.providerName,
                            ResultHandler(
                                { provider ->
                                    if (provider != null) {
                                        onSuccess(CredentialsToProvider(credentials, provider))
                                    } else {
                                        onError(TinkLinkError.ProviderNotFound(credentials.providerName))
                                    }
                                },
                                {
                                    onError(TinkLinkError.ProviderNotFound(credentials.providerName))
                                }
                            )
                        )
                    },
                    {
                        onError(TinkLinkError.CredentialsNotFound(credentialsId))
                    }
                )
            )
        }
    }
}

internal data class CredentialsToProvider(
    val credentials: Credentials,
    val provider: Provider
)
