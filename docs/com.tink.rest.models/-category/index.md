[link](../../index.md) / [com.tink.rest.models](../index.md) / [Category](./index.md)

# Category

`@JsonClass(true) data class Category`

Categories are used for categorization of transactions. They are structured as a category tree, and are available as a flat list of categories with parent/child relationships using their id and parent fields. Category information is used for pre-computed statistics, making aggregated spending and income data available for all the different nodes in the category tree. However, a transaction itself, can only be assigned to a leaf category. Both the `INCOME` and `EXPENSES` categories represent users' regular income and spending, while the `TRANSFER` categories are special in the sense that they represent transfers between accounts (potentially across banks), such as regular bank transfers, credit-card payments, mortgage amortizations and other transactions that should not add to the users' actual spending.

### Types

| Name | Summary |
|---|---|
| [TypeEnum](-type-enum/index.md) | Type of the category. Values: INCOME, EXPENSES, TRANSFERS`enum class TypeEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Categories are used for categorization of transactions. They are structured as a category tree, and are available as a flat list of categories with parent/child relationships using their id and parent fields. Category information is used for pre-computed statistics, making aggregated spending and income data available for all the different nodes in the category tree. However, a transaction itself, can only be assigned to a leaf category. Both the `INCOME` and `EXPENSES` categories represent users' regular income and spending, while the `TRANSFER` categories are special in the sense that they represent transfers between accounts (potentially across banks), such as regular bank transfers, credit-card payments, mortgage amortizations and other transactions that should not add to the users' actual spending.`Category(code: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, defaultChild: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, sortOrder: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, type: TypeEnum, typeName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, primaryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, searchTerms: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, secondaryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [code](code.md) | Machine readable category code.`var code: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [defaultChild](default-child.md) | Indicates if this is the default child to be used when categorizing to a primary level category.`var defaultChild: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [id](id.md) | The internal identifier of the category, referenced by e.g. a transaction.`var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parent](parent.md) | The parent internal identifier of this category, or null.`var parent: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [primaryName](primary-name.md) | The primary name of this category.`var primaryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [searchTerms](search-terms.md) | Used by the search engine to find transactions with this category.`var searchTerms: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [secondaryName](secondary-name.md) | The secondary name of this category.`var secondaryName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [sortOrder](sort-order.md) | Sort order for nicer display for the user.`var sortOrder: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [type](type.md) | Type of the category.`var type: TypeEnum` |
| [typeName](type-name.md) | Type name of the category.`var typeName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
