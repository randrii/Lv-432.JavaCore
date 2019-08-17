package com.softserve.rybka.HW5;

public class Task1 {

    public static void main(String[] args) {
        Bird[] birds = new Bird[5];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Penguin();
        birds[4] = new Chicken();

        for (Bird bird : birds){
            System.out.println(bird.fly());
        }

        for (Bird bird : birds){
            System.out.println(bird.toString());
        }

    }
}

abstract class Bird{
    boolean feather;
    boolean layEggs;

    abstract String fly();
}

class FlyingBird extends Bird{

    @Override
    String fly() {
        return "I can fly";
    }
}

class NonFlyingBird extends Bird{

    @Override
    String fly(){
        return "I can't fly";
    }
}

class Eagle extends FlyingBird{
    Eagle(){
        feather = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feather=" + feather +
                ", layEggs=" + layEggs +
                '}';
    }
}

class Swallow extends FlyingBird{
    Swallow(){
        feather = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feather=" + feather +
                ", layEggs=" + layEggs +
                '}';
    }
}

class Penguin extends NonFlyingBird{
    Penguin(){
        feather = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feather=" + feather +
                ", layEggs=" + layEggs +
                '}';
    }
}

class Chicken extends NonFlyingBird{
    Chicken(){
        feather = true;
        layEggs = true;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feather=" + feather +
                ", layEggs=" + layEggs +
                '}';
    }
}