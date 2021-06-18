---
title: Provider -
---
//[link](../../index.md)/[com.tink.model.provider](../index.md)/[[androidJvm]Provider](index.md)/[Provider](-provider.md)



# Provider  
[androidJvm]  
Content  
fun [Provider](-provider.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Provider.Type](-type/index.md), status: [Provider.Status](-status/index.md), releaseStatus: [Provider.ReleaseStatus](-release-status/index.md)? = null, credentialsType: [Credentials.Type](../../com.tink.model.credentials/[android-jvm]-credentials/-type/index.md), helpText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isPopular: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, fields: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[android-jvm]-field/index.md)>, groupDisplayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), marketCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), images: [Images](../../com.tink.model/[android-jvm]-images/index.md)? = null, financialInstitution: [Provider.FinancialInstitution](-financial-institution/index.md), accessType: [Provider.AccessType](-access-type/index.md), capabilities: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Provider.Capability](-capability/index.md)>, authenticationUserType: [Provider.AuthenticationUserType](-authentication-user-type/index.md))  
More info  


creates a new provider object. This is usually done inside the Tink framework. It should normally not be necessary to create your own provider objects.

  



