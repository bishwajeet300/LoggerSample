package com.bishwajeet.loggersample.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().reversed().contains("iOS"), "Check iOS is mentioned")
    }
}