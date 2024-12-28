package com.aytachuseynli.cryptocurrencyappclean.data.repository

import com.aytachuseynli.cryptocurrencyappclean.data.remote.CoinPaprikaApi
import com.aytachuseynli.cryptocurrencyappclean.data.remote.dto.CoinDetailDto
import com.aytachuseynli.cryptocurrencyappclean.data.remote.dto.CoinDto
import com.aytachuseynli.cryptocurrencyappclean.domain.repository.CoinRepository
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