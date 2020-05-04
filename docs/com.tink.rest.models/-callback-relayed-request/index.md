[link](../../index.md) / [com.tink.rest.models](../index.md) / [CallbackRelayedRequest](./index.md)

# CallbackRelayedRequest

`@JsonClass(true) data class CallbackRelayedRequest`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CallbackRelayedRequest(state: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameters: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [parameters](parameters.md) | The post parameters from the received callback from the ASPSP. Contains the parameters necessary for the integration to continue the communication with the ASPSP.`var parameters: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [state](state.md) | The state from the received callback from the ASPSP. Used by Tink to connect the incoming callback to the correct session.`var state: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
