package com.tink.link.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tink.link.TinkLink
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.streaming.publisher.StreamObserver
import com.tink.link.service.streaming.publisher.StreamSubscription

class ProfileViewModel : ViewModel() {

    private val providerStream = MutableLiveData<List<Provider>>()
    private val credentialsStream = MutableLiveData<List<Credential>>()

    private var credentialsSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }


    fun initialize(tinkLink: TinkLink) {

        val credentialRepository = tinkLink.getUserContext()!!.credentialRepository
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
                    status = it.statusPayload ?: ""
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
}

data class Connection(
    val id: String,
    val providerName: String,
    val status: String
)
