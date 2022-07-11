package com.android.starterapp.data

data class CryptoData(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    val current_price: Double,
    val market_cap: Long
)