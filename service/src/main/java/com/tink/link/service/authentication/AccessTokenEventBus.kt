package com.tink.link.service.authentication

import io.reactivex.disposables.Disposable
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AccessTokenEventBus @Inject constructor() {
    private val publisherSubject = BehaviorSubject.create<String>()

    fun subscribe(onAccessTokenReceived: (String) -> Unit): Disposable =
        publisherSubject.subscribe(onAccessTokenReceived)

    fun postAccessToken(accessToken: String) = publisherSubject.onNext(accessToken)
}
