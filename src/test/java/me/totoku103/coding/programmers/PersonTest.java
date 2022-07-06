package me.totoku103.coding.programmers;

import me.totoku103.coding.effectjava.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void test() {
        Person build =
                new Person
                        .Builder()
                        .name("name")
                        .sex("male")
                        .age(10)
                        .build();
    }

}