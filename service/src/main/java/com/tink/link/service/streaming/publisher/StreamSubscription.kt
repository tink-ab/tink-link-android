package com.tink.link.service.streaming.publisher

interface StreamSubscription {
    fun unsubscribe()
}

interface Stream<T> {
    fun subscribe(observer: StreamObserver<T>): StreamSubscription
}

interface StreamObserver<T> {
    fun onNext(value: T) {}
    fun onError(error: Throwable) {}
    fun onCompleted() {}
}


fun <A, B> StreamObserver<A>.toGrpcStreamObserver(
    converter: (B) -> A
): io.grpc.stub.StreamObserver<B> =
    object : io.grpc.stub.StreamObserver<B> {
        override fun onNext(value: B) = onNext(converter(value))
        override fun onError(t: Throwable) = this@toGrpcStreamObserver.onError(t)
        override fun onCompleted() = this@toGrpcStreamObserver.onCompleted()
    }