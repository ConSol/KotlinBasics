package com.consol.kotlin.exercises

import com.consol.kotlin.Dog
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

@Ignore //TODO REMOVE!
class OptionalTest {


    private fun letDogBark(dog: Dog?) {
//      TODO TASK 1 call the function "bark" on the dog using the Safe Call Operator
        TODO("Please implement the task :-)")
    }

    private fun getDogName(dog: Dog?): String {
//      TODO TASK 2 return the DOG NAME if the dog is NOT null
//      TODO TASK 2 return "No dog found" if the dog IS null
//      HINT: use the Elvis operator "?:" )
        TODO("Please implement the task :-)")
    }

    private fun getNameOf(any: Any): String {
//      TODO TASK 3 return the DOG NAME if it IS a dog. (HINT: use "as?"-cast or "is" check)
//      TODO TASK 3 if it is NOT a dog, return "type unknown"
        TODO("Please implement the task :-)")
    }







    /*
    Do not worry about the part below!
     */
    @Test
    fun testKotlinMakesDogAccessSafer() {
        letDogBark(null)
    }

    @Test
    fun testDogGetsIntroducedCorrectlyWhenNull() {
        assertEquals("No dog found", getDogName(null))
    }

    @Test
    fun testDogGetsIntroducedCorrectlyWhenNotNull() {
        assertEquals("Bruno", getDogName(Dog("Bruno")))
    }

    @Test
    fun testSafeCasts() {
        assertEquals("Bruno", getNameOf(Dog("Bruno", "Labrador", 5)))
        assertEquals("type unknown", getNameOf("JUST A STRING. NOT A DOG"))
    }
}
