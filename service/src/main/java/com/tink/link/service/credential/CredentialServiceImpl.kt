package com.tink.link.service.credential

import com.tink.link.model.credential.Credential
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.handler.toStreamObserver
import com.tink.link.service.streaming.PollingHandler
import com.tink.link.service.streaming.publisher.Stream
import com.tink.link.service.streaming.publisher.toGrpcStreamObserver
import io.grpc.Channel
import se.tink.grpc.v1.rpc.CancelSupplementInformationRequest
import se.tink.grpc.v1.rpc.DeleteCredentialRequest
import se.tink.grpc.v1.rpc.DisableCredentialRequest
import se.tink.grpc.v1.rpc.EnableCredentialRequest
import se.tink.grpc.v1.rpc.ListCredentialsRequest
import se.tink.grpc.v1.rpc.RefreshCredentialsRequest
import se.tink.grpc.v1.rpc.SupplementInformationRequest
import se.tink.grpc.v1.rpc.ThirdPartyCallbackRequest
import se.tink.grpc.v1.services.CredentialServiceGrpc
import javax.inject.Inject

class CredentialServiceImpl @Inject constructor(
    channel: Channel
) : CredentialService {

    private val stub = CredentialServiceGrpc.newStub(channel)

    override fun list(): Stream<List<Credential>> {
        return PollingHandler { observer ->
                stub.listCredentials(
                    ListCredentialsRequest.getDefaultInstance(),
                    observer.toGrpcStreamObserver { value ->
                        value.credentialsList.map { it.toCredential() }
                    })
            }
    }

    override fun create(
        descriptor: CredentialCreationDescriptor,
        handler: ResultHandler<Credential>
    ) = stub.createCredential(descriptor.toRequest(), handler.toStreamObserver {
        it.credential.toCredential()
    })

    override fun delete(credentialId: String, handler: ResultHandler<Unit>) =
        DeleteCredentialRequest
            .newBuilder()
            .setCredentialId(credentialId)
            .build()
            .let {
                stub.deleteCredential(it, handler.toStreamObserver())
            }

    override fun update(
        descriptor: CredentialUpdateDescriptor,
        handler: ResultHandler<Credential>
    ) = stub.updateCredential(descriptor.toRequest(), handler.toStreamObserver { response ->
        response.credential.toCredential()
    })

    override fun refresh(credentialIds: List<String>, handler: ResultHandler<Unit>) =
        RefreshCredentialsRequest
            .newBuilder()
            .addAllCredentialIds(credentialIds)
            .build()
            .let {
                stub.refreshCredentials(it, handler.toStreamObserver())
            }

    override fun enable(credentialId: String, handler: ResultHandler<Unit>) =
        EnableCredentialRequest
            .newBuilder()
            .setCredentialId(credentialId)
            .build()
            .let {
                stub.enableCredential(it, handler.toStreamObserver())
            }

    override fun disable(credentialId: String, handler: ResultHandler<Unit>) =
        DisableCredentialRequest
            .newBuilder()
            .setCredentialId(credentialId)
            .build()
            .let {
                stub.disableCredential(it, handler.toStreamObserver())
            }

    override fun supplementInformation(
        credentialId: String,
        information: Map<String, String>,
        handler: ResultHandler<Unit>
    ) =
        SupplementInformationRequest
            .newBuilder()
            .setCredentialId(credentialId)
            .putAllSupplementalInformationFields(information)
            .build()
            .let {
                stub.supplementInformation(it, handler.toStreamObserver())
            }

    override fun cancelSupplementalInformation(credentialId: String, handler: ResultHandler<Unit>) =
        CancelSupplementInformationRequest
            .newBuilder()
            .setCredentialId(credentialId)
            .build()
            .let {
                stub.cancelSupplementInformation(it, handler.toStreamObserver())
            }

    override fun thirdPartyCallback(state: String, parameters: Map<String, String>, handler: ResultHandler<Unit>) =
        ThirdPartyCallbackRequest
            .newBuilder()
            .setState(state)
            .putAllParameters(parameters)
            .build()
            .let {
                stub.thirdPartyCallback(it, handler.toStreamObserver())
            }
}
