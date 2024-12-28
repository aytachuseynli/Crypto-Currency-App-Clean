package com.aytachuseynli.cryptocurrencyappclean.domain.repository

import com.aytachuseynli.cryptocurrencyappclean.data.remote.dto.CoinDetailDto
import com.aytachuseynli.cryptocurrencyappclean.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}