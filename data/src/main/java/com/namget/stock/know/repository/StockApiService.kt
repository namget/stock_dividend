package com.namget.stock.know.repository

import com.namget.stock.know.data.resp.DividendResp
import com.namget.stock.know.data.resp.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface StockApiService {
    @GET("service/GetStocDiviInfoService")
    @JvmSuppressWildcards
    fun getStockDividendInfo(@QueryMap dividendReq: Map<String,Any>) : Response<DividendResp>
}