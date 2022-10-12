---
title: [common]CredentialsOperationArgs
---
//[link](../../../index.html)/[com.tink.link.ui.credentials](../index.html)/[[common]CredentialsOperationArgs](index.html)



# CredentialsOperationArgs



[common]\
sealed class [CredentialsOperationArgs](index.html)



## Types


| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.html) | [common]<br>data class [Authenticate](-authenticate/index.html)(val provider: &lt;ERROR CLASS&gt;, val credentials: &lt;ERROR CLASS&gt;) : [CredentialsOperationArgs](index.html) |
| [Create](-create/index.html) | [common]<br>data class [Create](-create/index.html)(val provider: &lt;ERROR CLASS&gt;) : [CredentialsOperationArgs](index.html) |
| [Refresh](-refresh/index.html) | [common]<br>data class [Refresh](-refresh/index.html)(val provider: &lt;ERROR CLASS&gt;, val credentials: &lt;ERROR CLASS&gt;, val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [CredentialsOperationArgs](index.html) |
| [Update](-update/index.html) | [common]<br>data class [Update](-update/index.html)(val provider: &lt;ERROR CLASS&gt;, val credentials: &lt;ERROR CLASS&gt;) : [CredentialsOperationArgs](index.html) |


## Properties


| Name | Summary |
|---|---|
| [provider](provider.html) | [common]<br>abstract val [provider](provider.html): &lt;ERROR CLASS&gt; |


## Inheritors


| Name |
|---|
| Create |
| Update |
| Refresh |
| Authenticate |

