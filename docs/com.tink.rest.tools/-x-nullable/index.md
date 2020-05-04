[link](../../index.md) / [com.tink.rest.tools](../index.md) / [XNullable](./index.md)

# XNullable

`@Target([AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER]) @JsonQualifier annotation class XNullable`

Marks an optional variable that will be forcibly serialized as "null" when being transformed
to json. (By default, an optional variable is omitted from the output json string,
for optimisation purposes.)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Marks an optional variable that will be forcibly serialized as "null" when being transformed to json. (By default, an optional variable is omitted from the output json string, for optimisation purposes.)`XNullable()` |
