package com.android.starterapp.data.mapper

import com.android.starterapp.data.CryptoData
import com.android.starterapp.domain.entity.CryptoCoin

fun List<CryptoCoin>.toCryptoData(): List<CryptoData> {
    val cryptoDataList = mutableListOf<CryptoData>()

    this.forEach {
        val cryptoData = CryptoData(
            it.id,
            it.symbol,
            it.name,
            it.image,
            it.current_price,
            it.market_cap
        )
        cryptoDataList.add(cryptoData)
    }

    return cryptoDataList
}