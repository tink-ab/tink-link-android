---
title: Custom
---
//[link](../../../../index.html)/[com.tink.service.network](../../index.html)/[[common]Environment](../index.html)/[Custom](index.html)



# Custom



[common]\
class [Custom](index.html)(val restUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Environment](../index.html)

Represents a custom environment you want to connect to.



## Constructors


| | |
|---|---|
| [Custom](-custom.html) | [common]<br>fun [Custom](-custom.html)(restUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [restUrl](../rest-url.html) | [common]<br>val [restUrl](../rest-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The url for the REST endpoint |
| [sslCertificate](../ssl-certificate.html) | [common]<br>val [sslCertificate](../ssl-certificate.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>An optional ssl pinning certificate associated with the [restUrl](../rest-url.html) |

