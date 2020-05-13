package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.createTemporaryUser
import com.tink.link.getUserContext
import com.tink.link.ui.providerlist.ProviderListFragment.Companion.getBundle
import com.tink.model.provider.Provider
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler
import java.lang.IllegalArgumentException

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tink_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val user = (activity as? TinkLinkUiActivity)?.user
        if (user == null) {
            createUser {
                launchLinkUiFlowForUser(it)
            }
        } else {
            launchLinkUiFlowForUser(user)
        }
    }

    private fun createUser(onUserCreateAction: (User) -> Unit) {
        val market = (activity as? TinkLinkUiActivity)?.market
        val locale = (activity as? TinkLinkUiActivity)?.locale
        require(!market.isNullOrBlank() && !locale.isNullOrBlank()) {
            throw IllegalArgumentException("Invalid market and locale parameters set for user creation")
        }
        Tink.createTemporaryUser(
            market = market,
            locale = locale,
            resultHandler = ResultHandler(
                {
                    onUserCreateAction.invoke(it)
                },
                { }
            )
        )
    }

    private fun launchLinkUiFlowForUser(user: User) {
        Tink.setUser(user)
        Tink.getUserContext()?.providerRepository?.listProviders(
            handler = ResultHandler(
                { providers: List<Provider> ->
                    findNavController().navigate(
                        R.id.action_mainFragment_to_providerListFragment,
                        getBundle(providers)
                    )
                }, {}
            ),
            includeDemoProviders = true
        )
    }
}