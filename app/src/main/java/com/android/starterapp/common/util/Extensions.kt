package com.android.starterapp.common.util

import java.text.DecimalFormat

fun Long.formatMoney(): String {
    val formatter = DecimalFormat("#,###,###")
    return formatter.format(this)
}