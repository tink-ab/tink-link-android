---
title: [androidJvm]Environment
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[androidJvm]Environment](index.html)



# Environment



[androidJvm]\
sealed class [Environment](index.html)

Represents the environment you want to connect to.



## Types


| Name | Summary |
|---|---|
| [Custom](-custom/index.html) | [androidJvm]<br>class [Custom](-custom/index.html)(val restUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Environment](index.html)<br>Represents a custom environment you want to connect to. |
| [Production](-production/index.html) | [androidJvm]<br>object [Production](-production/index.html) : [Environment](index.html)<br>Represents the Tink production environment |


## Properties


| Name | Summary |
|---|---|
| [restUrl](rest-url.html) | [androidJvm]<br>val [restUrl](rest-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The url for the REST endpoint |
| [sslCertificate](ssl-certificate.html) | [androidJvm]<br>val [sslCertificate](ssl-certificate.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>An optional ssl pinning certificate associated with the [restUrl](rest-url.html) |


## Inheritors


| Name |
|---|
| Production |
| Custom |

