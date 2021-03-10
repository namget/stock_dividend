package com.namget.stock.know.data.req

data class DividendReq(
    val numOfRows : Int,
    val pageNo : Int,
    val resultType : String = "json",
    val serviceKey : String
)