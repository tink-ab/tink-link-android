[link](../../index.md) / [com.tink.service.provider](../index.md) / [ProviderFilter](./index.md)

# ProviderFilter

`data class ProviderFilter : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

A filter to describe which providers should be included in the response

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A filter to describe which providers should be included in the response`ProviderFilter(includeDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false, includeNonDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true, requireCapability: Capability? = null)` |

### Properties

| Name | Summary |
|---|---|
| [includeDemoProviders](include-demo-providers.md) | If set to true, providers of type [TEST](../../com.tink.model.provider/-provider/-type/-t-e-s-t.md) will be added in the response list. Default: false`val includeDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [includeNonDemoProviders](include-non-demo-providers.md) | If set to false, providers with a type different than [TEST](../../com.tink.model.provider/-provider/-type/-t-e-s-t.md) will be removed from the response list. Default: true`val includeNonDemoProviders: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [requireCapability](require-capability.md) | Use the capability to only list providers with a specific capability. By default the list will not be filtered by capability`val requireCapability: Capability?` |
