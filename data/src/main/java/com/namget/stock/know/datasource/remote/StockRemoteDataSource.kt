package com.namget.stock.know.datasource.remote

import com.namget.stock.know.data.req.DividendReq
import com.namget.stock.know.data.resp.DividendResp
import com.namget.stock.know.data.resp.Response
import com.namget.stock.know.datasource.StockDataSource
import com.namget.stock.know.di.RemoteDataSource
import com.namget.stock.know.repository.StockApiService
import com.namget.stock.know.util.ResponseResult
import com.namget.stock.know.util.safeApiCall
import javax.inject.Inject
import javax.inject.Named

@RemoteDataSource
class StockRemoteDataSource @Inject constructor(
    private val stockApiService: StockApiService,
    @Named("api_key") private val serviceKey: String
) : StockDataSource {

    override suspend fun getStockData(
        name: String,
    ): List<DividendResp> {
        val result = safeApiCall {
            stockApiService.getStockDividendInfo(
                DividendReq(
                    serviceKey = serviceKey,
                    stckIssuCmpyNm = name
                ).toMap()
            )
        }
        when (result) {
            is ResponseResult.Success<Response<DividendResp>> -> {
                result.output.body.items.item
            }
            is ResponseResult.Failure -> {

            }
        }

    }
}