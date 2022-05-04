---
title: [common]Category
---
//[link](../../../index.html)/[com.tink.model.category](../index.html)/[[common]Category](index.html)



# Category



[common]\
data class [Category](index.html)(val code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [Category.Type](-type/index.html), val parentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val children: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Category](index.html)&gt;, val sortOrder: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val isDefaultChild: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))



## Constructors


| | |
|---|---|
| [Category](-category.html) | [common]<br>fun [Category](-category.html)(code: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Category.Type](-type/index.html), parentId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, children: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Category](index.html)&gt;, sortOrder: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), isDefaultChild: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |


## Types


| Name | Summary |
|---|---|
| [Type](-type/index.html) | [common]<br>enum [Type](-type/index.html) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Category.Type](-type/index.html)&gt; |


## Properties


| Name | Summary |
|---|---|
| [children](children.html) | [common]<br>val [children](children.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Category](index.html)&gt; |
| [code](code.html) | [common]<br>val [code](code.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | [common]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [isDefaultChild](is-default-child.html) | [common]<br>val [isDefaultChild](is-default-child.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [name](name.html) | [common]<br>val [name](name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parentId](parent-id.html) | [common]<br>val [parentId](parent-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [sortOrder](sort-order.html) | [common]<br>val [sortOrder](sort-order.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [type](type.html) | [common]<br>val [type](type.html): [Category.Type](-type/index.html) |

