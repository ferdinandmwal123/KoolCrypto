package com.mwalagho.ferdinand.koolcrypto.presentation.coin_detail

import com.mwalagho.ferdinand.koolcrypto.domain.model.Coin
import com.mwalagho.ferdinand.koolcrypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
