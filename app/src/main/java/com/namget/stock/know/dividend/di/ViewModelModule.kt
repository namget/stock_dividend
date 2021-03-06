package com.namget.stock.know.dividend.di

import androidx.lifecycle.ViewModel
import com.namget.stock.know.dividend.ui.dashboard.SearchViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class ViewModelModule {

    @Provides
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    fun provideSearchViewModel(): ViewModel {
        return SearchViewModel()
    }
}