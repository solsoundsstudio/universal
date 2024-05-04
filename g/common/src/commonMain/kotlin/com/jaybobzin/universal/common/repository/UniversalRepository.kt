package com.jaybobzin.universal.common.repository

import co.touchlab.kermit.Logger
import org.koin.core.component.KoinComponent

interface UniversalRepositoryInterface {
    fun hello(): List<String>
}

class UniversalRepository : KoinComponent, UniversalRepositoryInterface {
    val logger = Logger.withTag("UniversalRepository")

    override fun hello(): List<String> {
        return listOf("Hello", "bobz")
    }
}
