[link](../../index.md) / [com.tink.model.time](../index.md) / [Period](./index.md)

# Period

`sealed class Period : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

### Properties

| Name | Summary |
|---|---|
| [end](end.md) | `abstract val end: Instant` |
| [start](start.md) | `abstract val start: Instant` |

### Inheritors

| Name | Summary |
|---|---|
| [DayPeriod](../-day-period/index.md) | `data class DayPeriod : `[`Period`](./index.md) |
| [MonthPeriod](../-month-period/index.md) | `data class MonthPeriod : `[`Period`](./index.md) |
| [YearPeriod](../-year-period/index.md) | `data class YearPeriod : `[`Period`](./index.md) |
