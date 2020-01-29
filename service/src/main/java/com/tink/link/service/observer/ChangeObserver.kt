package com.tink.link.service.observer

interface ChangeObserver<T> {

    fun onCreate(items: List<T>)

    fun onRead(items: List<T>)

    fun onUpdate(items: List<T>)

    fun onDelete(items: List<T>)
}