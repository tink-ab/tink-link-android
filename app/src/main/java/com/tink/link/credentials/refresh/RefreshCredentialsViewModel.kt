package com.tink.link.credentials.refresh

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.link.Event
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.core.provider.ProviderRepository
import com.tink.link.model.credential.Credential
import com.tink.link.model.misc.Field
import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.streaming.publisher.StreamObserver
import com.tink.link.service.streaming.publisher.StreamSubscription
import com.tink.link.whenNonNull
import timber.log.Timber

class RefreshCredentialsViewModel : ViewModel() {

    private val _credentials =
        MutableLiveData<List<Credential>>()
    val credentials: LiveData<List<Credential>> = _credentials

    private var credentialsSubscription: StreamSubscription? = null

    private lateinit var credentialRepository: CredentialRepository

    private val providers = MutableLiveData<List<Provider>>()

    fun initialize(
        credentialRepository: CredentialRepository,
        providerRepository: ProviderRepository
    ) {
        this.credentialRepository = credentialRepository
        credentialsSubscription =
            credentialRepository.listStream().subscribe(object :
                StreamObserver<List<Credential>> {
                override fun onNext(value: List<Credential>) {
                    _credentials.postValue(value)
                }
            })

        providerRepository.listProviders(
            ResultHandler({
                providers.postValue(it)
            }, {
                // Error
            })
        )
    }

    fun refreshAll() {
        credentials.value?.map { it.id }?.let {
            credentialRepository.refresh(
                it,
                ResultHandler({
                    Timber.d("Refresh success")
                }, {
                    Timber.d("Refresh error")
                })
            )
        }
    }

    fun sendSupplementalInformation(credentialId: String, fields: List<Field>) {
        credentialRepository.supplementInformation(
            credentialId,
            fields.associate { it.name to it.value },
            ResultHandler({}, {})
        )
    }

    fun cancelSupplementalInformation(credentialId: String) {
        credentialRepository.cancelSupplementalInformation(
            credentialId,
            ResultHandler({}, {})
        )
    }

    private val currentlyRefreshing: LiveData<Credential?> =
        Transformations.map(credentials) { list ->
            list.filterNot { getRefreshState(it.status) == CredentialRefreshState.DONE }
                .sortedBy { it.id }
                .firstOrNull()
        }

    private val currentlyRefreshingWithDistinctStatus = MediatorLiveData<Credential?>()
        .apply {
            addSource(currentlyRefreshing) {
                whenNonNull(value, it) { old, new ->
                    if (old.id != new.id || old.status != new.status || old.statusUpdated < new.statusUpdated) {
                        value = new
                    }
                } ?: if (value != it) { //one of both is null, set value
                    value = it
                }
            }
        }

    val infoRequiredEvent: LiveData<Event<Credential>> =
        Transformations.map(currentlyRefreshingWithDistinctStatus) { credential ->
            credential
                ?.takeIf { getRefreshState(it.status) == CredentialRefreshState.INFO_REQUIRED }
                ?.let { Event(it) }
        }

    val refreshInfo: LiveData<List<RefreshModel>> = MediatorLiveData<List<RefreshModel>>().apply {
        fun update() {
            value = credentials.value?.map {
                RefreshModel(
                    label = providers.value
                        ?.find { provider -> provider.name == it.providerName }
                        ?.displayName
                        ?: "",
                    status = it.status?.toString() ?: "",
                    id = it.id,
                    state = getRefreshState(it.status)
                )
            }

        }
        addSource(credentials) { update() }
        addSource(providers) { update() }
    }

    private fun getRefreshState(credentialStatus: Credential.Status?) = when (credentialStatus) {
        Credential.Status.CREATED,
        Credential.Status.AUTHENTICATING -> CredentialRefreshState.LOADING
        Credential.Status.UPDATING,
        Credential.Status.UPDATED,
        Credential.Status.TEMPORARY_ERROR,
        Credential.Status.AUTHENTICATION_ERROR,
        Credential.Status.PERMANENT_ERROR -> CredentialRefreshState.DONE
        Credential.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
        Credential.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
        Credential.Status.AWAITING_SUPPLEMENTAL_INFORMATION -> CredentialRefreshState.INFO_REQUIRED
        Credential.Status.SESSION_EXPIRED -> TODO()
        Credential.Status.DISABLED -> TODO()
        Credential.Status.UNKNOWN -> TODO()
        null -> TODO()
    }

    override fun onCleared() {
        super.onCleared()
        credentialsSubscription?.unsubscribe()
    }
}

enum class CredentialRefreshState { LOADING, DONE, INFO_REQUIRED }

data class RefreshModel(
    val label: String,
    val status: String,
    val id: String,
    val state: CredentialRefreshState
)
