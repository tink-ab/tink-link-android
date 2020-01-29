package com.tink.link.service.network

import android.content.Context
import android.net.Uri
import dagger.Module
import dagger.Provides
import io.grpc.Channel
import io.grpc.ClientInterceptors
import io.grpc.okhttp.OkHttpChannelBuilder
import com.tink.link.service.authentication.AccessTokenEventBus
import java.io.ByteArrayInputStream
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideInterceptor(
        tinkLinkConfig: TinkLinkConfiguration,
        accessTokenEventBus: AccessTokenEventBus
    ): HeaderClientInterceptor {
        return HeaderClientInterceptor(
            tinkLinkConfig.oAuthClientId,
            accessTokenEventBus
        )
    }

    @Provides
    @Singleton
    internal fun provideChannel(
        tinkLinkConfig: TinkLinkConfiguration,
        interceptor: HeaderClientInterceptor,
        applicationContext: Context
    ): Channel {
        val channel =
            OkHttpChannelBuilder
                .forAddress(tinkLinkConfig.environment.grpcUrl, tinkLinkConfig.environment.port)
                .apply {
                    tinkLinkConfig.environment.grpcSSLKey?.let { sslKey ->
                        sslSocketFactory(
                            TLSHelper.getSslSocketFactory(
                                ByteArrayInputStream(
                                    sslKey.toByteArray()
                                )
                            )
                        )
                    }
                }
                .build()

        ChannelConnector(applicationContext, channel).keepConnected()

        return ClientInterceptors.intercept(channel, interceptor)
    }
}

/**
 * Configuration for Tink Link
 * @param environment The environment you want to connect to. Use [Environment.Production] if you
 * are using the Tink environment or add your own with [Environment.Custom]
 * @param oAuthClientId Your client id. You can retrieve it from [the Tink console][https://console.tink.com].
 * @param redirectUri The URI to redirect back to your app from a browser or third party app.
 * Refer to the [third party authorization guide][https://github.com/tink-ab/tink-link-sdk-android/blob/master/third-party-authentication.md] for details.
 */
data class TinkLinkConfiguration(
    val environment: Environment,
    val oAuthClientId: String,
    val redirectUri: Uri
) {
    init {
        with(redirectUri) {
            require(!scheme.isNullOrEmpty() && !authority.isNullOrEmpty()) {
                "Both scheme and authority needs to be set for redirectUri."
            }
        }
    }
}

