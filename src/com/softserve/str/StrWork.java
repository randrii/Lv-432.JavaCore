package com.softserve.str;

public class StrWork {
	public static void main(String[] args) {
		/*
		String s0 = "abc";
		String s1 = "abc";
		String s2 = new String("abc");
		//
		System.out.println("s0= " + s0);
		System.out.println("s1= " + s1);
		System.out.println("s2= " + s2);
		//
		s1 = "123";
		System.out.println("new s0= " + s0);
		System.out.println("new s1= " + s1);
		System.out.println("new s2= " + s2);
		*/
		//
		/*
		StringBuilder sb0 = new StringBuilder("abc");
		StringBuilder sb1 = sb0;
		//
		System.out.println("sb0= " + sb0);
		System.out.println("sb1= " + sb1);
		//
		sb0.append("_123");
		System.out.println("new sb0= " + sb0);
		System.out.println("new sb1= " + sb1);
		*/
		//
		/*
		char[] chA = {'A', 'B', 'C', 'D', 'E', 'F'};
		String s10 = new String(chA);
		System.out.println(s10);
		*/
		//
		//String str = "I study Java language Java"; 
		//int n = str.indexOf('a'); // 9
		//int n = str.indexOf("av"); // 9
		//int n = str.lastIndexOf('a'); // 18
		//int n = str.lastIndexOf("av"); // 23
		//int n = str.lastIndexOf("avas"); // -1
		//System.out.println("n= " + n);
		//String str1 = str.substring(13);     // language Java
		//String str2 = str.substring(8, 14);  // Java l
		//System.out.println(str1);
		//System.out.println(str2);
		//boolean res = str.startsWith("I study");
		//boolean res = str.startsWith("Java", 8);
		//System.out.println(res);
		//System.out.println(str.toLowerCase());
		//System.out.println(str.toUpperCase());
		//
		//char c = str.charAt(8);  // str[9] not in Java
		//System.out.println("c= " + c);
		//
		/*
		String str = "      study Java  Java    1";
		//str = str.replace('a', 'b');
		//str = str.replace("Java", "Hahaha");
		System.out.println(str);
		//System.out.println(str.trim());
	    */
		//
		/*
		String a = "aa";
		String A = "Aa";
		String b = "aa";
		System.out.println("a.equals(A) " + a.equals(A));
		System.out.println("a.equals(b) " + a.equals(b));
		System.out.println("a.equalsIgnoreCase(A) " + a.equalsIgnoreCase(A));
		System.out.println("a.compareTo(A) " + a.compareTo(A)); 
		System.out.println("a.compareToIgnoreCase(A) " + a.compareToIgnoreCase(A));
		System.out.println("a.hashCode() " + a.hashCode());
		System.out.println("A.hashCode() " + A.hashCode());
		System.out.println("b.hashCode() " + b.hashCode());
		*/
		//
		/*
		int i = 8;
		String my = "12";
		//String my = "Java-";
		//my = my + (i + 4);
		//my = my + (new Integer(i)).toString();
		my = my + String.valueOf(i);
		System.out.println(my);
		i = Integer.parseInt(my);
		System.out.println("i+1 = " + (i+1));
		//
		String str = "JAVA-SE,8";
		String[] arr = str.split("-|,");
		for (String w : arr) {
			System.out.println(w);
		}
		*/
		//
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		//
		System.out.println("(s1 == s2): " + (s1 == s2)); 		// true
		System.out.println("(s1 == s3): " + (s1 == s3));		// false
		//
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("s1.equals(s3): " + s1.equals(s3));
		//
		System.out.println("s1.equals(s2):  " + s1.compareTo(s2));
		System.out.println("s1.equals(s3):  " + s1.compareTo(s3));
		//
		System.out.println("(s1.hashCode() == s2.hashCode()):  " + (s1.hashCode() == s2.hashCode()) );
		System.out.println("(s1.hashCode() == s3.hashCode()):  " + (s1.hashCode() == s3.hashCode()) );
		//
	}
}
