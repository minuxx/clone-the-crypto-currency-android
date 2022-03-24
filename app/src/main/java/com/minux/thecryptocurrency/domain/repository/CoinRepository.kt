package com.minux.thecryptocurrency.domain.repository

import com.minux.thecryptocurrency.data.remote.dto.CoinDetailDto
import com.minux.thecryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    //여기에 캐싱처리? 로컬 DB 뭐시기도 하는가봄..
    //테스트케이스에 용이하다함
    //UseCase가 이 리포지토리를 이용함
    //이부분 설명 이해안됨

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}