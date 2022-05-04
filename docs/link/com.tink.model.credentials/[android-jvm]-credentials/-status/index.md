---
title: Status
---
//[link](../../../../index.html)/[com.tink.model.credentials](../../index.html)/[[androidJvm]Credentials](../index.html)/[Status](index.html)



# Status



[androidJvm]\
enum [Status](index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Status](index.html)&gt; 

Represents the status of the credentials.



When data is being fetched/updated from a [Provider](../../../com.tink.model.provider/[android-jvm]-provider/index.html), the status of the credentials can change to indicate the current state of the flow. You can observe the credentials and act upon changes in the status if the [statusUpdated](../status-updated.html) value is greater than what it was previously.



## Entries


| | |
|---|---|
| [DELETED](-d-e-l-e-t-e-d/index.html) | [androidJvm]<br>[DELETED](-d-e-l-e-t-e-d/index.html)() |
| [DISABLED](-d-i-s-a-b-l-e-d/index.html) | [androidJvm]<br>[DISABLED](-d-i-s-a-b-l-e-d/index.html)() |
| [SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.html) | [androidJvm]<br>[SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.html)() |
| [AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.html) | [androidJvm]<br>[AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.html)() |
| [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html) | [androidJvm]<br>[AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html)() |
| [AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html) | [androidJvm]<br>[AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html)() |
| [PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.html) | [androidJvm]<br>[PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.html)() |
| [AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.html) | [androidJvm]<br>[AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.html)() |
| [TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.html) | [androidJvm]<br>[TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.html)() |
| [UPDATED](-u-p-d-a-t-e-d/index.html) | [androidJvm]<br>[UPDATED](-u-p-d-a-t-e-d/index.html)() |
| [UPDATING](-u-p-d-a-t-i-n-g/index.html) | [androidJvm]<br>[UPDATING](-u-p-d-a-t-i-n-g/index.html)() |
| [AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.html) | [androidJvm]<br>[AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.html)() |
| [CREATED](-c-r-e-a-t-e-d/index.html) | [androidJvm]<br>[CREATED](-c-r-e-a-t-e-d/index.html)() |
| [UNKNOWN](-u-n-k-n-o-w-n/index.html) | [androidJvm]<br>[UNKNOWN](-u-n-k-n-o-w-n/index.html)() |


## Properties


| Name | Summary |
|---|---|
| [name](../../../com.tink.service.network/[android-jvm]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-812656150) | [androidJvm]<br>val [name](../../../com.tink.service.network/[android-jvm]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-812656150): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../../com.tink.service.network/[android-jvm]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-812656150) | [androidJvm]<br>val [ordinal](../../../com.tink.service.network/[android-jvm]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-812656150): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

