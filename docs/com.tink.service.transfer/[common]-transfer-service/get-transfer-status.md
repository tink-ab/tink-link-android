---
title: getTransferStatus
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[common]TransferService](index.html)/[getTransferStatus](get-transfer-status.html)



# getTransferStatus



[common]\
abstract suspend fun [getTransferStatus](get-transfer-status.html)(transferId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html)



Retrieves information about the current status of a transfer.



#### Return



A [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html) from which you can read the [status](../../com.tink.model.transfer/[common]-signable-operation/-status/index.html) of the operation.



## Parameters


common

| | |
|---|---|
| transferId | The id of the transfer. Note: When retrieving this from a [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html), [SignableOperation.underlyingId](../../com.tink.model.transfer/[common]-signable-operation/underlying-id.html) should be passed in here. |




