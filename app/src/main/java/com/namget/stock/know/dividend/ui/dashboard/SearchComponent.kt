package com.namget.stock.know.dividend.ui.dashboard

import com.namget.stock.know.dividend.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SearchComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SearchComponent
    }

    fun inject(dashboardFragment: SearchFragment)
}