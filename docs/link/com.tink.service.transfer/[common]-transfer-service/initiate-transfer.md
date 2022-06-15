---
title: initiateTransfer
---
//[link](../../../index.html)/[com.tink.service.transfer](../index.html)/[[common]TransferService](index.html)/[initiateTransfer](initiate-transfer.html)



# initiateTransfer



[common]\
abstract suspend fun [initiateTransfer](initiate-transfer.html)(descriptor: [CreateTransferDescriptor](../[common]-create-transfer-descriptor/index.html)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html)



Initiates a new transfer



#### Return



A [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.html) from which you can read the [status](../../com.tink.model.transfer/[common]-signable-operation/-status/index.html) of the operation.



## Parameters


common

| | |
|---|---|
| descriptor | Information about the transfer that should be created |




