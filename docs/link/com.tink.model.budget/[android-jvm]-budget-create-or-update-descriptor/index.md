---
title: [androidJvm]BudgetCreateOrUpdateDescriptor
---
//[link](../../../index.html)/[com.tink.model.budget](../index.html)/[[androidJvm]BudgetCreateOrUpdateDescriptor](index.html)



# BudgetCreateOrUpdateDescriptor



[androidJvm]\
data class [BudgetCreateOrUpdateDescriptor](index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val targetAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), val filter: [Budget.Specification.Filter](../[android-jvm]-budget/-specification/-filter/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val periodicity: [Budget.Periodicity](../[android-jvm]-budget/-periodicity/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Descriptor for creating or updating a budget. If we have an id, it means we're updating an already existing budget.



## Constructors


| | |
|---|---|
| [BudgetCreateOrUpdateDescriptor](-budget-create-or-update-descriptor.html) | [androidJvm]<br>fun [BudgetCreateOrUpdateDescriptor](-budget-create-or-update-descriptor.html)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), targetAmount: [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html), filter: [Budget.Specification.Filter](../[android-jvm]-budget/-specification/-filter/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, periodicity: [Budget.Periodicity](../[android-jvm]-budget/-periodicity/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [description](description.html) | [androidJvm]<br>val [description](description.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [filter](filter.html) | [androidJvm]<br>val [filter](filter.html): [Budget.Specification.Filter](../[android-jvm]-budget/-specification/-filter/index.html) |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [name](name.html) | [androidJvm]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [periodicity](periodicity.html) | [androidJvm]<br>val [periodicity](periodicity.html): [Budget.Periodicity](../[android-jvm]-budget/-periodicity/index.html) |
| [targetAmount](target-amount.html) | [androidJvm]<br>val [targetAmount](target-amount.html): [Amount](../../com.tink.model.misc/[android-jvm]-amount/index.html) |

