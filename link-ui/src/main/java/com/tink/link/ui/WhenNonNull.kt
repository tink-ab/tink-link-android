package com.tink.link.ui

inline fun <P1 : Any, P2 : Any, R> whenNonNull(p1: P1?, p2: P2?, function: (p1: P1, p2: P2) -> R): R? {
    if (p1 != null && p2 != null) {
        return function(p1, p2)
    }
    return null
}

inline fun <P1 : Any, P2 : Any, P3 : Any, R> whenNonNull(p1: P1?, p2: P2?, p3: P3?, function: (p1: P1, p2: P2, p3: P3) -> R): R? {
    if (p1 != null && p2 != null && p3 != null) {
        return function(p1, p2, p3)
    }
    return null
}

inline fun <P1 : Any, P2 : Any, P3 : Any, P4 : Any, P5 : Any, R>
whenNonNull(p1: P1?, p2: P2?, p3: P3?, p4: P4?, p5: P5?, function: (p1: P1, p2: P2, p3: P3, p4: P4, p5: P5) -> R): R? {
    if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null) {
        return function(p1, p2, p3, p4, p5)
    }
    return null
}

inline fun <P1 : Any, P2 : Any, P3 : Any, P4 : Any, P5 : Any, P6 : Any, R>
whenNonNull(
    p1: P1?,
    p2: P2?,
    p3: P3?,
    p4: P4?,
    p5: P5?,
    p6: P6?,
    function: (p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6) -> R
): R? {
    if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null && p6 != null) {
        return function(p1, p2, p3, p4, p5, p6)
    }
    return null
}

inline fun <P1 : Any, P2 : Any, P3 : Any, P4 : Any, P5 : Any, P6 : Any, P7 : Any, R>
whenNonNull(
    p1: P1?,
    p2: P2?,
    p3: P3?,
    p4: P4?,
    p5: P5?,
    p6: P6?,
    p7: P7?,
    function: (p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7) -> R
): R? {
    if (p1 != null && p2 != null && p3 != null && p4 != null && p5 != null && p6 != null && p7 != null) {
        return function(p1, p2, p3, p4, p5, p6, p7)
    }
    return null
}

inline fun <P1 : Any, P2 : Any, P3 : Any, P4 : Any, R>
whenNonNull(p1: P1?, p2: P2?, p3: P3?, p4: P4?, function: (p1: P1, p2: P2, p3: P3, p4: P4) -> R): R? {
    if (p1 != null && p2 != null && p3 != null && p4 != null) {
        return function(p1, p2, p3, p4)
    }
    return null
}
