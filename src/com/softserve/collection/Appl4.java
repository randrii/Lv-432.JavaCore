package com.softserve.collection;

import java.util.Arrays;

public class Appl4 {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		//
		students[0] = new Student(52645, "Oksana");
		students[1] = new Student(98765, "Bogdan");
		students[2] = new Student(1354, "Orest");
		//
		System.out.println("Unsorted");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		//
		Arrays.sort(students);
		System.out.println("Sorted");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

}
