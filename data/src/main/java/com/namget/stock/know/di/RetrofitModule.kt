package com.namget.stock.know.di

import com.namget.stock.know.repository.RetrofitBuilder
import com.namget.stock.know.repository.StockApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    @Singleton
    fun provideStockService() : StockApiService{
        val retrofitBuilder = RetrofitBuilder()
        return retrofitBuilder.create(StockApiService::class.java)
    }
}