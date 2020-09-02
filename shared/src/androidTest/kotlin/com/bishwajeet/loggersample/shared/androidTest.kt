package com.bishwajeet.loggersample.shared

import org.junit.Assert.assertTrue
import org.junit.Test

class GreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greeting().reversed().contains("Android"))
    }
}