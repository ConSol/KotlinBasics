package com.consol.kotlin.java;

import com.consol.kotlin.Dog;
import com.consol.kotlin.model.Owner;
import org.jetbrains.annotations.NotNull;

import static com.consol.kotlin.DogKt.hello;

public class SuperDogJava extends Dog {
    private final Owner owner;

    public SuperDogJava(Owner owner, String name, String type) {
        super(name, type, 100000);
        this.owner = owner;
    }

    @NotNull
    @Override
    public String sayHello() {
        hello("asdf");
        return "Hey my name is " + getName() + "! My " + getOwner();
    }

    public String getOwner() {
        return "Owner: " + owner.getFirstName() + " " + owner.getLastName();
    }
}
