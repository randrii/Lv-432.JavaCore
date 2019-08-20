package com.softserve.collection;

public class Appl {
	public static void main(String[] args) {
		/*-
		String text = "Hello World";
		Box box = new Box();
		box.set(123);
		//
		box.set(text);
		//
		Integer i = (Integer) box.get();  // Runtime Error.
		System.out.println(i);
		*/
		//
		String text = "Hello World";
		WrapperBox box = new WrapperBox();
		box.set(text);
		// Integer i = (Integer) box.get();  // Compile Error.
		// System.out.println(i);
	}
}
