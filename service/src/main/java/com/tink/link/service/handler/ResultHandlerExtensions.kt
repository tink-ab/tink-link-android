package com.tink.link.service.handler

import io.grpc.stub.StreamObserver

fun <A, B> ResultHandler<A>.toStreamObserver(converter: (B) -> A): StreamObserver<B> {

    return object : StreamObserver<B> {

        override fun onNext(value: B) {
            onSuccess(converter(value))
        }

        override fun onError(t: Throwable) {
            this@toStreamObserver.onError(t)
        }

        override fun onCompleted() {}
    }
}

fun <T> ResultHandler<Unit>.toStreamObserver() =
    object : StreamObserver<T> {

        override fun onNext(value: T) {
            onSuccess.invoke(Unit)
        }

        override fun onError(t: Throwable) {
            this@toStreamObserver.onError(t)
        }

        override fun onCompleted() {}

    }
