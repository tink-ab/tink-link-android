package com.tink.link.ui.accesstype

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.squareup.picasso.Picasso
import com.tink.link.ui.credentialstype.CredentialsTypeListFragment
import com.tink.link.ui.R
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.Provider
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_fragment_access_type_list.*
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of access types that belong to the same financial institution.
 *
 * @see [ProviderTreeNode.FinancialInstitutionNode]
 */
class AccessTypeListFragment :
    ProviderTreeNodeFragment(R.layout.tink_fragment_access_type_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    private val providerList: List<ProviderTreeNode> by lazy {
        requireNotNull(arguments?.getParcelableArrayList<ProviderTreeNode>(ARG_PROVIDER_TREE))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (providerList.size == 1) {
            // Skip this level and go directly to the child,
            // instead of displaying a list of only one possible selection.
            findNavController().popBackStack()
            navigateToNode(providerList.first())
        }
    }

    override fun setupViews() {
        toolbar.title = getString(R.string.tink_access_type_fragment_title, toolbarTitle)
        setupCardViews()
    }

    private fun setupCardViews() {
        providerList
            .filterIsInstance<ProviderTreeNode.AccessTypeNode>()
            .let { accessTypeList ->
                accessTypeList
                    .firstOrNull { it.type == Provider.AccessType.OPEN_BANKING }
                    ?.let { openBankingItem ->
                        openBankingItem.icon?.let {
                            Picasso.get().load(it).into(openBankingLogo)
                            openBankingLogo.visibility = View.VISIBLE
                        }
                        openBankingAddButton.setOnClickListener { navigateToNode(openBankingItem) }
                        openBankingAccessTypeCard.visibility = View.VISIBLE
                    }
                accessTypeList
                    .firstOrNull { it.type == Provider.AccessType.OTHER }
                    ?.let { otherItem ->
                        otherItem.icon?.let {
                            Picasso.get().load(it).into(otherLogo)
                            otherLogo.visibility = View.VISIBLE
                        }
                        otherAddButton.setOnClickListener { navigateToNode(otherItem) }
                        otherAccessTypeCard.visibility = View.VISIBLE
                    }
            }
    }

    /**
     * Navigate to the [CredentialsTypeListFragment]
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        findNavController().navigate(
            R.id.credentialsTypeListFragment,
            bundleOf(
                ARG_PROVIDER_TREE to (node as ProviderTreeNode.AccessTypeNode).credentialsTypes.toArrayList(),
                ARG_PROVIDER_TOOLBAR_TITLE to toolbarTitle
            )
        )
    }
}
