package com.namget.stock.know.repository

import com.namget.stock.know.data.resp.DividendResp
import com.namget.stock.know.data.resp.Response
import retrofit2.http.GET

interface StockService {
    @GET("service/GetStocDiviInfoService")
    fun getStockDividendInfo() : Response<DividendResp>
}