package com.namget.stock.know.di

import com.namget.stock.know.datasource.StockDataSource
import com.namget.stock.know.datasource.StockLocalDataSource
import com.namget.stock.know.datasource.StockRemoteDataSource
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourceModule {

    @Binds
    @LocalDataSource
    abstract fun bindStockLocalDataSource(stockLocalDataSource: StockLocalDataSource): StockDataSource

    @Binds
    @RemoteDataSource
    abstract fun bindStockRemoteDataSource(stockRemoteDataSource: StockRemoteDataSource): StockDataSource


}