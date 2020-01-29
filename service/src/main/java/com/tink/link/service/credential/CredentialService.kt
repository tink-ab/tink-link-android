package com.tink.link.service.credential

import com.tink.link.model.credential.Credential
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.streaming.publisher.Stream

interface CredentialService {
    fun list(): Stream<List<Credential>>
    fun create(descriptor: CredentialCreationDescriptor, handler: ResultHandler<Credential>)
    fun delete(credentialId: String, handler: ResultHandler<Unit>)
    fun update(descriptor: CredentialUpdateDescriptor, handler: ResultHandler<Credential>)
    fun refresh(credentialIds: List<String>, handler: ResultHandler<Unit>)
    fun enable(credentialId: String, handler: ResultHandler<Unit>)
    fun disable(credentialId: String, handler: ResultHandler<Unit>)
    fun supplementInformation(credentialId: String, information: Map<String, String>, handler: ResultHandler<Unit>)
    fun cancelSupplementalInformation(credentialId: String, handler: ResultHandler<Unit>)
    fun thirdPartyCallback(state: String, parameters: Map<String, String>, handler: ResultHandler<Unit>)
}
