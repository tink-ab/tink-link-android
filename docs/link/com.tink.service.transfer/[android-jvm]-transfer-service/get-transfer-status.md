---
title: getTransferStatus
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[androidJvm]TransferService](index.html)/[getTransferStatus](get-transfer-status.html)



# getTransferStatus



[androidJvm]\
abstract suspend fun [getTransferStatus](get-transfer-status.html)(transferId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html)



Retrieves information about the current status of a transfer.



#### Return



A [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html) from which you can read the [status](../../com.tink.model.transfer/[android-jvm]-signable-operation/-status/index.html) of the operation.



## Parameters


androidJvm

| | |
|---|---|
| transferId | The id of the transfer. Note: When retrieving this from a [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html), [SignableOperation.underlyingId](../../com.tink.model.transfer/[android-jvm]-signable-operation/underlying-id.html) should be passed in here. |




