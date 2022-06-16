[link](../../../index.md) / [com.tink.link.authentication](../../index.md) / [AuthenticationTask](../index.md) / [SupplementalInformation](index.md) / [submit](./submit.md)

# submit

`fun submit(filledFields: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, resultHandler: `[`ResultHandler`](../../../com.tink.service.handler/-result-handler/index.md)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Submit supplemental information for the authentication to Tink.
Should be called as soon as the fields have been validated and the user is
ready to send the information.

### Parameters

`filledFields` - A key-value map of the supplemental information. The key should
always be [Field.name](../../../com.tink.model.misc/-field/name.md) from [fields](fields.md) and the value should be the user input of that
field.