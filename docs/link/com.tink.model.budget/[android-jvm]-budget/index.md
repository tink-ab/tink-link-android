---
title: [androidJvm]Budget
---
//[link](../../../index.html)/[com.tink.model.budget](../index.html)/[[androidJvm]Budget](index.html)



# Budget



[androidJvm]\
class [Budget](index.html)



## Constructors


| | |
|---|---|
| [Budget](-budget.html) | [androidJvm]<br>fun [Budget](-budget.html)() |


## Types


| Name | Summary |
|---|---|
| [Period](-period/index.html) | [androidJvm]<br>data class [Period](-period/index.html)(val start: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val end: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val spentAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val budgetAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Periodicity](-periodicity/index.html) | [androidJvm]<br>sealed class [Periodicity](-periodicity/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Specification](-specification/index.html) | [androidJvm]<br>data class [Specification](-specification/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val periodicity: [Budget.Periodicity](-periodicity/index.html), val archived: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val filter: [Budget.Specification.Filter](-specification/-filter/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Summary](-summary/index.html) | [androidJvm]<br>data class [Summary](-summary/index.html)(val budgetSpecification: [Budget.Specification](-specification/index.html), val budgetPeriod: [Budget.Period](-period/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| [Transaction](-transaction/index.html) | [androidJvm]<br>data class [Transaction](-transaction/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val amount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val dispensableAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val categoryCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |

