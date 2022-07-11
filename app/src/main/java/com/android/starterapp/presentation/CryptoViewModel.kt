package com.android.starterapp.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.starterapp.domain.Resource
import com.android.starterapp.domain.repository.CryptoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CryptoViewModel @Inject constructor(
    private val cryptoRepository: CryptoRepository
) : ViewModel() {

    var state by mutableStateOf(CryptoState())
        private set

    init {
        loadCryptoData()
    }

    private fun loadCryptoData() {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )
            when (val result = cryptoRepository.getCryptoData()) {
                is Resource.Success -> {
                    state = state.copy(
                        cryptoData = result.data,
                        isLoading = false,
                        error = null
                    )
                }
                is Resource.Error -> {
                    state = state.copy(
                        cryptoData = null,
                        isLoading = false,
                        error = result.message
                    )
                }
            }
        }
    }
}