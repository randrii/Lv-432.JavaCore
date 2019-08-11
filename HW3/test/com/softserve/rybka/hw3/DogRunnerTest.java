package com.softserve.rybka.hw3;

import static org.junit.Assert.*;

public class DogRunnerTest {

    private Dog dog1 = new Dog("Baltasar", "pug", 7);
    private Dog dog2 = new Dog("Rubber", "beagle", 3);

    @org.junit.Test
    public void sameName() {
        assertFalse(dog1.getName() == dog2.getName());
    }

    @org.junit.Test
    public void oldestDog() {
        assertEquals(dog1, DogRunner.oldestDog(dog1,dog2));
    }
}