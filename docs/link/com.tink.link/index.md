---
title: com.tink.link
---
//[link](../../index.html)/[com.tink.link](index.html)



# Package com.tink.link



## Types


| Name | Summary |
|---|---|
| TinkLink | [common, androidJvm]<br>[common]<br>object [TinkLink]([common]-tink-link/index.html)<br>[androidJvm]<br>object [TinkLink]([android-jvm]-tink-link/index.html)<br>This is for Java compatibility only. Use extensions on Tink when using Kotlin<br>**Since Kotlin** 999999999.0.0 |
| TinkLinkException | [common, androidJvm]<br>[common]<br>class [TinkLinkException]([common]-tink-link-exception/index.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null)<br>[androidJvm]<br>class [TinkLinkException]([android-jvm]-tink-link-exception/index.html)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) : [Exception](https://developer.android.com/reference/kotlin/java/lang/Exception.html) |


## Functions


| Name | Summary |
|---|---|
| authenticateUser | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[authenticateUser]([common]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: &lt;ERROR CLASS&gt;&lt;&lt;ERROR CLASS&gt;&gt;): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Tink.[authenticateUser]([android-jvm]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)<br>Authenticate an existing user with an authentication code. |
| createTemporaryUser | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[createTemporaryUser]([common]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: &lt;ERROR CLASS&gt;&lt;&lt;ERROR CLASS&gt;&gt;): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Tink.[createTemporaryUser]([android-jvm]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)<br>Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users. |
| getConsentContext | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[getConsentContext]([common]get-consent-context.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Tink.[getConsentContext]([android-jvm]get-consent-context.html)(): [ConsentContext](../com.tink.link.consent/[android-jvm]-consent-context/index.html) |
| getErrorHandler | [common]<br>fun &lt;ERROR CLASS&gt;.[getErrorHandler]([common]get-error-handler.html)(): [TinkLinkErrorHandler](../com.tink.link.errorhandler/[common]-tink-link-error-handler/index.html)<br>Fetches the [TinkLinkErrorHandler](../com.tink.link.errorhandler/[common]-tink-link-error-handler/index.html)<br>[androidJvm]<br>fun Tink.[getErrorHandler]([android-jvm]get-error-handler.html)(): [TinkLinkErrorHandler](../com.tink.link.errorhandler/[android-jvm]-tink-link-error-handler/index.html)<br>Fetches the [TinkLinkErrorHandler](../com.tink.link.errorhandler/[android-jvm]-tink-link-error-handler/index.html) |
| getUserContext | [common]<br>fun &lt;ERROR CLASS&gt;.[getUserContext]([common]get-user-context.html)(): [UserContext](../com.tink.link.core.user/[common]-user-context/index.html)?<br>Fetches the [UserContext](../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set.<br>[androidJvm]<br>fun Tink.[getUserContext]([android-jvm]get-user-context.html)(): [UserContext](../com.tink.link.core.user/[android-jvm]-user-context/index.html)?<br>Fetches the [UserContext](../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |
| getUserInfo | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[getUserInfo]([common]get-user-info.html)(resultHandler: &lt;ERROR CLASS&gt;&lt;&lt;ERROR CLASS&gt;&gt;): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Tink.[getUserInfo]([android-jvm]get-user-info.html)(resultHandler: ResultHandler&lt;UserInfo&gt;)<br>Fetches the UserInfo for an authenticated user. |
| requireUserContext | [common]<br>fun &lt;ERROR CLASS&gt;.[requireUserContext]([common]require-user-context.html)(): [UserContext](../com.tink.link.core.user/[common]-user-context/index.html)<br>Fetches the [UserContext](../com.tink.link.core.user/[common]-user-context/index.html) from Tink if a user is set.<br>[androidJvm]<br>fun Tink.[requireUserContext]([android-jvm]require-user-context.html)(): [UserContext](../com.tink.link.core.user/[android-jvm]-user-context/index.html)<br>Fetches the [UserContext](../com.tink.link.core.user/[android-jvm]-user-context/index.html) from Tink if a user is set. |

