package com.aytachuseynli.cryptocurrencyappclean.presentation.coin_list

import com.aytachuseynli.cryptocurrencyappclean.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)