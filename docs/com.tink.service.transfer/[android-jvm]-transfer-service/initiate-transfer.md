//[link](../../index.md)/[com.tink.service.transfer](../index.md)/[[androidJvm]TransferService](index.md)/[initiateTransfer](initiate-transfer.md)



# initiateTransfer  
[androidJvm]  
Content  
abstract suspend fun [initiateTransfer](initiate-transfer.md)(descriptor: [CreateTransferDescriptor](../[android-jvm]-create-transfer-descriptor/index.md)): [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.md)  
More info  


Initiates a new transfer



#### Return  


A [SignableOperation](../../com.tink.model.transfer/[android-jvm]-signable-operation/index.md) from which you can read the [status](../../com.tink.model.transfer/[android-jvm]-signable-operation/-status/index.md) of the operation.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/TransferService/initiateTransfer/#com.tink.service.transfer.CreateTransferDescriptor/PointingToDeclaration/"></a>descriptor| <a name="com.tink.service.transfer/TransferService/initiateTransfer/#com.tink.service.transfer.CreateTransferDescriptor/PointingToDeclaration/"></a><br><br>Information about the transfer that should be created<br><br>
  
  



