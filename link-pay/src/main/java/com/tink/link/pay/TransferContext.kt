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
    ): TransferTask =
        TransferTask(
            CreateTransferDescriptor(
                amount,
                "se://1120700004704000?name=testAccount",
                "sourceMessage",
                "se://1078646804708704?name=testAccount",
                "destinationMessage"
            ),
            credentialsService, transferService, onStatusChanged
        ).also { it.start() }
}

sealed class TransferStatus {

    object Done : TransferStatus()
    object Failed : TransferStatus()
    object Loading : TransferStatus()

    class AwaitingAuthentication(val credentials: Credentials) : TransferStatus()
}

class TransferTask(
    private val transferDescriptor: CreateTransferDescriptor,
    private val credentialsService: CredentialsService,
    private val transferService: TransferService,
    private val onStatusChanged: (TransferStatus) -> Unit
) {

    private val errorHandler = CoroutineExceptionHandler { _, _ ->
        onStatusChanged(TransferStatus.Failed)
    }

    private val scope = CoroutineScope(Dispatchers.IO + Job() + errorHandler)
    private var currentStatus: TransferStatus = TransferStatus.Loading

    fun start() {

        scope.launch {

            val initialSignableOperation = transferService.initiateTransfer(transferDescriptor)

            while (true) {
                val newOperation =
                    transferService.getTransferStatus(initialSignableOperation.underlyingId)

                val newStatus: TransferStatus = when (newOperation.status) {
                    SignableOperation.Status.CREATED,
                    SignableOperation.Status.EXECUTING -> TransferStatus.Loading
                    SignableOperation.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
                    SignableOperation.Status.AWAITING_CREDENTIALS -> {
                        val credentials =
                            credentialsService.getCredentials(initialSignableOperation.credentialsId!!)
                        getTransferStatusFromCredentials(credentials)

                    }
                    SignableOperation.Status.CANCELLED,
                    SignableOperation.Status.FAILED -> TransferStatus.Failed
                    SignableOperation.Status.EXECUTED -> TransferStatus.Done
                }

                setStatus(newStatus)

                if (newStatus == TransferStatus.Failed || newStatus == TransferStatus.Done) {
                    break
                }

                delay(2_000L)
            }
        }
    }


    fun cancel() {
        scope.cancel()
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
            Credentials.Status.PERMANENT_ERROR -> TransferStatus.Failed
        }
}
