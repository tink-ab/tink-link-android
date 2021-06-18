//[link](../../index.md)/[com.tink.service.transfer](../index.md)/[[common]TransferService](index.md)/[initiateTransfer](initiate-transfer.md)



# initiateTransfer  
[common]  
Content  
abstract suspend fun [initiateTransfer](initiate-transfer.md)(descriptor: [CreateTransferDescriptor](../[common]-create-transfer-descriptor/index.md)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.md)  
More info  


Initiates a new transfer



#### Return  


A [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.md) from which you can read the [status](../../com.tink.model.transfer/[common]-signable-operation/-status/index.md) of the operation.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/TransferService/initiateTransfer/#com.tink.service.transfer.CreateTransferDescriptor/PointingToDeclaration/"></a>descriptor| <a name="com.tink.service.transfer/TransferService/initiateTransfer/#com.tink.service.transfer.CreateTransferDescriptor/PointingToDeclaration/"></a><br><br>Information about the transfer that should be created<br><br>
  
  



