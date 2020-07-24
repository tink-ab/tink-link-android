package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.createTemporaryUser
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler

const val FRAGMENT_ARG_USER = "userArg"
const val FRAGMENT_ARG_MARKET = "marketArg"
const val FRAGMENT_ARG_LOCALE = "localeArg"

internal class MainFragment : Fragment() {

    private val user: User? by lazy {
        arguments?.getParcelable<User>(FRAGMENT_ARG_USER)
    }

    private val market: String by lazy {
        arguments?.getString(FRAGMENT_ARG_MARKET) ?: ""
    }

    private val locale: String by lazy {
        arguments?.getString(FRAGMENT_ARG_LOCALE) ?: ""
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tink_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (user == null) {
            createUser {
                launchLinkUiFlowForUser(it)
            }
        } else {
            launchLinkUiFlowForUser(user!!)
        }
    }

    private fun createUser(onUserCreateAction: (User) -> Unit) {
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

    private fun launchLinkUiFlowForUser(user: User) {
        Tink.setUser(user)
        findNavController().navigate(R.id.action_mainFragment_to_providerListFragment)
    }
}
