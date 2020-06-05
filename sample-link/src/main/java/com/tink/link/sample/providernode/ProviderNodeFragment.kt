package com.tink.link.sample.providernode

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.tink.link.sample.R
import com.tink.link.sample.credentials.CredentialsFragment
import com.tink.link.sample.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.sample.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.layout_provider_tree_node_list.*
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * Fragment responsible for displaying a list of providers that has the same credentials type.
 *
 * @see [ProviderTreeNode.CredentialsTypeNode]
 */
class ProviderNodeFragment : ProviderTreeNodeFragment(R.layout.fragment_provider_node) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.setText(R.string.provider_node_fragment_title)
        toolbar.title = toolbarTitle
        toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
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