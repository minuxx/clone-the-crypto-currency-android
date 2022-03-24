package com.minux.thecryptocurrency.presentation.coin_detail

import com.minux.thecryptocurrency.domain.model.Coin
import com.minux.thecryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)