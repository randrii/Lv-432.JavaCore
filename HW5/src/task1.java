public class task1 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Dog();

        for (Animal animal: animals){
            System.out.println("\n"+animal.voice()+"\n"+animal.feed());
        }
    }
}

interface Animal {
    String voice();
    String feed();
}

class Cat implements Animal{

    @Override
    public String voice() {
        return "Meow-Meow";
    }

    @Override
    public String feed() {
        return "Cat eats";
    }
}

class Dog implements Animal{

    @Override
    public String voice() {
        return "Woof-woof";
    }

    @Override
    public String feed() {
        return "Dog eats";
    }
}
