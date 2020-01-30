package com.tink.link.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tink.link.MainActivity
import com.tink.link.R
import com.tink.link.TinkLink
import com.tink.link.model.credential.Credential
import com.tink.link.providerlist.ProviderListFragment
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.streaming.publisher.StreamObserver
import com.tink.link.service.streaming.publisher.StreamSubscription
import kotlinx.android.synthetic.main.fragment_profile.*
import timber.log.Timber

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var tinkLink: TinkLink

    private var subscription: StreamSubscription? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tinkLink = (activity as MainActivity).tinkLink
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        subscription = tinkLink.getUserContext()?.credentialRepository?.listStream()
            ?.subscribe(object : StreamObserver<List<Credential>> {

                override fun onNext(value: List<Credential>) {
                    super.onNext(value)
                    value
                        .joinToString { "${it.providerName}: ${it.status}\n" }
                        .also { info.text = it }
                }
            })

        addBankButton.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_providerListFragment) }

        tinkLink.getUserContext()?.providerRepository?.listProviders(
            ResultHandler(
                { providerList ->
                    addBankButton.post {
                        if (providerList.isNotEmpty()) {

                            addBankButton.isEnabled = true
                            addBankButton.setOnClickListener {
                                findNavController().navigate(
                                    R.id.action_profileFragment_to_providerListFragment,
                                    ProviderListFragment.getBundle(providerList)
                                )
                            }
                        } else {
                            addBankButton.isEnabled = false
                        }
                    }
                },
                {
                    Timber.tag("Jan").e(it, "list providers error")
                    // Handle error
                }
            ),
            includeDemoProviders = true
        )
    }

    override fun onDestroyView() {
        subscription?.unsubscribe()
        super.onDestroyView()
    }
}