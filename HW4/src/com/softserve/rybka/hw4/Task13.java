package com.softserve.rybka.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        int monthDays[ ]  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Task1\nEnter the number of month: ");
        int month = Integer.parseInt(bufferedReader.readLine())-1;
        System.out.println("Amount of days in this month is "+(month>=0 && month<=11? monthDays[month]: null));

        System.out.println("Task2\nEnter 10 int elements");
        int sum = 0;
        int prod = 1;
        int pcount = 0;
        int[] numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }


        for (int i = 0; i < numbers.length/2; i++) {
            if (numbers[i] > 0) {
                pcount++;
                if (pcount == numbers.length/2)
                    break;
            }
        }

            if (pcount == numbers.length/2){
                for (int j = 0; j < numbers.length/2; j++) {
                    sum+=numbers[j];
                }
                System.out.println("Sum of 5 first elements is "+sum);
            }
            else {
                for (int y = numbers.length-1; y >= numbers.length/2; y--) {
                    prod*=numbers[y];
                }
            System.out.println("Product of 5 last elements is "+prod);
            }

        System.out.println("Task3\nEnter 5 int numbers");
        int[] numb = new int[5];
        int secondPositionCount=0;
        int secondPosition = 0;

        for (int i = 0; i <numb.length ; i++) {
            numb[i] = Integer.parseInt(bufferedReader.readLine());
            if (numb[i]<0){
                break;
            }
            if (numb[i]>0){
                secondPositionCount++;
                if (secondPositionCount == 2){
                    secondPosition = i;
                }
            }
        }

        System.out.println("Position of second positive number is "+(secondPosition+1));

        int min = numb[0];
        int minPosition = numb[0];
        int evenProduct = 1;

        for (int i = 0; i <numb.length ; i++) {
            if (numb[i]<min){
                min = numb[i];
                minPosition = i;
            }
        }
        System.out.println("Min is "+min+" at position "+(minPosition+1));

        for (int aNumb : numb) {
            if (aNumb != 0 && Math.abs(aNumb % 2) == 0) {
                evenProduct *= aNumb;
            }
        }
        System.out.println("The product of all entered even numbers is "+evenProduct);
    }
}
