[link](../../index.md) / [com.tink.service.transfer](../index.md) / [TransferService](index.md) / [initiateTransfer](./initiate-transfer.md)

# initiateTransfer

`abstract suspend fun initiateTransfer(descriptor: `[`CreateTransferDescriptor`](../-create-transfer-descriptor/index.md)`): `[`SignableOperation`](../../com.tink.model.transfer/-signable-operation/index.md)

Initiates a new transfer

### Parameters

`descriptor` - Information about the transfer that should be created

**Return**
A [SignableOperation](../../com.tink.model.transfer/-signable-operation/index.md) from which you can read the [status](../../com.tink.model.transfer/-signable-operation/-status/index.md) of the operation.

