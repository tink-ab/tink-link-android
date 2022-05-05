---
title: Production
---
//[link](../../../../index.html)/[com.tink.service.network](../../index.html)/[[common]Environment](../index.html)/[Production](index.html)



# Production



[common]\
object [Production](index.html) : [Environment](../index.html)

Represents the Tink production environment



## Properties


| Name | Summary |
|---|---|
| [restUrl](../rest-url.html) | [common]<br>val [restUrl](../rest-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The url for the REST endpoint |
| [sslCertificate](../ssl-certificate.html) | [common]<br>val [sslCertificate](../ssl-certificate.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>An optional ssl pinning certificate associated with the [restUrl](../rest-url.html) |


## Extensions


| Name | Summary |
|---|---|
| withSslKey | [common]<br>fun [Environment.Production](index.html).[withSslKey](../../[common]with-ssl-key.html)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom](../-custom/index.html)<br>Creates an environment with the [Environment.Production](index.html) rest URL and the specified [sslCertificate](../../[common]with-ssl-key.html).<br>[androidJvm]<br>fun [Environment.Production](../../[android-jvm]-environment/-production/index.html).[withSslKey](../../[android-jvm]with-ssl-key.html)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom](../../[android-jvm]-environment/-custom/index.html)<br>Creates an environment with the [Environment.Production](../../[android-jvm]-environment/-production/index.html) rest URL and the specified [sslCertificate](../../[android-jvm]with-ssl-key.html). |

