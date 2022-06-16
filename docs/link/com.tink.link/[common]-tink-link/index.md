---
title: [common]TinkLink
---
//[link](../../../index.html)/[com.tink.link](../index.html)/[[common]TinkLink](index.html)



# TinkLink



[common]\
object [TinkLink](index.html)

This is for Java compatibility only. Use extensions on [Tink](../../com.tink.core/[common]-tink/index.html) when using Kotlin







#### Since Kotlin



999999999.0.0



## Functions


| Name | Summary |
|---|---|
| [authenticateUser](authenticate-user.html) | [common]<br>fun [authenticateUser](authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Authenticate an existing user with an authentication code. |
| [createTemporaryUser](create-temporary-user.html) | [common]<br>fun [createTemporaryUser](create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users. |
| [getConsentContext](get-consent-context.html) | [common]<br>fun [getConsentContext](get-consent-context.html)(): &lt;ERROR CLASS&gt; |
| [getErrorHandler](get-error-handler.html) | [common]<br>fun [getErrorHandler](get-error-handler.html)(): [TinkLinkErrorHandler](../../com.tink.link.errorhandler/[common]-tink-link-error-handler/index.html)<br>Fetches the [TinkLinkErrorHandler](../../com.tink.link.errorhandler/[common]-tink-link-error-handler/index.html). |
| [getUserContext](get-user-context.html) | [common]<br>fun [getUserContext](get-user-context.html)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html)?<br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set. |
| [getUserInfo](get-user-info.html) | [common]<br>fun [getUserInfo](get-user-info.html)(resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[UserInfo](../../com.tink.model.user/[common]-user-info/index.html)&gt;): &lt;ERROR CLASS&gt;<br>Fetches the [UserInfo](../../com.tink.model.user/[common]-user-info/index.html) for an authenticated user. |
| [requireUserContext](require-user-context.html) | [common]<br>fun [requireUserContext](require-user-context.html)(): [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html)<br>Fetches the [UserContext](../../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set. |

