# Java API
Tink Link is written in Kotlin and the main entry points are realized with extension functions. For that reason there are small differences when calling some functions from Java:

|Function            | in Kotlin                                      | in Java                                           |
|--------------------|------------------------------------------------|---------------------------------------------------|
|Get the user context|`Tink.getUserContext()`                         |`TinkLink.getUserContext()`                        |
|Authorize the user  |`Tink.authenticateUser(code, resultHandler)`    |`TinkLink.authenticateUser(code, resultHandler)`   | 


