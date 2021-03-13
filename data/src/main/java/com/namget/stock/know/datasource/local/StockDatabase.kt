package com.namget.stock.know.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.namget.stock.know.data.entitiy.StockDividend

@Database(
    entities = [StockDividend::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class StockDatabase : RoomDatabase() {
    abstract fun getAppDao(): StockDao
}
