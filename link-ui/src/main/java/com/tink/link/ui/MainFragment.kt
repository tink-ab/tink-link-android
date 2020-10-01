package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.authenticateUser
import com.tink.link.createTemporaryUser
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler
import com.tink.service.provider.ProviderFilter

const val FRAGMENT_ARG_LINK_USER = "linkUserArg"
const val FRAGMENT_ARG_PROVIDER_SELECTION = "providerSelectionArg"

internal class MainFragment : Fragment() {

    private val linkUser: LinkUser by lazy {
        requireNotNull(arguments?.getParcelable<LinkUser>(FRAGMENT_ARG_LINK_USER))
    }

    private val providerSelection: ProviderSelection by lazy {
        requireNotNull(arguments?.getParcelable<ProviderSelection>(FRAGMENT_ARG_PROVIDER_SELECTION))
    }

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
        findNavController().navigate(
            R.id.action_mainFragment_to_providerListFragment,
            bundleOf(FRAGMENT_ARG_PROVIDER_SELECTION to providerSelection)
        )
    }
}
