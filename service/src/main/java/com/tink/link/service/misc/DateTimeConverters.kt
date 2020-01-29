package com.tink.link.service.misc

import com.google.protobuf.Timestamp
import org.threeten.bp.Instant

internal fun Timestamp.toInstant() = Instant.ofEpochSecond(seconds, nanos.toLong())
