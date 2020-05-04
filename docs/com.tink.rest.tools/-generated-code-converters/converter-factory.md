[link](../../index.md) / [com.tink.rest.tools](../index.md) / [GeneratedCodeConverters](index.md) / [converterFactory](./converter-factory.md)

# converterFactory

`@JvmStatic fun converterFactory(): Factory`

Creates everything needed for retrofit to make it work with the client lib, including a
[Moshi](#) instance. If you want to use your own instance of moshi, use
converterFactory(moshi) instead, and add [XNullableAdapterFactory](../-x-nullable-adapter-factory/index.md), [KotlinJsonAdapterFactory](#) and
[TypesAdapterFactory](../-types-adapter-factory/index.md) to your moshi builder (in a similar way how we are instantiating the `moshi` field here).

`@JvmStatic fun converterFactory(moshi: Moshi): Factory`