[link](../../../index.md) / [com.tink.rest.models](../../index.md) / [Account](../index.md) / [AccountExclusionEnum](./index.md)

# AccountExclusionEnum

`@JsonClass(false) enum class AccountExclusionEnum`

Indicates features this account should be excluded from. Possible values are: `NONE`: No features are excluded from this account, `PFM_DATA`: Personal Finance Management Features, like statistics and activities are excluded, `PFM_AND_SEARCH`: Personal Finance Management Features are excluded, and transactions belonging to this account are not searchable. This is the equivalent of the, now deprecated, boolean flag 'excluded', `AGGREGATION`: No data will be aggregated for this account and, all data associated with the account is removed (except account name and account number). This property can be updated in a update account request.
Values: AGGREGATION, PFM_AND_SEARCH, PFM_DATA, NONE

### Enum Values

| Name | Summary |
|---|---|
| [AGGREGATION](-a-g-g-r-e-g-a-t-i-o-n.md) |  |
| [PFM_AND_SEARCH](-p-f-m_-a-n-d_-s-e-a-r-c-h.md) |  |
| [PFM_DATA](-p-f-m_-d-a-t-a.md) |  |
| [NONE](-n-o-n-e.md) |  |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
