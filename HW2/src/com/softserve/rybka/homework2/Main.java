package com.softserve.rybka.homework2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Andrew", "Rybka");
        person1.setBirthYear(1997);

        Person person2 = new Person();
        person2.setFirstName("Bill");
        person2.setLastName("Bean");
        person2.setBirthYear(2011);

        Person person3 = new Person("Bruce", "Willis");
        person3.setBirthYear(2001);

        Person person4 = new Person("Rock", "Lee");
        person4.setBirthYear(2002);

        Person person5 = new Person("Mary", "Wing");
        person5.setBirthYear(2007);

        person1.output();
        person2.output();
        person3.output();
        person4.output();

        person5.changeName("Markis", null);
        person5.output();

        person4.input();
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
