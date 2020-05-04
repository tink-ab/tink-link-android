[link](../../index.md) / [com.tink.rest.models](../index.md) / [AccountDetails](./index.md)

# AccountDetails

`@JsonClass(true) data class AccountDetails`

### Types

| Name | Summary |
|---|---|
| [TypeEnum](-type-enum/index.md) | Account subtype. Values: MORTGAGE, BLANCO, MEMBERSHIP, VEHICLE, LAND, STUDENT, CREDIT, OTHER`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AccountDetails(interest: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, numMonthsBound: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, type: TypeEnum? = null, nextDayOfTermsChange: ZonedDateTime? = null)` |

### Properties

| Name | Summary |
|---|---|
| [interest](interest.md) | Interest of the account. Applicable for loans and savings accounts.`var interest: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [nextDayOfTermsChange](next-day-of-terms-change.md) | A timestamp of the next day of terms change of the account. Applicable for loans.`var nextDayOfTermsChange: ZonedDateTime?` |
| [numMonthsBound](num-months-bound.md) | Populated if available. Describes how many months the interest rate is bound.`var numMonthsBound: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [type](type.md) | Account subtype.`var type: TypeEnum?` |
