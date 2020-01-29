package com.tink.link.service.authorization

import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import com.tink.link.service.authentication.AccessTokenEventBus
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.network.TLSHelper
import com.tink.link.service.network.TinkLinkConfiguration
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import java.io.ByteArrayInputStream
import javax.inject.Inject
import javax.inject.Singleton

interface UserService {
    fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>)
    fun authenticate(authenticationCode: String, resultHandler: ResultHandler<String>)
}

private interface RetrofitUserService {

    @POST("/api/v1/oauth/authorize")
    fun authorize(
        @Header("Authorization") auth: String,
        @Body body: AuthorizationRequest
    ): Single<AuthorizationResponse>

    @POST("/link/v1/authentication/token")
    fun authenticate(
        @Body body: AuthenticationRequest
    ): Single<AuthenticationResponse>

    companion object {

        fun create(tinkLinkConfiguration: TinkLinkConfiguration): RetrofitUserService {

            val client = OkHttpClient.Builder()
                .apply {
                    tinkLinkConfiguration.environment.restSSLKey?.let {
                        sslSocketFactory(
                            TLSHelper.getSslSocketFactory(
                                ByteArrayInputStream(it.toByteArray())
                            )
                        )
                    }
                }
                .build()

            return Retrofit.Builder()
                .baseUrl(tinkLinkConfiguration.environment.restUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitUserService::class.java)
        }
    }

    data class AuthorizationRequest(
        @SerializedName("clientId") val clientId: String,
        @SerializedName("redirectUri") val redirectUri: String,
        @SerializedName("scope") val scope: String
    )

    data class AuthorizationResponse(
        @SerializedName("code") val authorizationCode: String
    )

    data class AuthenticationRequest(
        @SerializedName("code") val code: String
    )

    data class AuthenticationResponse(
        @SerializedName("accessToken") val accessToken: String,
        @SerializedName("Scope") val scope: String
    )
}

@Singleton
internal class UserServiceImpl @Inject constructor(
    private val tinkLinkConfiguration: TinkLinkConfiguration,
    accessTokenEventBus: AccessTokenEventBus
) : UserService {

    private var token: String? = null

    init {
        accessTokenEventBus.subscribe { token = it }
    }

    private val retrofitService =
        RetrofitUserService.create(tinkLinkConfiguration)


    @SuppressLint("CheckResult")
    override fun authorize(
        scopes: Set<Scope>,
        resultHandler: ResultHandler<String>
    ) {

        val accessToken = requireNotNull(token) { "Access token not set" }

        retrofitService
            .authorize(
                "Bearer $accessToken",
                RetrofitUserService.AuthorizationRequest(
                    tinkLinkConfiguration.oAuthClientId,
                    tinkLinkConfiguration.redirectUri.toString(),
                    scopes.joinToString(",")
                )
            )
            .map { it.authorizationCode }
            ?.subscribeOn(Schedulers.io())
            ?.subscribe(
                { resultHandler.onSuccess(it) },
                { resultHandler.onError(it) }
            )
    }

    @SuppressLint("CheckResult")
    override fun authenticate(authenticationCode: String, resultHandler: ResultHandler<String>) {
        retrofitService
            .authenticate(RetrofitUserService.AuthenticationRequest(authenticationCode))
            .map { it.accessToken }
            .subscribeOn(Schedulers.io())
            .subscribe(
                resultHandler.onSuccess,
                resultHandler.onError
            )
    }
}

sealed class Scope(private val scope: String) {
    object TransactionsRead : Scope("transactions:read")
    object AccountsRead : Scope("accounts:read")
    object UserRead : Scope("user:read")
    object CredentialsRead : Scope("credentials:read")
    object IdentityRead : Scope("identity:read")
    object InvestmentsRead : Scope("investments:read")
    object StatisticsRead : Scope("statistics:read")
    class CustomScope(scope: String) : Scope(scope)

    override fun toString(): String = scope
}
