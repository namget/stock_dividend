package com.namget.stock.know.dividend.di

import androidx.lifecycle.ViewModelProvider
import com.namget.stock.know.dividend.util.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}