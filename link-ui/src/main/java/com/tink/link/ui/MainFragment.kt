package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.authenticateUser
import com.tink.link.createTemporaryUser
import com.tink.link.ui.credentials.CredentialsOperationType
import com.tink.link.ui.credentials.CredentialsStatusDialogFactory
import com.tink.link.ui.credentials.CredentialsUpdateFields
import com.tink.link.ui.providerlist.FRAGMENT_ARG_PROVIDER_SELECTION
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler

const val FRAGMENT_ARG_LINK_USER = "linkUserArg"
const val FRAGMENT_ARG_CREDENTIALS_OPERATION = "credentialsOperationArg"

internal class MainFragment : Fragment() {

    private val linkUser: LinkUser by lazy {
        requireNotNull(arguments?.getParcelable<LinkUser>(FRAGMENT_ARG_LINK_USER))
    }

    private val credentialsOperation: CredentialsOperation by lazy {
        requireNotNull(
            arguments?.getParcelable<CredentialsOperation>(FRAGMENT_ARG_CREDENTIALS_OPERATION)
        )
    }

    private val viewModel: MainViewModel by viewModels()

    private var statusDialog: AlertDialog? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tink_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        when (linkUser) {
            is LinkUser.TemporaryUser -> createUser { launchLinkUiFlowForUser(it) }
            is LinkUser.UnauthenticatedUser -> authenticateUser { launchLinkUiFlowForUser(it) }
            is LinkUser.ExistingUser -> launchLinkUiFlowForUser((linkUser as LinkUser.ExistingUser).user)
        }
    }

    private fun createUser(onUserCreateAction: (User) -> Unit) {
        val market = (linkUser as LinkUser.TemporaryUser).market
        val locale = (linkUser as LinkUser.TemporaryUser).locale
        require(market.isNotBlank() && locale.isNotBlank()) {
            "Invalid market and locale parameters set for user creation"
        }
        Tink.createTemporaryUser(
            market = market,
            locale = locale,
            resultHandler = ResultHandler(
                onUserCreateAction,
                { }
            )
        )
    }

    private fun authenticateUser(onUserAuthenticateAction: (User) -> Unit) {
        val authorizationCode = (linkUser as LinkUser.UnauthenticatedUser).authorizationCode
        require(authorizationCode.isNotBlank()) {
            "Invalid authorization code set for user authentication"
        }
        Tink.authenticateUser(
            authenticationCode = authorizationCode,
            resultHandler = ResultHandler(
                onUserAuthenticateAction,
                { }
            )
        )
    }

    private fun launchLinkUiFlowForUser(user: User) {
        Tink.setUser(user)
        when (val operation = credentialsOperation) {
            is CredentialsOperation.Create -> {
                findNavController().navigate(
                    R.id.action_mainFragment_to_providerListFragment,
                    bundleOf(FRAGMENT_ARG_PROVIDER_SELECTION to operation.providerSelection)
                )
            }

            is CredentialsOperation.Update,
            is CredentialsOperation.Authenticate,
            is CredentialsOperation.Refresh -> {
                operation.credentialsId?.let { viewModel.setCredentialsId(it) }
            }
        }

        viewModel.credentialsToProvider.observe(viewLifecycleOwner, Observer { credentialsToProvider ->
            launchFlowForCredentials(credentialsToProvider)
        })

        viewModel.onError.observe(viewLifecycleOwner, Observer { message ->
            statusDialog = CredentialsStatusDialogFactory
                .createDialog(
                    requireContext(),
                    CredentialsStatusDialogFactory.Type.ERROR,
                    getString(R.string.tink_error_unknown)
                ) {
                    statusDialog?.dismiss()
                    (activity as? TinkLinkUiActivity)?.closeTinkLinkUi(
                        TinkLinkUiActivity.RESULT_FAILURE
                    )
                }
                .also { it.show() }
        })
    }

    private fun launchFlowForCredentials(credentialsToProvider: CredentialsToProvider) {
        when (val operation = credentialsOperation) {
            is CredentialsOperation.Update -> {
                findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToCredentialsFragmentUpdate(
                        credentialsId = credentialsToProvider.credentials.id,
                        credentialsFields = CredentialsUpdateFields(credentialsToProvider.credentials.fields),
                        operationType = operation.operationType(),
                        provider = credentialsToProvider.provider
                    )
                )
            }

            is CredentialsOperation.Authenticate -> {
                findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToCredentialsFragmentAuthenticate(
                        credentialsId = credentialsToProvider.credentials.id,
                        operationType = operation.operationType(),
                        provider = credentialsToProvider.provider
                    )
                )
            }

            is CredentialsOperation.Refresh -> {
                findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToCredentialsFragmentRefresh(
                        credentialsId = credentialsToProvider.credentials.id,
                        operationType = operation.operationType(),
                        provider = credentialsToProvider.provider,
                        authenticate = operation.authenticate
                    )
                )
            }
        }
    }

    private fun CredentialsOperation.operationType() =
        when (this) {
            is CredentialsOperation.Create -> CredentialsOperationType.CREATE
            is CredentialsOperation.Update -> CredentialsOperationType.UPDATE
            is CredentialsOperation.Authenticate -> CredentialsOperationType.AUTHENTICATE
            is CredentialsOperation.Refresh -> CredentialsOperationType.REFRESH
        }
}
