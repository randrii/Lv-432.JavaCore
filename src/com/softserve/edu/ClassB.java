package com.softserve.edu;

public class ClassB extends ClassA {
	public double i = 1.1;

	public void m1() {
		System.out.println("ClassB, metod m1, i= " + i);
	}

	public void m4() {
		System.out.println("ClassB, metod m4");
		System.out.println("i = " + i);
	}
}
