package com.jaybobzin.universal.common

import com.jaybobzin.universal.common.di.commonModule
import com.jaybobzin.universal.common.repository.UniversalRepositoryInterface
import com.jaybobzin.universal.common.repository.platformModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class UniversalNetworkTest: KoinTest {
    private val repo : UniversalRepositoryInterface by inject()

    @OptIn(ExperimentalCoroutinesApi::class)
    @BeforeTest
    fun setUp()  {
        Dispatchers.setMain(StandardTestDispatcher())

        startKoin {
            modules(
                commonModule(true),
                platformModule(),
            )
        }
    }

    @Test
    fun testHello() = runTest {
        val result = repo.hello()
        println(result)
        assertTrue(result.isNotEmpty())
    }
}