[link](../../index.md) / [com.tink.rest.tools](../index.md) / [GeneratedCodeConverters](./index.md)

# GeneratedCodeConverters

`object GeneratedCodeConverters`

### Properties

| Name | Summary |
|---|---|
| [moshi](moshi.md) | `val moshi: Moshi` |

### Functions

| Name | Summary |
|---|---|
| [converterFactory](converter-factory.md) | Creates everything needed for retrofit to make it work with the client lib, including a [Moshi](#) instance. If you want to use your own instance of moshi, use converterFactory(moshi) instead, and add [XNullableAdapterFactory](../-x-nullable-adapter-factory/index.md), [KotlinJsonAdapterFactory](#) and [TypesAdapterFactory](../-types-adapter-factory/index.md) to your moshi builder (in a similar way how we are instantiating the `moshi` field here).`fun converterFactory(): Factory``fun converterFactory(moshi: Moshi): Factory` |
