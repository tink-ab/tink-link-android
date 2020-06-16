package com.tink.link.ui.financialinstitution

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tink.link.ui.R
import com.tink.link.ui.accesstype.AccessTypeListFragment
import com.tink.link.ui.extensions.toArrayList
import com.tink.link.ui.providertree.ARG_PROVIDER_TOOLBAR_TITLE
import com.tink.link.ui.providertree.ARG_PROVIDER_TREE
import com.tink.link.ui.providertree.ProviderTreeNodeFragment
import com.tink.model.provider.ProviderTreeNode
import kotlinx.android.synthetic.main.tink_layout_toolbar.*

/**
 * Fragment responsible for displaying a list of financial institutions that belongs to the same financial institution group.
 *
 * @see [ProviderTreeNode.FinancialInstitutionGroupNode]
 */
internal class FinancialInstitutionListFragment :
    ProviderTreeNodeFragment(R.layout.tink_fragment_provider_list) {

    private val toolbarTitle: String by lazy {
        requireNotNull(arguments?.getString(ARG_PROVIDER_TOOLBAR_TITLE))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.title = toolbarTitle
    }

    /**
     * Navigate to the [AccessTypeListFragment].
     */
    override fun navigateToNode(node: ProviderTreeNode) {
        val selectedInstitution = node as ProviderTreeNode.FinancialInstitutionNode
        findNavController().navigate(
            R.id.accessTypeListFragment,
            bundleOf(
                ARG_PROVIDER_TREE to selectedInstitution.accessTypes.toArrayList(),
                ARG_PROVIDER_TOOLBAR_TITLE to selectedInstitution.name
            )
        )
    }
}