public class task2 {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Student();
        people[1] = new Student();
        people[2] = new Teacher();
        people[3] = new Teacher();
        people[4] = new Cleaner();

        for (Person person: people){
            person.print();
            if (person instanceof Teacher){
                System.out.println("Salary: "+((Teacher) person).salary());
            }
            if (person instanceof Cleaner){
                System.out.println("Salary: "+((Cleaner) person).salary());
            }
        }
    }
}

abstract class Person{
    public String name;
    public abstract void print();
}

class Student extends Person{

    private final String TYPE_PERSON = "Student";

    public Student(){
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}

abstract class Staff extends Person{

    private final String TYPE_PERSON = "Staff";

    abstract int salary();

    public Staff(){
        System.out.print(TYPE_PERSON+" : ");
    }

    @Override
    public void print() {
        System.out.println("I am a staff");
    }
}

class Teacher extends Staff{

    private final String TYPE_PERSON = "Teacher";

    public Teacher(){
        System.out.println(TYPE_PERSON);
    }

    @Override
    int salary() {
        return 4000;
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }
}

class Cleaner extends Staff{

    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(){
        System.out.println(TYPE_PERSON);
    }

    @Override
    int salary() {
        return 3500;
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }
}
