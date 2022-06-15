---
title: [androidJvm]Scope
---
//[link](../../../index.html)/[com.tink.model.user](../index.html)/[[androidJvm]Scope](index.html)



# Scope



[androidJvm]\
sealed class [Scope](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Types


| Name | Summary |
|---|---|
| [AccountsRead](-accounts-read/index.html) | [androidJvm]<br>object [AccountsRead](-accounts-read/index.html) : [Scope](index.html) |
| [CredentialsRead](-credentials-read/index.html) | [androidJvm]<br>object [CredentialsRead](-credentials-read/index.html) : [Scope](index.html) |
| [CustomScope](-custom-scope/index.html) | [androidJvm]<br>class [CustomScope](-custom-scope/index.html)(scope: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Scope](index.html) |
| [IdentityRead](-identity-read/index.html) | [androidJvm]<br>object [IdentityRead](-identity-read/index.html) : [Scope](index.html) |
| [InvestmentsRead](-investments-read/index.html) | [androidJvm]<br>object [InvestmentsRead](-investments-read/index.html) : [Scope](index.html) |
| [StatisticsRead](-statistics-read/index.html) | [androidJvm]<br>object [StatisticsRead](-statistics-read/index.html) : [Scope](index.html) |
| [TransactionsRead](-transactions-read/index.html) | [androidJvm]<br>object [TransactionsRead](-transactions-read/index.html) : [Scope](index.html) |
| [UserRead](-user-read/index.html) | [androidJvm]<br>object [UserRead](-user-read/index.html) : [Scope](index.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.html) | [androidJvm]<br>open override fun [toString](to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| TransactionsRead |
| AccountsRead |
| UserRead |
| CredentialsRead |
| IdentityRead |
| InvestmentsRead |
| StatisticsRead |
| CustomScope |

