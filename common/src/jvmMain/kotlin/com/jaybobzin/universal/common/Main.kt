package com.jaybobzin.universal.common

import com.jaybobzin.universal.common.di.initKoin
import com.jaybobzin.universal.common.repository.UniversalRepository
fun main() {
    val koin = initKoin(enableNetworkLogs = true).koin
    val repo = koin.get<UniversalRepository>()
    repo.hello().forEach { println(it) }
}
