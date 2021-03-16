package com.namget.stock.know.domain.repository

import com.namget.stock.know.data.resp.DividendResp

interface StockRepository {
    suspend fun getStockDividendInfo(name : String): List<DividendResp>
}