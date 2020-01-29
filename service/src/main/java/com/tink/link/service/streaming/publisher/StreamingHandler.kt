package com.tink.link.service.streaming.publisher

import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject
import com.tink.link.model.account.Account
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.Provider
import com.tink.link.service.streaming.StreamingEvent
import kotlin.properties.Delegates
import kotlin.reflect.KMutableProperty0

interface StreamingHandler {
    val providersStream: Observable<List<Provider>>
    val accountsStream: Observable<List<Account>>
    val credentialsStream: Observable<List<Credential>>

    fun subscribeForProviders(onNext: (List<Provider>) -> Unit): StreamSubscription
    fun subscribeForCredentials(onNext: (List<Credential>) -> Unit): StreamSubscription
    fun subscribeForAccounts(onNext: (List<Account>) -> Unit): StreamSubscription

    fun onNext(value: StreamingEvent)
}

class StreamingHandlerImpl: StreamingHandler {

    private var providers: List<Provider> by Delegates.observable(emptyList()) { _, old, new ->
        if (old != new) {
            _providersStream.onNext(new)
        }
    }

    private var accounts: List<Account> by Delegates.observable(emptyList()) { _, old, new ->
        if (old != new) {
            _accountsStream.onNext(new)
        }
    }

    private var credentials: List<Credential> by Delegates.observable(emptyList()) { _, old, new ->
        if (old != new) {
            _credentialsStream.onNext(new)
        }
    }

    private fun updateProvidersFromEvent(event: StreamingEvent.ProviderEvent) {
        updateListFromEvent(
            currentList = ::providers,
            eventList = event.providers,
            eventType = event.type,
            distinctKeySelector = { it.name }
        )
    }

    private fun updateAccountsFromEvent(event: StreamingEvent.AccountEvent) {
        updateListFromEvent(
            currentList = ::accounts,
            eventList = event.accounts,
            eventType = event.type,
            distinctKeySelector = { it.id }
        )
    }

    private fun updateCredentialsFromEvent(event: StreamingEvent.CredentialEvent) {
        updateListFromEvent(
            currentList = ::credentials,
            eventList = event.credentials,
            eventType = event.type,
            distinctKeySelector = { it.id }
        )
    }

    private fun <T, K> updateListFromEvent(
        currentList: KMutableProperty0<List<T>>,
        eventList: List<T>,
        eventType: StreamingEvent.Type,
        distinctKeySelector: (T) -> K
    ) {
        when (eventType) {
            StreamingEvent.Type.UNKNOWN -> { }
            StreamingEvent.Type.CREATE -> currentList.set(currentList.get() + eventList)
            StreamingEvent.Type.DELETE -> currentList.set(currentList.get() - eventList)
            StreamingEvent.Type.READ -> currentList.set(eventList)

            StreamingEvent.Type.UPDATE -> currentList.set(
                currentList.get()
                    .toMutableList()
                    .plus(eventList)
                    .distinctBy(distinctKeySelector)
            )
        }
    }

    private val _providersStream: PublishSubject<List<Provider>> = PublishSubject.create()
    override val providersStream: Observable<List<Provider>> = _providersStream

    private val _accountsStream: PublishSubject<List<Account>> = PublishSubject.create()
    override val accountsStream: Observable<List<Account>> = _accountsStream

    private val _credentialsStream: PublishSubject<List<Credential>> = PublishSubject.create()
    override val credentialsStream: Observable<List<Credential>> = _credentialsStream

    override fun onNext(value: StreamingEvent) =
        when (value) {
            is StreamingEvent.ProviderEvent -> updateProvidersFromEvent(value)
            is StreamingEvent.AccountEvent -> updateAccountsFromEvent(value)
            is StreamingEvent.CredentialEvent -> updateCredentialsFromEvent(value)
        }


    override fun subscribeForProviders(onNext: (List<Provider>) -> Unit): StreamSubscription {
        return SubscriptionFromDisposable(providersStream.subscribe(onNext))
    }

    override fun subscribeForCredentials(onNext: (List<Credential>) -> Unit): StreamSubscription {
        return SubscriptionFromDisposable(credentialsStream.subscribe(onNext))
    }

    override fun subscribeForAccounts(onNext: (List<Account>) -> Unit): StreamSubscription {
        return SubscriptionFromDisposable(accountsStream.subscribe(onNext))
    }
}


private class SubscriptionFromDisposable(private val disposable: Disposable) : StreamSubscription {
    override fun unsubscribe() {
        disposable.dispose()
    }
}
