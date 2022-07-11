package com.android.starterapp.presentation

import com.android.starterapp.data.CryptoData

data class CryptoState(
    val cryptoData: List<CryptoData>? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)