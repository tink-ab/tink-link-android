package com.tink.link.service.network

import java.io.InputStream
import java.security.KeyStore
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.TrustManagerFactory

object TLSHelper {

    @Throws(Exception::class)
    private fun getTrustManagers(ca: InputStream): Array<TrustManager> {
        val ks = KeyStore.getInstance(KeyStore.getDefaultType())
        ks.load(null)
        val cf = CertificateFactory.getInstance("X.509")
        val cert = cf.generateCertificate(ca) as X509Certificate
        val principal = cert.subjectX500Principal
        ks.setCertificateEntry(principal.getName("RFC2253"), cert)
        // Set up trust manager factory to use our key store.
        val trustManagerFactory =
            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
        trustManagerFactory.init(ks)
        return trustManagerFactory.trustManagers
    }

    @Throws(Exception::class)
    fun getSslSocketFactory(ca: InputStream?): SSLSocketFactory {
        if (ca == null) {
            return SSLSocketFactory.getDefault() as SSLSocketFactory
        }

        val context = SSLContext.getInstance("TLS")
        context.init(null, getTrustManagers(ca), null)
        return context.socketFactory
    }

}
