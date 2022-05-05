---
title: [common]Tink
---
//[link](../../../index.html)/[com.tink.core](../index.html)/[[common]Tink](index.html)



# Tink



[common]\
object [Tink](index.html)



## Functions


| Name | Summary |
|---|---|
| [getConfiguration](get-configuration.html) | [common]<br>fun [getConfiguration](get-configuration.html)(): [TinkConfiguration](../../com.tink.service.network/[common]-tink-configuration/index.html)? |
| [getUser](get-user.html) | [common]<br>fun [getUser](get-user.html)(): [User](../../com.tink.model.user/[common]-user/index.html)? |
| [init](init.html) | [common]<br>fun [init](init.html)(config: [TinkConfiguration](../../com.tink.service.network/[common]-tink-configuration/index.html), context: &lt;ERROR CLASS&gt;)<br>Initializes Tink in the application and should be called before the usage of Tink components. This should only be called once. |
| [providerRepository](provider-repository.html) | [common]<br>fun [providerRepository](provider-repository.html)(): [ProviderRepository](../../com.tink.core.provider/[common]-provider-repository/index.html) |
| [requireComponent](require-component.html) | [common]<br>fun [requireComponent](require-component.html)(): &lt;ERROR CLASS&gt; |
| [setUser](set-user.html) | [common]<br>fun [setUser](set-user.html)(user: [User](../../com.tink.model.user/[common]-user/index.html)) |


## Extensions


| Name | Summary |
|---|---|
| authenticateUser | [common, androidJvm]<br>[common]<br>fun [Tink](index.html).[authenticateUser](../../com.tink.link/[common]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[authenticateUser](../../com.tink.link/[android-jvm]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[android-jvm]-user/index.html)&gt;)<br>Authenticate an existing user with an authentication code. |
| createTemporaryUser | [common, androidJvm]<br>[common]<br>fun [Tink](index.html).[createTemporaryUser](../../com.tink.link/[common]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[createTemporaryUser](../../com.tink.link/[android-jvm]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[android-jvm]-user/index.html)&gt;)<br>Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users. |
| getConsentContext | [common, androidJvm]<br>[common]<br>fun [Tink](index.html).[getConsentContext](../../com.tink.link/[common]get-consent-context.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[getConsentContext](../../com.tink.link/[android-jvm]get-consent-context.html)(): [ConsentContext](../../com.tink.link.consent/[android-jvm]-consent-context/index.html) |
| getUserContext | [common]<br>fun [Tink](index.html).[getUserContext](../../com.tink.link/[common]get-user-context.html)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html)?<br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set.<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[getUserContext](../../com.tink.link/[android-jvm]get-user-context.html)(): [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html)?<br>Fetches the [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |
| getUserInfo | [common]<br>fun [Tink](index.html).[getUserInfo](../../com.tink.link/[common]get-user-info.html)(resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[UserInfo](../../com.tink.model.user/[common]-user-info/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Fetches the [UserInfo](../../com.tink.model.user/[common]-user-info/index.html) for an authenticated user.<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[getUserInfo](../../com.tink.link/[android-jvm]get-user-info.html)(resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[UserInfo](../../com.tink.model.user/[android-jvm]-user-info/index.html)&gt;)<br>Fetches the [UserInfo](../../com.tink.model.user/[android-jvm]-user-info/index.html) for an authenticated user. |
| requireUserContext | [common]<br>fun [Tink](index.html).[requireUserContext](../../com.tink.link/[common]require-user-context.html)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html)<br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set.<br>[androidJvm]<br>fun [Tink](../[android-jvm]-tink/index.html).[requireUserContext](../../com.tink.link/[android-jvm]require-user-context.html)(): [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html)<br>Fetches the [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |

