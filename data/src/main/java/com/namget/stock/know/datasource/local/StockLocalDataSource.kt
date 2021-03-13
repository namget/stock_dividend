package com.namget.stock.know.datasource.local

import com.namget.stock.know.data.resp.DividendResp
import com.namget.stock.know.datasource.StockDataSource
import com.namget.stock.know.di.LocalDataSource
import javax.inject.Inject


@LocalDataSource
class StockLocalDataSource @Inject constructor(private val stockDao: StockDao) : StockDataSource {
    override suspend fun getStockData(name: String): List<DividendResp> {
        val stockDividend = stockDao.selectStockDividend(name)
        return
    }
}