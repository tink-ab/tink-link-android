[link](../../index.md) / [com.tink.service.network](../index.md) / [Environment](./index.md)

# Environment

`sealed class Environment`

Represents the environment you want to connect to.

### Types

| Name | Summary |
|---|---|
| [Custom](-custom/index.md) | Represents a custom environment you want to connect to.`class Custom : `[`Environment`](./index.md) |
| [Production](-production.md) | Represents the Tink production environment`object Production : `[`Environment`](./index.md) |

### Properties

| Name | Summary |
|---|---|
| [restUrl](rest-url.md) | The url for the REST endpoint`val restUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [sslCertificate](ssl-certificate.md) | An optional ssl pinning certificate associated with the [restUrl](rest-url.md)`val sslCertificate: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
