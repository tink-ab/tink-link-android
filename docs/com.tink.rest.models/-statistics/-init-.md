[link](../../index.md) / [com.tink.rest.models](../index.md) / [Statistics](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Statistics(@Json("description") description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("period") period: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("resolution") resolution: ResolutionEnum, @Json("type") type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("userId") userId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("value") value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, @Json("payload") payload: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

Statistics contain derived data from different types of information which is available for a user. This calculated data is stored for a certain period of time with a certain time resolution, and could be based on information such as expenses, incomes or balances. As an example, statistics could be a time series of travel expenses calculated monthly for the last six months.

