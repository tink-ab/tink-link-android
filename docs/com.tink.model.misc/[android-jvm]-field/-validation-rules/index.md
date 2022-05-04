---
title: ValidationRules
---
//[link](../../../../index.html)/[com.tink.model.misc](../../index.html)/[[androidJvm]Field](../index.html)/[ValidationRules](index.html)



# ValidationRules



[androidJvm]\
data class [ValidationRules](index.html)(val maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val isOptional: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Represents rules that determine whether the user input for a field is valid.



## Constructors


| | |
|---|---|
| [ValidationRules](-validation-rules.html) | [androidJvm]<br>fun [ValidationRules](-validation-rules.html)(maxLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minLength: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), patternError: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isOptional: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [validate](validate.html) | [androidJvm]<br>fun [validate](validate.html)(fieldName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Field.ValidationResult](../-validation-result/index.html)<br>Validates the user input for a field. |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [isOptional](is-optional.html) | [androidJvm]<br>val [isOptional](is-optional.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether the user input is optional |
| [maxLength](max-length.html) | [androidJvm]<br>val [maxLength](max-length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The maximum allowed length for the user input |
| [minLength](min-length.html) | [androidJvm]<br>val [minLength](min-length.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The minimum allowed length for the user input |
| [pattern](pattern.html) | [androidJvm]<br>val [pattern](pattern.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The regex pattern allowed for the user input |
| [patternError](pattern-error.html) | [androidJvm]<br>val [patternError](pattern-error.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A user-friendly text describing an error where the user input did not match the [pattern](pattern.html) |

