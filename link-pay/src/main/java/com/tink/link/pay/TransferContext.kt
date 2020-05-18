package com.tink.link.pay

import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.service.credentials.CredentialsService
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import javax.inject.Inject

class TransferContext @Inject constructor(
    private val transferService: TransferService,
    private val credentialsService: CredentialsService
) {

    fun initiateTransfer(
        amount: Amount,
        sourceUri: String,
        destinationUri: String,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription =
        TransferTask(
            CreateTransferDescriptor(
                amount = amount,
                sourceUri = sourceUri,
                sourceMessage = "sourceMessage",
                destinationUri = destinationUri,
                destinationMessage = "destinationMessage"
            ),
            credentialsService,
            transferService,
            statusChangeObserver
        )
}

sealed class TransferStatus {
    object Success : TransferStatus()
    object Loading : TransferStatus()
    class AwaitingAuthentication(val credentials: Credentials) : TransferStatus()
}
