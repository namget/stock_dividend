package com.namget.stock.know.dividend.di

import android.content.Context
import com.namget.stock.know.di.DatabaseModule
import com.namget.stock.know.di.RepositoryModule
import com.namget.stock.know.di.RetrofitModule
import com.namget.stock.know.dividend.ui.dashboard.SearchComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppSubComponent::class, ViewModelFactoryModule::class, DatabaseModule::class,
        ViewModelModule::class, ProvideApiKeyModule::class, RetrofitModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun searchComponent(): SearchComponent.Factory

}