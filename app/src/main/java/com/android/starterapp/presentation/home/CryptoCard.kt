package com.android.starterapp.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.android.starterapp.common.util.formatMoney
import com.android.starterapp.data.CryptoData

@Composable
fun CryptoCard(
    cryptoData: CryptoData
) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.fillMaxSize()
    ) {
        AsyncImage(
            alignment = Alignment.CenterEnd,
            model = cryptoData.image,
            contentDescription = cryptoData.image
        )
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(cryptoData.name, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(cryptoData.current_price.toString(), fontSize = 16.sp)
            Text(cryptoData.market_cap.formatMoney(), fontSize = 16.sp)
        }
    }
}