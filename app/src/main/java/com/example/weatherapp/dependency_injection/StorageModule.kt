package com.example.weatherapp.dependency_injection

import com.example.weatherapp.storage.SharedPreferencesManeger
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManeger(context = get(), gson = get()) }
}