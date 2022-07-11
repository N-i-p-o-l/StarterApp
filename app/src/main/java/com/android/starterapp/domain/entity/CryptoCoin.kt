package com.android.starterapp.domain.entity

data class CryptoCoin(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    val current_price: Double,
    val market_cap: Long,
    val total_volume: Long,
    val price_change_percentage_24h: Float,
    val circulating_supply: Float?,
    val total_supply: Float?,
    val max_supply: Float?,
    val ath: Float,
    val ath_change_percentage: Float,
    val last_updated: String
)