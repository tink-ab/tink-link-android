[link](../../index.md) / [com.tink.link.authentication](../index.md) / [AuthenticationTask](index.md) / [isNewerThan](./is-newer-than.md)

# isNewerThan

`fun isNewerThan(other: `[`AuthenticationTask`](index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Helper function comparing two [AuthenticationTask](index.md)s to see if one is newer than
that the other. This can be used to determine if a new update should be sent.
This is for internal use in the Tink Sdk and it should not be necessary to use it otherwise.

