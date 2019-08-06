package com.softserve.rybka.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static Calendar calendar = Calendar.getInstance();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person () {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getAge(){
        return calendar.get(Calendar.YEAR) - this.birthYear;
    }

    void input() throws IOException {
        System.out.println("Input your first, last and birth year");
        this.firstName = bufferedReader.readLine();
        this.lastName = bufferedReader.readLine();
        this.birthYear = Integer.parseInt(bufferedReader.readLine());
    }

    void output(){
        System.out.println("Name: "+this.firstName+" LastName: "+this.lastName+" Birth Date: "+birthYear+" Age: "+this.getAge());
    }

    void changeName(String fname, String lname){
        if (fname != null)
            this.firstName = fname;
        if (lname !=null)
            this.lastName = lname;
    }
}
