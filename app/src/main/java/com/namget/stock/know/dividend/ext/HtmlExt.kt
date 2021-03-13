package com.namget.animalcrossing.ext

import android.os.Build
import android.text.Html
import android.text.Spannable
import android.text.Spanned

/**
 * Created by Namget on 2020.05.05.
 */
fun String.fromHtml() : Spanned {
    return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT)
    } else {
        Html.fromHtml(this)
    }
}