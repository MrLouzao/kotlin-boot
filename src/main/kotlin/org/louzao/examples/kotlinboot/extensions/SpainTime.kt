package org.louzao.examples.kotlinboot.extensions

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*


fun LocalDateTime.toSpanishDate() = this.format(spainDateFormatter);

private val spainDateFormatter = DateTimeFormatterBuilder()
        .appendPattern("dd-MM-YYYY")
        .toFormatter(Locale.GERMAN);