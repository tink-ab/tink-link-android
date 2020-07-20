package com.tink.link.ui.credentials.refresh

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.getUserContext
import com.tink.link.ui.Event
import com.tink.link.ui.whenNonNull
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Field
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import org.threeten.bp.Instant
import timber.log.Timber

class RefreshCredentialsViewModel : ViewModel() {

    private val credentials = MutableLiveData<List<Credentials>>()
    private val providers = MutableLiveData<List<Provider>>()

    private var credentialsSubscription: StreamSubscription? = null

    private val credentialsRepository: CredentialsRepository

    private val credentialsStatusMap = mutableMapOf<String, CredentialsStatusModel>()

    private val updateQueue = LinkedHashMap<String, Credentials>()

    init {
        val userContext = requireNotNull(Tink.getUserContext())

        credentialsRepository = userContext.credentialsRepository
        val providerRepository = userContext.providerRepository

        credentialsSubscription =
            credentialsRepository.listStream().subscribe(object :
                    StreamObserver<List<Credentials>> {
                    override fun onNext(value: List<Credentials>) {
                        credentialsListUpdate(value)
                        credentials.postValue(value)
                    }
                })

        providerRepository.listProviders(
            ResultHandler(
                {
                    providers.postValue(it)
                },
                {
                    // Error
                }
            )
        )
    }

    // Check if any status in the list has changed
    private fun credentialsListUpdate(credentials: List<Credentials>) {
        for (newCredentials in credentials) {

            val newStatusModel = newCredentials.toStatusModel()

            val oldStatusDescription = credentialsStatusMap[newCredentials.id]
            if (oldStatusDescription == null || oldStatusDescription.isNewStatus(newStatusModel)) {
                credentialsStatusMap[newCredentials.id] = newStatusModel // Update map
                onCredentialsStatusUpdate(newCredentials) // Update queue as necessary
                currentlyRefreshing.postValue(
                    updateQueue.asIterable().firstOrNull()?.value // Post first value of the queue as current credentials
                )
            }
        }
    }

    private fun onCredentialsStatusUpdate(credentials: Credentials) {

        when (getRefreshState(credentials.status)) {

            // Status is done or error. Nothing to do anymore for the user, remove from queue
            CredentialsRefreshState.DONE -> updateQueue.remove(credentials.id)

            // Status changed to an active state. Add to queue or update if already in
            CredentialsRefreshState.LOADING,
            CredentialsRefreshState.INFO_REQUIRED -> updateQueue[credentials.id] = credentials
        }
    }

    private val currentlyRefreshing: MutableLiveData<Credentials?> = MutableLiveData()

    // A live data which will only update its value if the status of the
    // credentials held has changed or if it's a completely new credentials
    private val currentlyRefreshingWithDistinctStatus = MediatorLiveData<Credentials?>()
        .apply {
            addSource(currentlyRefreshing) {
                whenNonNull(value, it) { old, new ->
                    if (old.id != new.id || old.toStatusModel().isNewStatus(new.toStatusModel())) {
                        value = new
                    }
                } ?: if (value != it) { // one of both is null, set value
                    value = it
                }
            }
        }

    val infoRequiredEvent: LiveData<Event<Credentials>> =
        Transformations.map(currentlyRefreshingWithDistinctStatus) { credentials ->
            credentials
                ?.takeIf { getRefreshState(it.status) == CredentialsRefreshState.INFO_REQUIRED }
                ?.let { Event(it) }
        }

    fun refreshAll() {
        credentials.value?.map { it.id }?.let {
            credentialsRepository.refresh(
                it[0], // TODO: Update this when refresh functionality is implemented
                ResultHandler(
                    {
                        Timber.d("Refresh success")
                    },
                    {
                        Timber.d("Refresh error")
                    }
                )
            )
        }
    }

    fun sendSupplementalInformation(credentialsId: String, fields: List<Field>) {
        credentialsRepository.supplementInformation(
            credentialsId,
            fields.associate { it.name to it.value },
            ResultHandler({}, {})
        )
    }

    fun cancelSupplementalInformation(credentialsId: String) {
        credentialsRepository.cancelSupplementalInformation(
            credentialsId,
            ResultHandler({}, {})
        )
    }

    val refreshInfo: LiveData<List<RefreshModel>> = MediatorLiveData<List<RefreshModel>>().apply {
        fun update() {
            value = credentials.value?.map {

                val provider = providers.value?.find { provider ->
                    provider.name == it.providerName
                }

                RefreshModel(
                    label = provider?.displayName ?: "",
                    status = it.status?.toString() ?: "",
                    id = it.id,
                    state = getRefreshState(it.status),
                    iconUri = provider?.images?.icon
                )
            }
        }
        addSource(credentials) { update() }
        addSource(providers) { update() }
    }

    private fun getRefreshState(credentialsStatus: Credentials.Status?) = when (credentialsStatus) {
        Credentials.Status.CREATED,
        Credentials.Status.AUTHENTICATING -> CredentialsRefreshState.LOADING
        Credentials.Status.UPDATING,
        Credentials.Status.UPDATED,
        Credentials.Status.TEMPORARY_ERROR,
        Credentials.Status.AUTHENTICATION_ERROR,
        Credentials.Status.PERMANENT_ERROR -> CredentialsRefreshState.DONE
        Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
        Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
        Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION -> CredentialsRefreshState.INFO_REQUIRED
        Credentials.Status.SESSION_EXPIRED,
        Credentials.Status.DISABLED,
        Credentials.Status.UNKNOWN,
        Credentials.Status.DELETED,
        null -> CredentialsRefreshState.DONE // Status handling not implemented, ignore
    }

    override fun onCleared() {
        super.onCleared()
        credentialsSubscription?.unsubscribe()
    }
}

private data class CredentialsStatusModel(
    val status: Credentials.Status?,
    val statusUpdated: Instant
)

enum class CredentialsRefreshState { LOADING, DONE, INFO_REQUIRED }

data class RefreshModel(
    val label: String,
    val status: String,
    val id: String,
    val state: CredentialsRefreshState,
    val iconUri: String?
)

private fun Credentials.toStatusModel() = CredentialsStatusModel(status, statusUpdated)

private fun CredentialsStatusModel.isNewStatus(other: CredentialsStatusModel) =
    status != other.status || statusUpdated < other.statusUpdated
