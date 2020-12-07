package com.tink.link.core.credentials

import com.tink.link.authentication.AuthenticationTask
import com.tink.model.credentials.Credentials
import com.tink.service.credentials.CredentialsAuthenticateDescriptor
import com.tink.service.credentials.CredentialsCreationDescriptor
import com.tink.service.credentials.CredentialsRefreshDescriptor
import com.tink.service.credentials.CredentialsService
import com.tink.service.credentials.CredentialsUpdateDescriptor
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal class CreateCredentialsTask(
    descriptor: CredentialsCreationDescriptor,
    credentialsService: CredentialsService,
    streamObserver: StreamObserver<CredentialsStatus>
) : CredentialsTask(
    credentialsService = credentialsService,
    streamObserver = streamObserver,
    credentialsAction = { credentialsService.create(descriptor) }
)

internal class UpdateCredentialsTask(
    descriptor: CredentialsUpdateDescriptor,
    credentialsService: CredentialsService,
    streamObserver: StreamObserver<CredentialsStatus>
) : CredentialsTask(
    credentialsService = credentialsService,
    streamObserver = streamObserver,
    credentialsAction = { credentialsService.update(descriptor) }
)

internal class AuthenticateCredentialsTask(
    descriptor: CredentialsAuthenticateDescriptor,
    credentialsService: CredentialsService,
    streamObserver: StreamObserver<CredentialsStatus>
) : CredentialsTask(
    credentialsService = credentialsService,
    streamObserver = streamObserver,
    credentialsAction = {
        credentialsService.authenticate(descriptor)
        credentialsService.getCredentials(descriptor.id)
    }
)

internal class RefreshCredentialsTask(
    descriptor: CredentialsRefreshDescriptor,
    credentialsService: CredentialsService,
    streamObserver: StreamObserver<CredentialsStatus>
) : CredentialsTask(
    credentialsService = credentialsService,
    streamObserver = streamObserver,
    credentialsAction = {
        credentialsService.refresh(descriptor)
        credentialsService.getCredentials(descriptor.id)
    }
)

internal abstract class CredentialsTask(
    private val credentialsService: CredentialsService,
    private val streamObserver: StreamObserver<CredentialsStatus>,
    private val credentialsAction: suspend () -> Credentials
) : StreamSubscription {

    private val errorHandler =
        CoroutineExceptionHandler { _, error -> streamObserver.onError(error) }

    private val scope = CoroutineScope(Dispatchers.IO + Job() + errorHandler)
    private var currentStatus: CredentialsStatus = CredentialsStatus.Loading()
        set(value) {
            if (isNewStatus(field, value)) {
                field = value
                // Push status update to StreamObserver
                streamObserver.onNext(currentStatus)
            }
        }

    init {
        scope.launch {
            val initialCredentials: Credentials = credentialsAction()
            var previousStatusUpdated = initialCredentials.statusUpdated

            // First credentials will always be non-null.
            var credentials: Credentials? = initialCredentials

            // Start polling for Credentials status changes, and push updates to streamObserver
            while (true) {
                // Handle first credentials status and all subsequent status changes
                if (credentials != null) {
                    // We have a valid credentials with a new status. Update streamObserver.
                    currentStatus = credentials.toCredentialsStatus()
                    previousStatusUpdated = credentials.statusUpdated
                    if (currentStatus is CredentialsStatus.Success) break
                }

                delay(2_000L)

                // Fetch credentials and compare new status to previous.
                // If it's unchanged, this will be null.
                credentials = credentialsService.getCredentials(initialCredentials.id)
                    .takeIf { it.statusUpdated.isAfter(previousStatusUpdated) }
            }

            streamObserver.onCompleted()
        }
    }

    private fun isNewStatus(
        oldStatus: CredentialsStatus,
        newStatus: CredentialsStatus
    ): Boolean {
        if (oldStatus is CredentialsStatus.AwaitingAuthentication &&
            newStatus is CredentialsStatus.AwaitingAuthentication
        ) {
            return newStatus.authenticationTask.isNewerThan(oldStatus.authenticationTask)
        }
        return oldStatus != newStatus
    }

    private suspend fun Credentials.toCredentialsStatus() =
        when (status) {
            Credentials.Status.UNKNOWN,
            Credentials.Status.CREATED,
            Credentials.Status.UPDATING,
            Credentials.Status.AUTHENTICATING -> CredentialsStatus.Loading(status.toString())

            Credentials.Status.UPDATED -> CredentialsStatus.Success(status.toString(), this)

            Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
            Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION ->
                CredentialsStatus.AwaitingAuthentication(
                    AuthenticationTask.ThirdPartyAuthentication(this)
                )

            Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                CredentialsStatus.AwaitingAuthentication(
                    AuthenticationTask.SupplementalInformation(this)
                )

            Credentials.Status.DISABLED,
            Credentials.Status.DELETED,
            Credentials.Status.SESSION_EXPIRED,
            Credentials.Status.AUTHENTICATION_ERROR,
            Credentials.Status.TEMPORARY_ERROR,
            Credentials.Status.PERMANENT_ERROR,
            null -> throw CredentialsFailure(statusPayload?.ifBlank { null })
        }

    override fun unsubscribe() {
        scope.cancel()
    }
}

class CredentialsFailure(message: String? = null) : Throwable(message)
