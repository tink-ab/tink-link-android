[link](../../index.md) / [com.tink.service.transfer](../index.md) / [TransferService](index.md) / [getTransferStatus](./get-transfer-status.md)

# getTransferStatus

`abstract suspend fun getTransferStatus(transferId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SignableOperation`](../../com.tink.model.transfer/-signable-operation/index.md)

Retrieves information about the current status of a transfer.

### Parameters

`transferId` - The id of the transfer. Note: When retrieving this from a [SignableOperation](../../com.tink.model.transfer/-signable-operation/index.md),
[SignableOperation.underlyingId](../../com.tink.model.transfer/-signable-operation/underlying-id.md) should be passed in here.

**Return**
A [SignableOperation](../../com.tink.model.transfer/-signable-operation/index.md) from which you can read the [status](../../com.tink.model.transfer/-signable-operation/-status/index.md) of the operation.

