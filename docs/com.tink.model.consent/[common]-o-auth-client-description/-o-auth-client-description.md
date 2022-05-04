---
title: OAuthClientDescription
---
//[link](../../../index.html)/[com.tink.model.consent](../index.html)/[[common]OAuthClientDescription](index.html)/[OAuthClientDescription](-o-auth-client-description.html)



# OAuthClientDescription



[common]\
fun [OAuthClientDescription](-o-auth-client-description.html)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[common]-scope-description/index.html)&gt;)



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




