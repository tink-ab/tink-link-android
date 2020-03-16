package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.authenticateUser
import com.tink.service.authentication.user.User
import com.tink.service.handler.ResultHandler

class MainFragment : Fragment(), TinkLinkConsumer {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Set a user on the Tink instance:
        Tink.setUser(getUser())
        findNavController().navigate(R.id.profileFragment)
    }

    /**
     * Implement this method by returning a [User] either from an existing access token
     * (just create a [User] object with that token and return it),
     * or by fetching it from [Tink.authenticateUser].
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
    private fun getUserByAccessToken(accessToken: String) = User.fromAccessToken(accessToken)

    /**
     * Example of fetching a user from an authentication code.
     */
    private fun getUserByAuthenticationCode(code: String) {
        Tink.authenticateUser(code, ResultHandler(
            { user: User ->
                // Do something with the user
            }, {}
        ))
    }
}