---
title: com.tink.link.core.credentials
---
//[link](../../index.html)/[com.tink.link.core.credentials](index.html)



# Package com.tink.link.core.credentials



## Types


| Name | Summary |
|---|---|
| CredentialsFailure | [common, androidJvm]<br>[common]<br>class [CredentialsFailure]([common]-credentials-failure/index.html)(val credentials: [Credentials](../com.tink.model.credentials/[common]-credentials/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)<br>[androidJvm]<br>class [CredentialsFailure]([android-jvm]-credentials-failure/index.html)(val credentials: [Credentials](../com.tink.model.credentials/[android-jvm]-credentials/index.html), message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| CredentialsRepository | [common, androidJvm]<br>[common]<br>class [CredentialsRepository]([common]-credentials-repository/index.html)constructor(service: [CredentialsService](../com.tink.service.credentials/[common]-credentials-service/index.html), tinkConfiguration: [TinkConfiguration](../com.tink.service.network/[common]-tink-configuration/index.html))<br>[androidJvm]<br>class [CredentialsRepository]([android-jvm]-credentials-repository/index.html)@Injectconstructor(service: [CredentialsService](../com.tink.service.credentials/[android-jvm]-credentials-service/index.html), tinkConfiguration: [TinkConfiguration](../com.tink.service.network/[android-jvm]-tink-configuration/index.html))<br>Repository for creating, accessing and modifying credentials. |
| CredentialsStatus | [common]<br>sealed class [CredentialsStatus]([common]-credentials-status/index.html)<br>The status of a Credentials. Possible values are [Success]([common]-credentials-status/-success/index.html), [Loading]([common]-credentials-status/-loading/index.html), and [AwaitingAuthentication]([common]-credentials-status/-awaiting-authentication/index.html)<br>[androidJvm]<br>sealed class [CredentialsStatus]([android-jvm]-credentials-status/index.html)<br>The status of a Credentials. Possible values are [Success]([android-jvm]-credentials-status/-success/index.html), [Loading]([android-jvm]-credentials-status/-loading/index.html), and [AwaitingAuthentication]([android-jvm]-credentials-status/-awaiting-authentication/index.html) |

