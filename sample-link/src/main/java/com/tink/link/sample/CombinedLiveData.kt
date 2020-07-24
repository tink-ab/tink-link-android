package com.tink.link.sample

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer

class CombinedLiveData<S1 : Any, S2 : Any, R : Any>(
    source1: LiveData<S1>,
    source2: LiveData<S2>,
    transformer: (S1, S2) -> R?
) : LiveData<R>() {
    private val backingLiveData =
        MediatorLiveData<R?>().apply {
            fun update() {
                whenNonNull(
                    source1.value,
                    source2.value
                ) { value1, value2 ->
                    value = transformer(value1, value2)
                }
            }

            addSource(source1) { update() }
            addSource(source2) { update() }
        }

    override fun observe(owner: LifecycleOwner, observer: Observer<in R>) {
        super.observe(owner, observer)
        backingLiveData.observe(
            owner,
            Observer { newValue ->
                if (value != newValue) {
                    // Only transmit updates for new, non-null values.
                    newValue?.let { this@CombinedLiveData.postValue(it) }
                }
            }
        )
    }
}
