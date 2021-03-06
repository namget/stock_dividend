package com.namget.stock.know.dividend.di

import android.content.Context
import com.namget.stock.know.dividend.ui.dashboard.SearchComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppSubComponent::class, ViewModelFactoryModule::class, ViewModelModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun searchComponent(): SearchComponent.Factory

}