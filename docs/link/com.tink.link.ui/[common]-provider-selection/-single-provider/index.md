---
title: SingleProvider
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]ProviderSelection](../index.html)/[SingleProvider](index.html)



# SingleProvider



[common]\
data class [SingleProvider](index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [ProviderSelection](../index.html)

Adapt the UI to launch directly into a single provider with a unique [name](name.html) identifier. This will launch the create credentials view directly and skip the provider list selection.



## Throws


| | |
|---|---|
| IllegalArgumentException | If [name](name.html) is empty. |


## Constructors


| | |
|---|---|
| [SingleProvider](-single-provider.html) | [common]<br>fun [SingleProvider](-single-provider.html)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

