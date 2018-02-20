package com.consol.kotlin.basics.greeter

class Greeter {
    fun greet(name: String? = null): String {
        return "Hello ${name ?: "stranger"}!"
    }
}
