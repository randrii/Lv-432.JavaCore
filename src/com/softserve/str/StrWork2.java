package com.softserve.str;

public class StrWork2 {

	public static void main(String[] args) {
		//
		//String template = "My friend is %s.";
		//System.out.printf(template, "mercedec");
		//System.out.println( String.format(template, "mercedec") );
		//System.out.println( String.format(template, "Ivan") );
		//
		final double PI = 3.1415926;
	    System.out.println("Pi= " + PI);
		String format = "My Pi = %10.2fhahaha";
		String s = String.format(format, PI);
		System.out.printf("format:  " + format, PI);
	}
	
}
