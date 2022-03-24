package com.minux.thecryptocurrency.data.repository

import com.minux.thecryptocurrency.data.remote.CoinPaprikaApi
import com.minux.thecryptocurrency.data.remote.dto.CoinDetailDto
import com.minux.thecryptocurrency.data.remote.dto.CoinDto
import com.minux.thecryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}