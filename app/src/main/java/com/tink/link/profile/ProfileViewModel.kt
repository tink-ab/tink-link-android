package com.tink.link.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.core.Tink
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.link.credentials.CredentialsFragment
import com.tink.link.getUserContext
import com.tink.model.credentials.Credentials
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import org.threeten.bp.Instant
import org.threeten.bp.ZoneId
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle
import java.util.Locale

class ProfileViewModel : ViewModel() {

    private val providerStream = MutableLiveData<List<Provider>>()
    private val credentialsStream = MutableLiveData<List<Credentials>>()

    private val credentialsRepository: CredentialsRepository

    private var credentialsSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }

    init {
        val userContext = requireNotNull(Tink.getUserContext())

        credentialsRepository = userContext.credentialsRepository
        val providerRepository = userContext.providerRepository

        credentialsSubscription =
            credentialsRepository.listStream().subscribe(object : StreamObserver<List<Credentials>> {
                override fun onNext(value: List<Credentials>) {
                    credentialsStream.postValue(value)
                }
            })

        providerRepository.listProviders(
            ResultHandler(
                onSuccess = { providerStream.postValue(it) },
                onError = { /*handle error */ }
            ),
            includeDemoProviders = true
        )
    }

    private val _connections = MediatorLiveData<List<Connection>>().apply {
        fun update() {
            val credentials = credentialsStream.value ?: return
            val providers = providerStream.value ?: return

            value = credentials.map {

                val provider = providers.find { provider -> provider.name == it.providerName }

                Connection(
                    id = it.id,
                    providerName = provider?.displayName ?: "",
                    lastUpdated = it.updated.format(),
                    iconUri = provider?.images?.icon
                )
            }
        }

        addSource(credentialsStream) { update() }
        addSource(providerStream) { update() }
    }

    val connections: LiveData<List<Connection>> = _connections

    val providers: LiveData<List<Provider>> = providerStream

    override fun onCleared() {
        super.onCleared()
        credentialsSubscription?.unsubscribe()
    }

    fun deleteCredentials(id: String, completed: () -> Unit) =
        credentialsRepository.delete(id, ResultHandler({ completed() }, { completed() }))

    fun getUpdateDataForCredentials(credentialsId: String): CredentialsUpdateData? {

        val credentials = credentialsStream.value?.find { it.id == credentialsId } ?: return null
        val provider = providers.value?.find { it.name == credentials.providerName } ?: return null

        return CredentialsUpdateData(
            provider,
            credentials.fields
        )
    }

    fun getProviderForCredentials(credentialsId: String): Provider? {
        val credentials = credentialsStream.value?.find { it.id == credentialsId } ?: return null
        return providers.value?.find { it.name == credentials.providerName }
    }

    fun authenticateCredentials(id: String, completed: () -> Unit) {
        credentialsRepository.authenticate(id, ResultHandler({ completed() }, { completed() }))
    }
}

data class Connection(
    val id: String,
    val providerName: String,
    val lastUpdated: String,
    val iconUri: String?
)

data class CredentialsUpdateData(
    val provider: Provider,
    val currentValues: Map<String, String>
)

private fun Instant.format(): String =
    DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.MEDIUM)
        .withLocale(Locale.getDefault())
        .withZone(ZoneId.systemDefault())
        .format(this)
