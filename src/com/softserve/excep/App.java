package com.softserve.excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	public void m1() {
		//int i = 4;
		//int j = 0;
		// double i = -4;
		// double j = 0;
		int[] a = new int[2]; // a[0]; a[1]
		try {
			//System.out.println("Result: " + (i / j));
			a[2] = 0;
		} catch (Exception e) {
		//} catch (ArithmeticException e) {
			System.out.println("Error found: message = " + e.getMessage());
			e.printStackTrace();
			//throw new RuntimeException("ERROR FOUND: message = " + e.getMessage());
			System.out.println("HAHAHA");
		}
	}
	
	public void m2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		try {
			System.out.println("Input data: ");
			s = br.readLine();
		} catch (IOException e) {
			// TODO
			System.out.println("Error. System Terminated.");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO
				e.printStackTrace();
			}
		}
		int k = 0;
		try {
			k = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			System.out.println("Oj, xalepa");
			e.printStackTrace();
		}
		System.out.println("k= " + k);
	}
	
	public void m3() throws MyException {
		int i = 1;
		if (i > 0) {
			throw new MyException("hahaha");
		}
	}

	public void m4() {
		int i = 1;
		if (i > 0) {
			throw new My2Exception("hahaha");
		}
	}

	public void m5(){
		try {
			m3();
		} catch (MyException e) {
			throw new My2Exception("hahaha5", e);
		}
	}

	public void m6() {
		int i = 1;
		try {
			System.out.println("Start try m6");
			if (i > 0) {
				throw new My2Exception("hahaha6");
			}
			System.out.println("Done try m6");
		} finally {
			System.out.println("finally6");
		} 
	}
	
	public void m7() {
		int i = 0;
		try {
			System.out.println("Start try m6");
			i = 10 / i;
			System.out.println("Done try m6");
		} catch (Exception e) {
			System.out.println("ALL ERROR");
			//return;
			//System.exit(111);
		} finally {
			System.out.println("finally6");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//double safeSqrt(double x) throws ArithmeticException {
	double safeSqrt(double x) {
		if (x < 0.0)
			throw new ArithmeticException();
		return Math.sqrt(x);
	}

	
	public static void main(String[] args) {
		App a = new App();
		//a.m1();
		//a.m2();
//		try {
//			a.m3();
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//a.m4();
		//a.m5();
		//a.m6();
		//a.m7();
		a.safeSqrt(-10);
	}
}
