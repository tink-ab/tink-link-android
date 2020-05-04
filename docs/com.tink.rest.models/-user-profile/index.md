[link](../../index.md) / [com.tink.rest.models](../index.md) / [UserProfile](./index.md)

# UserProfile

`@JsonClass(true) data class UserProfile`

### Types

| Name | Summary |
|---|---|
| [PeriodModeEnum](-period-mode-enum/index.md) | The configured monthly period mode of the user. This can be modified by the user. Values: MONTHLY, MONTHLY_ADJUSTED`enum class PeriodModeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UserProfile(currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, periodAdjustedDay: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, periodMode: PeriodModeEnum, timeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, notificationSettings: `[`NotificationSettings`](../-notification-settings/index.md)`, cashbackEnabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [cashbackEnabled](cashback-enabled.md) | `var cashbackEnabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [currency](currency.md) | The configured ISO 4217 currency code of the user. This can be modified by the user.`var currency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [locale](locale.md) | The configured locale of the user. This can be modified by the user.`var locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [market](market.md) | The primary market/country of the user.`var market: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [notificationSettings](notification-settings.md) | The configured notification settings of the user. This can be modified by the user.`var notificationSettings: `[`NotificationSettings`](../-notification-settings/index.md) |
| [periodAdjustedDay](period-adjusted-day.md) | The configured day of the month to break the adjusted period on. This can be modified by the user. A valid value should be in the range between 1 and 31. If the adjusted day is after the last day of a given month, then it is treated as the last day of the month.`var periodAdjustedDay: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [periodMode](period-mode.md) | The configured monthly period mode of the user. This can be modified by the user.`var periodMode: PeriodModeEnum` |
| [timeZone](time-zone.md) | The configured time zone of the user. This can be modified by the user.`var timeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
