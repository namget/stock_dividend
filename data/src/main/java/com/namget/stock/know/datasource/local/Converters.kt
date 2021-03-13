package com.namget.stock.know.datasource.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.namget.stock.know.ext.fromJson
import com.namget.stock.know.data.resp.DividendResp
import java.util.*

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun stockDividendToString(listOfString: String): List<DividendResp> {
        return Gson().fromJson(listOfString)
    }

    @TypeConverter
    fun stringToStockDividend(list: List<DividendResp>): String {
        return Gson().toJson(list)
    }
}