package com.softserve.edu;

import com.softserve.A;

public class B extends A {
	
	private int j;

	public B(int j) {
		super(j);
		System.out.println("public B(int j) DONE");
		this.j = j;
	} 
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void m1() {
		System.out.println("m1() from B");
	}
	
	public void m123() {
		System.out.println("m123() from B");
	}
}
