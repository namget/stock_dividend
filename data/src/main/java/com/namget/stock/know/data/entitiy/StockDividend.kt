package com.namget.stock.know.data.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.namget.stock.know.data.resp.DividendResp

@Entity
class StockDividend(
    @PrimaryKey
    val id: Long = 0,
    val searchText: String,
    val list: List<DividendResp>
)