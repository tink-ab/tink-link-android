package com.tink.link.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.ui.providerlist.ProviderListFragment.Companion.getBundle
import com.tink.model.provider.Provider
import com.tink.service.handler.ResultHandler

class MainFragment : Fragment(), TinkLinkConsumer {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tink_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Tink.getUserContext()?.providerRepository?.listProviders(
            handler = ResultHandler(
                { providers: List<Provider> ->
                    findNavController().navigate(
                        R.id.action_mainFragment_to_providerListFragment,
                        getBundle(providers)
                    )
                }, {}
            ),
            includeDemoProviders = true
        )


    }
}