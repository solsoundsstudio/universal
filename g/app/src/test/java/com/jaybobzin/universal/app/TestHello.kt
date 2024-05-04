package com.jaybobzin.universal.app

import com.jaybobzin.universal.common.repository.UniversalRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import kotlin.test.assertEquals

@RunWith(RobolectricTestRunner::class)
class TestHello {
    @Test
    fun `Universal Repository`() {
        val repo = UniversalRepository()


        val hello = repo.hello()
        assertEquals("Hello", hello[0])
        assertEquals("bobz", hello[1])

        hello.forEach { println(it) }
    }
}