package com.consol.kotlin.exercises

import com.consol.kotlin.Dog
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Ignore
import org.junit.Test


@Ignore //TODO REMOVE!
class LambdasTest {
    private val dogs = listOf(Dog("Bruno", age = 4), Dog("Daisy", age = 12), Dog("Rex", age = 7))

    // TODO TASK 1 find and return a list of the names of all dogs using "map"
    private fun findDogNames(dogs: List<Dog>): List<String> {
        TODO("Please implement the task :-)")
    }

    // TODO TASK 2 find and return a list of all dogs whose "age" is older than 5 years using "filter"
    private fun findOldDogs(dogs: List<Dog>): List<Dog> {
        TODO("Please implement the task :-)")
    }

    // TODO TASK 3 COMBINE FILTER AND MAP: find and return a list of the NAMES of all dogs that are OLDER THAN 5
    private fun findNamesOfOldDogs(dogs: List<Dog>): List<String> {
        TODO("Please implement the task :-)")
    }





    /*
    Do not worry about the part below
     */
    @Test
    fun testDogNamesUsingMap() {
        val names = findDogNames(dogs)

        assertEquals(listOf("Bruno", "Daisy", "Rex"), names)
    }

    @Test
    fun testOldDogsUsingFilter() {
        val oldDogs = findOldDogs(dogs)

        for (dog in oldDogs) {
            assertTrue(dog.age > 5)
        }
    }

    @Test
    fun testFindNamesOfOldDogs() {
        val oldDogNames = findNamesOfOldDogs(dogs)

        assertEquals(listOf("Daisy", "Rex"), oldDogNames)
    }
}