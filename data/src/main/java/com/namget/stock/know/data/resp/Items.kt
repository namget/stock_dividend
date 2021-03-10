package com.namget.stock.know.data.resp

import com.google.gson.annotations.SerializedName

data class Items<T>(
    @SerializedName("item")
    val item: List<T>,
    val numOfRows : Int,
    val pageNo : Int,
    val totalCount : Int
)