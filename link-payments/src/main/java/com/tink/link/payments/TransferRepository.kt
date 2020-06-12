package com.tink.link.payments

import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.TransferStatus.AwaitingAuthentication
import com.tink.link.payments.TransferStatus.Loading
import com.tink.link.payments.TransferStatus.Success
import com.tink.link.payments.codeexamples.addBeneficiaryExample
import com.tink.link.payments.coroutines.launchForResult
import com.tink.model.account.Account
import com.tink.model.misc.Amount
import com.tink.model.transfer.Beneficiary
import com.tink.service.credentials.CredentialsService
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver
import com.tink.service.streaming.publisher.StreamSubscription
import com.tink.service.transfer.CreateBeneficiaryDescriptor
import com.tink.service.transfer.CreateTransferDescriptor
import com.tink.service.transfer.TransferService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import javax.inject.Inject

/**
 * Repository for initiating transfers and retrieving the necessary input for that action.
 */
interface TransferRepository {

    /**
     * Initiate a new transfer
     *
     * @param amount The amount that should be transferred. Its [currencyCode][Amount.currencyCode]
     * should be the same as the source account's currency.
     * @param sourceAccountUri The uri for the source account of the transfer. It can be retrieved
     * for example from [Account.identifiers]
     * @param beneficiaryUri The uri of the beneficiary the transfer is sent to.
     * See [Beneficiary.uri]
     * @param message The message used for the transfer.
     * @param statusChangeObserver An observer which will receive callbacks when there are
     * updates to the status of the transfer. Successful and intermediate status will be posted in
     * [onNext][StreamObserver.onNext], whereas failures and errors will be passed as [Throwable]
     * via [onError][StreamObserver.onError]. If the transfer finished successfully, you will also
     * receive a call to [onCompleted][StreamObserver.onCompleted], after which there will be no other
     * calls to this stream observer.
     *
     * @return a [StreamSubscription]. Calling [unsubscribe][StreamSubscription.unsubscribe] on it
     * will cancel polling of the transfer status. No more updates will be passed to the
     * [statusChangeObserver].
     *
     */
    fun initiateTransfer(
        amount: Amount,
        sourceAccountUri: String,
        beneficiaryUri: String,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription

    /**
     * Initiate a new transfer
     *
     * @param amount The amount that should be transferred. Its [currencyCode][Amount.currencyCode]
     * should be the same as the source account's currency.
     * @param sourceAccount The source account of this transfer. See [fetchAccounts].
     * @param beneficiary The beneficiary of this transfer. See [fetchBeneficiaries].
     * @param message The message used for the transfer.
     * @param statusChangeObserver An observer which will receive callbacks when there are
     * updates to the status of the transfer. Successful and intermediate status will be posted in
     * [onNext][StreamObserver.onNext], whereas failures and errors will be passed as [Throwable]
     * via [onError][StreamObserver.onError]. If the transfer finished successfully, you will also
     * receive a call to [onCompleted][StreamObserver.onCompleted], after which there will be no other
     * calls to this stream observer.
     *
     * @return a [StreamSubscription]. Calling [unsubscribe][StreamSubscription.unsubscribe] on it
     * will cancel polling of the transfer status. No more updates will be passed to the
     * [statusChangeObserver]
     */
    fun initiateTransfer(
        amount: Amount,
        sourceAccount: Account,
        beneficiary: Beneficiary,
        message: TransferMessage,
        statusChangeObserver: StreamObserver<TransferStatus>
    ): StreamSubscription


    /**
     * Fetch all accounts of the user that are suitable to pick as the source of a transfer.
     */
    fun fetchAccounts(resultHandler: ResultHandler<List<Account>>)

    /**
     * Fetch all beneficiaries of the user.
     */
    fun fetchBeneficiaries(resultHandler: ResultHandler<List<Beneficiary>>)

    /**
     * Add a new beneficiary
     *
     * @sample addBeneficiaryExample
     */
    fun addBeneficiary(
        ownerAccountId: String,
        credentialsId: String,
        accountNumber: String,
        accountNumberType: String,
        name: String,
        streamObserver: StreamObserver<AddBeneficiaryStatus>
    ): StreamSubscription

    /**
     * Add a new beneficiary
     */
    fun addBeneficiary(
        ownerAccount: Account,
        accountNumber: String,
        accountNumberType: String,
        name: String,
        streamObserver: StreamObserver<AddBeneficiaryStatus>
    ): StreamSubscription
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
                sourceAccountUri = sourceAccountUri,
                sourceMessage = message.sourceMessage,
                beneficiaryUri = beneficiaryUri,
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
        CoroutineScope(dispatcher + Job()).launchForResult(resultHandler) {
            transferService.getBeneficiaries()
        }
    }

    override fun addBeneficiary(
        ownerAccountId: String,
        credentialsId: String,
        accountNumber: String,
        accountNumberType: String,
        name: String,
        streamObserver: StreamObserver<AddBeneficiaryStatus>
    ): StreamSubscription =
        AddBeneficiaryTask(
            CreateBeneficiaryDescriptor(
                ownerAccountId, credentialsId, accountNumber, accountNumberType, name
            ),
            credentialsService,
            transferService,
            streamObserver
        )

    override fun addBeneficiary(
        ownerAccount: Account,
        accountNumber: String,
        accountNumberType: String,
        name: String,
        streamObserver: StreamObserver<AddBeneficiaryStatus>
    ): StreamSubscription =
        addBeneficiary(
            ownerAccountId = ownerAccount.id,
            credentialsId = ownerAccount.credentialsId,
            accountNumber = accountNumber,
            accountNumberType = accountNumberType,
            name = name,
            streamObserver = streamObserver
        )
}

/**
 * The status of a transfer.
 * Possible values are [Success], [Loading], and [AwaitingAuthentication]
 */
sealed class TransferStatus {

    /**
     * The status was successfully sent to the user's bank for processing.
     *
     * @param message a message containing details about the status.
     */
    data class Success(val message: String? = null) : TransferStatus()

    /**
     * The transfer is being processed by Tink. There is currently no user action
     * required.
     *
     * @param message a message containing details about the status.
     */
    data class Loading(val message: String? = null) : TransferStatus()

    /**
     * There is an outstanding authentication waiting that needs to be completed by the user to
     * proceed with the transfer.
     *
     * @property authenticationTask the authentication that needs to be completed by the user.
     */
    class AwaitingAuthentication(val authenticationTask: AuthenticationTask) : TransferStatus()
}

/**
 * The message for a transfer.
 *
 * @param destinationMessage This is the message that will be displayed to the
 * recipient of the transfer.
 * @param sourceMessage This is the message that will be displayed on the source
 * source account. If not provided it will be the same as [destinationMessage].
 */
data class TransferMessage(val destinationMessage: String, val sourceMessage: String? = null)
