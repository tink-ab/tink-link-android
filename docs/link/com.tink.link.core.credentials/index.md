---
title: com.tink.link.core.credentials
---
//[link](../../index.html)/[com.tink.link.core.credentials](index.html)



# Package com.tink.link.core.credentials



## Types


| Name | Summary |
|---|---|
| CredentialsFailure | [common, androidJvm]<br>[common]<br>class [CredentialsFailure]([common]-credentials-failure/index.html)(val credentials: &lt;ERROR CLASS&gt;, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)<br>[androidJvm]<br>class [CredentialsFailure]([android-jvm]-credentials-failure/index.html)(val credentials: Credentials, message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| CredentialsRepository | [common, androidJvm]<br>[common]<br>class [CredentialsRepository]([common]-credentials-repository/index.html)constructor(service: &lt;ERROR CLASS&gt;, tinkConfiguration: &lt;ERROR CLASS&gt;)<br>[androidJvm]<br>class [CredentialsRepository]([android-jvm]-credentials-repository/index.html)@Injectconstructor(service: CredentialsService, tinkConfiguration: TinkConfiguration)<br>Repository for creating, accessing and modifying credentials. |
| CredentialsStatus | [common]<br>sealed class [CredentialsStatus]([common]-credentials-status/index.html)<br>The status of a Credentials. Possible values are [Success]([common]-credentials-status/-success/index.html), [Loading]([common]-credentials-status/-loading/index.html), and [AwaitingAuthentication]([common]-credentials-status/-awaiting-authentication/index.html)<br>[androidJvm]<br>sealed class [CredentialsStatus]([android-jvm]-credentials-status/index.html)<br>The status of a Credentials. Possible values are [Success]([android-jvm]-credentials-status/-success/index.html), [Loading]([android-jvm]-credentials-status/-loading/index.html), and [AwaitingAuthentication]([android-jvm]-credentials-status/-awaiting-authentication/index.html) |

