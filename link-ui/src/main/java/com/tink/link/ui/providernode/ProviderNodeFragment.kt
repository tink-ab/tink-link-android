package com.tink.link.ui.providernode

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.R
import com.tink.link.ui.credentials.CredentialFragment
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of providers that has the same credential type.
 *
 * @see [ProviderTreeNode.CredentialTypeNode]
 */
class ProviderNodeFragment : ProviderTreeNodeFragment(R.layout.tink_fragment_provider_node) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    /**
     * Navigate to the [CredentialFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.credentialFragment,
            CredentialFragment.getBundle(
                (node as ProviderTreeNode.ProviderNode).provider
            )
        )
    }
}