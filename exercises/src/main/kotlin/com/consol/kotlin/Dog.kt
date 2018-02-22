package com.consol.kotlin


/**
 * Created by Malte Bucksch on 09/11/2017.
 */
open class Dog(var name: String, val type: String = "Labrador", var age: Int = 5) {
    fun bark(times: Int = 3) {
        println("wufff".repeat(times))
    }

    open fun sayHello(): String {
        return "Hey my name is $name"
    }
}

fun String.hello() = this.toUpperCase()