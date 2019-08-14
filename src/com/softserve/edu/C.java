package com.softserve.edu;

import com.softserve.A;

//public final class C extends A {  // ERROR Class D
public class C extends A {

//	public C() {
//		super();
//	}
	
	@Override
	public void m1() {
		System.out.println("m1() from C");
	}

	@Override
	public void m2() {
		System.out.println("\tm2() from C");
		super.m2();
	}
	
	//private void m3() {} // ERROR

	@Override
	public void m4() { 
		m5();
	}
}
