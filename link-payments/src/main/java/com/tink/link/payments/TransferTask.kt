package com.tink.link.payments

import com.tink.model.credentials.Credentials
import com.tink.model.transfer.SignableOperation
import com.tink.service.credentials.CredentialsService
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

internal class TransferTask(
    private val transferDescriptor: CreateTransferDescriptor,
    private val credentialsService: CredentialsService,
    private val transferService: TransferService,
    private val streamObserver: StreamObserver<TransferStatus>
) : StreamSubscription {

    private val errorHandler =
        CoroutineExceptionHandler { _, error ->
            streamObserver.onError(error)
        }

    private val scope =
        CoroutineScope(Dispatchers.IO + Job() + errorHandler)
    private var currentStatus: TransferStatus = TransferStatus.Loading
        set(value) {
            if (isNewStatus(field, value)) {
                field = value
                streamObserver.onNext(currentStatus)
            }
        }

    init {
        streamObserver.onNext(currentStatus)
        scope.launch {
            var operation = transferService.initiateTransfer(transferDescriptor)

            while (true) {
                currentStatus = operation.toTransferStatus()
                if (currentStatus == TransferStatus.Success) return@launch

                operation = transferService.getTransferStatus(operation.underlyingId)

                delay(2_000L)
            }
        }

        streamObserver.onCompleted()
    }

    override fun unsubscribe() {
        scope.cancel()
    }

    private suspend fun SignableOperation.toTransferStatus() =
        when (status) {
            SignableOperation.Status.CREATED,
            SignableOperation.Status.EXECUTING -> TransferStatus.Loading

            SignableOperation.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
            SignableOperation.Status.AWAITING_CREDENTIALS -> {
                val credentials =
                    credentialsService.getCredentials(credentialsId!!)
                getTransferStatusFromCredentials(credentials)
            }

            SignableOperation.Status.CANCELLED,
            SignableOperation.Status.FAILED -> throw TransferFailure(
                TransferFailure.Reason.TransferFailed(statusMessage.takeUnless { it.isBlank() })
            )
            SignableOperation.Status.EXECUTED -> TransferStatus.Success
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
                TransferStatus.AwaitingAuthentication(
                    credentials
                )

            Credentials.Status.DISABLED,
            Credentials.Status.DELETED,
            null,
            Credentials.Status.SESSION_EXPIRED,
            Credentials.Status.TEMPORARY_ERROR,
            Credentials.Status.AUTHENTICATION_ERROR,
            Credentials.Status.PERMANENT_ERROR -> throw TransferFailure(
                TransferFailure.Reason.CredentialsError(
                    credentials.statusPayload?.takeUnless { it.isBlank() })
            )
        }
}