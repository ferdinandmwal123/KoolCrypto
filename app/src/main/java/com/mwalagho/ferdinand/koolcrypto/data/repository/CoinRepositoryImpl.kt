package com.mwalagho.ferdinand.koolcrypto.data.repository

import com.mwalagho.ferdinand.koolcrypto.data.remote.CoinPaprikaAPI
import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.CoinDetailDto
import com.mwalagho.ferdinand.koolcrypto.data.remote.dto.CoinDto
import com.mwalagho.ferdinand.koolcrypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}