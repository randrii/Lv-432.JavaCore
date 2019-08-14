package com.softserve.edu;

import com.softserve.A;

public class AppAB {
	public static void main(String[] args) {
		//A b = new A(121);
		//B b = new B(121);
		A b = new B(121);
		((B)b).m123();
		//b.setI(123);
		System.out.println("b.getI() = " + b.getI());
		//
		A[] arr = new A[3];
		arr[0] = new B(1);
		arr[1] = new C();
		arr[2] = new B(2);
		for (A current : arr) {
			current.m1();
			current.m2();
		}
	}
}
