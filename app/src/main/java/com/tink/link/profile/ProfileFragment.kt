package com.tink.link.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tink.link.MainActivity
import com.tink.link.R
import com.tink.link.providerlist.ProviderListFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var viewModel: ProfileViewModel

    private val adapter = CredentialRowAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this)[ProfileViewModel::class.java].also {
            it.initialize((activity as MainActivity).tinkLink)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.connections.observe(viewLifecycleOwner, Observer {
            adapter.connections = it
        })

        viewModel.providers.observe(viewLifecycleOwner, Observer { providerList ->
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
        })
    }
}
