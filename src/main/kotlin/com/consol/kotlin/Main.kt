package com.consol.kotlin


fun main(args: Array<String>) {
    arrayOf(
            Dog(name = "Tobi"),
            Dog(name = "Simon", age = 1)
    ).forEach { println(it.sayHello()) }
}
