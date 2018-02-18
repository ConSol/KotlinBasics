package com.consol.kotlin.basics.greeter

import org.junit.Assert
import org.junit.Test

class GreeterTest {

    private val greeter = Greeter()

    @Test
    fun greetStranger() {
        Assert.assertEquals("Greetings should match!", "Hello stranger!", greeter.greet())
    }

    @Test
    fun greetFriend() {
        Assert.assertEquals("Greetings should match!", "Hello Tobi!", greeter.greet("Tobi"))
    }
}
