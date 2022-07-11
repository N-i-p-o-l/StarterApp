package com.android.starterapp.data.remote

import com.android.starterapp.domain.entity.CryptoCoin
import retrofit2.http.GET

interface CryptoApi {

    @GET("coins/markets?vs_currency=usd&order=market_cap_desc&per_page=10&page=1")
    suspend fun getCryptoData(): List<CryptoCoin>
}