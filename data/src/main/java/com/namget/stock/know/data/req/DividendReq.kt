package com.namget.stock.know.data.req

import javax.inject.Inject
import javax.inject.Named

data class DividendReq(
    val numOfRows: Int = 2000,
    val pageNo: Int = 1,
    val resultType: String = "json",
    val serviceKey: String,
    val crno: String? = null, // 법인 등록번호 1101110057012
    val stckIssuCmpyNm: String// 주식 발행 명칭
) {
    @Inject
    @Named("api_key")
    lateinit var apiKey: String

    fun toMap(): Map<String, Any> {
        val map: MutableMap<String, Any> = mutableMapOf(
            "numOfRows" to numOfRows,
            "pageNo" to pageNo,
            "resultType" to resultType,
            "serviceKey" to apiKey,
            "stckIssuCmpyNm" to stckIssuCmpyNm,
        )
        crno?.let {
            map["crno"] = it
        }

        return map.toMap()
    }
}
