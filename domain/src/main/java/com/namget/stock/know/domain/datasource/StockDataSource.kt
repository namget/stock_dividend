package com.namget.stock.know.domain.datasource

import com.namget.stock.know.data.resp.DividendResp

interface StockDataSource {
    suspend fun getStockData(name: String) : List<DividendResp>
}