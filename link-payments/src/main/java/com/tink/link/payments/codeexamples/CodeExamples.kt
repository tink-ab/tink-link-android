package com.tink.link.payments.codeexamples

import android.app.Activity
import com.tink.core.Tink
import com.tink.link.authentication.AuthenticationTask
import com.tink.link.payments.AddBeneficiaryStatus
import com.tink.link.payments.getTransferRepository
import com.tink.model.misc.Field
import com.tink.rest.models.Account
import com.tink.service.handler.ResultHandler
import com.tink.service.streaming.publisher.StreamObserver

private val account: Account = TODO()

internal fun addBeneficiaryExample() {
    Tink.getTransferRepository().addBeneficiary(
        ownerAccountId = account.id,
        credentialsId = account.credentialsId,
        accountNumberType = "iban",
        accountNumber = "FR7630006000011234567890189",
        name = "Beneficiary name",
        streamObserver = object : StreamObserver<AddBeneficiaryStatus> {
            override fun onNext(value: AddBeneficiaryStatus) {
                when (value) {
                    is AddBeneficiaryStatus.Loading -> {
                        // Show loading state
                    }

                    is AddBeneficiaryStatus.Success -> {
                        // Show success state
                    }

                    is AddBeneficiaryStatus.AwaitingAuthentication -> {
                        handleAuthenticationTask(value.authenticationTask)
                    }
                }
            }

            override fun onError(error: Throwable) {
                // Show error state
            }
        }
    )
}

private val filledFields: Map<String, String> = TODO()
private val resultHandler: ResultHandler<Unit> = TODO()
private val activity: Activity = TODO()

internal fun handleAuthenticationTask(authenticationTask: AuthenticationTask) {
    when (authenticationTask) {
        is AuthenticationTask.SupplementalInformation -> {
            // setup a view with input fields
            setupFieldView(authenticationTask.fields)

            // gather field input and submit it
            authenticationTask.submit(filledFields, resultHandler)
        }
        is AuthenticationTask.ThirdPartyAuthentication -> {
            // launch third party authentication
            val launchResult = authenticationTask.launch(activity)

            if (launchResult !is AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success) {
                // third party app is not installed or needs upgrade
                // show a dialog with the necessary information
            }
        }
    }
}

internal fun setupFieldView(fields: List<Field>) {
    // create a field view
}