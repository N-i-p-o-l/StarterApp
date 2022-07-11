package com.android.starterapp.data.repository

import com.android.starterapp.data.CryptoData
import com.android.starterapp.data.mapper.toCryptoData
import com.android.starterapp.data.remote.CryptoApi
import com.android.starterapp.domain.Resource
import com.android.starterapp.domain.repository.CryptoRepository
import javax.inject.Inject

class CryptoRepositoryImpl @Inject constructor (
    private val cryptoApi: CryptoApi
): CryptoRepository {

    override suspend fun getCryptoData(): Resource<List<CryptoData>> {
        return try {
            Resource.Success(
                data = cryptoApi.getCryptoData().toCryptoData()
            )
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}