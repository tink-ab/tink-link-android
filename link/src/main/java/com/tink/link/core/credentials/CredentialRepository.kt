package com.tink.link.core.credentials

import com.tink.model.credential.Credential
import com.tink.service.credential.CredentialCreationDescriptor
import com.tink.service.credential.CredentialService
import com.tink.service.credential.CredentialUpdateDescriptor
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration
import com.tink.service.streaming.publisher.Stream
import javax.inject.Inject

/**
 * Repository for creating, accessing and modifying credentials.
 *
 * @constructor Create a new repository instance from a [CredentialService]
 * This is usually done inside the Tink framework and it should normally not be necessary to create your own instance.
 */
class CredentialRepository @Inject constructor(
    private val service: CredentialService,
    private val tinkConfiguration: TinkConfiguration
) {

    /**
     * Returns a [Stream] containing the list of [Credential] objects.
     *
     * You can subscribe to the [Stream] and observe changes in the [Credential] objects and act upon them.
     */
    fun listStream(): Stream<List<Credential>> {
        return service.list()
    }

    /**
     * Creates a new [Credential] object.
     *
     * @param providerName Identifier for the [Provider]. See [Provider.name]
     * @param credentialType The [Credential.Type] used to authenticate the user to the financial institution
     * @param fields The map of [Field] name and value pairs for the [Provider]
     * @param resultHandler The [ResultHandler] for processing error and success callbacks
     */
    fun create(
        providerName: String,
        credentialType: Credential.Type,
        fields: Map<String, String>,
        resultHandler: ResultHandler<Credential>
    ) {
        service.create(
            CredentialCreationDescriptor(
                providerName,
                credentialType,
                fields,
                tinkConfiguration.redirectUri
            ), resultHandler
        )
    }

    /**
     * Updates the [Credential] matching the id.
     *
     * You can only update the value of a [Field] that is mutable.
     *
     * @param credentialId Identifier for the [Credential] that is being updated
     * @param fields The map of [Field] name and value pairs for the [Credential]
     * @param resultHandler The [ResultHandler] for processing error and success callbacks
     */
    fun update(
        credentialId: String,
        fields: Map<String, String>,
        resultHandler: ResultHandler<Credential>
    ) {
        service.update(
            CredentialUpdateDescriptor(
                credentialId,
                fields,
                tinkConfiguration.redirectUri
            ), resultHandler
        )
    }

    /**
     * Refreshes all [Credential] objects matching the list of ids.
     *
     * @param credentialIds List of identifiers for all the [Credential] objects that is being refreshed
     * @param resultHandler The [ResultHandler] for processing error and success callbacks
     */
    fun refresh(credentialIds: List<String>, resultHandler: ResultHandler<Unit>) {
        service.refresh(credentialIds, resultHandler)
    }

    /**
     * Deletes the [Credential] matching the id.
     *
     * @param credentialId Identifier for the [Credential] that is being deleted
     * @param resultHandler The [ResultHandler] for processing error and success callbacks
     */
    fun delete(credentialId: String, resultHandler: ResultHandler<Unit>) {
        service.delete(credentialId, resultHandler)
    }

    private fun enable(credentialId: String, resultHandler: ResultHandler<Unit>) {
        service.enable(credentialId, resultHandler)
    }

    private fun disable(credentialId: String, resultHandler: ResultHandler<Unit>) {
        service.disable(credentialId, resultHandler)
    }

    /**
     * Submits the supplemental information required to authenticate the [Credential] matching the id.
     *
     * @param credentialId Identifier for the [Credential] that is being authenticated
     * @param information The map of [Field] name and value pairs representing the supplemental information to be sent
     * @param handler The [ResultHandler] for processing error and success callbacks
     */
    fun supplementInformation(
        credentialId: String,
        information: Map<String, String>,
        handler: ResultHandler<Unit>
    ) {
        service.supplementInformation(credentialId, information, handler)
    }

    /**
     * Cancels the supplemental information submission flow.
     * The backend service is informed to stop waiting for the supplemental information.
     * This method should be called if you want to dismiss the supplemental information flow.
     *
     * @param credentialId Identifier for the [Credential] that is being authenticated
     * @param handler The [ResultHandler] for processing error and success callbacks
     */
    fun cancelSupplementalInformation(credentialId: String, handler: ResultHandler<Unit>) {
        service.cancelSupplementalInformation(credentialId, handler)
    }

    /**
     * Sends the third party callback information from an Account Servicing Payment Service Provider (ASPSP).
     *
     * This is usually done inside the TinkLink framework and it should normally not be necessary to do this on your own.
     *
     * @param state The value corresponding to the `state` key from the received callback parameters.
     * @param parameters The map of key and value pairs, other than `state` from the received callback parameters.
     * @param handler The [ResultHandler] for processing error and success callbacks
     */
    fun thirdPartyCallback(
        state: String,
        parameters: Map<String, String>,
        handler: ResultHandler<Unit>
    ) {
        service.thirdPartyCallback(state, parameters, handler)
    }
}