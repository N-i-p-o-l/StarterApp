package com.android.starterapp.domain.repository

import com.android.starterapp.data.CryptoData
import com.android.starterapp.domain.Resource

interface CryptoRepository {
    suspend fun getCryptoData(): Resource<List<CryptoData>>
}