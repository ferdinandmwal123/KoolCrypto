package com.mwalagho.ferdinand.koolcrypto.presentation.coin_list

import com.mwalagho.ferdinand.koolcrypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
