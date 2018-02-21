package com.consol.kotlin

import com.consol.kotlin.model.Owner
import com.consol.kotlin.model.SuperDogKotlin


fun main(args: Array<String>) {
    arrayOf(
            Dog(name = "Tobi"),
            Dog(name = "Simon", age = 1),
            SuperDogKotlin(name = "Uli", type = "superdog", owner = Owner("Super", "ConSoli"))
    ).forEach { println(it.sayHello()) }
}
