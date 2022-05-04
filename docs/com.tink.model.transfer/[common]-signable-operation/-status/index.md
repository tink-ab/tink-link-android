---
title: Status
---
//[link](../../../../index.html)/[com.tink.model.transfer](../../index.html)/[[common]SignableOperation](../index.html)/[Status](index.html)



# Status



[common]\
enum [Status](index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[SignableOperation.Status](index.html)&gt; 

The status of the operation. [CANCELLED](-c-a-n-c-e-l-l-e-d/index.html), [FAILED](-f-a-i-l-e-d/index.html) and [EXECUTED](-e-x-e-c-u-t-e-d/index.html) are all endstates.



## Entries


| | |
|---|---|
| [UNKNOWN](-u-n-k-n-o-w-n/index.html) | [common]<br>[UNKNOWN](-u-n-k-n-o-w-n/index.html)() |
| [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html) | [common]<br>[AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html)() |
| [EXECUTED](-e-x-e-c-u-t-e-d/index.html) | [common]<br>[EXECUTED](-e-x-e-c-u-t-e-d/index.html)() |
| [FAILED](-f-a-i-l-e-d/index.html) | [common]<br>[FAILED](-f-a-i-l-e-d/index.html)() |
| [CANCELLED](-c-a-n-c-e-l-l-e-d/index.html) | [common]<br>[CANCELLED](-c-a-n-c-e-l-l-e-d/index.html)() |
| [AWAITING_CREDENTIALS](-a-w-a-i-t-i-n-g_-c-r-e-d-e-n-t-i-a-l-s/index.html) | [common]<br>[AWAITING_CREDENTIALS](-a-w-a-i-t-i-n-g_-c-r-e-d-e-n-t-i-a-l-s/index.html)() |
| [EXECUTING](-e-x-e-c-u-t-i-n-g/index.html) | [common]<br>[EXECUTING](-e-x-e-c-u-t-i-n-g/index.html)() |
| [CREATED](-c-r-e-a-t-e-d/index.html) | [common]<br>[CREATED](-c-r-e-a-t-e-d/index.html)() |


## Functions


| Name | Summary |
|---|---|
| [isEndState](is-end-state.html) | [common]<br>fun [isEndState](is-end-state.html)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |


## Properties


| Name | Summary |
|---|---|
| [name](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439) | [common]<br>val [name](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439) | [common]<br>val [ordinal](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

