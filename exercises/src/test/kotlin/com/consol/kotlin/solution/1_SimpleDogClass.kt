package com.consol.kotlin.solution

import org.junit.Test
import kotlin.test.assertEquals


class SimpleDogClassTest {
    // TODO TASK 1 add two properties "name" and "type"(read-only)
    // TODO TASK 2 add a function "bark" with a "times"(Int) argument -> which returns "wuff" multiple times
    // HINT: Use the "repeat" function ("xxx".repeat(3))

    private class Dog(val name: String, val type: String) {
        fun bark(times: Int = 1): String {
            return "Wuff".repeat(n = times)
        }
    }

    @Test
    fun testMyNewDogClass() {
        // TODO TASK 4: 1. create a dog instance named "Bruno" with type "Labrador"
        // TODO TASK 4: 2. let him "bark" 3 times and assert the value is equals to "WuffWuffWuff"

        val bruno = Dog("Bruno", "Labrador")
        assertEquals("WuffWuffWuff", bruno.bark(3))
    }
}
