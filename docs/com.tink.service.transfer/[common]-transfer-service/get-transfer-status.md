//[link](../../index.md)/[com.tink.service.transfer](../index.md)/[[common]TransferService](index.md)/[getTransferStatus](get-transfer-status.md)



# getTransferStatus  
[common]  
Content  
abstract suspend fun [getTransferStatus](get-transfer-status.md)(transferId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.md)  
More info  


Retrieves information about the current status of a transfer.



#### Return  


A [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.md) from which you can read the [status](../../com.tink.model.transfer/[common]-signable-operation/-status/index.md) of the operation.



## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.transfer/TransferService/getTransferStatus/#kotlin.String/PointingToDeclaration/"></a>transferId| <a name="com.tink.service.transfer/TransferService/getTransferStatus/#kotlin.String/PointingToDeclaration/"></a><br><br>The id of the transfer. Note: When retrieving this from a [SignableOperation](../../com.tink.model.transfer/[common]-signable-operation/index.md), [SignableOperation.underlyingId](../../com.tink.model.transfer/[common]-signable-operation/underlying-id.md) should be passed in here.<br><br>
  
  



