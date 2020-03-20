package com.tink.link.ui.credentialtype

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.R
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.link.ui.providernode.ProviderNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of credential types that belongs to the same access type.
 *
 * @see [ProviderTreeNode.AccessTypeNode]
 */
class CredentialTypeListFragment :
    ProviderTreeNodeFragment(R.layout.tink_fragment_credential_type_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.title = getString(R.string.tink_credential_type_fragment_title)
    }

    /**
     * Navigate to the [ProviderNodeFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.providerNodeFragment,
            bundleOf(
                ARG_PROVIDER_TOOLBAR_TITLE to toolbarTitle,
                ARG_PROVIDER_TREE to (node as ProviderTreeNode.CredentialTypeNode).providers.toArrayList()
            )
        )
    }
}