[link](../../index.md) / [com.tink.rest.tools](../index.md) / [TypesAdapterFactory](./index.md)

# TypesAdapterFactory

`class TypesAdapterFactory : Factory`

Moshi Factory to handle all the custom types we want to support,
such as [LocalDate](#), [ZonedDateTime](#), [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Moshi Factory to handle all the custom types we want to support, such as [LocalDate](#), [ZonedDateTime](#), [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html).`TypesAdapterFactory()` |

### Functions

| Name | Summary |
|---|---|
| [create](create.md) | `fun create(type: `[`Type`](https://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`, annotations: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<out `[`Annotation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-annotation/index.html)`>, moshi: Moshi): JsonAdapter<*>?` |
