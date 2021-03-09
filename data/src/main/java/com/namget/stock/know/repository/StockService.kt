package com.namget.stock.know.repository

import retrofit2.http.GET

interface StockService {
    @GET("service/GetStocDiviInfoService")
    fun getStockDividendInfo()
}