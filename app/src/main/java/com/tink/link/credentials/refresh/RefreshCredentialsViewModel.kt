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
import org.threeten.bp.Instant
import timber.log.Timber

class RefreshCredentialsViewModel : ViewModel() {

    private val credentials = MutableLiveData<List<Credential>>()
    private val providers = MutableLiveData<List<Provider>>()

    private var credentialsSubscription: StreamSubscription? = null

    private lateinit var credentialRepository: CredentialRepository

    private val credentialStatusMap = mutableMapOf<String, CredentialStatusModel>()

    private val updateQueue = LinkedHashMap<String, Credential>()

    fun initialize(
        credentialRepository: CredentialRepository,
        providerRepository: ProviderRepository
    ) {
        this.credentialRepository = credentialRepository
        credentialsSubscription =
            credentialRepository.listStream().subscribe(object :
                StreamObserver<List<Credential>> {
                override fun onNext(value: List<Credential>) {
                    credentialListUpdate(value)
                    credentials.postValue(value)
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

    // Check if any status in the list has changed
    private fun credentialListUpdate(credentials: List<Credential>) {
        for (newCredential in credentials) {

            val newStatusModel = newCredential.toStatusModel()

            val oldStatusDescription = credentialStatusMap[newCredential.id]
            if (oldStatusDescription == null || oldStatusDescription.isNewStatus(newStatusModel)) {
                credentialStatusMap[newCredential.id] = newStatusModel // Update map
                onCredentialStatusUpdate(newCredential) // Update queue as necessary
                currentlyRefreshing.postValue(
                    updateQueue.asIterable().firstOrNull()?.value // Post first value of the queue as current credential
                )
            }
        }
    }

    private fun onCredentialStatusUpdate(credential: Credential) {

        when (getRefreshState(credential.status)) {

            // Status is done or error. Nothing to do anymore for the user, remove from queue
            CredentialRefreshState.DONE -> updateQueue.remove(credential.id)

            // Status changed to an active state. Add to queue or update if already in
            CredentialRefreshState.LOADING,
            CredentialRefreshState.INFO_REQUIRED -> updateQueue[credential.id] = credential
        }
    }

    private val currentlyRefreshing: MutableLiveData<Credential?> = MutableLiveData()

    // A live data which will only update its value if the status of the
    // credential held has changed or if it's a completely new credential
    private val currentlyRefreshingWithDistinctStatus = MediatorLiveData<Credential?>()
        .apply {
            addSource(currentlyRefreshing) {
                whenNonNull(value, it) { old, new ->
                    if (old.id != new.id || old.toStatusModel().isNewStatus(new.toStatusModel())) {
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
        Credential.Status.SESSION_EXPIRED,
        Credential.Status.DISABLED,
        Credential.Status.UNKNOWN,
        null -> CredentialRefreshState.DONE // Status handling not implemented, ignore
    }

    override fun onCleared() {
        super.onCleared()
        credentialsSubscription?.unsubscribe()
    }
}

private data class CredentialStatusModel(
    val status: Credential.Status?,
    val statusUpdated: Instant
)

enum class CredentialRefreshState { LOADING, DONE, INFO_REQUIRED }

data class RefreshModel(
    val label: String,
    val status: String,
    val id: String,
    val state: CredentialRefreshState
)

private fun Credential.toStatusModel() = CredentialStatusModel(status, statusUpdated)

private fun CredentialStatusModel.isNewStatus(other: CredentialStatusModel) =
    status != other.status || statusUpdated < other.statusUpdated
