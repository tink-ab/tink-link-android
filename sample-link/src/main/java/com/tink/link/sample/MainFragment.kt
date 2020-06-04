package com.tink.link.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.authenticateUser
import com.tink.model.user.User
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
        Tink.setUser(getUserFromIntent() ?: getUser())
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToProfileFragment())
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
        return getUserByAccessToken("eyJhbGciOiJFUzI1NiIsImtpZCI6IjliMzIyNTYyLTc1OTUtNGRjNy1hYjI3LWZmZGJiMDY5NDlkOCIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTEyOTEzMDMsImlhdCI6MTU5MTI4NDEwMywiaXNzIjoidGluazovL2F1dGgiLCJqdGkiOiI0ODU5ZjYwYy1lMDk4LTRlZmUtOGYxYi0yZTAyMDI0YzYxYzIiLCJvcmlnaW4iOiJtYWluIiwic2NvcGVzIjpbImludmVzdG1lbnRzOnJlYWQiLCJ0cmFuc2FjdGlvbnM6Y2F0ZWdvcml6ZSIsImNhdGVnb3JpZXM6cmVhZCIsInVzZXI6cmVhZCIsInN0YXRpc3RpY3M6cmVhZCIsImFjY291bnRzOnJlYWQiLCJjcmVkZW50aWFsczpyZWFkIiwidHJhbnNhY3Rpb25zOnJlYWQiLCJpbnNpZ2h0czpyZWFkIiwiaWRlbnRpdHk6cmVhZCIsImJ1ZGdldHM6cmVhZCJdLCJzdWIiOiJ0aW5rOi8vYXV0aC91c2VyL2FjMGNhMjJmOGMxMjQ0MTg5Y2JhMGE0NTdiMjdhNzljIiwidGluazovL2FwcC9pZCI6ImM2ZWUwMGZlOGEwYzRhYjE5MzBmYzkyMGFlMjk1YjdmIn0.OeF0aPaU6H9yvPd6licplK9nbbK1oMDPpMW_SmMIOvMdtio6Mh6MfdPqSU2yJCnNoysFKStt_2QzBjbtX2wLnQ")
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

    private fun getUserFromIntent(): User? =
        activity?.intent
            ?.getStringExtra(MainActivity.ACCESS_TOKEN_EXTRA)
            ?.takeUnless { it.isEmpty() }
            ?.let {
                User.fromAccessToken(it)
            }
}
