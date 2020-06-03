package com.tink.link.payments

import com.tink.link.authentication.AuthenticationTask

/**
 * The status of a transfer.
 * Possible values are [Success], [Loading], and [AwaitingAuthentication]
 */
sealed class AddBeneficiaryStatus {

    /**
     * The beneficiary creation was successfully sent to the user's bank for processing.
     *
     * @param message a message containing details about the status.
     */
    data class Success(val message: String? = null) : AddBeneficiaryStatus()

    /**
     * The beneficiary creation is being processed by Tink. There is currently no user action
     * required.
     *
     * @param message a message containing details about the status.
     */
    data class Loading(val message: String? = null) : AddBeneficiaryStatus()

    /**
     * There is an outstanding authentication waiting that needs to be completed by the user to
     * proceed with adding the beneficiary.
     *
     * @property authenticationTask the authentication that needs to be completed by the user.
     */
    class AwaitingAuthentication(val authenticationTask: AuthenticationTask) :
        AddBeneficiaryStatus()
}
