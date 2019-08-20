package com.softserve.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Appl3 {
	
	public static void main(String[] args) {
		int[] x = new int[10];
		Random rand = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(100);
		}
		//List<?> arx = Arrays.asList(x);
		List<Integer> arx = new ArrayList<>();
		for (int i = 0; i < x.length; i++) {
			arx.add(x[i]);
		}
		//
		System.out.println("Array: " + arx);
		Arrays.sort(x);
		System.out.print("[ ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",  ");
		}
		System.out.println("] ");
	}

}
