package com.namget.stock.know.datasource.local

import androidx.room.*
import com.namget.stock.know.data.entitiy.StockDividend
import com.namget.stock.know.data.resp.DividendResp

@Dao
interface StockDao {
    @Query("SELECT * FROM StockDividend where searchText = :name ORDER BY id ASC")
    fun selectStockDividend(name: String) : StockDividend?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStockDividendList(stockDividend: StockDividend)

    @Delete
    fun deleteStockDividendList(dividendResp: DividendResp)
}