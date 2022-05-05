---
title: Status
---
//[link](../../../../index.html)/[com.tink.model.credentials](../../index.html)/[[common]Credentials](../index.html)/[Status](index.html)



# Status



[common]\
enum [Status](index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Credentials.Status](index.html)&gt; 

Represents the status of the credentials.



When data is being fetched/updated from a [Provider](../../../com.tink.model.provider/[common]-provider/index.html), the status of the credentials can change to indicate the current state of the flow. You can observe the credentials and act upon changes in the status if the [statusUpdated](../status-updated.html) value is greater than what it was previously.



## Entries


| | |
|---|---|
| [DELETED](-d-e-l-e-t-e-d/index.html) | [common]<br>[DELETED](-d-e-l-e-t-e-d/index.html)() |
| [DISABLED](-d-i-s-a-b-l-e-d/index.html) | [common]<br>[DISABLED](-d-i-s-a-b-l-e-d/index.html)() |
| [SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.html) | [common]<br>[SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.html)() |
| [AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.html) | [common]<br>[AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.html)() |
| [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html) | [common]<br>[AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html)() |
| [AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html) | [common]<br>[AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.html)() |
| [PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.html) | [common]<br>[PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.html)() |
| [AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.html) | [common]<br>[AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.html)() |
| [TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.html) | [common]<br>[TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.html)() |
| [UPDATED](-u-p-d-a-t-e-d/index.html) | [common]<br>[UPDATED](-u-p-d-a-t-e-d/index.html)() |
| [UPDATING](-u-p-d-a-t-i-n-g/index.html) | [common]<br>[UPDATING](-u-p-d-a-t-i-n-g/index.html)() |
| [AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.html) | [common]<br>[AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.html)() |
| [CREATED](-c-r-e-a-t-e-d/index.html) | [common]<br>[CREATED](-c-r-e-a-t-e-d/index.html)() |
| [UNKNOWN](-u-n-k-n-o-w-n/index.html) | [common]<br>[UNKNOWN](-u-n-k-n-o-w-n/index.html)() |


## Properties


| Name | Summary |
|---|---|
| [name](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439) | [common]<br>val [name](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-372974862%2FProperties%2F-1713223439): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439) | [common]<br>val [ordinal](../../../com.tink.service.network/[common]-sdk-client/-t-i-n-k_-l-i-n-k/index.html#-739389684%2FProperties%2F-1713223439): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

