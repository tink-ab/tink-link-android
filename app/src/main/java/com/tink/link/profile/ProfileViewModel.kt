package com.tink.link.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.link.TinkLink
import com.tink.link.core.credentials.CredentialRepository
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.streaming.publisher.StreamObserver
import com.tink.link.service.streaming.publisher.StreamSubscription
import org.threeten.bp.Instant
import org.threeten.bp.ZoneId
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle
import java.util.Locale

class ProfileViewModel : ViewModel() {

    private val providerStream = MutableLiveData<List<Provider>>()
    private val credentialsStream = MutableLiveData<List<Credential>>()

    private lateinit var credentialRepository: CredentialRepository

    private var credentialsSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }

    fun initialize(tinkLink: TinkLink) {

        credentialRepository = tinkLink.getUserContext()!!.credentialRepository
        val providerRepository = tinkLink.getUserContext()!!.providerRepository

        credentialsSubscription =
            credentialRepository.listStream().subscribe(object : StreamObserver<List<Credential>> {
                override fun onNext(value: List<Credential>) {
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
                Connection(
                    id = it.id,
                    providerName = providers.find { provider -> provider.name == it.providerName }?.displayName
                        ?: "",
                    lastUpdated = it.updated.format()
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

    fun deleteCredential(id: String, completed: () -> Unit) =
        credentialRepository.delete(id, ResultHandler({ completed() }, { completed() }))

    fun getUpdateDataForCredential(credentialId: String): CredentialUpdateData? {

        val credential = credentialsStream.value?.find { it.id == credentialId } ?: return null
        val provider = providers.value?.find { it.name == credential.providerName } ?: return null

        return CredentialUpdateData(
            provider,
            credential.fields
        )
    }
}

data class Connection(
    val id: String,
    val providerName: String,
    val lastUpdated: String
)

data class CredentialUpdateData(
    val provider: Provider,
    val currentValues: Map<String, String>
)

private fun Instant.format(): String =
    DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.MEDIUM)
        .withLocale(Locale.getDefault())
        .withZone(ZoneId.systemDefault())
        .format(this)
