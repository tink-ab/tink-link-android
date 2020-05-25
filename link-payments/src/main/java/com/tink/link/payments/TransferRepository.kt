package com.tink.link.payments

import com.tink.link.payments.coroutines.launchForResult
import com.tink.model.account.Account
import com.tink.model.credentials.Credentials
import com.tink.model.misc.Amount
import com.tink.model.transfer.Beneficiary
import com.tink.service.credentials.CredentialsService
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import javax.inject.Inject

interface TransferRepository {

    fun initiateTransfer(
        amount: Amount,
        sourceUri: String,
        destinationUri: String,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription

    fun fetchAccounts(resultHandler: ResultHandler<List<Account>>)

    fun fetchBeneficiaries(resultHandler: ResultHandler<List<Beneficiary>>)
}

internal class TransferRepositoryImpl @Inject constructor(
    private val transferService: TransferService,
    private val credentialsService: CredentialsService
) : TransferRepository {

    override fun initiateTransfer(
        amount: Amount,
        sourceUri: String,
        destinationUri: String,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription =
        TransferTask(
            CreateTransferDescriptor(
                amount = amount,
                sourceUri = sourceUri,
                sourceMessage = message.sourceMessage,
                destinationUri = destinationUri,
                destinationMessage = message.destinationMessage
            ),
            credentialsService,
            transferService,
            statusChangeObserver
        )


    override fun fetchAccounts(resultHandler: ResultHandler<List<Account>>) {
        // TODO: Inject dispatcher?
        CoroutineScope(Dispatchers.IO + Job()).launchForResult(resultHandler) {
            transferService.getSourceAccounts()
        }
    }

    override fun fetchBeneficiaries(resultHandler: ResultHandler<List<Beneficiary>>) {
        CoroutineScope(Dispatchers.IO + Job()).launchForResult(resultHandler) {
            transferService.getBeneficiaries()
        }
    }
}

sealed class TransferStatus {
    object Success : TransferStatus()
    object Loading : TransferStatus()
    class AwaitingAuthentication(val credentials: Credentials) : TransferStatus()
}

data class TransferMessage(val destinationMessage: String, val sourceMessage: String? = null)
