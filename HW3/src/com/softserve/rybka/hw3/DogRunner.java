package com.softserve.rybka.hw3;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Rex");
        dog1.setBreed(Dog.BREED.beagle);
        dog1.setAge(5);

        Dog dog2 = new Dog();
        dog2.setName("Kikie");
        dog2.setBreed(Dog.BREED.poolde);
        dog2.setAge(10);

        Dog dog3 = new Dog();
        dog3.setName("Rex");
        dog3.setBreed(Dog.BREED.pug);
        dog3.setAge(15);


        sameName(dog1,dog2);
        sameName(dog1,dog3);
        sameName(dog2, dog3);

        Dog oldDog = oldestDog(dog1, oldestDog(dog2, dog3));
        System.out.println("The oldest dog is "+oldDog.getBreed()+" "+oldDog.getName());

    }

    public static void sameName(Dog dog1, Dog dog2){
        System.out.println("Same name of "+dog1.getBreed()+" "+dog1.getName()+" & "+dog2.getBreed()+" "+dog2.getName()+" : "+ (dog1.getName() == dog2.getName()));
    }

    public static Dog oldestDog(Dog dog1, Dog dog2){
        return dog1.getAge() > dog2.getAge() ? dog1 : dog2;
    }
}
