package com.namget.stock.know.dividend.di

import android.content.Context
import com.namget.stock.know.dividend.R
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ProvideApiKeyModule  {

    @Provides
    @Named("api_key")
    fun provideApiKey(context : Context) : String {
        return  context.resources.getString(R.string.data_api_key)
    }
}