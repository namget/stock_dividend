package com.namget.stock.know.repository

import com.namget.stock.know.datasource.StockDataSource
import com.namget.stock.know.di.LocalDataSource
import com.namget.stock.know.di.RemoteDataSource
import javax.inject.Inject


class StockRepositoryImpl @Inject constructor(
    @RemoteDataSource
    val stockRemoteDataSource: StockDataSource,
    @LocalDataSource
    val stockLocalDataSource: StockDataSource
) : StockRepository {

    override fun getStockDividendInfo() {
        TODO("Not yet implemented")
    }
}