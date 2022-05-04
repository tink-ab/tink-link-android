---
title: [common]Environment
---
//[link](../../../index.html)/[com.tink.service.network](../index.html)/[[common]Environment](index.html)



# Environment



[common]\
sealed class [Environment](index.html)

Represents the environment you want to connect to.



## Types


| Name | Summary |
|---|---|
| [Custom](-custom/index.html) | [common]<br>class [Custom](-custom/index.html)(val restUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Environment](index.html)<br>Represents a custom environment you want to connect to. |
| [Production](-production/index.html) | [common]<br>object [Production](-production/index.html) : [Environment](index.html)<br>Represents the Tink production environment |


## Properties


| Name | Summary |
|---|---|
| [restUrl](rest-url.html) | [common]<br>val [restUrl](rest-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The url for the REST endpoint |
| [sslCertificate](ssl-certificate.html) | [common]<br>val [sslCertificate](ssl-certificate.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>An optional ssl pinning certificate associated with the [restUrl](rest-url.html) |


## Inheritors


| Name |
|---|
| Production |
| Custom |

