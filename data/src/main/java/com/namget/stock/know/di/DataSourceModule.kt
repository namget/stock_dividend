package com.namget.stock.know.di

import com.namget.stock.know.datasource.local.StockLocalDataSource
import com.namget.stock.know.datasource.remote.StockRemoteDataSource
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