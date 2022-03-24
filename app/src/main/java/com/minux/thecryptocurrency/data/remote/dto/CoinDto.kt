package com.minux.thecryptocurrency.data.remote.dto

import com.minux.thecryptocurrency.domain.model.Coin

data class CoinDto(
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

//transform a coin dto to a coin object
fun CoinDto.toCoin(): Coin {
    return Coin(
        id= id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}