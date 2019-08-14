package com.softserve;

public abstract class A {

	public final double RADIUS = 10;
	
	private int i;

	public A() {
		System.out.println("public A() DONE");
	}

	public A(int i) {
		System.out.println("public A(int i) DONE");
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public abstract void m1();

	public void m2() {
		System.out.println("\tm2() from A");
	}
	
	public void m3() {}
	
	//protected final void m4() {}
	protected void m4() {}
	
	protected void m5() {
		// RADIUS = 11; ERROR
	}
}
