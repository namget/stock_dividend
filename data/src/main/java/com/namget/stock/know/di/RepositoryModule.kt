package com.namget.stock.know.di

import com.namget.stock.know.repository.StockRepository
import com.namget.stock.know.repository.StockRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindStockRepository(stockRepositoryImpl: StockRepositoryImpl) : StockRepository
}