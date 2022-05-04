---
title: Provider
---
//[link](../../../index.html)/[com.tink.model.provider](../index.html)/[[androidJvm]Provider](index.html)/[Provider](-provider.html)



# Provider



[androidJvm]\
fun [Provider](-provider.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Provider.Type](-type/index.html), status: [Provider.Status](-status/index.html), releaseStatus: [Provider.ReleaseStatus](-release-status/index.html)? = null, credentialsType: [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.html), helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isPopular: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, fields: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Field](../../com.tink.model.misc/[android-jvm]-field/index.html)&gt;, groupDisplayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), marketCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), images: [Images](../../com.tink.model/[android-jvm]-images/index.html)? = null, financialInstitution: [Provider.FinancialInstitution](-financial-institution/index.html), accessType: [Provider.AccessType](-access-type/index.html), capabilities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Provider.Capability](-capability/index.html)&gt;, authenticationUserType: [Provider.AuthenticationUserType](-authentication-user-type/index.html))



creates a new provider object. This is usually done inside the Tink framework. It should normally not be necessary to create your own provider objects.




