[link](../../index.md) / [com.tink.link.ui](../index.md) / [TinkLinkErrorInfo](./index.md)

# TinkLinkErrorInfo

`sealed class TinkLinkErrorInfo : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)

A wrapper class that provides information about the underlying error causing the [TinkLinkError](../-tink-link-error/index.md)

### Types

| Name | Summary |
|---|---|
| [HttpError](-http-error/index.md) | This represents an HTTP exception that may have occurred.`data class HttpError : `[`TinkLinkErrorInfo`](./index.md) |
| [InternalError](-internal-error/index.md) | This represents a generic error that may have occurred.`data class InternalError : `[`TinkLinkErrorInfo`](./index.md) |

### Properties

| Name | Summary |
|---|---|
| [message](message.md) | The error message`abstract val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
