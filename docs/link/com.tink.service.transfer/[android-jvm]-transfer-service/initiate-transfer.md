---
title: initiateTransfer
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[androidJvm]TransferService](index.html)/[initiateTransfer](initiate-transfer.html)



# initiateTransfer



[androidJvm]\
abstract suspend fun [initiateTransfer](initiate-transfer.html)(descriptor: [CreateTransferDescriptor](../[android-jvm]-create-transfer-descriptor/index.html)): [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html)



Initiates a new transfer



#### Return



A [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.html) from which you can read the [status](../../com.tink.model.transfer/[android-jvm]-signable-operation/-status/index.html) of the operation.



## Parameters


androidJvm

| | |
|---|---|
| descriptor | Information about the transfer that should be created |




