package com.namget.stock.know.dividend

import android.app.Application
import com.namget.stock.know.dividend.di.AppComponent
import com.namget.stock.know.dividend.di.DaggerAppComponent

class StockApplication : Application() {

    val appComponent: AppComponent by lazy {
         DaggerAppComponent.factory().create(applicationContext)
    }

}