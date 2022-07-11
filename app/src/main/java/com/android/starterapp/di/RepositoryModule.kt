package com.android.starterapp.di

import com.android.starterapp.data.repository.CryptoRepositoryImpl
import com.android.starterapp.domain.repository.CryptoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindCryptoRepository(
        weatherRepositoryImpl: CryptoRepositoryImpl
    ): CryptoRepository
}