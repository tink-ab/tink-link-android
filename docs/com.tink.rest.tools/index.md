[link](../index.md) / [com.tink.rest.tools](./index.md)

## Package com.tink.rest.tools

### Types

| Name | Summary |
|---|---|
| [GeneratedCodeConverters](-generated-code-converters/index.md) | `object GeneratedCodeConverters` |
| [TinkJsonAdapterFactory](-tink-json-adapter-factory/index.md) | `class TinkJsonAdapterFactory : Factory` |
| [TypesAdapterFactory](-types-adapter-factory/index.md) | Moshi Factory to handle all the custom types we want to support, such as [LocalDate](#), [ZonedDateTime](#), [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html).`class TypesAdapterFactory : Factory` |
| [XNullableAdapterFactory](-x-nullable-adapter-factory/index.md) | `class XNullableAdapterFactory : Factory` |

### Annotations

| Name | Summary |
|---|---|
| [CSV](-c-s-v/index.md) | `annotation class CSV` |
| [PIPES](-p-i-p-e-s/index.md) | `annotation class PIPES` |
| [SSV](-s-s-v/index.md) | `annotation class SSV` |
| [TSV](-t-s-v/index.md) | `annotation class TSV` |
| [XNullable](-x-nullable/index.md) | Marks an optional variable that will be forcibly serialized as "null" when being transformed to json. (By default, an optional variable is omitted from the output json string, for optimisation purposes.)`annotation class XNullable` |

### Extensions for External Classes

| Name | Summary |
|---|---|
| [retrofit2.Response](retrofit2.-response/index.md) |  |
