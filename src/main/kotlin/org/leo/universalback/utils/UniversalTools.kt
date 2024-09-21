package org.leo.universalback.utils

import java.util.*

object UniversalTools {

    fun getUUID(): String {
        return UUID.randomUUID().toString().replace("-", "").uppercase(Locale.getDefault())
    }

}