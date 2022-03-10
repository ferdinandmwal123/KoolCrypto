package com.mwalagho.ferdinand.koolcrypto.domain.repository

import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.CoinDetailDto
import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}