package com.tink.link.credentials

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.tink.link.MainActivity
import com.tink.link.R
import kotlinx.android.synthetic.main.fragment_refresh_credentials.*

class RefreshCredentialsFragment : Fragment(R.layout.fragment_refresh_credentials) {

    private val viewModel: RefreshCredentialsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.initialize((activity as MainActivity).tinkLink.getUserContext()!!.credentialRepository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.credentials.observe(viewLifecycleOwner, Observer { credentialsList ->
            statusText.text = credentialsList.joinToString {
                "${it.providerName}: ${it.status}, ${it.statusUpdated}\n"
            }
        })

        viewModel.infoRequiredEvent.observe(viewLifecycleOwner, Observer {
            // Handle third party auth or supplemental information
        })

        refreshButton.setOnClickListener { viewModel.refreshAll() }
    }

}
