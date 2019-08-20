package com.softserve;

public class Appl {
	public static void main(String[] args) {
		String text = "Hello World";
		Box<String> box = new Box<String>();
		//Box<Integer> box = new Box<>();
		box.set(text);
		//box.set(123);
		//Integer i = (Integer) box.get(); // Compile Error.
		//System.out.println(i);
	}
}
