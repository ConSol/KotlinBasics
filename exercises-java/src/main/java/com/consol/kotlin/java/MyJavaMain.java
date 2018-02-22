package com.consol.kotlin.java;

import com.consol.kotlin.Dog;
import com.consol.kotlin.model.Owner;
import com.consol.kotlin.model.SuperDogKotlin;

import java.util.ArrayList;
import java.util.List;

public class MyJavaMain {
    public static void main(String[] args) {
        System.out.println("JAVA CALL!\n");

        Dog dog = new Dog("dogOnly", "JDK-DOG", 10);
        System.out.println(dog.sayHello());


        Owner jetBrains = new Owner("JetBrains", "Owner");
        SuperDogKotlin kotlinDog = new SuperDogKotlin(jetBrains, "kotlinDog", "JVM-DOG", 6);
        System.out.println(kotlinDog.sayHello());

        Owner oracle = new Owner("Oracle", "Owner");
        SuperDogJava javaDog = new SuperDogJava(oracle, "javaDog", "JVM-DOG");
        System.out.println(javaDog.sayHello());


        List<Dog> allDogs = new ArrayList<>();
        allDogs.add(dog);
        allDogs.add(kotlinDog);
        allDogs.add(javaDog);
        allDogs.forEach(v ->
                System.out.println(v.sayHello())
        );

    }
}