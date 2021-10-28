package com.tink.link.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.authenticateUser
import com.tink.link.createTemporaryUser
import com.tink.link.getUserInfo
import com.tink.link.ui.analytics.TinkLinkTracker
import com.tink.link.ui.analytics.models.AppInfo
import com.tink.link.ui.analytics.models.ApplicationEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import com.tink.link.ui.credentials.CredentialsOperationArgs
import com.tink.link.ui.credentials.CredentialsStatusDialogFactory
import com.tink.link.ui.providerlist.FRAGMENT_ARG_PROVIDER_SELECTION
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler

const val FRAGMENT_ARG_LINK_USER = "linkUserArg"
const val FRAGMENT_ARG_CREDENTIALS_OPERATION = "credentialsOperationArg"

internal class MainFragment : Fragment() {

    private val linkUser: LinkUser by lazy {
        requireNotNull(arguments?.getParcelable(FRAGMENT_ARG_LINK_USER))
    }

    private val credentialsOperation: CredentialsOperation by lazy {
        requireNotNull(
            arguments?.getParcelable(FRAGMENT_ARG_CREDENTIALS_OPERATION)
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
        observeCredentialChanges()
        when (linkUser) {
            is LinkUser.TemporaryUser -> createUser { launchLinkUiFlowForUser(it) }
            is LinkUser.UnauthenticatedUser -> authenticateUser { launchLinkUiFlowForUser(it) }
            is LinkUser.ExistingUser -> launchLinkUiFlowForUser((linkUser as LinkUser.ExistingUser).user)
        }
    }

    private fun observeCredentialChanges() {
        viewModel.credentialsToProvider.observe(
            viewLifecycleOwner,
            { credentialsToProvider ->
                launchFlowForCredentials(credentialsToProvider)
            }
        )

        viewModel.onError.observe(
            viewLifecycleOwner,
            { error ->
                (activity as? TinkLinkUiActivity)?.let { activity ->
                    activity.linkError = error
                }
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
                    .also {
                        it.show()
                        val credentialsId: String? = credentialsOperation.credentialsId
                        val providerName = if (error is TinkLinkError.ProviderNotFound) {
                            error.providerName
                        } else {
                            null
                        }
                        TinkLinkTracker.trackScreen(
                            ScreenEvent.ERROR_SCREEN,
                            ScreenEventData(
                                providerName = providerName,
                                credentialsId = credentialsId
                            )
                        )
                    }
            }
        )
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
        setupInternalTracker(requireContext())
        when (val operation = credentialsOperation) {
            is CredentialsOperation.Create -> {
                activity?.runOnUiThread {
                    findNavController().navigate(
                        R.id.action_mainFragment_to_providerListFragment,
                        bundleOf(FRAGMENT_ARG_PROVIDER_SELECTION to operation.providerSelection)
                    )
                }
            }

            is CredentialsOperation.Update,
            is CredentialsOperation.Authenticate,
            is CredentialsOperation.Refresh -> {
                operation.credentialsId?.let { viewModel.setCredentialsId(it) }
            }
        }
    }

    private fun launchFlowForCredentials(credentialsToProvider: CredentialsToProvider) {
        val operationArgs = when (val operation = credentialsOperation) {
            is CredentialsOperation.Update -> {
                CredentialsOperationArgs.Update(
                    provider = credentialsToProvider.provider,
                    credentials = credentialsToProvider.credentials
                )
            }

            is CredentialsOperation.Authenticate -> {
                CredentialsOperationArgs.Authenticate(
                    provider = credentialsToProvider.provider,
                    credentials = credentialsToProvider.credentials
                )
            }

            is CredentialsOperation.Refresh -> {
                CredentialsOperationArgs.Refresh(
                    provider = credentialsToProvider.provider,
                    credentials = credentialsToProvider.credentials,
                    authenticate = operation.authenticate
                )
            }

            else -> null
        }
        if (operationArgs != null) {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToCredentialsFragment(operationArgs)
            )
        }
    }

    private fun setupInternalTracker(context: Context) {
        Tink.getUserInfo(
            resultHandler = ResultHandler(
                { userInfo ->
                    TinkLinkTracker.initialize(
                        clientId = Tink.getConfiguration()?.oAuthClientId ?: "",
                        userId = userInfo.id,
                        market = userInfo.profile.market,
                        appInfo = getAppInfo(context),
                        operation = credentialsOperation
                    )
                    sendApplicationEvent(credentialsOperation)
                },
                { }
            )
        )
    }

    private fun getAppInfo(context: Context): AppInfo {
        val versionName = BuildConfig.libraryVersion
        val appPackageName = context.packageName
        val appPackageInfo = context.packageManager.getPackageInfo(
            appPackageName,
            0
        )
        val appVersionName = appPackageInfo.versionName
        val appName = appPackageInfo.applicationInfo.loadLabel(context.packageManager)
        return AppInfo(
            version = versionName,
            appName = appName.toString(),
            appPackageName = appPackageName,
            appVersion = appVersionName
        )
    }

    private fun sendApplicationEvent(credentialsOperation: CredentialsOperation) {
        when (val operation = credentialsOperation) {
            is CredentialsOperation.Create -> {
                val screenEventData = ScreenEventData(
                    providerName = operation.getProviderNameIfAvailable(),
                    credentialsId = operation.credentialsId
                )
                TinkLinkTracker.trackApplicationEvent(
                    operation.toApplicationEvent(),
                    screenEventData
                )
            }
            else -> { }
        }
    }

    private fun CredentialsOperation.Create.toApplicationEvent(): ApplicationEvent =
        if (providerSelection is ProviderSelection.SingleProvider) {
            ApplicationEvent.INITIALIZED_WITH_PROVIDER
        } else {
            ApplicationEvent.INITIALIZED_WITHOUT_PROVIDER
        }

    private fun CredentialsOperation.Create.getProviderNameIfAvailable(): String? =
        if (providerSelection is ProviderSelection.SingleProvider) {
            providerSelection.name
        } else {
            null
        }
}
