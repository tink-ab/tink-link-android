package com.tink.link.payments

import com.tink.link.authentication.AuthenticationTask
import com.tink.model.credentials.Credentials
import com.tink.service.credentials.CredentialsService
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateBeneficiaryDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal class AddBeneficiaryTask(
    private val descriptor: CreateBeneficiaryDescriptor,
    private val credentialsService: CredentialsService,
    private val transferService: TransferService,
    private val streamObserver: StreamObserver<AddBeneficiaryStatus>
) : StreamSubscription {

    private val errorHandler =
        CoroutineExceptionHandler { _, error -> streamObserver.onError(error) }

    private val scope = CoroutineScope(Dispatchers.IO + Job() + errorHandler)
    private var currentStatus: AddBeneficiaryStatus = AddBeneficiaryStatus.Loading()
        set(value) {
            if (isNewStatus(field, value)) {
                field = value
                streamObserver.onNext(currentStatus)
            }
        }

    init {

        scope.launch {

            transferService.addBeneficiary(descriptor)

            while (true) {

                val credentials = credentialsService.getCredentials(descriptor.credentialsId)

                currentStatus = getStatusFromCredentials(credentials)

                if (currentStatus is AddBeneficiaryStatus.Success) return@launch

                delay(2_000L)
            }
        }

        streamObserver.onCompleted()
    }

    private fun isNewStatus(
        oldStatus: AddBeneficiaryStatus,
        newStatus: AddBeneficiaryStatus
    ): Boolean {
        if (oldStatus is AddBeneficiaryStatus.AwaitingAuthentication &&
            newStatus is AddBeneficiaryStatus.AwaitingAuthentication
        ) {
            return newStatus.authenticationTask.isNewerThan(oldStatus.authenticationTask)
        }
        return oldStatus != newStatus
    }

    private fun getStatusFromCredentials(credentials: Credentials) =
        when (credentials.status) {
            Credentials.Status.UNKNOWN,
            Credentials.Status.CREATED,
            Credentials.Status.AUTHENTICATING -> AddBeneficiaryStatus.Loading()

            Credentials.Status.UPDATING,
            Credentials.Status.UPDATED -> AddBeneficiaryStatus.Success()

            Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
            Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION ->
                AddBeneficiaryStatus.AwaitingAuthentication(
                    AuthenticationTask.ThirdPartyAuthentication(credentials)
                )

            Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                AddBeneficiaryStatus.AwaitingAuthentication(
                    AuthenticationTask.SupplementalInformation(credentials)
                )

            Credentials.Status.DISABLED,
            Credentials.Status.DELETED,
            Credentials.Status.SESSION_EXPIRED,
            Credentials.Status.TEMPORARY_ERROR,
            Credentials.Status.AUTHENTICATION_ERROR,
            Credentials.Status.PERMANENT_ERROR,
            null -> throw AddBeneficiaryFailure(credentials.statusPayload?.ifBlank { null })
        }

    override fun unsubscribe() {
        scope.cancel()
    }
}
