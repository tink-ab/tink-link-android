package com.tink.link

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.link.core.user.User
import com.tink.link.providerlist.ProviderListFragment
import com.tink.link.service.handler.ResultHandler

class MainFragment : Fragment(), TinkLinkConsumer {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tinkLink = (activity as MainActivity).tinkLink

        // Set a user on the TinkLink instance:
        tinkLink.setUser(getUser())
        // Request a list of providers, and show them in a new fragment.
        tinkLink.getUserContext()?.providerRepository?.listProviders(
            ResultHandler(
                {
                    findNavController().navigate(
                        R.id.action_mainFragment_to_providerListFragment,
                        ProviderListFragment.getBundle(it)
                    )
                },
                {
                    // Handle error
                }
            )
        )
    }

    /**
     * Implement this method by returning a [User] either from an existing access token
     * (just create a [User] object with that token and return it),
     * or by fetching it from [TinkLink.authenticateUser].
     *
     * @see [getUserByAccessToken]
     * @see [getUserByAuthenticationCode]
     */
    private fun getUser(): User {
        TODO("Replace with implementation for getting a User using your preferred method.")
    }

    /**
     * Example of creating a User from an access token.
     */
    private fun getUserByAccessToken(accessToken: String) = User(accessToken)

    /**
     * Example of fetching a user from an authentication code.
     */
    private fun getUserByAuthenticationCode(tinkLink: TinkLink, code: String) {
        tinkLink.authenticateUser(code, ResultHandler(
            { user ->
                // Do something with the user
            }, {}
        ))
    }
}