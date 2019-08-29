package com.softserve.rybka.hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Task 1. Input two double numbers:");
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());

            System.out.println("Their division is " + div(a, b));

        } catch (NumberFormatException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Task 2. Check if numbers belong to defined interval");

        int count = 0;
        int tmp;
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, random.nextInt(2)+2);

        while(count <= 9){
            tmp = random.nextInt(100);
            if (numbers.contains(tmp)) continue;
            if (tmp > 1 & tmp > numbers.get(count) & tmp != numbers.get(count) & tmp < 100){
                numbers.add(count, tmp);
                count++;
            }
        }

        Collections.sort(numbers);
        System.out.println(numbers);

        for (int item: numbers){
            try {
                System.out.println(item + "\t" + readNumber(item, 20,40));
            } catch (Exception e){
                System.out.println(item + "\t" + e.getMessage());
            }
        }

    }

    private static double div( double a, double b){
        return a / b;
    }

    private static boolean readNumber(int number, int start, int end) {
        return (number >= start & number <= end);
    }
}