package com.namget.stock.know.dividend.ext

import com.namget.stock.know.ext.e
import java.text.SimpleDateFormat
import java.util.*

fun Date?.dateToNumberFormat(): String {

    return try {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.KOREA)
        this?.let { dateFormat.format(it) } ?: ""
    } catch (e: IllegalArgumentException) {
        e("DateFormatError", "error : ", e)
        return ""
    }
}

fun Calendar.theDayAfter(day: Int = 1): Calendar {
    return this.apply {
        set(Calendar.DATE, get(Calendar.DATE + day))
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.HOUR, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
    }
}

