package com.softserve;

//public class Box<T extends IT> {
public class Box<T> {
	// T stands for "Type".
	private T t;

	public void set(T t) {
		//t.m1();
		this.t = t;
	}

	public T get() {
		return t;
	}
}
