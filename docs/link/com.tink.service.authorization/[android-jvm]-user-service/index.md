---
title: [androidJvm]UserService
---
//[link](../../../index.html)/[com.tink.service.authorization](../index.html)/[[androidJvm]UserService](index.html)



# UserService



[androidJvm]\
interface [UserService](index.html)



## Functions


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [androidJvm]<br>abstract suspend fun [authenticate](authenticate.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [authorize](authorize.html) | [androidJvm]<br>abstract suspend fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[android-jvm]-scope/index.html)&gt;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [createAnonymousUser](create-anonymous-user.html) | [androidJvm]<br>abstract suspend fun [createAnonymousUser](create-anonymous-user.html)(arguments: [UserCreationDescriptor](../[android-jvm]-user-creation-descriptor/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUserInfo](get-user-info.html) | [androidJvm]<br>abstract suspend fun [getUserInfo](get-user-info.html)(): [UserInfo](../../com.tink.model.user/[android-jvm]-user-info/index.html) |

