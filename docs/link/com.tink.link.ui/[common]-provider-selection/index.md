---
title: [common]ProviderSelection
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[common]ProviderSelection](index.html)



# ProviderSelection



[common]\
sealed class [ProviderSelection](index.html)

Used as an argument for the [TinkLinkUiActivity](../[common]-tink-link-ui-activity/index.html) to specify if you want to select a [single provider](-single-provider/index.html) or a [list of providers](-provider-list/index.html).



## Types


| Name | Summary |
|---|---|
| [ProviderList](-provider-list/index.html) | [common]<br>data class [ProviderList](-provider-list/index.html)(val filter: &lt;ERROR CLASS&gt; = ProviderFilter()) : [ProviderSelection](index.html)<br>Show a provider list selection in the UI. This allows you to also specify an optional [filter](-provider-list/filter.html). |
| [SingleProvider](-single-provider/index.html) | [common]<br>data class [SingleProvider](-single-provider/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [ProviderSelection](index.html)<br>Adapt the UI to launch directly into a single provider with a unique [name](-single-provider/name.html) identifier. This will launch the create credentials view directly and skip the provider list selection. |


## Inheritors


| Name |
|---|
| SingleProvider |
| ProviderList |

