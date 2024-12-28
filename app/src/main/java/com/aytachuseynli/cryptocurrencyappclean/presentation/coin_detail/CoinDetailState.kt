package com.aytachuseynli.cryptocurrencyappclean.presentation.coin_detail

import com.aytachuseynli.cryptocurrencyappclean.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)