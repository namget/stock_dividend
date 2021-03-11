package com.namget.stock.know.di

import com.namget.stock.know.repository.RetrofitBuilder
import com.namget.stock.know.repository.StockService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    @Singleton
    fun provideStockService() : StockService{
        val retrofitBuilder = RetrofitBuilder()
        return retrofitBuilder.create(StockService::class.java)
    }
}