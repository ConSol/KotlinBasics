package com.consol.kotlin.model

import com.consol.kotlin.Dog


/**
 * Created by Malte Bucksch on 09/11/2017.
 */


class SuperDog(val owner: Owner = Owner("First", "ConSoli"), name: String, type: String, age: Int = 1000) : Dog(name, type, age) {

    override fun sayHello(): String {
        return "Hey my name is $name! My ${getOwner()}"
    }

    fun getOwner(): String {
        return "Owner: ${owner.firstName} ${owner.lastName}"
    }

}