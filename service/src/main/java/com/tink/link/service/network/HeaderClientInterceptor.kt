package com.tink.link.service.network

import com.tink.link.service.BuildConfig
import com.tink.link.service.authentication.AccessTokenEventBus
import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.ClientCall
import io.grpc.ClientInterceptor
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.stub.MetadataUtils

private fun String.asciiMetadata() = Metadata.Key.of(this, Metadata.ASCII_STRING_MARSHALLER)

private val AUTHORIZATION = "Authorization".asciiMetadata()
private val DEVICE_ID_HEADER_NAME = "X-Tink-Device-ID".asciiMetadata()
private val SDK_NAME_HEADER_NAME = "X-Tink-SDK-Name".asciiMetadata()
private val SDK_VERSION_HEADER_NAME = "X-Tink-SDK-Version".asciiMetadata()
private val OAUTH_CLIENT_ID_HEADER_NAME = "X-Tink-OAuth-Client-ID".asciiMetadata()
private val REMOTE_ADDRESS = "X-Forwarded-For".asciiMetadata()
private val USER_AGENT = "User-Agent".asciiMetadata()

private const val SDK_NAME_HEADER_VALUE = "Tink Link Android"

internal class HeaderClientInterceptor(
    private val oAuthClientId: String,
    accessTokenEventBus: AccessTokenEventBus,
    private val deviceId: String? = null
) : ClientInterceptor {

    var token: String? = null

    init {
        accessTokenEventBus.subscribe { token = it }
    }

    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        method: MethodDescriptor<ReqT, RespT>,
        callOptions: CallOptions, next: Channel
    ): ClientCall<ReqT, RespT> {
        return object : SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            override fun start(responseListener: Listener<RespT>, headers: Metadata) {
                /* Set custom headers */

                fun String.putAsHeader(key: Metadata.Key<String>) {
                    takeUnless { it.isEmpty() }?.also { headers.put(key, it) }
                }

                deviceId?.putAsHeader(DEVICE_ID_HEADER_NAME)
                token?.let { "Bearer $it" }?.putAsHeader(AUTHORIZATION)
                oAuthClientId.putAsHeader(OAUTH_CLIENT_ID_HEADER_NAME)

                SDK_NAME_HEADER_VALUE.putAsHeader(SDK_NAME_HEADER_NAME)
                BuildConfig.VERSION_NAME.putAsHeader(SDK_VERSION_HEADER_NAME)

                super.start(object : SimpleForwardingClientCallListener<RespT>(responseListener) {
                    override fun onHeaders(headers: Metadata) {
                        /*
						 * if you don't need receive header from server,
						 * you can use {@link io.grpc.stub.MetadataUtils#attachHeaders}
						 * directly to send header
						 */
                        MetadataUtils.newAttachHeadersInterceptor(headers)
                        super.onHeaders(headers)
                    }
                }, headers)
            }
        }

    }
}
