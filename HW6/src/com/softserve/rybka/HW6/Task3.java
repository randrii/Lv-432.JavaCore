package com.softserve.rybka.HW6;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(5);
        students.add(new Student("Andrew", 5));
        students.add(new Student("Mark", 3));
        students.add(new Student("Alice", 5));
        students.add(new Student("Nick", 3));
        students.add(new Student("Bill", 2));

        System.out.println("Initial list:\n"+students.toString());

        Student.printStudents(students, 5);

        students.sort(new Student.compatanorByName());
        System.out.println("Ordered list by name:\n"+students.toString());

        students.sort(new Student.compatanorByCourse());
        System.out.println("Ordered list by course:\n"+students.toString());
    }
}

class Student{
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "\n" + name + "\t" + course;
    }

    public static void printStudents(List students, Integer course){
        System.out.println("Students at "+course+" course:");
        ListIterator<Student> listIterator = students.listIterator();
        Student student;
        while(listIterator.hasNext()) {
            student = listIterator.next();
            if (student.getCourse().equals(course)) {
                System.out.println(student.getName());
            }
        }


    }

    static class compatanorByName implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }
    }

    static class compatanorByCourse implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).getCourse().compareTo(((Student)o2).getCourse());
        }
    }
}