sealed class Environment(
    val grpcUrl: String,
    val restUrl: String,
    val port: Int,
    val grpcSSLKey: String? = null,
    val restSSLKey: String? = null
) {

    object Production : Environment(
        grpcUrl = "main-grpc.production.oxford.tink.se",
        restUrl = "https://api.tink.com",
        port = 443,
        grpcSSLKey = "-----BEGIN CERTIFICATE-----\n" +
                "MIIGfDCCBWSgAwIBAgISA6JCzTmIuC+c2L6Z0RKVuuduMA0GCSqGSIb3DQEBCwUA\n" +
                "MEoxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBFbmNyeXB0MSMwIQYDVQQD\n" +
                "ExpMZXQncyBFbmNyeXB0IEF1dGhvcml0eSBYMzAeFw0xOTA5MTUwMDEyMTZaFw0x\n" +
                "OTEyMTQwMDEyMTZaMC4xLDAqBgNVBAMTI21haW4tZ3JwYy5wcm9kdWN0aW9uLm94\n" +
                "Zm9yZC50aW5rLnNlMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAqRMz\n" +
                "xxeDEBPucYRqkN4SwKtm63hZXmHOstbAVHqwubdVyKtEavud5t2ksN34mmUelf6j\n" +
                "xkG9uaepB15nN3WCxezmqTP2aOUCZEk65yMEGkWHqTrzL2Wx97g923qYelet/aBw\n" +
                "s8X5OU5E2T0rUDWHsFktp/B7kOkV7dwGEvApj7Cf1Exnmk1iJl1me5u326AeWAOD\n" +
                "+71Qo4P7cEKEndYnADY7pIVyxfRnduwZpmovvEFYXyWFIzQJH2WR92q2/h/sRFGE\n" +
                "y2tWct8vcj6O/NCUoRX200Wc4Dzr/PKp5kpliFDWtz1/h1AO6jGUvDNMT/PsXVwq\n" +
                "38a+2iscE8O2rMnFtjilW0G6k3foOzfKX7Dkjqa618NNDDJWhTk8oAJ94xUnJEfz\n" +
                "HqIM5jvjpolBrnOotPE3a9s8Dd59V5SS30eU/htjcsXwMOxn5mSS4qWC+jyclc2E\n" +
                "2wI3aXCdfuXvXm9fl8zORzXlChAETM6JxtsTmuWLjev+5QiWLMUH7KRx81VY4V+P\n" +
                "4vJaQ+T/kYTLBHTIXmj7bMziEJkYD2qQrW1YxgsM8YvCx5f5je9BOodKQoCPGNj5\n" +
                "RnHmyA4o4f/HkrQk+yejNUJfQUTu25LuE9PBPk8jmLD7cGN9WQvGWZYe981IQvZc\n" +
                "3h70ODmGFxgBEWIA0lzYweSZMEv6m80enZyCTeMCAwEAAaOCAnYwggJyMA4GA1Ud\n" +
                "DwEB/wQEAwIFoDAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwDAYDVR0T\n" +
                "AQH/BAIwADAdBgNVHQ4EFgQU0nqn88nowwgt+v2UY7oskgQy++cwHwYDVR0jBBgw\n" +
                "FoAUqEpqYwR93brm0Tm3pkVl7/Oo7KEwbwYIKwYBBQUHAQEEYzBhMC4GCCsGAQUF\n" +
                "BzABhiJodHRwOi8vb2NzcC5pbnQteDMubGV0c2VuY3J5cHQub3JnMC8GCCsGAQUF\n" +
                "BzAChiNodHRwOi8vY2VydC5pbnQteDMubGV0c2VuY3J5cHQub3JnLzAuBgNVHREE\n" +
                "JzAlgiNtYWluLWdycGMucHJvZHVjdGlvbi5veGZvcmQudGluay5zZTBMBgNVHSAE\n" +
                "RTBDMAgGBmeBDAECATA3BgsrBgEEAYLfEwEBATAoMCYGCCsGAQUFBwIBFhpodHRw\n" +
                "Oi8vY3BzLmxldHNlbmNyeXB0Lm9yZzCCAQIGCisGAQQB1nkCBAIEgfMEgfAA7gB1\n" +
                "AOJpS64m6OlACeiGG7Y7g9Q+5/50iPukjyiTAZ3d8dv+AAABbTJ6QtUAAAQDAEYw\n" +
                "RAIgBimryfdTNENB7fZxWKR+70Hy3ZdCT5uo7JMC0M8UjNcCIEav84M6j3fGf2Zm\n" +
                "2JNNofhYF7v33vxB7WzW0O5mwT96AHUAKTxRllTIOWW6qlD8WAfUt2+/WHopctyk\n" +
                "wwz05UVH9HgAAAFtMnpCywAABAMARjBEAiB9DAhwG0SwlIhv37quc7wjp55X3DAE\n" +
                "0krJrGPjBrnWUAIgHNAVRs58tfUf6bErgtsXaXS7hlteM6k/l6xYe26Om40wDQYJ\n" +
                "KoZIhvcNAQELBQADggEBABJ0nKTp+puipp5hUmusm+8Tn2kZCVAfpsbjBZZ+H/k6\n" +
                "Nq4EAHmiTsDg2k91XUvZ1kUfN2LwW+UukwQqVWD/KxZ91M0yDwfYxSyP/pHuXIU2\n" +
                "PrbFoLIP9Lqh7ZERFJWyYMo2d5Yes1XQDJLa9zMA5P2cSHYnJxpuOZ84O2ioG4yy\n" +
                "S38Rz2aBTcDvaub1Z+cs5guUrL3NjxZji+x8CHTFjhpJ4Kfgocn3I+dNLp/0rxTm\n" +
                "aIlh9rC91zbAQ5esq95fJV96TpTnyLbkrU2mlWGQGTGFmklxulBMEN1sd2WWq8zq\n" +
                "HXjyrn4TF6wI7GbbHJQFh6Isr3ePMRYNrQaqUCYKtG8=\n" +
                "-----END CERTIFICATE-----\n",
        restSSLKey = "-----BEGIN CERTIFICATE-----\n" +
                "MIIGeDCCBWCgAwIBAgISA/I1VxCbScdt47kFS63VetEFMA0GCSqGSIb3DQEBCwUA\n" +
                "MEoxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBFbmNyeXB0MSMwIQYDVQQD\n" +
                "ExpMZXQncyBFbmNyeXB0IEF1dGhvcml0eSBYMzAeFw0xOTA4MTMwNjUzNDhaFw0x\n" +
                "OTExMTEwNjUzNDhaMBcxFTATBgNVBAMTDGFwaS50aW5rLmNvbTCCAiIwDQYJKoZI\n" +
                "hvcNAQEBBQADggIPADCCAgoCggIBAO9VBtV415cjUEOTibyUx0ILszmRpaj1UF4i\n" +
                "FppB8pYyB0zNwKUZqH3vbbyEXXnjjj/7HRKNLOpNgXnPhkDWIz2rlUDK0Mz1jBXD\n" +
                "wtICmW4Xhio20b3pJEE1LMkRv59H3jsxF5MrCgukdKZ44hw9yqyMMVv10ye1tB9Q\n" +
                "fJDu/sZQT85ztRfmRvXceSvv6EfUVPQByKR9oi220oJqUBWB2HjNMj/G/SXprxq9\n" +
                "y/pGDLUsiGtofVsU1V0/jskxKCmOJGYPABPavvGdMRyxswUB84eZUxdWOWa8tndT\n" +
                "mLJD7x9T7TqQAigLyRlROJXukRtNoXwDzskenFQTY28Iq0Xtttm9FuHoLP3DWVQ2\n" +
                "OQ7CrW5/HlhvJyyza9F0c0ldh2mXlqOpxOkJnVs7sCSQUolC2qGLWjh++B6kW0fu\n" +
                "T5RN50Ghh/jSv4afAXA+9mSmqk7T9TUIpsWPMh8LQQNXzjpDLhTeTjM/AIOja6NU\n" +
                "qaS+WIEe4FJm+c0BFi0zd+J2XwN2+JsiQhPbb3oASKnBvw5/KQblFPTdaAf5Bz3+\n" +
                "hVusiDxfvClp9YrCDfjbfqmT06O9u44BddKmd0CH3oeiZqwLNDjoUjwHzV7lszGh\n" +
                "7vPKsC3WpAjjgKTPsIdMFubS4NKOIKHxILLSd+31j7dYF9DH3lRPGLzpOC6CNwAA\n" +
                "zb48DyaLAgMBAAGjggKJMIIChTAOBgNVHQ8BAf8EBAMCBaAwHQYDVR0lBBYwFAYI\n" +
                "KwYBBQUHAwEGCCsGAQUFBwMCMAwGA1UdEwEB/wQCMAAwHQYDVR0OBBYEFMR+Okdu\n" +
                "tEBsEwWtYgjWtaTV37E2MB8GA1UdIwQYMBaAFKhKamMEfd265tE5t6ZFZe/zqOyh\n" +
                "MG8GCCsGAQUFBwEBBGMwYTAuBggrBgEFBQcwAYYiaHR0cDovL29jc3AuaW50LXgz\n" +
                "LmxldHNlbmNyeXB0Lm9yZzAvBggrBgEFBQcwAoYjaHR0cDovL2NlcnQuaW50LXgz\n" +
                "LmxldHNlbmNyeXB0Lm9yZy8wPgYDVR0RBDcwNYIlYXBpLWdhdGV3YXkucHJvZHVj\n" +
                "dGlvbi5veGZvcmQudGluay5zZYIMYXBpLnRpbmsuY29tMEwGA1UdIARFMEMwCAYG\n" +
                "Z4EMAQIBMDcGCysGAQQBgt8TAQEBMCgwJgYIKwYBBQUHAgEWGmh0dHA6Ly9jcHMu\n" +
                "bGV0c2VuY3J5cHQub3JnMIIBBQYKKwYBBAHWeQIEAgSB9gSB8wDxAHYA4mlLribo\n" +
                "6UAJ6IYbtjuD1D7n/nSI+6SPKJMBnd3x2/4AAAFsifgE3QAABAMARzBFAiEAlHuA\n" +
                "7SHsS7+dx0TlNL+k/DKqTF5iRoTyX5/AcGGvhwoCIC+fh04UfP9unAKpqXQsjZri\n" +
                "JzRyd6kF0DT41xM9ib0fAHcAY/Lbzeg7zCzPC3KEJ1drM6SNYXePvXWmOLHHaFRL\n" +
                "2I0AAAFsifgE/wAABAMASDBGAiEAqsgqCcgKeRvVUgHFY38a3/GqzlvZjJyNZl7k\n" +
                "E2NMWXoCIQCYIYFYlh9od9F4d7wwBfdv5Laki03zEgTZB3YEAAO6kDANBgkqhkiG\n" +
                "9w0BAQsFAAOCAQEAXHZ/tliSQOu+ZbM7OmnQg+GqEvRhd0wQzrcVv0gv/XtXtn0W\n" +
                "LNPz30MPluXrHUd/OHbF1ITaTqHylpvhSegH6wlXrfkfrFJjHbo9Detl4Pl7OhAM\n" +
                "VXeh0p7Sj/XP3zl7oXOUwTZbbiBRnFZRRcWo8aYYKOSw4BN4VbGbVSh4eAvw1OTf\n" +
                "FQF1F8GfI2qWmj4Zzyj2rzOtOVr7uSE1Dh2quAzmNYF/++x++yymjbvMUJzFLbQF\n" +
                "wN+4fkWdfm52naf2ee/rggxyjUBQpX28fPehxyuRee+cYrEeFkdXlLpepxkeKmMk\n" +
                "gHxwu2y5CcKwNwBmXVoC5pfHM9HDvCwKdbsENw==\n" +
                "-----END CERTIFICATE-----\n"
    )

    class Custom(
        grpcApiUrl: String,
        restApiUrl: String,
        portNumber: Int,
        grpcApiSSLKey: String?,
        restApiSSLKey: String?
    ) : Environment(
        grpcUrl = grpcApiUrl,
        restUrl = restApiUrl,
        port = portNumber,
        grpcSSLKey = grpcApiSSLKey,
        restSSLKey = restApiSSLKey
    )
}
