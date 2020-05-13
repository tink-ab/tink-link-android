package com.tink.link.pay

import android.util.Log
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.transfer.SignableOperation
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import javax.inject.Inject

class TransferContext @Inject constructor(
    private val transferService: TransferService,
    private val credentialsRepository: CredentialsRepository
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
            credentialsRepository, transferService, onStatusChanged
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
    val credentialsRepository: CredentialsRepository,
    private val transferService: TransferService,
    private val onStatusChanged: (TransferStatus) -> Unit
) {

    private var currentStatus: TransferStatus = TransferStatus.Loading

    private var cancelled: Boolean = false
    private var transferPollingPaused: Boolean = false

    val credentialsStreamObserver = object : StreamObserver<List<Credentials>> {

        override fun onNext(value: List<Credentials>) {

            Log.d("Jan", "on next credentials");
            
            if(cancelled) return


            val credentials = value.first() //TODO
            Log.d("Jan", "In credentials stream, ${credentials.status}");

            val transferStatusFromCredentials = when (credentials.status) {
                Credentials.Status.UPDATING,
                Credentials.Status.UPDATED -> {

                    //TODO: Resubscribe transfer
                    transferPollingPaused = false
                    Log.d("Jan", "Transfer polling reactivated");

                    credentialsSubscription?.unsubscribe()
                    TransferStatus.Loading
                }

                Credentials.Status.CREATED,
                Credentials.Status.AUTHENTICATING,
                Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
                Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
                Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION ->
                    TransferStatus.AwaitingAuthentication(credentials)

                Credentials.Status.TEMPORARY_ERROR,
                Credentials.Status.AUTHENTICATION_ERROR,
                Credentials.Status.PERMANENT_ERROR,
                Credentials.Status.SESSION_EXPIRED,
                Credentials.Status.DISABLED,
                Credentials.Status.DELETED,
                Credentials.Status.UNKNOWN,
                null -> TransferStatus.Failed
            }

            when (val status = currentStatus) {

                TransferStatus.Done,
                TransferStatus.Failed -> return

                TransferStatus.Loading -> setNewStatus(transferStatusFromCredentials)
                is TransferStatus.AwaitingAuthentication -> {
                    if (credentials.statusUpdated > status.credentials.statusUpdated) {
                        setNewStatus(transferStatusFromCredentials)
                    }
                }
            }
        }
    }

    private val transferStreamObserver = object : StreamObserver<SignableOperation> {

        override fun onError(error: Throwable) {
            Log.d("Jan", "Error in transfer stream: ${error.message}");
        }

        override fun onCompleted() {
            Log.d("Jan", "Transfer stream completed");
        }

        override fun onNext(value: SignableOperation) {


            Log.d("Jan", "On next transfer: $value");

            if (cancelled) return
            if(transferPollingPaused) return

            Log.d("Jan", "In transfer stream");


            val newStatus = when (value.status) {
                SignableOperation.Status.CREATED,
                SignableOperation.Status.EXECUTING -> TransferStatus.Loading
                SignableOperation.Status.CANCELLED,
                SignableOperation.Status.FAILED -> TransferStatus.Failed
                SignableOperation.Status.EXECUTED -> TransferStatus.Done
                SignableOperation.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION,
                SignableOperation.Status.AWAITING_CREDENTIALS -> {
//                    transferSubscription?.unsubscribe()
                    transferPollingPaused = true // TODO: real unsubscribe
                    credentialsSubscription =
                        credentialsRepository.listStream().subscribe(credentialsStreamObserver)
                    TransferStatus.Loading
                }
            }

            if (value.status.isEndState()) {
                this@TransferTask.cancel()
            }

            if (newStatus != currentStatus) {
                setNewStatus(newStatus)
            }
        }

    }

    fun setNewStatus(newStatus: TransferStatus) {
        currentStatus = newStatus
        onStatusChanged(currentStatus)
    }

    var credentialsSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }


    var transferSubscription: StreamSubscription? = null
        set(value) {
            field?.unsubscribe()
            field = value
        }


    fun start() {
        onStatusChanged(TransferStatus.Loading)

        transferSubscription =
            transferService.initiateTransfer(transferDescriptor, transferStreamObserver)
    }

    fun cancel() {
        cancelled = true
        Log.d("Jan", "Cancelled: $cancelled");
        transferSubscription = null
        credentialsSubscription = null
    }
}
