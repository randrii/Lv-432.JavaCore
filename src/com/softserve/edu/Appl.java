package com.softserve.edu;

import java.util.Arrays;

public class Appl {
	private int i;

	public void myPrint() {
		System.out.println("i=" + i);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		//
		Appl appl1 = new Appl();
		appl1.i = 1;
		appl1.myPrint();
		//
		Appl appl2 = new Appl();
		appl2.i = 2;
		appl2.myPrint();
		//
//		int[] arr;
//		arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 11;
//		arr[2] = 12;
//		arr[3] = 13;
//		arr[4] = 14;
//		//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Result a[" + i + "]= " + arr[i]);
//		}
		//
//		String[] months = new String[12];
//		//months[0] = "January";
//		months[0] = new String("January");
//		months[1] = "February";
//		months[2] = "March";
//		months[3] = "April";
//		months[4] = "May";
//		months[5] = "June";
//		months[6] = "July";
//		months[7] = "August";
//		months[8] = "September";
//		months[9] = "October";
//		months[10] = "November";
//		months[11] = "December";
//		for (String s : months) {
//			System.out.println("Result s= " + s);
//		}
		//
		// int monthDays[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		// };
//		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		System.out.println(  Arrays.toString(monthDays)  );
//		int j = 0;
//		while (j < monthDays.length) {
//			System.out.println("month number = " + (j + 1) + "  monthDays = " + monthDays[j]);
//			j = j + 1;
//		}
		//
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int n = 0;
//		for (int i = 0; i < 10; i++) {
//			System.out.print("Input number: ");
//			n = Integer.parseInt(sc.nextLine());
//			System.out.println("Get Number = " + n);
//			if (n < 0) {
//				// break;
//				continue;
//			}
//			sum = sum + n;
//		}
//		System.out.print("The End,  sum=" + sum);
//		sc.close();
		//
		// int[] arr = { 2, -5, 7, -4, 8, 5, -1, 0, 4 };
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 10, 8, 9 };
//		int max = arr[0];
//		int imax = 0;
//		int i = 0;
//		while (i < arr.length) {
//			if (arr[i] > max) {
//				max = arr[i];
//				imax = i;
//			}
//			i++;
//		}
//		System.out.print("Maximum = " + max);
//		System.out.println(" is in " + imax + " place");
		//
		System.out.println("Unsorted: " + Arrays.toString(arr));
		int tmp;
		boolean isStop = true;
		for (int i = 0; i < arr.length - 1; i++) {
			isStop = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					isStop = false;
					System.out.println("\t***Change position");
				}
			}
			if (isStop) {
				break;
			}
		}
		System.out.println("Sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

}
