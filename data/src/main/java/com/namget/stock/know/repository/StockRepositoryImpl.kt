package com.namget.stock.know.repository

import com.namget.stock.know.data.resp.DividendResp
import com.namget.stock.know.di.LocalDataSource
import com.namget.stock.know.di.RemoteDataSource
import com.namget.stock.know.domain.datasource.StockDataSource
import com.namget.stock.know.util.ResponseResult
import javax.inject.Inject


class StockRepositoryImpl @Inject constructor(
    @RemoteDataSource
    val stockRemoteDataSource: StockDataSource,
    @LocalDataSource
    val stockLocalDataSource: StockDataSource
) : StockRepository {

    override suspend fun getStockDividendInfo(name : String): ResponseResult<DividendResp> {
        var stockData = stockLocalDataSource.getStockData(name)

        if (stockData.isEmpty()) {
            stockData = stockRemoteDataSource.getStockData(name)
        }
        return stockData
    }
}