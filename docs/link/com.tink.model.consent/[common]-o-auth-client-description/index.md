---
title: [common]OAuthClientDescription
---
//[link](../../../index.html)/[com.tink.model.consent](../index.html)/[[common]OAuthClientDescription](index.html)



# OAuthClientDescription



[common]\
data class [OAuthClientDescription](index.html)(val clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[common]-scope-description/index.html)&gt;)

A description of the OAuth client and the data it will collect from the user.



## Parameters


common

| | |
|---|---|
| clientName | : The name of the application specified by the client when creating it in the console. |
| clientUrl | : A url specified by the client for additional information. Can be empty. |
| clientIconUrl | : A url for a client icon. Can be empty. |
| scopeDescriptions | : A list of [ScopeDescription](../[common]-scope-description/index.html)s describing which financial info is going to be collected. |
| verified | : Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data. |
| aggregator | : Describes whether the client is aggregating data under their own or under Tink's license. |



## Constructors


| | |
|---|---|
| [OAuthClientDescription](-o-auth-client-description.html) | [common]<br>fun [OAuthClientDescription](-o-auth-client-description.html)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[common]-scope-description/index.html)&gt;) |


## Properties


| Name | Summary |
|---|---|
| [aggregator](aggregator.html) | [common]<br>val [aggregator](aggregator.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clientIconUrl](client-icon-url.html) | [common]<br>val [clientIconUrl](client-icon-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientName](client-name.html) | [common]<br>val [clientName](client-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientUrl](client-url.html) | [common]<br>val [clientUrl](client-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scopeDescriptions](scope-descriptions.html) | [common]<br>val [scopeDescriptions](scope-descriptions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[common]-scope-description/index.html)&gt; |
| [verified](verified.html) | [common]<br>val [verified](verified.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

