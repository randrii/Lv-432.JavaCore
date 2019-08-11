package com.softserve.rybka.hw3;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(){}

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() { return breed; }

    public void setBreed(Dog.BREED breed) { this.breed = breed.toString(); }

    public enum BREED{
        poolde, beagle, pug

    }
}
