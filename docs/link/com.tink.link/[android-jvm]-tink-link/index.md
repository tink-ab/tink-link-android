---
title: [androidJvm]TinkLink
---
//[link](../../../index.html)/[com.tink.link](../index.html)/[[androidJvm]TinkLink](index.html)



# TinkLink



[androidJvm]\
object [TinkLink](index.html)

This is for Java compatibility only. Use extensions on Tink when using Kotlin







#### Since Kotlin



999999999.0.0



## Functions


| Name | Summary |
|---|---|
| [authenticateUser](authenticate-user.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [authenticateUser](authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)<br>Authenticate an existing user with an authentication code. |
| [createTemporaryUser](create-temporary-user.html) | [androidJvm]<br>fun [createTemporaryUser](create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)<br>Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users. |
| [getConsentContext](get-consent-context.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [getConsentContext](get-consent-context.html)(): [ConsentContext](../../com.tink.link.consent/[android-jvm]-consent-context/index.html) |
| [getUserContext](get-user-context.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [getUserContext](get-user-context.html)(): [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html)?<br>Fetches the [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |
| [getUserInfo](get-user-info.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [getUserInfo](get-user-info.html)(resultHandler: ResultHandler&lt;UserInfo&gt;)<br>Fetches the UserInfo for an authenticated user. |
| [requireUserContext](require-user-context.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [requireUserContext](require-user-context.html)(): [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html)<br>Fetches the [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |

