package com.softserve.rybka.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

class Tasks {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static void task1() throws IOException {
        System.out.println("Task 1. Input year: ");
        int year = Integer.parseInt(bufferedReader.readLine());
        System.out.print(year+" of ");
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        System.out.println(year+"th century");
    }

    static void task2(){
        double[] array = new double[10];
        array[0] = 0;
        array[1] = 0.625;
        for (int i = 2; i < array.length; i++) {
            array[i] = (array[i-1]/2)+(3.0/4)*array[i-2];
        }
        System.out.println("Task 2. Output: "+Arrays.toString(array));
    }

    static void task3(){
        double result = 0;

        for (int i = 1; i <= 30; i++) {
            result += Math.pow((getA(i) - getB(i)), 2);
        }

        System.out.println("Task 3. Result is " + result);
    }

    private static double getA(int i) {
        return i % 2 == 0 ? i / 2.0 : i;
    }

    private static double getB(int i) {
        return i / (i*i);
    }

    static void task4() throws IOException {
        System.out.println("Task 4. Input n: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(bufferedReader.readLine());
        }

        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                newArray[i] = Math.abs(array[0]);
                continue;
            }
            newArray[i] = Math.abs(array[i-1])+Math.abs(array[i]);
        }
        System.out.println("Output:"+Arrays.toString(newArray));
    }

    static void task5() throws IOException {
        System.out.println("Task 5. Input a, b, c: ");

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a <= 0 | b <= 0 | c <= 0){
            System.out.println(0);
        }
        if (a == b && b == c){
            System.out.println(3);
        }
        else {
            System.out.println(1);
        }
    }

    static void task6() throws IOException {
        System.out.println("Task 6. Enter a1 - a4: ");
        int a1 = Integer.parseInt(bufferedReader.readLine());
        int a2 = Integer.parseInt(bufferedReader.readLine());
        int a3 = Integer.parseInt(bufferedReader.readLine());
        int a4 = Integer.parseInt(bufferedReader.readLine());
        int n;

        if (a1 == a4){
            n = (a1 == a2) ? 3 : 2;
        } else {
            n = (a1 == a2) ? 4 : 1;
        }
        System.out.println("Number position is "+n);
    }

    static void task7() throws IOException {
        System.out.println("Task 7. Enter position: ");
        int k = Integer.parseInt(bufferedReader.readLine());
        int[] sequence = new int[180];
        int count = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++){
                sequence[count] = i;
                sequence[count+1] = j;
                count+=2;
            }
        }

        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i]);
        }
        System.out.println("\nk = "+sequence[k*2-2]+sequence[k*2-1]);
    }

    static void task8() throws IOException {
        System.out.println("Task 8. Enter a & b: ");
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c;

        while(a != b){
            if (a > b) {
                a-=b;
            }
            else {
                b-=a;
            }
        }

        System.out.println("The gratest commn div is "+a);
    }

    static void task9(){
        double y = 40;

        for (int i = 39; i >= 0; --i) {
            y=i+Math.cos(y);
        }
        System.out.println("Task 9. Calculation result is "+y);
    }

    static void task10() throws IOException {
        System.out.println("Task 10. Enter int n: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter double radius: ");
        double r = Double.parseDouble(bufferedReader.readLine());
        double r_xy;
        double[] arr = new double[n];
        int count = 0;

        System.out.println("Input double[] points: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(bufferedReader.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = n -1; j >= 0; j--) {
                r_xy = Math.sqrt(arr[i]*arr[i]+arr[j]*arr[j]);
                if (r_xy <= r && i!=j){
                    count++;
                    //System.out.println("( "+arr[i]+" ; "+arr[j]+" ) points belong to circle of radius "+r);
                }
            }
        }
        System.out.println(count+" points belong to circle of radius "+r);
    }

    static void task11() throws IOException {
        System.out.println("Task 11. Enter int n: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input double[] time of serving buyer: ");
        double[] servingTime = new double[n];

        for (int i = 0; i < n; i++) {
            servingTime[i] = Double.parseDouble(bufferedReader.readLine());
        }

        double[] stayTime = new double[n];
        double temp = 0;

        for (int i = 1; i < n; i++) {
            temp += servingTime[i-1];
            stayTime[i] = temp;
            System.out.println((i+1)+"th client was waiting "+stayTime[i]);
        }

        double leastTime = servingTime[0];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (leastTime > servingTime[i]){
                leastTime = servingTime[i];
                index = i;
            }
        }
        System.out.println((index+1)+"th buyer had the least serving time");
    }

    static void task12() throws IOException {
        System.out.println("Task 12. Enter int n: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input marks: ");
        double[] marks = new double[n];
        HashSet<Double> newMarks = new HashSet<>();

        for (int i = 0; i < n; i++) {
            marks[i] = Double.parseDouble(bufferedReader.readLine());
        }

        double min = marks[0];
        double max = marks[1];
        double avg = 0;

        System.out.println("All array of marks: "+Arrays.toString(marks));
        for (int i = 0; i < marks.length; i++) {
            min = (marks[i] < min) ? marks[i] : min;
            max = (marks[i] > max) ? marks[i] : max;
        }

        for (int i = 0; i < n; i++) {

            newMarks.add(marks[i]);

            if (marks[i] == max || marks[i] == min){
                newMarks.remove(marks[i]);
            }
        }

        for (double item : newMarks){
            avg += item;
        }
        System.out.println("New array of marks: "+newMarks.toString());
        System.out.println("Final mark is "+(avg/newMarks.size()));
    }
}
