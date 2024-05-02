package com.jaybobzin.universal.app.di

import com.jaybobzin.universal.app.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::HomeViewModel)
}
