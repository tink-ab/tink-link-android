package com.tink.link.payments

import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.coroutines.launchForResult
import com.tink.model.account.Account
import com.tink.model.misc.Amount
import com.tink.model.transfer.Beneficiary
import com.tink.service.credentials.CredentialsService
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import javax.inject.Inject

interface TransferRepository {

    fun initiateTransfer(
        amount: Amount,
        sourceAccountUri: String,
        beneficiaryUri: String,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription

    fun initiateTransfer(
        amount: Amount,
        sourceAccount: Account,
        beneficiary: Beneficiary,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription

    fun fetchAccounts(resultHandler: ResultHandler<List<Account>>)

    fun fetchBeneficiaries(resultHandler: ResultHandler<List<Beneficiary>>)
}

internal class TransferRepositoryImpl(
    private val transferService: TransferService,
    private val credentialsService: CredentialsService,
    private val dispatcher: CoroutineDispatcher
) : TransferRepository {

    @Inject
    constructor(
        transferService: TransferService,
        credentialsService: CredentialsService
    ) : this(transferService, credentialsService, Dispatchers.IO)

    override fun initiateTransfer(
        amount: Amount,
        sourceAccountUri: String,
        beneficiaryUri: String,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription =
        TransferTask(
            CreateTransferDescriptor(
                amount = amount,
                sourceUri = sourceAccountUri,
                sourceMessage = message.sourceMessage,
                destinationUri = beneficiaryUri,
                destinationMessage = message.destinationMessage
            ),
            credentialsService,
            transferService,
            statusChangeObserver
        )

    override fun initiateTransfer(
        amount: Amount,
        sourceAccount: Account,
        beneficiary: Beneficiary,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription {
        val sourceAccountUri =
            sourceAccount.identifiers.firstOrNull() ?: "tink://${sourceAccount.id}"
        return initiateTransfer(
            amount,
            sourceAccountUri,
            beneficiary.uri,
            message,
            statusChangeObserver
        )
    }

    override fun fetchAccounts(resultHandler: ResultHandler<List<Account>>) {
        CoroutineScope(dispatcher + Job()).launchForResult(resultHandler) {
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
    class AwaitingAuthentication(val operation: AuthenticationTask) : TransferStatus()
}

data class TransferMessage(val destinationMessage: String, val sourceMessage: String? = null)
