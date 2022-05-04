---
title: init
---
//[link](../../../index.html)/[com.tink.core](../index.html)/[[common]Tink](index.html)/[init](init.html)



# init



[common]\
fun [init](init.html)(config: [TinkConfiguration](../../com.tink.service.network/[common]-tink-configuration/index.html), context: &lt;ERROR CLASS&gt;)



Initializes Tink in the application and should be called before the usage of Tink components. This should only be called once.



## Throws


| | |
|---|---|
| IllegalStateException | Thrown if this method is called more than once. |



