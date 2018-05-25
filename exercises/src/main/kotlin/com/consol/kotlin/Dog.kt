package com.consol.kotlin

class Dog(var name: String, val type: String = "Labrador", var age: Int = 5) {

    fun bark(times: Int = 3): String {
        return "wufff".repeat(times)
    }

    fun sayHello(): String {
        return "Hey my name is $name"
    }
}