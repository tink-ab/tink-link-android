package com.tink.link.pay

import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.transfer.SignableOperation
import com.tink.service.credentials.CredentialsService
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class TransferContext @Inject constructor(
    private val transferService: TransferService,
    private val credentialsService: CredentialsService
) {

    fun initiateTransfer(
        amount: Amount,
        sourceUri: String,
        destinationUri: String,
        onStatusChanged: (TransferStatus) -> Unit
    ): TransferTask = //Stream
        TransferTask(
            CreateTransferDescriptor(
                amount = amount,
                sourceUri = sourceUri,
                sourceMessage = "sourceMessage",
                destinationUri = destinationUri,
                destinationMessage = "destinationMessage"
            ),
            credentialsService, transferService, onStatusChanged
        ).also { it.start() }
}

sealed class TransferStatus {

    object Success : TransferStatus()
    class Failure(val reason: Reason) : TransferStatus()
    object Loading : TransferStatus()

    class AwaitingAuthentication(val credentials: Credentials) : TransferStatus()
}

sealed class Reason(val message: String?) {
    class CredentialsError(message: String? = null) : Reason(message)
    class TransferFailed(message: String? = null) : Reason(message)
}

class TransferTask(
    private val transferDescriptor: CreateTransferDescriptor,
    private val credentialsService: CredentialsService,
    private val transferService: TransferService,
    private val onStatusChanged: (TransferStatus) -> Unit
) {

    private val errorHandler = CoroutineExceptionHandler { _, error ->
        // onError
        onStatusChanged(TransferStatus.Failure(Reason.TransferFailed()))
    }

    private val scope = CoroutineScope(Dispatchers.IO + Job() + errorHandler)
    private var currentStatus: TransferStatus = TransferStatus.Loading

    fun start() {
        currentStatus = TransferStatus.Loading
        onStatusChanged(currentStatus)

        scope.launch {

            val initialSignableOperation = transferService.initiateTransfer(transferDescriptor)

            val initialStatus = getStatusFromOperation(initialSignableOperation)

            setStatus(initialStatus)

            if (initialStatus is TransferStatus.Failure || initialStatus == TransferStatus.Success) {
                return@launch
            }

            while (true) {
                val newOperation =
                    transferService.getTransferStatus(initialSignableOperation.underlyingId)

                val newStatus: TransferStatus = getStatusFromOperation(newOperation)

                setStatus(newStatus)

                if (newStatus is TransferStatus.Failure || newStatus == TransferStatus.Success) {
                    break
                }

                delay(2_000L)
            }
        }
    }

    fun cancel() {
        scope.cancel()
    }

    private suspend fun getStatusFromOperation(signableOperation: SignableOperation): TransferStatus =
        when (signableOperation.status) {
            SignableOperation.Status.CREATED,
            SignableOperation.Status.EXECUTING -> TransferStatus.Loading
            SignableOperation.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
            SignableOperation.Status.AWAITING_CREDENTIALS -> {
                val credentials =
                    credentialsService.getCredentials(signableOperation.credentialsId!!)
                getTransferStatusFromCredentials(credentials)

            }
            SignableOperation.Status.CANCELLED,
            SignableOperation.Status.FAILED -> TransferStatus.Failure(
                Reason.TransferFailed(
                    signableOperation.statusMessage.takeUnless { it.isBlank() })
            )
            SignableOperation.Status.EXECUTED -> TransferStatus.Success
        }

    private fun setStatus(newStatus: TransferStatus) {
        if (isNewStatus(currentStatus, newStatus)) {
            currentStatus = newStatus
            onStatusChanged(currentStatus)
        }
    }

    private fun isNewStatus(oldStatus: TransferStatus, newStatus: TransferStatus): Boolean {

        if (oldStatus is TransferStatus.AwaitingAuthentication && newStatus is TransferStatus.AwaitingAuthentication) {
            if (oldStatus.credentials.status != newStatus.credentials.status)
                return true
            if (oldStatus.credentials.statusUpdated < newStatus.credentials.statusUpdated)
                return true
            return false
        }

        return oldStatus != newStatus
    }

    private fun getTransferStatusFromCredentials(credentials: Credentials) =
        when (credentials.status) {
            Credentials.Status.UNKNOWN,
            Credentials.Status.CREATED,
            Credentials.Status.AUTHENTICATING,
            Credentials.Status.UPDATING,
            Credentials.Status.UPDATED -> TransferStatus.Loading

            Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
            Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
            Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                TransferStatus.AwaitingAuthentication(credentials)

            Credentials.Status.DISABLED,
            Credentials.Status.DELETED,
            null,
            Credentials.Status.SESSION_EXPIRED,
            Credentials.Status.TEMPORARY_ERROR,
            Credentials.Status.AUTHENTICATION_ERROR,
            Credentials.Status.PERMANENT_ERROR -> TransferStatus.Failure(
                Reason.CredentialsError(credentials.statusPayload?.takeUnless { it.isBlank() })
            )
        }
}
