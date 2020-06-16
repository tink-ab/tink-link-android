package com.tink.link.ui.providernode

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.R
import com.tink.link.ui.credentials.CredentialsFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of providers that has the same credentials type.
 *
 * @see [ProviderTreeNode.CredentialsTypeNode]
 */
internal class ProviderNodeFragment : ProviderTreeNodeFragment(R.layout.tink_fragment_provider_node) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.title = toolbarTitle
    }

    /**
     * Navigate to the [CredentialsFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.credentialsFragment,
            CredentialsFragment.getBundle(
                (node as ProviderTreeNode.ProviderNode).provider
            )
        )
    }
}