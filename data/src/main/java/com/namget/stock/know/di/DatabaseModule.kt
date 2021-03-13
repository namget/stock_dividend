package com.namget.stock.know.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.namget.stock.know.datasource.local.StockDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideStockService(context: Context): RoomDatabase {
        return Room.databaseBuilder(context, StockDatabase::class.java, "stockDB").build()
    }
}