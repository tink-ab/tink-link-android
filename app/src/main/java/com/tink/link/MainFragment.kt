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
        findNavController().navigate(R.id.profileFragment)
    }

    /**
     * Implement this method by returning a [User] either from an existing access token
     * (just create a [User] object with that token and return it),
     * or by fetching it from [TinkLink.authenticateUser].
     *
     * @see [getUserByAccessToken]
     * @see [getUserByAuthenticationCode]
     */
    private fun getUser(): User = User(
        "eyJhbGciOiJFUzI1NiIsImtpZCI6IjkyZjI1ZWM2LWFiN2QtNGEzZS1hZmE4LTFhYjZiYTAxMzQyZSIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODAzOTYzNjgsImlhdCI6MTU4MDM4OTE2OCwiaXNzIjoidGluazovL2F1dGgiLCJqdGkiOiJmN2ExODRhMi0zZjMxLTQxNTUtOTlkYS1iY2U3MDNiZjI3ZWMiLCJvcmlnaW4iOiJtYWluIiwic2NvcGVzIjpbInByb3ZpZGVyczpyZWFkIiwic3VnZ2VzdGlvbnM6cmVhZCIsImludmVzdG1lbnRzOnJlYWQiLCJjcmVkZW50aWFsczp3cml0ZSIsImF1dGhvcml6YXRpb246cmVhZCIsImNyZWRlbnRpYWxzOnJlZnJlc2giLCJ1c2VyOnJlYWQiLCJzdGF0aXN0aWNzOnJlYWQiLCJhY2NvdW50czpyZWFkIiwiY3JlZGVudGlhbHM6cmVhZCIsInRyYW5zYWN0aW9uczpyZWFkIl0sInN1YiI6InRpbms6Ly9hdXRoL3VzZXIvOTdjNmE3NDc3MWEyNGI1NmI1YTJjZmIyMGM1NDVkNjYiLCJ0aW5rOi8vYXBwL2lkIjoiMDIyNThiMWFlMDNkNDQ5YWE3M2EyY2Y5OWRhMjlhZDMifQ.7EhJRK6wUA0DsUV1FFSCqF2p2RVLxo04kIgjAAb2AiKmTIhkNZH05rEsy64k70SzUNFNdihruXUPZ3ZR9FTApQ"
    )

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